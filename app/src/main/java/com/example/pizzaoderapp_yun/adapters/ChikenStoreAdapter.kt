package com.example.pizzaoderapp_yun.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.pizzaoderapp_yun.R
import com.example.pizzaoderapp_yun.datas.Store

class ChikenStoreAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : List<Store>) : ArrayAdapter<Store>(mContext, resId, mList) {

    val inflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if (tempRow == null) {
            tempRow = inflater.inflate(R.layout.chiken_store_list_item, null)
        }

        val row = tempRow!!

        val data = mList[position]

        val chikenStoreNameTxt = row.findViewById<TextView>(R.id.chikenStoreNameTxt)
        val chikenLogoImg = row.findViewById<ImageView>(R.id.chikenLogoImg)

        storeNameTxt.text = data.name

        Glide.with(mContext).load(data.logoURL).into(logoImg)


        return row
    }
}