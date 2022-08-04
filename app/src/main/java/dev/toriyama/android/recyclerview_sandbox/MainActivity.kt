package dev.toriyama.android.recyclerview_sandbox

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.toriyama.android.recyclerview_sandbox.presentation.activity.TodoActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(
            this,
            TodoActivity::class.java
        )
        startActivity(intent)
    }
}