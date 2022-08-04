package dev.toriyama.android.recyclerview_sandbox.presentation.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import dev.toriyama.android.recyclerview_sandbox.R
import dev.toriyama.android.recyclerview_sandbox.databinding.ListTodoBinding
import dev.toriyama.android.recyclerview_sandbox.model.Todo

class TodoAdapter(context: Context) : RecyclerView.Adapter<TodoHolder>() {
    var items: List<Todo> = emptyList()
    private val inflater = LayoutInflater.from(context)

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoHolder {
        val binding =
            DataBindingUtil.inflate<ListTodoBinding>(inflater, R.layout.list_todo, parent, false)
        return TodoHolder(binding)
    }

    override fun onBindViewHolder(holder: TodoHolder, position: Int) {
        holder.binding.item = items[position]
        holder.binding.executePendingBindings()
    }
}

class TodoHolder(
    val binding: ListTodoBinding
) : RecyclerView.ViewHolder(binding.root)