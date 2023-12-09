package com.example.androidadvanced

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidadvanced.databinding.ListItem2Binding


class ClubAdapter (private val dataList: List<ClubData>): RecyclerView.Adapter<ClubAdapter.ViewHolder> () {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val binding = ListItem2Binding.inflate(LayoutInflater.from(parent.context), parent, false)
            return ViewHolder(binding)
        }

        override fun getItemCount(): Int = dataList.size


        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            with(holder) {
                with(dataList[position]) {
                    binding.logoclub.setImageResource(this.Clublogo)
                    binding.namaclub.text = this.Clubname
                }
            }
        }
    class ViewHolder(val binding: ListItem2Binding) : RecyclerView.ViewHolder(binding.root)
    }
