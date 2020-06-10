package com.kelaspemula.hordenku.Activity

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.NestedScrollView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.kelaspemula.hordenku.Pojo.Horden
import com.kelaspemula.hordenku.R
import com.kelaspemula.hordenku.utils.Tools
import com.kelaspemula.hordenku.utils.ViewAnimation
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.content_detail.*

class DetailActivity : AppCompatActivity() {
    var bt_descriptions: ImageButton? = null
    var bt_kelebihan: ImageButton? = null
    var bt_ukuran: ImageButton? = null
    var lay_exp_description: View? = null
    var lay_exp_kelebihan: View? = null
    var lay_exp_ukuran: View? = null
    var nested_scroll_view: NestedScrollView? = null

    companion object {
        const val EXTRA_IMG = "extra_img"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_SPESIFIKASI = "extra_spesifikasi"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_HARGA = "extra_harga"
        const val EXTRA_FITUR = "extra_fitur"
        const val EXTRA_KELEBIHAN = "extra_kelebihan"
        const val EXTRA_UKURAN = "extra_ukuran"
        const val EXTRA_BAHAN = "extra_bahan"
        const val EXTRA_PHONE = "extra_phone"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        initAnimation()
        initItem()

        val bundle: Bundle? = intent.extras
        bundle?.let {
        fab.setOnClickListener { view ->

            val phoneNumber = "08527336565"
            val dialPhone = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            startActivity(dialPhone)
        }
        }
    }

    private fun initItem() {
        val dataReceiverImage: ImageView = findViewById(R.id.image_detail)
        val dataReceiverName: TextView = findViewById(R.id.detail_name)
        val dataReceiverSpesifikasi: TextView = findViewById(R.id.detail_spesifikasi)
        val dataReceiverHarga: TextView = findViewById(R.id.detail_harga)
        val dataReceiverFitur: TextView = findViewById(R.id.tv_expand_fitur)
        val dataReceiverKelebihan: TextView = findViewById(R.id.tv_expand_kelebihan)
        val dataReceiverUkuran: TextView = findViewById(R.id.tv_expand_ukuran)
        val dataReceiverBahan: TextView = findViewById(R.id.tv_expand_bahan)
        val dataReceiverPhone: FloatingActionButton = findViewById(R.id.fab)

        val name = intent.getStringExtra(EXTRA_NAME)
        val spesifikasi = intent.getStringExtra(EXTRA_SPESIFIKASI)
        val harga = intent.getStringExtra(EXTRA_HARGA)
        val fitur = intent.getStringExtra(EXTRA_FITUR)
        val kelebihan = intent.getStringExtra(EXTRA_KELEBIHAN)
        val ukuran = intent.getStringExtra(EXTRA_UKURAN)
        val bahan = intent.getStringExtra(EXTRA_BAHAN)
        val image = intent.getIntExtra(EXTRA_DETAIL, 0)
        val phone = intent.getStringExtra(EXTRA_PHONE)

        Glide.with(this).load(image).apply(RequestOptions().override(350, 550))
            .into(dataReceiverImage)
        dataReceiverName.text = name
        dataReceiverSpesifikasi.text = spesifikasi
        dataReceiverHarga.text = harga
        dataReceiverFitur.text = fitur
        dataReceiverKelebihan.text = kelebihan
        dataReceiverUkuran.text = ukuran
        dataReceiverBahan.text = bahan

    }

    private fun initAnimation() {
        nested_scroll_view = findViewById<NestedScrollView>(R.id.nested_scroll_view)
        bt_descriptions = findViewById<ImageButton>(R.id.bt_toggle_description)
        lay_exp_description = findViewById<View>(R.id.lyt_expand_fitur)
        bt_descriptions!!.setOnClickListener { view -> toggleSection(view, lay_exp_description) }

        bt_kelebihan = findViewById<ImageButton>(R.id.bt_toggle_kelebihan)
        lay_exp_kelebihan = findViewById<View>(R.id.lyt_expand_kelebihan)
        bt_kelebihan!!.setOnClickListener { view -> toggleSection(view, lay_exp_kelebihan) }

        bt_ukuran = findViewById<ImageButton>(R.id.bt_toggle_ukuranbahan)
        lay_exp_ukuran = findViewById<View>(R.id.lyt_expand_ukuranbahan)
        bt_ukuran!!.setOnClickListener { view -> toggleSection(view, lay_exp_ukuran) }

        toggleArrow(bt_descriptions)
        lay_exp_description!!.visibility = View.VISIBLE
    }

    private fun toggleSection(bt: View, lyt: View?) {
        val show = toggleArrow(bt)
        if (show) {
            ViewAnimation.expand(lyt) { Tools.nestedScrollTo(nested_scroll_view, lyt) }
        } else {
            ViewAnimation.collapse(lyt)
        }
    }

    private fun toggleArrow(view: View?): Boolean {
        return if (view!!.rotation == 0f) {
            view.animate().setDuration(200).rotation(180f)
            true
        } else {
            view.animate().setDuration(200).rotation(0f)
            false
        }
    }
}
