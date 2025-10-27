package ru.stimmax.lessons.lesson15.homeworks

import ru.stimmax.lessons.lesson11.max

//5. Второй класс должен получать список строк и вставлять их в начало контейнера но поочерёдно с теми данными,
// которые уже есть. То-есть, наш список должен появиться в контейнере по индексам 0, 2, 4 и так далее.


class InsertOneByOneMaterials : Materials() {

    fun insert(items: List<String>) {
        val materials = extractMaterials() // Эта строчка: достаёт все старые материалы из контейнера,и очищает контейнер.
        // materials = ["дерево", "металл", "стекло"], а контейнер — пустой.

        val maxIndex = max(items.lastIndex, materials.lastIndex) // Здесь мы находим максимальный индекс среди двух списков.
        // Чтобы цикл прошёл по всем элементам обоих списков, даже если один из них длиннее другого.

        for (i in 0..maxIndex) { // Этот цикл идёт по всем индексам, начиная с 0, до максимального из двух списков.
            if (i < items.size) {  // Если в списке items есть элемент с индексом i — добавь его.
                addMaterial(items[i])
            }
            if (i < materials.size) { // Если в списке materials есть элемент с индексом i — добавь и его.
                addMaterial(materials[i])
            }
        }
    }
}

// Таким образом, элементы добавляются поочерёдно:
//сначала один из нового списка (items),
//потом один из старого (materials).