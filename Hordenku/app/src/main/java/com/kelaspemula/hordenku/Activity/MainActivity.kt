package com.kelaspemula.hordenku.Activity

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.core.graphics.BitmapCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kelaspemula.hordenku.Adapter.GridHordenAdapter
import com.kelaspemula.hordenku.Data.HordenData
import com.kelaspemula.hordenku.Pojo.Horden
import com.kelaspemula.hordenku.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_horden.*
import java.io.ByteArrayOutputStream

class MainActivity : AppCompatActivity() {

    private lateinit var rvHorden: RecyclerView
    private var list: ArrayList<Horden> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvHorden = findViewById(R.id.rv_horden)
        rvHorden.setHasFixedSize(true)

        list.addAll(HordenData.listData)
        showRecyclerGrid()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_item, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_profile -> {
                val intent = Intent(this, ProfileActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun showRecyclerGrid() {
        rvHorden.layoutManager = GridLayoutManager(this, 2)
        val gridLayout = GridHordenAdapter(list)
        rvHorden.adapter = gridLayout

        gridLayout.setOnItemHordenClick(object : GridHordenAdapter.OnHordenItemClickListener {
            override fun onItemClicked(data: Horden) {
            }
        })
    }
}


