package com.todoweather.ui.adapter


import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.todoweather.data.entities.TaskDateEntity
import com.todoweather.databinding.ParentItemBinding

class ParentAdapter :
    RecyclerView.Adapter<ParentAdapter.TasksViewHolder>() {

    private val items = ArrayList<TaskDateEntity>()

    fun setItems(items: List<TaskDateEntity>) {
        this.items.clear()
        this.items.addAll(items)
        notifyDataSetChanged()
    }

    inner class TasksViewHolder(val itemBinding: ParentItemBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
        private val adapter = ChildAdapter()

        @SuppressLint("WrongConstant")
        fun bind(item: TaskDateEntity) {
            with(itemBinding) {
                childRecyclerView.adapter = adapter
                childRecyclerView.layoutManager = LinearLayoutManager(
                    childRecyclerView.context,
                    LinearLayout.VERTICAL,
                    false
                )
                dateTextView.text = item.date
                adapter.setItems(item.tasks)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TasksViewHolder {
        val binding: ParentItemBinding =
            ParentItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TasksViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TasksViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

}