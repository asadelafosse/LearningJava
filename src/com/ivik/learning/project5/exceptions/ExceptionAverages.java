package com.ivik.learning.project5.exceptions;

/**
 * Created by Sebastien on 29-1-2016.
 */
public class ExceptionAverages {

    private double averageScore(double totalScore, String numberStudentsAsString) throws NumberFormatException, ArithmeticException {
            //'throws' clause is not required here, because the exceptions here are runtime exceptions, and therefore unchecked.
        try {
            int numberStudents = Integer.parseInt(numberStudentsAsString);
            int averageScore = (int) totalScore / numberStudents;       // recasting to int is required to receive a divide by zero arithmetic exception.
            System.out.println("Average score for (" + totalScore + ", " + numberStudentsAsString + ") is: " + averageScore);
            return averageScore;

        } catch(NumberFormatException e1){
            System.out.println("Average score for (" + totalScore + ", " + numberStudentsAsString + ") resulted in a NumberFormatException.");

        } catch(ArithmeticException e2){
            System.out.println("Average score for (" + totalScore + ", " + numberStudentsAsString + ") resulted in an ArithmeticException.");

        } finally {return 1;}       //The value returned here is not relevant. If the try block works, averageScore is return, and otherwise, the returned value is not used.

    }

    public void testAverages(){
        averageScore(900, "10");
        averageScore(90,"Oops!");
        averageScore(90,"0");
    }

    public static void main(String[] args) {
        ExceptionAverages exceptionAverages = new ExceptionAverages();
        exceptionAverages.testAverages();



    }

}
