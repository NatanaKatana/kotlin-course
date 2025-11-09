package ru.stimmax.lessons.lesson16.homeworks.cart

class Cart {

    // словарь: ключ = id товара, значение = количество
    private val items = mutableMapOf<Int, Int>()

    // ---------- 2. Базовый метод ----------
    fun addToCart(itemId: Int) {
        items[itemId] = items.getOrDefault(itemId, 0) + 1
    }

    // ---------- 3. Перегруженный метод: добавление количества ----------
    fun addToCart(itemId: Int, amount: Int) {
        items[itemId] = items.getOrDefault(itemId, 0) + amount
    }

    // ---------- 4. Перегруженный метод: добавление словаря ----------
    fun addToCart(newItems: Map<Int, Int>) {
        newItems.forEach { addToCart(it.key, it.value) }
    }

    // ---------- 5. Перегруженный метод: добавление списка ----------
    fun addToCart(ids: List<Int>) {
        ids.forEach { addToCart(it) }
    }

    // ---------- 6. Переопределяем toString ----------
    override fun toString(): String {
        val countID = items.size
        val countAmount = items.values.sum()
        val list = items.map { "Артикул: ${it.key}  Количество:${it.value}" }
            .joinToString("\n")
        return list + "Всего артикулов: $countID\n Всего товаров: $countAmount"
    }

}


