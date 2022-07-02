package com.example.template.util

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import com.example.template.databinding.LoadingBumdesBinding
import java.util.*


class ViewLoadingDialog(context: Context?) : Dialog(context!!) {
    private var pesan = ""
    private var binding: LoadingBumdesBinding? = null
    protected override fun onCreate(savedInstanceState: Bundle?) {
        binding = LoadingBumdesBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        DialogOption()
    }

    private fun DialogOption() {
        setCanceledOnTouchOutside(false)
        Objects.requireNonNull(window)?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        if (pesan != "") {
            binding?.dialogLoadingPesan?.text = pesan
        }
    }

    fun setPesan(pesan: String) {
        this.pesan = pesan
    }
}