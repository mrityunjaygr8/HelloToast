package gr8.mrityunjay.hellotoast

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        val LOG_TAG_NAME = MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showToast(view: View) {
        Log.d(LOG_TAG_NAME, "Toast")
        val countString = count_text.text.toString()
        val count = Integer.parseInt(countString)
        val toast = Toast.makeText(this, count.toString(), Toast.LENGTH_SHORT)
        toast.show()
    }

    fun countUp(view: View) {
        val countString = count_text.text.toString()
        var count = Integer.parseInt(countString)
        count++
        count_text.text = count.toString()
    }

}
