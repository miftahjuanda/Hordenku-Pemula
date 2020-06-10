package com.kelaspemula.hordenku.Data

import com.kelaspemula.hordenku.Pojo.Horden
import com.kelaspemula.hordenku.R
import kotlinx.android.synthetic.*

object HordenData {
    private val namesHorden = arrayOf("ALVINE SPETS", "BERGSKRABBA", "LENDA", "STRANDTRIFT", "MERETE", "TIBAST", "MARJUN", "BORGHILD", "HANNALENA"
    ,"MAJGULL", "SPARVORT", "HILLEBORG", "VILBORG")

    //private val spesifikasiHorden = arrayOf("putih pudar", "Gorden")
    private val spesifikasiHorden = arrayOf("Vitrase, 1 pasang, putih pudar", "Gorden, 1 pasang, biru/merah garis-garis", "Gorden dengan pengikat, 1 pasang, abu-abu", "Gorden, 1 pasang, ungu/putih"
    ,"Gorden penggelap ruangan, 1 pasang, cokelat muda-merah", "Gorden, 1 pasang, biru", "Tirai penggelap ruangan, 1 pasang, ungu", "Gorden tipis, 1 pasang, putih", "Gorden penggelap ruangan, 1 pasang, abu-abu"
    ,"Gorden anti tembus cahaya, 1 pasang, hijau", "Gorden tipis, 1 pasang, putih", "Gorden anti tembus cahaya, 1 pasang, abu-abu", "Tirai penggelap ruangan, 1 pasang, putih/toska")

    private val hargaHorden = arrayOf("Rp 149.000", "Rp 499.000","Rp 299.000", "Rp 399.000", "Rp 499.000", "Rp 999.000", "Rp 799.000", "Rp 399.000", "Rp 699.000"
    ,"Rp 799.000", "Rp 699.000", "Rp 599.000", "Rp 999.000")

    private val fiturHorden = arrayOf("Gorden dengan kain tipis memberikan privasi, sementara membiarkan sinar matahari masuk dan membantu Anda merasa terhubung dengan dunia di luar jendela."
        , "Solusi sempurna ketika Anda menginginkan privasi atau ingin memblokir pantulan cahaya yang mengganggu di layar TV dan komputer. Cahaya luar masih muncul dan menciptakan suasana yang nyaman di dalam ruangan."
    ,"Solusi sempurna ketika Anda menginginkan privasi atau ingin memblokir pantulan cahaya yang mengganggu di layar TV dan komputer. Cahaya luar masih muncul dan menciptakan suasana yang nyaman di dalam ruangan."
    ,"Solusi sempurna ketika Anda menginginkan privasi atau ingin memblokir pantulan cahaya yang mengganggu di layar TV dan komputer. Cahaya luar masih muncul dan menciptakan suasana yang nyaman di dalam ruangan."
    ,"Tirai yang menggelapkan ruang mencegah sebagian besar cahaya masuk dan memberikan privasi baik siang maupun malam dengan menghalangi pandangan dari luar."
    ,"Solusi sempurna ketika Anda menginginkan privasi atau ingin memblokir pantulan cahaya yang mengganggu di layar TV dan komputer. Cahaya luar masih muncul dan menciptakan suasana yang nyaman di dalam ruangan."
    ,"Tirai yang menggelapkan ruang mencegah sebagian besar cahaya masuk dan memberikan privasi baik siang maupun malam dengan menghalangi pandangan dari luar."
    ,"Gorden dengan kain tipis memberikan privasi, sementara membiarkan sinar matahari masuk dan membantu Anda merasa terhubung dengan dunia di luar jendela."
    ,"Tirai yang menggelapkan ruang mencegah sebagian besar cahaya masuk dan memberikan privasi baik siang maupun malam dengan menghalangi pandangan dari luar."
    ,"Dengan gorden anti tembus cahaya tidur Anda tidak akan terganggu oleh cahaya bulan dan lampu jalan - atau dibangunkan oleh sinar matahari ketika Anda ingin tidur lebih lama. Kainnya yang berat menjulur ke bawah dengan lembut dan merata."
    ,"Solusi sempurna ketika Anda menginginkan privasi atau ingin memblokir pantulan cahaya yang mengganggu di layar TV dan komputer. Cahaya luar masih muncul dan menciptakan suasana yang nyaman di dalam ruangan."
    ,"Dengan gorden anti tembus cahaya tidur Anda tidak akan terganggu oleh cahaya bulan dan lampu jalan - atau dibangunkan oleh sinar matahari ketika Anda ingin tidur lebih lama. Kainnya yang berat menjulur ke bawah dengan lembut dan merata."
    ,"Efektif menahan aliran udara di musim dingin dan udara panas di musim panas.\n" +
                "\n" +
                "Gorden yang ditenun dengan sangat padat menggelapkan ruangan dan mencegah orang di luar untuk melihat ke dalam.\n" +
                "\n" +
                "Gorden dapat digunakan pada batang atau trek gorden.\n" +
                "\n" +
                "Pita bagian atas memudahkan anda menciptakan lipatan menggunakan pengait gorden RIKTIG.\n" +
                "\n" +
                "Anda dapat menggantung gorden pada rel gorden melalui penggantung di belakang atau dengan cincin atau pengait.")

    private val ukuranHorden = arrayOf("Panjang:\t250 cm\n" +
            "            Lebar:\t145 cm\n" +
            "            Berat:\t0,50 kg\n" +
            "            Area:\t3,63 m²\n" +
            "            Jumlah paket:\t2"
        , "Panjang:\t250 cm\n" +
                "Lebar:\t145 cm\n" +
                "Berat:\t1,08 kg\n" +
                "Area:\t3,63 m\n" +
                "Jumlah paket:\t2"
    ,"Panjang:\t250 cm\n" +
                "Lebar:\t140 cm\n" +
                "Berat:\t1,80 kg\n" +
                "Area:\t3,50 m²\n" +
                "Jumlah paket:\t2 "
    , "Panjang:\t250 cm\n" +
                "Lebar:\t145 cm\n" +
                "Berat:\t0,89 kg\n" +
                "Area:\t3,63 m²\n" +
                "Jumlah paket:\t2"
    ,"Panjang:\t250 cm\n" +
                "Lebar:\t145 cm\n" +
                "Berat:\t2,43 kg\n" +
                "Area:\t3,63 m²\n" +
                "Jumlah paket:\t2"
    ,"Panjang:\t250 cm\n" +
                "Lebar:\t145 cm\n" +
                "Berat:\t2,23 kg\n" +
                "Area:\t3,63 m²\n" +
                "Jumlah paket:\t2"
    ,"Panjang:\t250 cm\n" +
                "Lebar:\t145 cm\n" +
                "Berat:\t2,79 kg\n" +
                "Area:\t3,63 m²\n" +
                "Jumlah paket:\t2"
    ,"Panjang:\t250 cm\n" +
                "Lebar:\t145 cm\n" +
                "Area:\t3,63 m²\n" +
                "Jumlah paket:\t2"
    ,"Panjang:\t250 cm\n" +
                "Lebar:\t145 cm\n" +
                "Berat:\t1,60 kg\n" +
                "Area:\t3,63 m²\n" +
                "Jumlah paket:\t2"
    ,"Panjang:\t250 cm\n" +
                "Lebar:\t145 cm\n" +
                "Berat:\t2,00 kg\n" +
                "Area:\t3,63 m²\n" +
                "Jumlah paket:\t2"
    ,"Panjang:\t250 cm\n" +
                "Lebar:\t145 cm\n" +
                "Area:\t3,63 m²\n" +
                "Jumlah paket:\t2"
    ,"Panjang:\t250 cm\n" +
                "Lebar:\t145 cm\n" +
                "Berat:\t1,96 kg\n" +
                "Area:\t3,63 m²\n" +
                "Jumlah paket:\t2"
    ,"Panjang:\t250 cm\n" +
                "Lebar:\t145 cm\n" +
                "Berat:\t2,50 kg\n" +
                "Area:\t3,63 m²\n" +
                "Jumlah paket:\t2")
    //private val ukuranHorden = arrayOf("Panjang", "Panjang")

    private val bahanHorden = arrayOf("100 % poliester (100% daur ulang)", "Gorden/tirai:\t 70% katun, 30% linen \n" +
            "Perekat atas:\t 100% poliester", "100% katun", "100 % poliester (100% daur ulang)", "100% katun", "100% poliester", "71% katun, 29% poliester"
    ,"100% poliester (min. 90% recycled)", "100% poliester", "87% poliester, 13% viskosa/rayon", "100 % poliester (100% daur ulang)", "100% poliester", "100% poliester")
    //private val bahanHorden = arrayOf("daur ulang)", "Perekat atas")

    private val kelebihanHorden = arrayOf("Gorden tipis memungkinkan sinar matahari masuk namun tetap memberi privasi sehingga cocok digunakan pada solusi jendela berlapis. Celah di bagian atas memungkinkan anda menggantung gorden langsung pada batang gorden."
    ,"Gorden tipis memungkinkan sinar matahari masuk namun tetap memberi privasi sehingga cocok digunakan pada solusi jendela berlapis. Celah di bagian atas memungkinkan anda menggantung gorden langsung pada batang gorden."
    ,"Carikan kain di bagian atas memudahkan anda menggantung gorden langsung pada rel gorden. Gorden dapat menurunkan tingkat cahaya dan mencegah orang di luar melihat langsung ke dalam."
    ,"Gorden dapat digunakan pada batang atau trek gorden. Pita bagian atas memudahkan anda menciptakan lipatan menggunakan pengait gorden RIKTIG. Anda dapat menggantung gorden pada rel gorden melalui penggantung di belakang atau dengan cincin atau pengait. Gorden dapat menurunkan tingkat cahaya dan mencegah orang di luar melihat langsung ke dalam."
    ,"Bagian atas yang berlubang memungkinkan anda menggantung gorden langsung pada batang tirai. Gorden tebal menggelapkan ruangan dan mencegang orang di luar melihat ke dalam ruangan. Efektif menahan aliran udara di musim dingin dan udara panas di musim panas."
    ,"Anda dapat menggantung gorden pada rel gorden melalui penggantung di belakang atau dengan cincin atau pengait. Gorden dapat menurunkan tingkat cahaya dan mencegah orang di luar melihat langsung ke dalam. Gorden dapat digunakan pada batang atau trek gorden. Pita bagian atas memudahkan anda menciptakan lipatan menggunakan pengait gorden RIKTIG. Pita pengait gorden memiliki warna yang sama dengan gorden sehingga terlihat rapi juga dari belakang."
    ,"Efektif menahan aliran udara di musim dingin dan udara panas di musim panas. Gorden anti tembus cahaya menghalangi cahaya masuk dan benar-benar menggelapkan ruangan Anda. Gorden dapat digunakan pada batang atau trek gorden. Anda dapat menggantung gorden pada rel gorden melalui penggantung di belakang atau dengan cincin atau pengait. Pita bagian atas memudahkan anda menciptakan lipatan menggunakan pengait gorden RIKTIG."
    ,"Gorden dapat digunakan pada batang atau trek gorden. Gorden tipis memungkinkan sinar matahari masuk namun tetap memberi privasi sehingga cocok digunakan pada solusi jendela berlapis. Pita bagian atas memudahkan anda menciptakan lipatan menggunakan pengait gorden RIKTIG. Anda dapat menggantung gorden pada rel gorden melalui penggantung di belakang atau dengan cincin atau pengait."
    ,"Pita bagian atas memudahkan anda menciptakan lipatan menggunakan pengait gorden RIKTIG. Gorden tebal menggelapkan ruangan dan mencegang orang di luar melihat ke dalam ruangan. Bagian atas juga terdapat carikan kain tersembunyi yang memungkinkan anda menggantung lapisan gorden langsung pada batang gorden."
    ,"Efektif menahan aliran udara di musim dingin dan udara panas di musim panas. Gorden anti tembus cahaya menghalangi cahaya masuk dan benar-benar menggelapkan ruangan Anda. Gorden dapat digunakan pada batang atau trek gorden. Pita bagian atas memudahkan anda menciptakan lipatan menggunakan pengait gorden RIKTIG. Anda dapat menggantung gorden pada rel gorden melalui penggantung di belakang atau dengan cincin atau pengait. Pita pengait gorden memiliki warna yang sama dengan gorden sehingga terlihat rapi juga dari belakang."
    ,"Gorden dapat digunakan pada batang atau trek gorden. Gorden tipis memungkinkan sinar matahari masuk namun tetap memberi privasi sehingga cocok digunakan pada solusi jendela berlapis. Pita bagian atas memudahkan anda menciptakan lipatan menggunakan pengait gorden RIKTIG. Anda dapat menggantung gorden pada rel gorden melalui penggantung di belakang atau dengan cincin atau pengait."
    ,"Bagian atas yang berlubang memungkinkan anda menggantung gorden langsung pada batang tirai. Gorden anti tembus cahaya menghalangi cahaya masuk dan benar-benar menggelapkan ruangan Anda. Tirai ini terbuat dari poliester dari botol PET daur ulang. Menggunakan limbah sebagai sumber daya membawa kita selangkah lebih dekat ke masa depan yang lebih berkelanjutan. Efektif menahan aliran udara di musim dingin dan udara panas di musim panas."
    ,"Efektif menahan aliran udara di musim dingin dan udara panas di musim panas. Gorden yang ditenun dengan sangat padat menggelapkan ruangan dan mencegah orang di luar untuk melihat ke dalam. Gorden dapat digunakan pada batang atau trek gorden. Pita bagian atas memudahkan anda menciptakan lipatan menggunakan pengait gorden RIKTIG. Anda dapat menggantung gorden pada rel gorden melalui penggantung di belakang atau dengan cincin atau pengait.")

    private val imgHorden = intArrayOf(R.drawable.alvine, R.drawable.bergskraban, R.drawable.lenda, R.drawable.strand, R.drawable.merete, R.drawable.tibast, R.drawable.marjun
    , R.drawable.borghild, R.drawable.hannalena, R.drawable.majgull, R.drawable.sparvort, R.drawable.hilleborg, R.drawable.vilborg)

    private val imgDetail = intArrayOf(R.drawable.alvinee, R.drawable.bregskraban1, R.drawable.lenda1, R.drawable.strand1, R.drawable.merete1, R.drawable.tibast1, R.drawable.marjun1
    , R.drawable.borghild1, R.drawable.hannalena1, R.drawable.majgull1, R.drawable.sparvort1, R.drawable.hilleborg1, R.drawable.vilborg1)

    private val phoneNumber = arrayOf("085273368822", "085273368824", "085373368826", "085273368822", "085273368822", "085273368822", "085273368822",
        "085273368822", "085273368822", "085273368822", "085273368822", "085273368822", "085273368822", "085273368822")

    val listData: ArrayList<Horden>
    get() {
        val list = arrayListOf<Horden>()
        for (position in namesHorden.indices){
            val horden = Horden()
            horden.image = imgHorden[position]
            horden.imageDetail = imgDetail[position]
            horden.name = namesHorden[position]
            horden.spesifikasi = spesifikasiHorden[position]
            horden.harga = hargaHorden[position]
            horden.fitur = fiturHorden[position]
            horden.kelebihan = kelebihanHorden[position]
            horden.ukuran = ukuranHorden[position]
            horden.bahan = bahanHorden[position]
            horden.phoneNumber = phoneNumber[position]
            list.add(horden)
        }
        return list
    }
}