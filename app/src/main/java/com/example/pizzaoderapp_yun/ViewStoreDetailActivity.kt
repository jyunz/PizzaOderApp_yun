package com.example.pizzaoderapp_yun

import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.pizzaoderapp_yun.datas.Store
import kotlinx.android.synthetic.main.activity_view_store_detail.*

class ViewStoreDetailActivity : BaseActivity() {

    lateinit var mStoreData : Store

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store_detail)
        setUpEvents()
        setValues()

    }
    override fun setUpEvents() {
    }

    override fun setValues() {

        mStoreData = intent.getSerializableExtra("storeData") as Store

        Glide.with(mContext).load(mStoreData.logoURL).into(storeLogoImg)

        storePhoneNumTxt.text = mStoreData.phoneNum
        storeNameTxt.text = mStoreData.name

    }


}