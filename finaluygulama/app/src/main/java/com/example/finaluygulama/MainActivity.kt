package com.example.finaluygulama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ProgressBar
import android.widget.SeekBar
import kotlin.math.max

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var kaydirma=findViewById<SeekBar>(R.id.kaydirma)
        var progress=findViewById<ProgressBar>(R.id.progressbar)


        kaydirma.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                if (p1==100){
                    progress.visibility=View.VISIBLE
                    Handler().postDelayed({
                        var ikiyegecis= Intent(applicationContext,girisekrani::class.java)
                        startActivity(ikiyegecis)
                        finish()
                    },2000)
                }
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                    kaydirma.setProgress(0,true)

            }

        })
    }
}



