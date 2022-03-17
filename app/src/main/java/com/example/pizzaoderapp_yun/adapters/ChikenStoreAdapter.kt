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

//     inflater : xml을 가지고 => 객체로 변환해주는 (화면에 뿌리도록 도와주는) 변수를 멤버 변수로 생성
//      getview 함수를 오버라이딩 => 기본 모양이 아닌 우리가 원하는 모양이 뿌려지게 하려고 오버라이딩
//    convertView변수를  => var tempRow에 옮겨 담아서 => null인 경우에는 새로 inflatr해서 담자.

    val inflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if (tempRow == null) {
            tempRow = inflater.inflate(R.layout.chiken_store_list_item, null)
        }

//        tempRow가 절대 null이 아닌 상태로 만들어주는 과정

        val row = tempRow!!

        val data = mList[position]

        val chikenStoreNameTxt = row.findViewById<TextView>(R.id.chikenStoreNameTxt)
        val chikenLogoImg = row.findViewById<ImageView>(R.id.chikenLogoImg)

        chikenStoreNameTxt.text = data.name

//        mContext를 만드는 이유 중 하나
        Glide.with(mContext).load(data.logoURL).into(chikenLogoImg)


        return row
    }
}