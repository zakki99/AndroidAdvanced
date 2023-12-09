package com.example.androidadvanced

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var  recyclerView: RecyclerView
    private  lateinit var  dataList: ArrayList<ClubData>
    lateinit var ClubImage:List<Int>
    lateinit var ClubName:List<String>


    private lateinit var bottomnavigation: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        bottomnavigation =findViewById(R.id.bottom_nav)
        bottomnavigation.setOnClickListener{menuItem ->
            when(menuItem.id){
                R.id.bottom_home ->{
                    replaceFragment(FragmentHome())
                    true
                }
                R.id.bottom_notif ->{
                    replaceFragment(FragmentNotification())
                    true
                }
                R.id.bottom_search ->{
                    replaceFragment(FragmentSearch())
                    true
                }
                R.id.bottom_profil ->{
                    replaceFragment(FragmentProfile())
                    true
                }
                else -> false
            }
            replaceFragment(FragmentHome())
        }

    }

    private fun getData(){
        for (i in ClubImage.indices){
            val dataClub = ClubData(ClubImage[i],ClubName[i])
            dataList.add(dataClub)
        }
        recyclerView.adapter = ClubAdapter(dataList)
    }
    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.frame_container,fragment).commit()
    }

}