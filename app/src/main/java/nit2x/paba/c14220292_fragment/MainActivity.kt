package nit2x.paba.c14220292_fragment

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.frameContainer)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val mFragmentManager = supportFragmentManager
        val mfSatu = fSatu()

        mFragmentManager.findFragmentByTag(fSatu::class.java.simpleName)
        mFragmentManager
            .beginTransaction()
            .add(R.id.frameContainer, mfSatu, fSatu::class.java.simpleName)
            .commit()

        val _btnSatu = findViewById<TextView>(R.id.btnfSatu)
        _btnSatu.setOnClickListener {
            val intent = Intent(this, fSatu::class.java).apply {
            }
            startActivity(intent)
            finish()
        }

        val _btnDua = findViewById<TextView>(R.id.btnfDua)
        _btnDua.setOnClickListener {
            val intent = Intent(this, fDua::class.java).apply {
            }
            startActivity(intent)
            finish()
        }

        val _btnTiga = findViewById<TextView>(R.id.btnfTiga)
        _btnTiga.setOnClickListener {
            val intent = Intent(this, fTiga::class.java).apply {
            }
            startActivity(intent)
            finish()
        }
    }
}