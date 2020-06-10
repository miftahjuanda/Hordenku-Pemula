package com.kelaspemula.hordenku.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.kelaspemula.hordenku.Activity.DetailActivity
import com.kelaspemula.hordenku.Pojo.Horden
import com.kelaspemula.hordenku.R

class GridHordenAdapter(private val listHorden: ArrayList<Horden>) : RecyclerView.Adapter<GridHordenAdapter.GridViewHolder>(){

    private lateinit var onHordenItemClickListener: OnHordenItemClickListener
    fun setOnItemHordenClick(onHordenItemClickListener: OnHordenItemClickListener) {
        this.onHordenItemClickListener = onHordenItemClickListener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_horden, parent, false)
        return GridViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listHorden.size
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        val horden = listHorden[position]
        Glide.with(holder.itemView.context)
            .load(listHorden[position].image)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgHorden)
        holder.nameHorden.text = horden.name
        holder.spesifikasi.text = horden.spesifikasi
        holder.harga.text = horden.harga

        holder.itemView.setOnClickListener {
            onHordenItemClickListener.onItemClicked(listHorden[holder.adapterPosition])
            val intent = Intent(holder.itemView.context, DetailActivity::class.java)
            intent.putExtra(DetailActivity.EXTRA_IMG, horden.image)
            intent.putExtra(DetailActivity.EXTRA_DETAIL, horden.imageDetail)
            intent.putExtra(DetailActivity.EXTRA_NAME, horden.name)
            intent.putExtra(DetailActivity.EXTRA_SPESIFIKASI, horden.spesifikasi)
            intent.putExtra(DetailActivity.EXTRA_HARGA, horden.harga)
            intent.putExtra(DetailActivity.EXTRA_FITUR, horden.fitur)
            intent.putExtra(DetailActivity.EXTRA_KELEBIHAN, horden.kelebihan)
            intent.putExtra(DetailActivity.EXTRA_UKURAN, horden.ukuran)
            intent.putExtra(DetailActivity.EXTRA_BAHAN, horden.bahan)
            intent.putExtra(DetailActivity.EXTRA_PHONE, horden.phoneNumber)
            holder.itemView.context.startActivity(intent)
        }
    }

    inner class GridViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgHorden: ImageView = itemView.findViewById(R.id.image_horden)
        var nameHorden: TextView = itemView.findViewById(R.id.tv_name_horden)
        var spesifikasi: TextView = itemView.findViewById(R.id.tv_spesifikasi)
        var harga: TextView = itemView.findViewById(R.id.tv_harga)
    }

    interface OnHordenItemClickListener {
        fun onItemClicked(data: Horden)
    }

}

