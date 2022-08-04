package dev.toriyama.android.recyclerview_sandbox.presentation.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import dev.toriyama.android.recyclerview_sandbox.R
import dev.toriyama.android.recyclerview_sandbox.databinding.ActivityTodoBinding
import dev.toriyama.android.recyclerview_sandbox.model.Todo
import dev.toriyama.android.recyclerview_sandbox.presentation.adapter.TodoAdapter
import java.util.*

class TodoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding =
            DataBindingUtil.setContentView<ActivityTodoBinding>(this, R.layout.activity_todo)
        val adapter = TodoAdapter(this)
        adapter.items = listOf(
            Todo("ゴミ出し", Date()),
            Todo("料理", Date()),
            Todo("買い物", Date()),
            Todo("ゴミ出し", Date()),
            Todo("料理", Date()),
            Todo("買い物", Date()),
            Todo("ゴミ出し", Date()),
            Todo("料理", Date()),
            Todo("買い物", Date()),
            Todo("ゴミ出し", Date()),
            Todo("料理", Date()),
            Todo("買い物", Date()),
            Todo("ゴミ出し", Date()),
            Todo("料理", Date()),
            Todo("買い物", Date()),
        )
        binding.todoList.layoutManager = LinearLayoutManager(this)
        binding.todoList.adapter = adapter
    }
}