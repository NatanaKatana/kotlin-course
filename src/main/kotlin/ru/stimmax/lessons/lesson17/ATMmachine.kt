package ru.stimmax.lessons.lesson17
//Банкомат

//Написать класс счёта, в котором можно пополнять, проверять и списывать с баланса только
//при предоставлении корректного пин кода. Также можно выполнять смену пинкода.
//В случае неудачной проверки, выбрасываем ошибку. Количество неверно введённых пинкодов 3,
//после чего проверка всегда будет заканчиваться ошибкой. Если пин введён верно,
//то счётчик попыток сбрасывается.

class ATMmachine(private var pin: String) {
    private var balance: Double = 0.0


    fun getBalance(pin: String): Double {

        return if (checkPin(pin)) {
            balance
        } else {
            0.0
        }
    }


    fun deposit(pin: String, amount: Double) {
        if (checkPin(pin) && amount > 0.0) {
            balance += amount
        }
    }


    private fun checkPin(pin: String): Boolean {
        return if (this.pin == pin) {
            true
        } else {
            println("Пин-код введен неверно")
            false
        }
    }


    fun withdraw(pin: String, amount: Double): Double {
        return if (checkPin(pin) && amount>0.0) {
            if(balance >= amount) {
                balance -= amount
                amount
            } else {
               val balance2 = balance
                balance = 0.0
                balance2
            }
        } else {
            0.0
        }

    }


}





