package com.example.notbored_nubia

import kotlin.random.Random

data class Suggestion(val description: String, val categoryId: String, val price: Int)

class Mock {
    private val all = Constants.FILTER.ALL
    private val education = Constants.FILTER.EDUCATION
    private val recreational = Constants.FILTER.RECREATIONAL
    private val social = Constants.FILTER.SOCIAL
    private val diy = Constants.FILTER.DIY
    private val charity = Constants.FILTER.CHARITY
    private val cooking = Constants.FILTER.COOKING
    private val relaxation = Constants.FILTER.RELAXATION
    private val music = Constants.FILTER.MUSIC
    private val busywork = Constants.FILTER.BUSYWORK

    private val suggestionList = listOf(
        Suggestion("Read a book", education, 0),
        Suggestion("Start a new course", education, 1),
        Suggestion("Start a exchange program", education, 3),
        Suggestion("Watch TV", recreational, 0),
        Suggestion("Sleep", recreational, 0),
        Suggestion("Go for a walk", social, 0),
        Suggestion("Watch a concert", social, 2),
        Suggestion("Build something", diy, 1),
        Suggestion("Customize a shirt", diy, 1),
        Suggestion("Donate food", charity, 1),
        Suggestion("Help dogs", charity, 0),
        Suggestion("Bake a cake", cooking, 1),
        Suggestion("Go to a 5 Star restaurant", cooking, 3),
        Suggestion("Go to the gym", relaxation, 1),
        Suggestion("Meditation", relaxation, 0),
        Suggestion("Write a song", music, 0),
        Suggestion("Learn to play guitar", music, 1),
        Suggestion("Open a small business", busywork, 2),
        Suggestion("Fold your laundry", busywork, 0)
    )

    fun getSuggestion(categoryValue: String): Suggestion {
        val filtered = suggestionList.filter { it.categoryId == categoryValue || categoryValue == all }

        val index = Random.nextInt(filtered.size)

        return filtered[index]
    }

}