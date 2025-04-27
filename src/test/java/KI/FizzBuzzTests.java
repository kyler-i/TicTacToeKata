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
        assertEquals("1", fb.convert(1));
    }

    @Test
    void threeReturnsFizz(){
        assertEquals("Fizz", fb.convert(3));
    }
}
