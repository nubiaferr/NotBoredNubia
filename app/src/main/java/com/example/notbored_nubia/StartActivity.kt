package com.example.notbored_nubia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.notbored_nubia.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityStartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.buttonStart.setOnClickListener(this)
        binding.textTerms.setOnClickListener(this)

    }

    override fun onClick(view: View) {
        if (view.id == R.id.button_start) {
            handleSave()
        }

        if (view.id == R.id.text_terms) {
            handleTherms()
        }
    }

    private fun handleSave() {
        val participants = binding.editParticipants.text.toString().apply {
            this.ifEmpty {
                null
            }
        }

        SharedInfos(this).storeParticipants(Constants.KEY.PARTICIPANTS, participants)

        startActivity(Intent(this, MainActivity::class.java))

    }

    private fun handleTherms() {
        startActivity(Intent(this, TermsActivity::class.java))
    }
}