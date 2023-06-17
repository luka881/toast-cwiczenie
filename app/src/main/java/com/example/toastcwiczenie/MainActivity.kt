import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(.layout.activity_main)

        val myButton: Button = findViewById(.id.myButton)
        myButton.run {
            )
            setOnClickListener(object : View.OnClickListener {
                override fun onClick(v: View?) {
                    Toast.makeText(applicationContext, "Button Clicked!", Toast.LENGTH_SHORT).show()
                }
            })
        }
    }
}