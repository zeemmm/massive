package belajar.percobaan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.arrow_back

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnBackLoginListener()

    }
    private fun btnBackLoginListener(){
        arrow_back.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }
    }

}