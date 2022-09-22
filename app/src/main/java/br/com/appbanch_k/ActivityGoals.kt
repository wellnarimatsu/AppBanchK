package br.com.appbanch_k


import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class ActivityGoals : AppCompatActivity() {


    private lateinit var btn_home: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_goals)

        btn_home = findViewById(R.id.icon_home)

        btn_home.setOnClickListener{

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }


    }
}