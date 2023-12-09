package com.example.androidadvanced

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidadvanced.R
import android.widget.Adapter
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.androidadvanced.databinding.FragmentHomeBinding


class FragmentHome : Fragment() {
    private lateinit var binding:FragmentHomeBinding
    private lateinit var adapter: ClubAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        val dataList=generateDataList()
        adapter =ClubAdapter(dataList)
    }

    private fun generateDataList(): List<ClubData> {
        val clubDataList = mutableListOf<ClubData>()

        clubDataList.add(ClubData(R.drawable.mu,"Manchester United"))
        clubDataList.add(ClubData(R.drawable.inter,"Inter Milan"))
        clubDataList.add(ClubData(R.drawable.atm,"Atletico Madrid"))

        return clubDataList

    }
}




