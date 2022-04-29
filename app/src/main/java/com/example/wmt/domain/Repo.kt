package com.example.wmt.domain

import com.example.wmt.data.model.shop
import com.example.wmt.vo.Resource

interface Repo {
    fun getShopslist():Resource<List<shop>>
}