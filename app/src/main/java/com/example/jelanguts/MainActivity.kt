package com.example.jelanguts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(DataModel(R.drawable.indonesia, "indonesia","Nama Rupiah berasal dari kata India: (rupiya) yang juga berakar dari bahasa Sansekerta yaitu: rupyakam  yang berarti perak " +
                "Nama 'Rupiah' dijadikan nama mata uang Indonesia dikarenakan pengaruh budaya India yang kuat semasa kejayaan kerajaan-kerajaan Hindu-Buddha di Nusantara selama ratusan tahun yang telah terasimilasi " +
                "kedalam budaya dan perbahasaan di Indonesia. Nama Rupee (dibaca rupi) juga digunakan untuk mata uang negara-negara seperti India, Pakistan, Nepal, Seychelles, " +
                "Mauritius dan Sri Lanka sementara di Maladewa diketahui sebagai (Rufiyah), mirip dengan di Indonesia Rupiyah, hanya dibedakan dengan f."))


        data?.add(DataModel(R.drawable.singapur,"singapur","Dolar Singapura (SGD atau S$) adalah mata uang negara Singapura. " +
                "Mata uang ini dicetak dan diatur penggunaannya oleh Otoritas Moneter Singapura. Satu dolar Singapura dibagi menjadi 100 sen. "))

        data?.add(DataModel(R.drawable.jepang,"jepang","mata uang Yen telah digunakan sejak 27 Juni 1871 sebagai bagian dari Shinka jōrei (peraturan pemerintah Jepang tentang mata uang baru). " +
                "Menurut ISO 4217, mata uang ini dilambangkan dengan 'JPY'."))

        data?.add(DataModel(R.drawable.korea,"korea","Korsel memiliki mata uang yang bernama Won dan dikeluarkan Bank of Korea. " +
                "Won ditulis dengan simbol “₩”, sementara kode ISO 4217 untuk Won adalah “KRW”."))

        data?.add(DataModel(R.drawable.thailand,"thailand","Mata uang negara Thailand adalah Baht, mata uang negara Thailand ini biasa disebut THB. " +
                "Mata uang negara Thailand adalah Baht dan pada hari ini 19 September 2021 ini memiliki nilai tukar rupiah Rp428.47 untuk 1 Baht."))

        data?.add(DataModel(R.drawable.malaysia,"malaysia","Mata uang Malaysia adalah Ringgit atau dikenal sebagai Ringgit Malaysia (RM). " +
                "Kode ISO untuk mata uang ini adalah MYR (Malaysian Ringgit)."))

        //Set data to Adapter
        recyclerView.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
}