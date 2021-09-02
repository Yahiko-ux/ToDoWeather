package com.todoweather.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.todoweather.data.entities.TaskEntity
import com.todoweather.databinding.ChildItemBinding

class ChildAdapter : RecyclerView.Adapter<ChildAdapter.ChildViewHolder>() {

    private val items = ArrayList<TaskEntity>()

    fun setItems(items: List<TaskEntity>) {
        this.items.clear()
        this.items.addAll(items)
        notifyDataSetChanged()
    }

    inner class ChildViewHolder(private val itemBinding: ChildItemBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {

        fun bind(item: TaskEntity) {
            itemBinding.taskText.text = item.text
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChildViewHolder {
        val binding: ChildItemBinding =
            ChildItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ChildViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ChildViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size


}