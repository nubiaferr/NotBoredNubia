package com.example.notbored_nubia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.notbored_nubia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.imageShuffle.setOnClickListener(this)
        binding.layoutEducation.setOnClickListener(this)
        binding.layoutRecreational.setOnClickListener(this)
        binding.layoutSocial.setOnClickListener(this)
        binding.layoutDiy.setOnClickListener(this)
        binding.layoutCharity.setOnClickListener(this)
        binding.layoutCooking.setOnClickListener(this)
        binding.layoutRelaxation.setOnClickListener(this)
        binding.layoutMusic.setOnClickListener(this)
        binding.layoutBusywork.setOnClickListener(this)
    }

    override fun onClick(view: View) {

        when (view.id) {
            R.id.image_shuffle -> {
                startActivity(
                    Intent(
                        this,
                        SuggestedActivity::class.java
                    ).apply {
                        putExtra(Constants.KEY.CATEGORY, Constants.FILTER.ALL)
                    }
                )

            }
            R.id.layout_education -> {
                startActivity(
                    Intent(
                        this,
                        SuggestedActivity::class.java
                    ).apply {
                        putExtra(Constants.KEY.CATEGORY, Constants.FILTER.EDUCATION)
                    }
                )
            }
            R.id.layout_recreational -> {
                startActivity(
                    Intent(
                        this,
                        SuggestedActivity::class.java
                    ).apply {
                        putExtra(Constants.KEY.CATEGORY, Constants.FILTER.RECREATIONAL)
                    }
                )
            }
            R.id.layout_social -> {
                startActivity(
                    Intent(
                        this,
                        SuggestedActivity::class.java
                    ).apply {
                        putExtra(Constants.KEY.CATEGORY, Constants.FILTER.SOCIAL)
                    }
                )
            }
            R.id.layout_diy -> {
                startActivity(
                    Intent(
                        this,
                        SuggestedActivity::class.java
                    ).apply {
                        putExtra(Constants.KEY.CATEGORY, Constants.FILTER.DIY)
                    }
                )
            }
            R.id.layout_charity -> {
                startActivity(
                    Intent(
                        this,
                        SuggestedActivity::class.java
                    ).apply {
                        putExtra(Constants.KEY.CATEGORY, Constants.FILTER.CHARITY)
                    }
                )
            }
            R.id.layout_cooking -> {
                startActivity(
                    Intent(
                        this,
                        SuggestedActivity::class.java
                    ).apply {
                        putExtra(Constants.KEY.CATEGORY, Constants.FILTER.COOKING)
                    }
                )
            }
            R.id.layout_relaxation -> {
                startActivity(
                    Intent(
                        this,
                        SuggestedActivity::class.java
                    ).apply {
                        putExtra(Constants.KEY.CATEGORY, Constants.FILTER.RELAXATION)
                    }
                )
            }
            R.id.layout_music -> {
                startActivity(
                    Intent(
                        this,
                        SuggestedActivity::class.java
                    ).apply {
                        putExtra(Constants.KEY.CATEGORY, Constants.FILTER.MUSIC)
                    }
                )
            }
            R.id.layout_busywork -> {
                startActivity(
                    Intent(
                        this,
                        SuggestedActivity::class.java
                    ).apply {
                        putExtra(Constants.KEY.CATEGORY, Constants.FILTER.BUSYWORK)
                    }
                )
            }
        }
    }

}