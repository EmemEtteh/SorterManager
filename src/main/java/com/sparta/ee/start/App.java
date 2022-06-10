package com.sparta.ee.start;

import com.sparta.ee.exceptions.InputIsTooLargeException;
import com.sparta.ee.exceptions.InvalidInputException;
import com.sparta.ee.exceptions.ZeroLengthInputException;
import com.sparta.ee.start.NewSorterController;

/**
 * Hello world!
 *
 */
public class App 
{
//    TakeInput start = new TakeInput();
//
//    PrintToConsole view = new PrintToConsole();
//
//    SelectAlgorithm model = new SelectAlgorithm();
//
//    SorterController controller = new SorterController(view, model, start);


    public static void main( String[] args ) throws InvalidInputException, InputIsTooLargeException, ZeroLengthInputException {

        NewSorterController controller = new NewSorterController();

        controller.runStuff();



    }
}
