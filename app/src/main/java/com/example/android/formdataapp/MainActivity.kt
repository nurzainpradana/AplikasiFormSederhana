package com.example.android.formdataapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.view.isEmpty
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
        var jenisKelamin: String = ""
        var alamat: String
        var email: String
        var asalSekolah: String
        var kompetensi: String

        // Mengecek Data
        if (et_name.text.toString() == "" || et_nik.text.toString() == ""
            || et_usia.text.toString() == "" || et_alamat.text.toString() == ""
            || et_email.text.toString() == "" || et_asal_sekolah.text.toString() == ""
            || rg_jk.checkedRadioButtonId == -1){
            Toast.makeText(this, "Data Belum Lengkap", Toast.LENGTH_SHORT).show()
        } else {
            // Mengambil Data Dari Form
            nama = et_name.text.toString()
            nik = et_nik.text.toString().toInt()
            usia = et_usia.text.toString().toInt()
            alamat = et_alamat.text.toString()
            email = et_alamat.text.toString()
            asalSekolah = et_asal_sekolah.text.toString()
            kompetensi = et_kompetensi.text.toString()

            if (rb_laki_laki.isChecked)
                jenisKelamin = "Laki-Laki"
            if (rb_perempuan.isChecked)
                jenisKelamin = "Perempuan"

            // Mengubah Layout Form menjadi invisible & layout tampil data menjadi visible
            layout_form.visibility = View.INVISIBLE
            layout_tampil_data.visibility = View.VISIBLE

            // Menampilkan Data Ke TextView pada layout tampil data
            tv_name.text = nama
            tv_nik.text = nik.toString()
            tv_usia.text = usia.toString()
            tv_jenis_kelamin.text = jenisKelamin
            tv_alamat.text = alamat
            tv_email.text = email
            tv_asal_sekolah.text = asalSekolah
            tv_kompetensi.text = kompetensi

        }
    }

    fun kembali(view: View) {
        // Mengubah Layout Form menjadi visible & layout tampil data menjadi invisible
        layout_form.visibility = View.VISIBLE
        layout_tampil_data.visibility = View.INVISIBLE
    }
}