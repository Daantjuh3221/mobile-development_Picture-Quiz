package nl.daanbefort.picturequiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnConfirm.setOnClickListener {
            checkAnswer()
        }

    }

    /**
     * Check if the submitted answer is correct.
     */
    private fun checkAnswer() {
        val answer = etAnswer.text.toString()
        // When the anwer is empty then display empty message using a toast message
        // When the answer equals "Giraffe" then display a correct message using a toast message.
        // Otherwise display an incorrect message.
        when {
            answer.isNullOrEmpty() -> Toast.makeText(this, getString(R.string.empty), Toast.LENGTH_LONG).show()
            answer == getString(R.string.giraffe) -> Toast.makeText(this, getString(R.string.correct), Toast.LENGTH_LONG).show()
            else -> Toast.makeText(this, getString(R.string.incorrect), Toast.LENGTH_LONG).show()
        }

    }
}
