package kolbapps.com.util

import android.util.Log

class AndroidUtils {
    companion object {
        fun teste() {
            Log.d("Teste lib", "Funcionou!!!")
        }
    }

    external fun stringFromJNI(): String

    fun testeNdk() {
        System.loadLibrary("native-lib")
        Log.d("Teste lib", stringFromJNI())
    }
}