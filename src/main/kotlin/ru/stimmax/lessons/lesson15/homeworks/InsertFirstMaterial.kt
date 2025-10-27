package ru.stimmax.lessons.lesson15.homeworks

//4. Первый класс должен вставлять строку на дно контейнера (должно появиться под индексом 0)
// Создать подкласс, который вставляет новый материал в начало контейнера
//(то есть под индексом 0, «на дно»).

class InsertFirstMaterial : Materials() {
    fun insert(item: String) {
        val materials = extractMaterials() // достаём всё, что было
        addMaterial(item)  //  добавляем новый материал (он будет первым)
        materials.forEach { // возвращаем старые материалы обратно - перебираем старые и добавляем обратно
            addMaterial(it)
        }
    }
}



