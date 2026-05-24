package proyecto.picobotella.ui.splash

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import proyecto.picobotella.R
import android.view.animation.AnimationUtils
import android.widget.ImageView

class SplashFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view = inflater.inflate(
            R.layout.fragment_splash,
            container,
            false
        )

        val bottle = view.findViewById<ImageView>(
            R.id.imgBottle
        )

        val animation = AnimationUtils.loadAnimation(
            requireContext(),
            R.anim.bottle_animation
        )

        bottle.startAnimation(animation)

        Handler(Looper.getMainLooper()).postDelayed({

            findNavController().navigate(
                R.id.homeFragment,
                null,
                androidx.navigation.NavOptions.Builder()
                    .setPopUpTo(
                        R.id.splashFragment,
                        true
                    )
                    .build()
            )

        }, 5000)

        return view
    }
}