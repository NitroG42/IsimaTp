package fr.isima.cestvraimentnimportequoi.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import fr.isima.cestvraimentnimportequoi.MesFragmentActivity
import fr.isima.cestvraimentnimportequoi.R

class MonFragment : Fragment(R.layout.fragment_main) {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(rootView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(rootView, savedInstanceState)
        val textView: TextView = rootView.findViewById(R.id.textView)
        val editText: TextView = rootView.findViewById(R.id.editText)
        val button: Button = rootView.findViewById(R.id.button)
        val buttonNext: Button = rootView.findViewById(R.id.buttonNext)

        button.setOnClickListener {
            textView.text = editText.text.toString().uneLettreSurDeux()
        }

        buttonNext.setOnClickListener {
            (requireActivity() as MesFragmentActivity).passerAuFragment2()
        }

    }

    /**
     * Une méthode d'extension Kotlin, qui permet d'afficher une lettre sur deux
     */
    fun String.uneLettreSurDeux(): String {
        return filterIndexed { index, c -> index % 2 == 0 }
    }
}