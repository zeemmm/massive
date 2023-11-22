package belajar.percobaan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.btn_1
import kotlinx.android.synthetic.main.activity_main.btn_2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    btnLoginListener()
    btnRegisterListener()
    }

    private fun btnLoginListener(){
        btn_1.setOnClickListener{
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
    private fun btnRegisterListener(){
        btn_2.setOnClickListener{
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }


}