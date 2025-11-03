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
        for ((id, qty) in newItems) {
            items[id] = items.getOrDefault(id, 0) + qty
        }
    }

    // ---------- 5. Перегруженный метод: добавление списка ----------
    fun addToCart(ids: List<Int>) {
        for (id in ids) {
            items[id] = items.getOrDefault(id, 0) + 1
        }
    }

    // ---------- 6. Переопределяем toString ----------
    override fun toString(): String {
        if (items.isEmpty()) return "Корзина пуста."

        val sb = StringBuilder()
        sb.append("ID товара | Количество\n")
        sb.append("---------------------\n")
        var totalItems = 0
        for ((id, qty) in items) {
            sb.append(String.format("%9d | %9d\n", id, qty))
            totalItems += qty
        }
        sb.append("---------------------\n")
        sb.append("Итоговое количество артикулов: ${items.size}\n")
        sb.append("Общее количество товаров: $totalItems\n")
        return sb.toString()
    }
}
