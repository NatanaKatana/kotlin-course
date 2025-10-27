package ru.stimmax.lessons.lesson15.homeworks

//Это класс контейнера. Он абстрактный, это означает, что нельзя создавать экземпляр этого класса, он нужен только для того,
// чтобы быть основой для подклассов.


abstract class Materials {

    private val materials = mutableListOf<String>()

    fun addMaterial(material: String) {
        materials.add(material)
    }

    fun extractMaterials(): List<String> {
        val extracted = materials.toList()
        materials.clear()
        return extracted
    }

    fun printContainer() {
        materials.forEachIndexed { index, layer ->
            println("[$index]: $layer")
        }
    }
}