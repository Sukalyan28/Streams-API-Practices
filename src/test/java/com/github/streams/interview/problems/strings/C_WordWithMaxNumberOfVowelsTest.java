package com.github.streams.interview.problems.strings;

import com.github.javafaker.Faker;
import com.github.streams.interview.InterviewProblemSolutions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/*
 * Given A String
 * Find the highest number of vowels present in a word.
 *
 * Example:
 * INPUT: HELLO HOW ARE YOU
 * OUTPUT: 2
 * EXPLANATION: HELLO contains 2 vowels.
 * */
class C_WordWithMaxNumberOfVowelsTest {

  @Disabled
  @Test
  void testNumberOfVowels() {
    var input = Faker.instance().chuckNorris().fact();
    final var mySolution = InterviewProblemSolutions.maxNumberOfVowels(input);
    final var yourSolution = 0;
    Assertions.assertEquals(mySolution, yourSolution);
  }
}
