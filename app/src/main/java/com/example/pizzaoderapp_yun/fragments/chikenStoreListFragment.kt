package com.example.pizzaoderapp_yun.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.pizzaoderapp_yun.R
import com.example.pizzaoderapp_yun.adapters.ChikenStoreAdapter
import com.example.pizzaoderapp_yun.adapters.PizzaStoreAdapter
import com.example.pizzaoderapp_yun.datas.Store
import kotlinx.android.synthetic.main.fragment_chiken_store_list.*

class chikenStoreListFragment : Fragment() {

    val mChikenStoreDataList = ArrayList<Store>()

    lateinit var mChikenStoreAdapter: ChikenStoreAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_chiken_store_list, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

//        동작관련 코드

        mChikenStoreDataList.add( Store("노랑통닭", "5555-1111","https://d3af5evjz6cdzs.cloudfront.net/images/uploads/320x0/_8125abe07aa50ccb9849bb09b783b8b11563844838.jpg" ))
        mChikenStoreDataList.add( Store("맘스터치", "4444-2222", "https://www.shuttledelivery.co.kr/uploads/57a47e10639cbbf8bc8c31b7d555f775.jpg"))
        mChikenStoreDataList.add( Store("지코바", "3333-3333", "https://w.namu.la/s/c86d419374c2380e2404dfe4dbe58be422570f6dba1d3fcd7f40c167da74de21caebf45469fdf91677e96a877ecf2fd5e8318e1a4550c42f50c7259ebc70c35f6c299558ca3ab47c43107a0d3ae97f5f"))
        mChikenStoreDataList.add( Store("비비큐","2222-4444","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSF5ZX6yu03R8PpnjBluuVwtRFKuPxzGpj24w&usqp=CAU"))
        mChikenStoreDataList.add( Store("교촌","1111-5555", "https://blog.kakaocdn.net/dn/b5dGDC/btqwTxyB3SZ/FNbo7uzSBdCF7VVGFJTdNk/img.jpg"))

        mChikenStoreAdapter = ChikenStoreAdapter(requireContext(), R.layout.chiken_store_list_item,mChikenStoreDataList)

        chikenStoreListView.adapter = mChikenStoreAdapter
    }
}
