package cat.dam.andy.viewsevents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener, View.OnLongClickListener {
    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var btn3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        initListeners()
    }

    private fun initViews() {
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
    }

    private fun initListeners() {
        val buttons = listOf(btn1, btn2, btn3)
        for (button in buttons) {
            button.setOnClickListener(this)
            button.setOnLongClickListener(this)
        }
    }

    override fun onClick(v: View?) {
        //comprovar quin boto s'ha clicat
        when (v?.id) {
            R.id.btn1 -> Toast.makeText(this, "Has clicat el botó 1!", Toast.LENGTH_SHORT).show()
            R.id.btn2 -> Toast.makeText(this, "Has clicat el botó 2!", Toast.LENGTH_SHORT).show()
            R.id.btn3 -> Toast.makeText(this, "Has clicat el botó 3!", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onLongClick(v: View?): Boolean {
        //comprovar quin boto s'ha clicat
        when (v?.id) {
            R.id.btn1 -> Toast.makeText(this, "Has fet un clic llarg al botó 1!", Toast.LENGTH_SHORT).show()
            R.id.btn2 -> Toast.makeText(this, "Has fet un clic llarg al botó 2!", Toast.LENGTH_SHORT).show()
            R.id.btn3 -> Toast.makeText(this, "Has fet un clic llarg al botó 3!", Toast.LENGTH_SHORT).show()
        }
        return true
    }
}