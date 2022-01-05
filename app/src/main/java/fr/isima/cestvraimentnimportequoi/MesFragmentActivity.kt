package fr.isima.cestvraimentnimportequoi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import fr.isima.cestvraimentnimportequoi.fragment.MonFragment
import fr.isima.cestvraimentnimportequoi.fragment.MonFragment2

class MesFragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_monfragment)

        supportFragmentManager.commit {
            replace<MonFragment>(R.id.container)
        }
    }

    fun passerAuFragment2() {
        supportFragmentManager.commit {
            replace<MonFragment2>(R.id.container)
            //Pour gérer le bouton back pour revenir sur fragment 1
            //addToBackStack(null)
        }
    }

    /**
     * Ne pas utiliser
     */
    fun passerAuFragment1() {
        supportFragmentManager.commit {
            replace<MonFragment>(R.id.container)
        }
    }

}