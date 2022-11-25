package my.todoapp

import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK
import android.content.Intent.FLAG_ACTIVITY_NEW_TASK
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity


class TasksActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tasks)

        val accountScreenImageButton = findViewById<ImageButton>(R.id.toAccountScreen)

        accountScreenImageButton.setOnClickListener {
            val intent = Intent(this, AccountActivity::class.java)
            intent.flags = FLAG_ACTIVITY_CLEAR_TASK or FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        }

        val mainScreenImageButton = findViewById<ImageButton>(R.id.toMainScreen)

        mainScreenImageButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = FLAG_ACTIVITY_CLEAR_TASK or FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        }
    }
}