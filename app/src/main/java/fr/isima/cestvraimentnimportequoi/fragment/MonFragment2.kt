package fr.isima.cestvraimentnimportequoi.fragment

import androidx.fragment.app.Fragment
import fr.isima.cestvraimentnimportequoi.R

class MonFragment2 : Fragment(R.layout.fragment_2) {
    /**
     * Ne pas utiliser, sert à montrer que si on essaye de catcher le bouton back pour revenir au fragment1,
     * on perd les informations qu'on a rentré dedans
     */
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, object : OnBackPressedCallback(true) {
//            override fun handleOnBackPressed() {
//                (requireActivity() as MesFragmentActivity).passerAuFragment1()
//            }
//
//        })
//    }
}