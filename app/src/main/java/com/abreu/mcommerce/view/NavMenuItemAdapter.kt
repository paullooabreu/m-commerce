package com.abreu.mcommerce.view

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.View.VISIBLE
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.abreu.mcommerce.R
import com.abreu.mcommerce.domain.NavMenuItem

class NavMenuItemAdapter(val items: List<NavMenuItem>) :
    RecyclerView.Adapter<NavMenuItemAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, type: Int): ViewHolder {
        val layout = LayoutInflater.from(parent.context)
            .inflate(R.layout.nav_menu_item, parent, false)

        return ViewHolder(layout)
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setData(items[position])
    }


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val ivIcon: ImageView
        private val tvLabel: TextView

        init {
            ivIcon = itemView.findViewById(R.id.iv_icon)
            tvLabel = itemView.findViewById(R.id.tv_label)
        }

        fun setData(item: NavMenuItem) {
            tvLabel.text = item.label

            if (item.iconId != NavMenuItem.DEFAULT_ICON_ID) {
                ivIcon.setImageResource(item.iconId)
                ivIcon.visibility = VISIBLE
            }
        }
    }

}