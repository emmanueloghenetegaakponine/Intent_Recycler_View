package com.tega.usapresident

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        const val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageList = listOf(
            UsPresident(
                R.drawable.ic_jamesgarfield,
                "James",
                "Garfield"
            ),
            UsPresident(
                R.drawable.ic_alexander_graham_bell,
                "Graham",
                "Alexander"
            ),
            UsPresident(
                R.drawable.ic_andrew_jackson,
                "Andrew",
                "Jackson"
            ),
            UsPresident(
                R.drawable.ic_eisenhower,
                "Hower",
                "Eisen"
            ),
            UsPresident(
                R.drawable.ic_jfk,
                "John",
                "kennedy"
            ),
            UsPresident(
                R.drawable.ic_nelson_mandela_peace_and_freedom,
                "Nelson",
                "Mandela"
            ),
            UsPresident(
                R.drawable.ic_johnny_automatic_abraham_lincoln,
                "Abraham",
                "Lincoln"
            ),
            UsPresident(
                R.drawable.ic_zeimusu_george_washington_1,
                "George",
                "Washington"
            ),
            UsPresident(
                R.drawable.ic_publicdomainq_politician_adolf_hitler,
                "Adolf",
                "Hitler"
            ),
            UsPresident(
                R.drawable.ic_trump_colour,
                "Donald",
                "Trump"
            ),
            UsPresident(
                R.drawable.ic_vladimir_putin_2006,
                "Valdimer",
                "Putin"
            ),
            UsPresident(
                R.drawable.ic_william_mckinley,
                "William",
                "Mckinley"
            ),
            UsPresident(
                R.drawable.ic_trump_colour,
                "Donald",
                "Trump"
            ),
            UsPresident(
                R.drawable.ic_jfk,
                "John",
                "Kennedy"
            ),
            UsPresident(
                R.drawable.ic_johnny_automatic_abraham_lincoln,
                "Abraham",
                "Lincoln"
            ),
            UsPresident(
                R.drawable.ic_vladimir_putin_2006,
                "Valdimir",
                "Putin"
            ),
            UsPresident(
                R.drawable.ic_andrew_jackson,
                "Andrew",
                "Jackson"
            ),
            UsPresident(
                R.drawable.ic_nelson_mandela_peace_and_freedom,
                "Nelson",
                "Mandela"
            ),
            UsPresident(
                R.drawable.ic_zeimusu_george_washington_1,
                "George",
                "Washington"
            ),
            UsPresident(
                R.drawable.ic_eisenhower,
                "Eisen",
                "Hower"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id._imageRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = PresidentAdapter(this, imageList){
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}
