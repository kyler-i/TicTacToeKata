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

import java.util.Scanner;

import java.util.Random;

public class FizzBuzz {
    public static String fizzBuzzMachine(int input){
        if (input % 15 == 0){
            return "FizzBuzz";
        }
        
        else if (input % 5 == 0){
            return "Buzz";
        }

        else if (input % 3 == 0){
            return "Fizz";
        }
        return Integer.toString(input);
    }
    public static void PrintFizzBuzz(){
        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzzMachine(i));
        }
    }
}
