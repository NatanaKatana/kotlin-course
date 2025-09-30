package ru.stimmax.lessons.lesson05




fun main() {

    //Задача: Вернуть язык интерфейса для сайта. Если пользователь не установил язык,
//то вернуть язык по умолчанию - Английский.

    val userLang: String? = "Italian"
    val defaultLang = "English"
    val currentLang = userLang ?: defaultLang
    println(currentLang)


    // Задача: Определить общий запас энергии зарядного устройства, учитывая,
// что если дополнительный аккумуляторный модуль отсутствует, его вклад в общий
// запас энергии равен нулю. Известно, что встроенная батарея имеет энергию
// 5000 мАч, а дополнительный модуль, если он подключен, имеет энергию 2000 мАч.
//Контекст: У вас есть портативное зарядное устройство для мобильного телефона.
// Это устройство состоит из двух основных частей: встроенной батареи и
// дополнительного аккумуляторного модуля. Встроенная батарея всегда имеет
// известное количество энергии, но дополнительный модуль может быть либо
// подключен с известным количеством энергии, либо отсутствовать.


    val innerAccumulator = 5000
    val externalAccumulator: Int? = 2000
    val a = externalAccumulator ?: 0
//    val powerBank = innerAccumulator + a
//    val powerBank = innerAccumulator + (externalAccumulator ?: 0)


//Контекст: Вы работаете на складе и отвечаете за инвентаризацию.
// Ваша задача — убедиться, что в каждом контейнере есть товары,
// иначе сообщить об ошибке.

    val goodsInContainer: String? = null
    val checkedGoods = goodsInContainer ?: "Goods not found"


// Рассчитай стоимость товара со скидкой, если цена известна,
// а скидка (указанная в процентах) может быть не установлена.

    val price = 80.0
    val discountInPercent: Double? = 10.0
    val discount = (discountInPercent ?: 0.0) / 100
    val discountPrice = price - price * discount
    println(discountPrice)
}


