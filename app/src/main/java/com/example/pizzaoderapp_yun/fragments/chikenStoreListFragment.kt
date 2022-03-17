package com.example.pizzaoderapp_yun.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.pizzaoderapp_yun.R

class chikenStoreListFragment : Fragment() {

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
    }
}

//노랑통닭 https://d3af5evjz6cdzs.cloudfront.net/images/uploads/320x0/_8125abe07aa50ccb9849bb09b783b8b11563844838.jpg
//맘스터치 https://www.shuttledelivery.co.kr/uploads/57a47e10639cbbf8bc8c31b7d555f775.jpg
//지코바 https://w.namu.la/s/c86d419374c2380e2404dfe4dbe58be422570f6dba1d3fcd7f40c167da74de21caebf45469fdf91677e96a877ecf2fd5e8318e1a4550c42f50c7259ebc70c35f6c299558ca3ab47c43107a0d3ae97f5f
//비비큐 https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSF5ZX6yu03R8PpnjBluuVwtRFKuPxzGpj24w&usqp=CAU
//교촌  https://blog.kakaocdn.net/dn/b5dGDC/btqwTxyB3SZ/FNbo7uzSBdCF7VVGFJTdNk/img.jpg