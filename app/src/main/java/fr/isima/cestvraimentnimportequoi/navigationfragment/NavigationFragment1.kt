package fr.isima.cestvraimentnimportequoi.navigationfragment

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import fr.isima.cestvraimentnimportequoi.R

class NavigationFragment1 : Fragment(R.layout.fragment_main) {

    override fun onViewCreated(rootView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(rootView, savedInstanceState)
        val textView: TextView = rootView.findViewById(R.id.textView)
        val editText: TextView = rootView.findViewById(R.id.editText)
        val button: Button = rootView.findViewById(R.id.button)
        val buttonNext: Button = rootView.findViewById(R.id.buttonNext)

        button.setOnClickListener {
            textView.text = editText.text
        }

        buttonNext.setOnClickListener {
            findNavController().navigate(R.id.passerAuFragment2)
        }
    }
}