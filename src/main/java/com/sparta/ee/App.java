package com.sparta.ee;

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


    public static void main( String[] args ) {

        NewSorterController controller = new NewSorterController();

        controller.runStuff();



    }
}
