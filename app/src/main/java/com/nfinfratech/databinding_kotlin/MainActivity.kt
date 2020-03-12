package com.nfinfratech.databinding_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.nfinfratech.databinding_kotlin.databinding.Main2ActivityBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding : Main2ActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        var userModel = UserModel()
        userModel.uName = "Androidian"
        userModel.pwd = "123456"
        mainBinding.userModel = userModel
    }
}
