package mx.itson.edu.practica5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnAntojitos:Button=findViewById(R.id.btn_antojitos)
        var btnEspecialidades:Button=findViewById(R.id.btn_especialidades)

        btnAntojitos.setOnClickListener {
            var intent: Intent =Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType", "Antojitos")
            startActivity(intent)
        }

        btnEspecialidades.setOnClickListener {
            var intent: Intent =Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType", "Especialidades")
            startActivity(intent)
        }
    }
}