/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.thread;

public class RepeatingPrinterTest {

  private static String lambdaMessage = "block-lambda";

  public static void main(String[] args) {
    Thread thd1 = new Thread(new RepeatingPrinter());
    thd1.start();

    // TODO: initialize the 'printer' reference variable with a block lambda
    // hint: you can copy / paste the *contents* of RepeatingPrinter's run() method
    // note: change the sysout to show "block-lambda"
    Runnable printer = () -> {
      while (true) {
        System.out.println(lambdaMessage);
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          // Do nothing; exception isn't serious.
        }
      }
    };

    // TODO: create another Thread, passing in the 'printer' reference as its Runnable - then start it
    new Thread(printer).start();

    lambdaMessage = "modified-message";
  }
}