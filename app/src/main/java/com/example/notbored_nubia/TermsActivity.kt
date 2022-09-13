package com.example.notbored_nubia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.notbored_nubia.databinding.ActivityTermsBinding

class TermsActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityTermsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTermsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.imageClose.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        if (view.id == R.id.image_close ) {
            startActivity(Intent(this, StartActivity::class.java))
        }
    }

}