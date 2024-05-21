package com.example.quizapp.utils

import com.example.quizapp.R
import com.example.quizapp.model.Question

object Constants {

    const val USER_NAME = "user_name"
    const val TOTAL_QUESTIONS = "total_questions"
    const val SCORE = "correct_answers"

    fun getQuestions(): MutableList<Question> {
        val questions = mutableListOf<Question>()

        val quest1 = Question(
            1, "What country does this flag belong?",
            R.drawable.saudi_flag, "Saudi Arabia",
            "Iran", "Eqypt", "Botswana",
            1
        )
        questions.add(quest1)

        val quest2 = Question(
            2, "What country does this flag belong?",
            R.drawable.french_flag, "Yemen",
            "Poland", "Niger", "France",
            4
        )
        questions.add(quest2)

        val quest3 = Question(
            3, "What country does this flag belong?",
            R.drawable.spanish_flag, "Ireland",
            "Brazil", "Spain", "Morocco",
            3
        )
        questions.add(quest3)

        val quest4 = Question(
            4, "What country does this flag belong?",
            R.drawable.american_flag, "United States",
            "Ukraine", "Liberia", "New Zealand",
            1
        )
        questions.add(quest4)

        val quest5 = Question(
            5, "What country does this flag belong?",
            R.drawable.australian_flag, "United Kingdom",
            "Australia", "Peru", "Somalia",
            2
        )
        questions.add(quest5)

        val quest6 = Question(
            6, "What country does this flag belong?",
            R.drawable.brazilian_flag, "Kenya",
            "Cote D'Ivoire", "Brazil", "Oman",
            3
        )
        questions.add(quest6)

        val quest7 = Question(
            7, "What country does this flag belong?",
            R.drawable.cameroonian_flag, "Cameroon",
            "Guinea", "Ghana", "Senegal",
            1
        )
        questions.add(quest7)

        val quest8 = Question(
            8, "What country does this flag belong?",
            R.drawable.egyptian_flag, "Equatorial Guinea",
            "Italy", "Cape Verde", "Egypt",
            4
        )
        questions.add(quest8)

        val quest9 = Question(
            9, "What country does this flag belong?",
            R.drawable.japanese_flag, "China",
            "Portugal", "Canada", "Japan",
            4
        )
        questions.add(quest9)

        val quest10 = Question(
            10, "What country does this flag belong?",
            R.drawable.south_african_flag, "Nigeria",
            "Chad", "South Africa", "Lebanon",
            3
        )
        questions.add(quest10)
        return questions
    }
}