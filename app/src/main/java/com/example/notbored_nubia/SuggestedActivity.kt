package com.example.notbored_nubia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.notbored_nubia.databinding.ActivitySuggestedBinding

class SuggestedActivity: AppCompatActivity(), View.OnClickListener  {
    private lateinit var binding: ActivitySuggestedBinding
    private lateinit var categoryId: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySuggestedBinding.inflate(layoutInflater)
        categoryId = intent.getStringExtra(Constants.KEY.CATEGORY).toString()
        setContentView(binding.root)

        supportActionBar?.hide()

        handleNumberOfParticipants()
        handleSuggestedActivity()

        binding.imageGoBack.setOnClickListener(this)
        binding.buttonNewActivity.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        if (view.id == R.id.image_go_back) {
            startActivity(Intent(this, MainActivity::class.java))
        }

        if (view.id == R.id.button_new_activity) {
            handleSuggestedActivity()
        }
    }

    private fun handleNumberOfParticipants() {
        val numberOfParticipants = SharedInfos(this).getParticipants(Constants.KEY.PARTICIPANTS)

        if (numberOfParticipants == "") {
            binding.textNumberParticipants.text = "1"
        } else {
            binding.textNumberParticipants.text = numberOfParticipants
        }
    }

    private fun handleSuggestedActivity() {
        val suggestedActivity = Mock().getSuggestion(categoryId!!)

        binding.titleSuggested.text = suggestedActivity.categoryId

        binding.textSuggestion.text = suggestedActivity.description

        when (suggestedActivity.price) {
            0 -> {
                binding.textPrice.text = "Free"
            }
            1 -> {
                binding.textPrice.text = "Low"
            }
            2 -> {
                binding.textPrice.text = "Medium"
            }
            3 -> {
                binding.textPrice.text = "High"
            }
        }


    }
}