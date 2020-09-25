package edu.assignment1

fun main(args: Array<String>) {

  val names = listOf("Fadi", "Timothy", "Derrick", "Omar", "Hiep", "Alexander", "Daniel", "Isela", "Jackqueline",
    "Bryan", "Nguyen", "Maxim", "Edgar", "Ahson", "Abdulkadir", "En-Kai", "Karla", "Panpan", "You", "Andrew",
    "Trevor", "Hoang", "Johnson", "Janelle", "Moujie", "MD", "Albert", "Jiahui", "Alejandro", "Venkat")

  val nameProcessor = NameProcessor()

  println("Average number of letters in names:\n%.2f".format(nameProcessor.averageNumberOfLetters(names)))

  println("Names grouped based on first letter:\n" + nameProcessor.groupsByFirstLetter(names))

  println("Number of names per initial:\n" + nameProcessor.numberOfNamesByFirstLetter(names))

  println("Average number of letters in names (full immutability):\n%.2f".format(nameProcessor.averageNumberOfLettersImmutable(names)))

  println("Names grouped based on first letter (full immutability):\n" + nameProcessor.groupsByFirstLetterImmutable(names))

  println("Number of names per initial (full immutability):\n" + nameProcessor.numberOfNamesByFirstLetterImmutable(names))
}


