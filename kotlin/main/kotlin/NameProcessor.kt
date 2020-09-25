package edu.assignment1

class NameProcessor {
  fun averageNumberOfLetters(names: List<String>): Double {

    if (names.isEmpty()) {
      return 0.0
    }

    var totalLetters = 0.0

    for (name in names) {
      totalLetters += name.length
    }

    return totalLetters / names.size
  }

  fun groupsByFirstLetter(names: List<String>): Map<Char, List<String>> {

    val groupByName = mutableMapOf<Char, ArrayList<String>>()

    if (names.isEmpty()) {
      return groupByName
    }

    for (name in names) {
      val firstLetter = name[0]

      if (!groupByName.containsKey(firstLetter)) {
        groupByName[firstLetter] = arrayListOf()
      }

      groupByName.getValue(firstLetter) += name
    }

    return groupByName
  }

  fun numberOfNamesByFirstLetter(names: List<String>): Map<Char, Int> {

    val namesPerLetter = mutableMapOf<Char, Int>()

    if (names.isEmpty()) {
      return namesPerLetter
    }

    for (name in names) {
      val firstLetter = name[0]

      if (!namesPerLetter.containsKey(firstLetter)) {
        namesPerLetter[firstLetter] = 0
      }

      namesPerLetter[firstLetter] = namesPerLetter.getValue(firstLetter) + 1
    }

    return namesPerLetter
  }

  fun averageNumberOfLettersImmutable(names: List<String>): Double {

    if (names.isEmpty()) {
      return 0.0
    }

    val totalLetters = names.map { it.length }.sum()

    return totalLetters.toDouble() / names.size
  }

  fun groupsByFirstLetterImmutable(names: List<String>): Map<Char, List<String>> {

    if (names.isEmpty()) {
      return mapOf()
    }

    return names.groupBy { name -> name[0] }
  }

  fun numberOfNamesByFirstLetterImmutable(names: List<String>): Map<Char, Int> {
    if (names.isEmpty()) {
      return mapOf()
    }

    return names.groupBy { name -> name[0] }
      .mapValues{ it.value.size }
  }
}
