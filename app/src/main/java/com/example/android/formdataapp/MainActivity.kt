package com.example.android.formdataapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun simpanData(view: View) {
        var nama: String
        var nik: Int
        var usia: Int
        var jenisKelamin: String
        var alamat: String
        var email: String
        var asalSekolah: String
        var kompetensi: String

        // Mengecek Data
        if (et_name.text.toString() == "" || et_nik.text.toString() == ""
            || et_usia.text.toString() == "" || et_alamat.text.toString() == ""
            || et_email.text.toString() == "" || et_asal_sekolah.text.toString() == ""){

        }

    }
}