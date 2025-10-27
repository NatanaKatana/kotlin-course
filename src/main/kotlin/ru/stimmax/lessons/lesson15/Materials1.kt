package ru.stimmax.lessons.lesson15

class Materials1 : Materials() {
    fun extractFirs(): String {
        val materials = extractMaterials()
        materials.drop(1).forEach { addMaterial(it)} // ??????????????????
        return materials.first()
    }
}