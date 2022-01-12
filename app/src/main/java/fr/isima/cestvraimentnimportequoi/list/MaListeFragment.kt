package fr.isima.cestvraimentnimportequoi.list

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import fr.isima.cestvraimentnimportequoi.R

class MaListeFragment : Fragment(R.layout.fragment_list) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val initial = listOf("Thomas", "Julien", "Antoine", "Clément", "Marc", "Joseph")
        val list = (0..2000).fold(initial) { acc, index ->
            acc + initial
        }

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = NameAdapter(list)
        Log.d("MaListe", "listSize ${list.count()}")
    }
}