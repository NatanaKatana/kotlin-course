package ru.stimmax.lessons.lesson15.homeworks

open class Furniture(
    val typeOfMaterial: String,
    val classificationByPurpose: String, // По назначению мебель подразделяется на две большие группы: для общественных помещений и жилых (бытовая)
    val classificationByZone: String
// классифицируется по зонам, для оборудования которых она предназначена. Так, мебель для общественных помещений может быть
// предназначена для оборудования зрительных залов, мест президиума, мест отдыха на вокзалах, на. пляжах, в парках.
// Мебель бытовая подразделяется на мебель для жилых комнат, кухни, передней, ванной, террасы и других помещений
) {
}

open class Tables(
    typeOfMaterial: String,
    classificationByPurpose: String,
    classificationByZone: String,
    val numberOfSupportingLegs: Int,
    val hightInCm: Int
) : Furniture(typeOfMaterial, classificationByPurpose, classificationByZone) {}

class diningTables(
    typeOfMaterial: String,
    classificationByPurpose: String,
    classificationByZone: String,
    numberOfSupportingLegs: Int,
    hightInCm: Int
) : Tables(typeOfMaterial, classificationByPurpose, classificationByZone, numberOfSupportingLegs, hightInCm) {}

class coffeeTables(
    typeOfMaterial: String,
    classificationByPurpose: String,
    classificationByZone: String,
    numberOfSupportingLegs: Int,
    hightInCm: Int
) : Tables(typeOfMaterial, classificationByPurpose, classificationByZone, numberOfSupportingLegs, hightInCm) {}


open class Closet(
    typeOfMaterial: String,
    classificationByPurpose: String,
    classificationByZone: String,
    val numberOfDoors: Int
) : Furniture(typeOfMaterial, classificationByPurpose, classificationByZone) {}

open class Beds(
    typeOfMaterial: String,
    classificationByPurpose: String,
    classificationByZone: String,
    val numberOfBerths: Int,
    val mattressType: String
) : Furniture(typeOfMaterial, classificationByPurpose, classificationByZone) {}

open class armChair(
    typeOfMaterial: String,
    classificationByPurpose: String,
    classificationByZone: String,
) : Furniture(typeOfMaterial, classificationByPurpose, classificationByZone) {}


open class Chairs(
    typeOfMaterial: String,
    classificationByPurpose: String,
    classificationByZone: String,
) : Furniture(typeOfMaterial, classificationByPurpose, classificationByZone) {}


class Mirrors(
    typeOfMaterial: String,
    classificationByPurpose: String,
    classificationByZone: String,
    val size: String
) : Furniture(typeOfMaterial, classificationByPurpose, classificationByZone) {}


//http://mebel.townevolution.ru/books/item/f00/s00/z0000000/st003.shtml
//https://anvikor.ru/blog/vidy-i-klassifikaciya-mebeli

// Кроме того, по конструкции мебель подразделяется на фанерованную и не фанерованную,
// секционную и несекционную, неразборную и разборнyю, складную, трансформируемую.


//  По характеру производства мебель подразделяется на экспериментальную, серийную и массовую.
//Экспериментальную мебель изготовляют для рассмотрения на художественно-технических советах, демонстрации на выставках и ярмарках с целью выявления на нее спроса покупателей. Иногда экспериментальные изделия сдают в опытную эксплуатацию для определения удобства пользования ими, их конструктивной прочности. Некоторые экспериментальные изделия подвергают испытаниям по утвержденным методикам.
//Серийную мебель выпускают более или менее крупными партиями (сериями) по результатам изготовления и испытания экспериментальных образцов. При этом предусмотрено повторение серий, в процессе которых конструкцию изделий совершенствуют.
//Массовую мебель выпускают в большом количестве непрерывно и в течение длительного времени без изменения ее конструкции, по окончательно отработанным и проверенным при изготовлении серий чертежам.

