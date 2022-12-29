package com.example.finaluygulama

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Switch
import android.widget.Toast
import androidx.core.widget.addTextChangedListener


val dosyayolu="com.example.finaluygulama"
var anahtarisim="isim"
val anahtarsifre="sifre"
var anahtarswitch="switch"

class girisekrani : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_girisekrani)


        var isim=findViewById<EditText>(R.id.isim)
        var sifre=findViewById<EditText>(R.id.sifre)
        var benihatirla=findViewById<Switch>(R.id.benihatirla)
        var preferences=getSharedPreferences(dosyayolu,Context.MODE_PRIVATE)
        var editor=preferences.edit()
        var swdurum=benihatirla.isChecked
        var progressbar2=findViewById<ProgressBar>(R.id.progressbar2)

        Toast.makeText(applicationContext, "Kaydedilen : "+
                "İsim: ${preferences.getString(anahtarisim,"Değer Yok ")}"+
                "Şifre: ${preferences.getString(anahtarsifre,"Değer Yok ")}" +
                "Unutma: ${swdurum}",Toast.LENGTH_SHORT).show()



        isim.addTextChangedListener{
            var isimm = isim.text.toString()
            var sifree = sifre.text.toString()
            if(isimm == "Beste Kocaoglu" && sifree == "02190201076" ){
                if (swdurum==true){
                    editor.putString(anahtarisim, isimm)
                    editor.putString(anahtarsifre, sifree)
                    editor.apply()
                }
                Handler().postDelayed({
                    progressbar2.visibility = View.VISIBLE
                    var ucegecis = Intent(applicationContext, MainActivity3::class.java)
                    startActivity(ucegecis)
                }, 1000)
            }
        }
        sifre.addTextChangedListener{
            var isimm = isim.text.toString()
            var sifree = sifre.text.toString()
            if(isimm == "Beste Kocaoglu" && sifree == "02190201076" ){
                if (swdurum==true){
                    editor.putString(anahtarisim, isimm)
                    editor.putString(anahtarsifre, sifree)
                    editor.apply()
                }
                Handler().postDelayed({
                    progressbar2.visibility = View.VISIBLE
                    var ucegecis = Intent(applicationContext, MainActivity3::class.java)
                    startActivity(ucegecis)
                }, 1000)
            }
        }
    }
}