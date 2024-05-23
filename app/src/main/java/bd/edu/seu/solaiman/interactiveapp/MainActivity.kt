package bd.edu.seu.solaiman.interactiveapp

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val buttonNyanza= findViewById<Button>(R.id.btnNyanza)
        val buttonTaupe= findViewById<Button>(R.id.btnTaupe)
        val buttonBursa= findViewById<Button>(R.id.btnBursa)
        val buttonFiona= findViewById<Button>(R.id.btnFiona)
        val buttonDrape= findViewById<Button>(R.id.btnDrape)
        val buttonHavana= findViewById<Button>(R.id.btnHavana)
        val buttonJade= findViewById<Button>(R.id.btnJade)
        val buttonGarland = findViewById<Button>(R.id.btnGarland)
        val buttonPale= findViewById<Button>(R.id.btnPale)
        val layout= findViewById<LinearLayout>(R.id.main)

        buttonNyanza.setOnClickListener{
            layout.setBackgroundResource(R.color.nyanza)
            Toast.makeText(applicationContext, "Nyanza", Toast.LENGTH_SHORT).show()
        }
        buttonTaupe.setOnClickListener{
            layout.setBackgroundResource(R.color.Taupe)
            Toast.makeText(applicationContext, "Taupe", Toast.LENGTH_SHORT).show()

        }
        buttonBursa.setOnClickListener{
            layout.setBackgroundResource(R.color.Bursa)
            Toast.makeText(applicationContext, "Bursa", Toast.LENGTH_SHORT).show()

        }
        buttonFiona.setOnClickListener{
            layout.setBackgroundResource(R.color.Fiona)
            Toast.makeText(applicationContext, "Fiona", Toast.LENGTH_SHORT).show()

        }
        buttonDrape.setOnClickListener{
            layout.setBackgroundResource(R.color.Drape)
            Toast.makeText(applicationContext, "Drape", Toast.LENGTH_SHORT).show()

        }
        buttonHavana.setOnClickListener{
            layout.setBackgroundResource(R.color.Havana)
            Toast.makeText(applicationContext, "Havana", Toast.LENGTH_SHORT).show()

        }
        buttonJade.setOnClickListener{
            layout.setBackgroundResource(R.color.Jade)
            Toast.makeText(applicationContext, "Jade", Toast.LENGTH_SHORT).show()

        }
        buttonPale.setOnClickListener{
            layout.setBackgroundResource(R.color.Pale)
            Toast.makeText(applicationContext, "Pale", Toast.LENGTH_SHORT).show()

        }
        buttonGarland.setOnClickListener{
            layout.setBackgroundResource(R.color.Garland)
            Toast.makeText(applicationContext, "Garland", Toast.LENGTH_SHORT).show()

        }

    }
}