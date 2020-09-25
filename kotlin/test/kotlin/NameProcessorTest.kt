package edu.assignment1

import io.kotlintest.specs.StringSpec
import io.kotlintest.shouldBe

class NameProcessorTest : StringSpec() {
  init {
    "canary should be true" {
      true shouldBe true
    }
    val nameProcessor = NameProcessor()

    "average number of letters when the given list is empty"{
      nameProcessor.averageNumberOfLetters(listOf()) shouldBe 0.0
    }

    "average number of letters when the given list has one name" {
      nameProcessor.averageNumberOfLetters(listOf("Bob")) shouldBe 3.0
    }

    "average number of letters when the given list has two name of same length"{
      nameProcessor.averageNumberOfLetters(listOf("Bob", "Kat")) shouldBe 3.0
    }

    "average number of letters when the given list has two name of different length" {
      nameProcessor.averageNumberOfLetters(listOf("Bob", "Mary")) shouldBe 3.5
    }

    "average number of letters when the given list has three name of different length"{
      nameProcessor.averageNumberOfLetters(listOf("Bob", "Mary", "Frank")) shouldBe 4.0
    }

    "groups based on name's first letter when the given list is empty"{
      nameProcessor.groupsByFirstLetter(listOf()) shouldBe mapOf()
    }

    "groups based on name's first letter when the given list has one name" {
      nameProcessor.groupsByFirstLetter((listOf("Bob"))) shouldBe mapOf('B' to listOf("Bob"))
    }

    "groups based on name's first letter when the given list has two names of same initial letter"{
      nameProcessor.groupsByFirstLetter(listOf("Bob", "Barbara")) shouldBe mapOf('B' to listOf("Bob", "Barbara"))
    }

    "groups based on name's first letter when the given list has two names of different initial letter" {
      nameProcessor.groupsByFirstLetter(listOf("Bob", "Mary")) shouldBe mapOf('B' to listOf("Bob"), 'M' to listOf("Mary"))
    }

    "groups based on name's first letter when the given list has three names, two with same initials and one with a distinct initial"{
      nameProcessor.groupsByFirstLetter(listOf("Bob", "Mary", "Barbara")) shouldBe mapOf('B' to listOf("Bob", "Barbara"), 'M' to listOf("Mary"))
    }

    "number of names based on name's first letter when the given list is empty"{
      nameProcessor.numberOfNamesByFirstLetter(listOf()) shouldBe mapOf()
    }

    "number of names based on name's first letter when the given list has one name" {
      nameProcessor.numberOfNamesByFirstLetter(listOf("Bob")) shouldBe mapOf('B' to 1)
    }

    "number of names based on name's first letter when the given list has two names of same initial letter"{
      nameProcessor.numberOfNamesByFirstLetter(listOf("Bob", "Barbara")) shouldBe mapOf('B' to 2)
    }

    "number of names based on name's first letter when the given list has two names of different initial letter" {
      nameProcessor.numberOfNamesByFirstLetter(listOf("Bob", "Mary")) shouldBe mapOf('B' to 1, 'M' to 1)
    }

    "number of names based on name's first letter when the given list has three names, two with same initials and one with a distinct initial"{
      nameProcessor.numberOfNamesByFirstLetter(listOf("Bob", "Mary", "Barbara")) shouldBe mapOf('B' to 2, 'M' to 1)
    }

    "average number of letters when the given list is empty, using full immutability and functional style"{
      nameProcessor.averageNumberOfLettersImmutable(listOf()) shouldBe 0.0
    }


    "average number of letters when the given list has one name, using full immutability and functional style" {
      nameProcessor.averageNumberOfLettersImmutable(listOf("Bob")) shouldBe 3.0
    }

    "average number of letters when the given list has two name of same length, using full immutability and functional style"{
      nameProcessor.averageNumberOfLettersImmutable(listOf("Bob", "Kat")) shouldBe 3.0
    }

    "average number of letters when the given list has two name of different length, using full immutability and functional style" {
      nameProcessor.averageNumberOfLettersImmutable(listOf("Bob", "Mary")) shouldBe 3.5
    }

    "average number of letters when the given list has three name of different length, using full immutability and functional style"{
      nameProcessor.averageNumberOfLettersImmutable(listOf("Bob", "Mary", "Frank")) shouldBe 4.0
    }

    "groups based on name's first letter when the given list is empty, using full immutability and functional style"{
      nameProcessor.groupsByFirstLetterImmutable(listOf()) shouldBe mapOf()
    }

    "groups based on name's first letter when the given list has one name, using full immutability and functional style" {
      nameProcessor.groupsByFirstLetterImmutable(listOf("Bob")) shouldBe mapOf('B' to listOf("Bob"))
    }

    "groups based on name's first letter when the given list has two names of same initial letter, using full immutability and functional style"{
      nameProcessor.groupsByFirstLetterImmutable(listOf("Bob", "Barbara")) shouldBe mapOf('B' to listOf("Bob", "Barbara"))
    }

    "groups based on name's first letter when the given list has two names of different initial letter, using full immutability and functional style" {
      nameProcessor.groupsByFirstLetterImmutable(listOf("Bob", "Mary")) shouldBe mapOf('B' to listOf("Bob"), 'M' to listOf("Mary"))
    }

    "groups based on name's first letter when the given list has three names, two with same initials and one with a distinct initial, using full immutability and functional style"{
      nameProcessor.groupsByFirstLetterImmutable(listOf("Bob", "Mary", "Barbara")) shouldBe mapOf('B' to listOf("Bob", "Barbara"), 'M' to listOf("Mary"))
    }

    "number of names based on name's first letter when the given list is empty, using full immutability and functional style"{
      nameProcessor.numberOfNamesByFirstLetterImmutable(listOf()) shouldBe mapOf()
    }

    "number of names based on name's first letter when the given list has one name, using full immutability and functional style" {
      nameProcessor.numberOfNamesByFirstLetterImmutable(listOf("Bob")) shouldBe mapOf('B' to 1)
    }

    "number of names based on name's first letter when the given list has two names of same initial letter, using full immutability and functional style"{
      nameProcessor.numberOfNamesByFirstLetterImmutable(listOf("Bob", "Barbara")) shouldBe mapOf('B' to 2)
    }

    "number of names based on name's first letter when the given list has two names of different initial letter, using full immutability and functional style" {
      nameProcessor.numberOfNamesByFirstLetterImmutable(listOf("Bob", "Mary")) shouldBe mapOf('B' to 1, 'M' to 1)
    }

    "number of names based on name's first letter when the given list has three names, two with same initials and one with a distinct initial, using full immutability and functional style"{
      nameProcessor.numberOfNamesByFirstLetterImmutable(listOf("Bob", "Mary", "Barbara")) shouldBe mapOf('B' to 2, 'M' to 1)
    }
  }
}
