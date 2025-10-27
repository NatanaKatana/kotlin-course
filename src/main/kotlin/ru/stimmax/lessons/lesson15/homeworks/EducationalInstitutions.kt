package ru.stimmax.lessons.lesson15.homeworks

open class EducationalInstitutions(
    val fullName: String,
    val timeOfEducation: String
) {
}

open class Preschool(
    fullName: String,
    timeOfEducation: String,
    val timeForSleepInHoursPerDay: Int
) : EducationalInstitutions(fullName, timeOfEducation) {}

class Kindergartens(
    fullName: String,
    timeOfEducation: String,
    timeForSleepInHoursPerDay: Int
) : Preschool(fullName, timeOfEducation, timeForSleepInHoursPerDay)



open class School(
    fullName: String,
    timeOfEducation: String
) : EducationalInstitutions(fullName, timeOfEducation) {}

class GeneralBasicEducation(
    fullName: String,
    timeOfEducation: String
) : School(fullName, timeOfEducation) {}

class GeneralSecondaryEducation(
fullName: String,
timeOfEducation: String
) : School(fullName, timeOfEducation) {}



open class College(
    fullName: String,
    timeOfEducation: String,
    val formOfStudyFulOrPartTime: String
) : EducationalInstitutions(fullName, timeOfEducation) {}




open class Institute(
    fullName: String,
    timeOfEducation: String,
    val formOfStudyFulOrPartTime: String
) : EducationalInstitutions(fullName, timeOfEducation) {}



