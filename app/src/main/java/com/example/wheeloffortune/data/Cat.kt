package com.example.wheeloffortune.data

/**
 * Data class with words arranged in categories used for guessing the word
 */
class Cat {
    fun countries(): MutableList<String> {
        return mutableListOf(
            "DENMARK",
            "CUBA",
            "SWEDEN",
            "NORWAY",
            "FINLAND",
            "GERMANY",
            "BRAZIL",
            "POLAND",
            "LUXEMBOURG",
            "SWITZERLAND",
        )
    }
    fun techBrands(): MutableList<String>{
        return mutableListOf(
            "APPLE",
            "ASUS",
            "LENOVO",
            "CORSAIR",
            "RAZER",
            "ACER",
            "NVIDIA",
            "INTEL",
        )

    }
    fun clothingBrands(): MutableList<String>{
        return mutableListOf(
            "LEVIS",
            "NIKE",
            "ADIDAS",
            "RALPH LAUREN",
            "GAP",
        )
    }
    fun stds(): MutableList<String>{
        return mutableListOf(
            "CHLAMYDIA",
            "HERPES",
            "GONORRHEA",
            "SYPHILIS",
            "TRICHOMONIASIS",
            "SCABIES",
        )
    }
}