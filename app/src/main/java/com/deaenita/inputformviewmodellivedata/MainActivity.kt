package com.deaenita.inputformviewmodellivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.deaenita.inputformviewmodellivedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MahasiswaViewModel
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this).get(MahasiswaViewModel::class.java)

        binding.btnSimpan.setOnClickListener {
            val nama = binding.etNama.text.toString()
            val nim = binding.etNIM.text.toString()
            val kelas = binding.etKelas.text.toString()

            viewModel.simpanData(nama, nim, kelas)
        }

        viewModel.nama.observe(this, { nama ->
            binding.tvNama.text = "Nama: $nama"
        })

        viewModel.nim.observe(this, { nim ->
            binding.tvNIM.text = "NIM: $nim"
        })

        viewModel.kelas.observe(this, { kelas ->
            binding.tvKelas.text = "Kelas: $kelas"
        })
    }
}