package proyecto.picobotella.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Button
import androidx.fragment.app.Fragment
import proyecto.picobotella.R
import android.widget.ImageView
import android.widget.LinearLayout

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view = inflater.inflate(
            R.layout.fragment_home,
            container,
            false
        )

        val btnSpin = view.findViewById<ImageView>(
            R.id.btnSpin
        )

        val pulseAnimation = AnimationUtils.loadAnimation(
            requireContext(),
            R.anim.button_pulse
        )

        btnSpin.startAnimation(pulseAnimation)

        return view
    }
}