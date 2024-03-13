
package np.com.satishray.tomato



import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class Loginactivity : AppCompatActivity() {


    lateinit var phone: EditText
    lateinit var button: Button
    lateinit var forgotpassword: TextView
    val validphone = "9876543210"

    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        phone = findViewById(R.id.phone)
       button =  findViewById(R.id.button)
        forgotpassword = findViewById(R.id.forgotpassword)



        button.setOnClickListener {

            val phone = phone.text.toString()

            if (phone == validphone) {
 val intent = Intent(this@Loginactivity, HomeActivity::class.java)
                startActivity(intent)
               finish()
            } else
            {
                Toast.makeText(
                    this@Loginactivity,
                    "Please Enter Valid Phone Number!",
                    Toast.LENGTH_LONG
                ).show()
            }

        }
        fun onPause()
        {
            super.onPause()
            finish()
        }
   }


}