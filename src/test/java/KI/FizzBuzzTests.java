/*
 * Copyright 2015-2025 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * https://www.eclipse.org/legal/epl-v20.html
 */

package KI;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FizzBuzzTests {
    FizzBuzz fb;
	@BeforeEach
    void createClass(){
        fb = new FizzBuzz();
    }

    @Test
    void canCovertToString(){
        assertEquals("1", fb.fizzBuzzMachine(1));
    }

    @Test 
    void multiplesOfThree(){
        assertEquals("Fizz", fb.fizzBuzzMachine(9));
        assertEquals("Fizz", fb.fizzBuzzMachine(18));
        assertEquals("Fizz", fb.fizzBuzzMachine(27));
    }

    @Test
    void multiplesOfFive(){
        assertEquals("Buzz", fb.fizzBuzzMachine(5));
        assertEquals("Buzz", fb.fizzBuzzMachine(10));
        assertEquals("Buzz", fb.fizzBuzzMachine(100));
    }

    @Test 
    void multiplesOfThreeAndFive(){
        assertEquals("FizzBuzz", fb.fizzBuzzMachine(15));
        assertEquals("FizzBuzz", fb.fizzBuzzMachine(30));
        assertEquals("FizzBuzz", fb.fizzBuzzMachine(45));
    }
}
