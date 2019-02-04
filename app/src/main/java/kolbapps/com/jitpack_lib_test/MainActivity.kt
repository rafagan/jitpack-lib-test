package kolbapps.com.jitpack_lib_test

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kolbapps.com.util.AndroidUtils

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AndroidUtils.teste()
    }
}
