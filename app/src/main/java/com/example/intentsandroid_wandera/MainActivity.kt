package com.example.intentsandroid_wandera

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var sms:Button
    private lateinit var email:Button
    private lateinit var camera:Button
    private lateinit var share:Button
    private lateinit var mpesa:Button
    private lateinit var call:Button
    private lateinit var website:Button
    private lateinit var map:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sms = findViewById(R.id.btnsms)
        email = findViewById(R.id.btnemail)
        camera = findViewById(R.id.btncamera)
        share = findViewById(R.id.btnshare)
        mpesa = findViewById(R.id.btnmpesa)
        call = findViewById(R.id.btncall)
        website = findViewById(R.id.btnwebsite)
        map = findViewById(R.id.btnmap)

        sms.setOnClickListener {
        val uri: Uri = Uri.parse("smsto:0746458093")
        val intent = Intent(Intent.ACTION_SENDTO,uri)
        intent.putExtra("sms_body","Hello")
        startActivity(intent)}

        email.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SENDTO,Uri.fromParts("mailto","wanderastecy64@gmail.com"))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT,"JOB APPLICATION")
            emailIntent.putExtra(Intent.EXTRA_TEXT,"Dear Madam.......")
            startActivity()
        }

        camera.setOnClickListener {

        }




            website.setOnClickListener {
                val gotoanotheractivity = Intent(this, Websiteactivity::class.java)
                startActivity(gotoanotheractivity)
            }
        }
    }
}