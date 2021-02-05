package com.hollychaffee;

public class Main {

    public static void main(String[] args) {
        boolean gameOver /* boolean literal, declaration of a variable-specifies data type (boolean) and name (gameOver).
                 Informs the compiler about properties of the variable such as it's name,
                 type of value it holds, and the initial value it takes, if any. */
                = true;  // Definition of variable. The value that has been assigned.
        int score = 6000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score == 5000) {  /* This line of code will execute without the curly braces but will only read this line.
             Add the curly braces and the compiler will read more than one line-all that is inside the code block of the curly braces. */
            System.out.println("Your score was 5000");  /* The use of code blocks are optional if we only have one statement to process.
             It is recommended to still use the curly braces every time to establish good habits and avoid errors.
             It also makes the code clear and easier to understand.*/
        }
        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");  // This is false, so we go to the next condition and check -
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");  // This is also false, so the compiler moves to the next condition.
        } else {  // Starts a new code block with an else conditional statement. Checks the specified condition.
            System.out.println("Finished");  // This is true, so the statement will print out.

            if (gameOver == true) {
                int finalScore = score + (levelCompleted * bonus);  // Calculates the final score.
                // The local variable here(inside this code block)is able to access the instance variables outside the code block above.
                System.out.println("Your final score was " + finalScore);
            }

            /* int savedFinalScore = finalScore;  This is an error because the previous code block was executed
               and the local variable has been destroyed (deleted).*/

            /* Challenge - Print out second score with the following
               score set to 10000
               levelCompleted set to 8
               bonus set to 200
               Make sure the first printout above still displays as well.*/

            int score2 = 10000;
            int levelCompleted2 = 8;
            int bonus2 = 200;

            if (gameOver) {
                int finalScore= score2 + (levelCompleted2 * bonus2);  /* The finalScore variable can be reused because
                it was deleted as a local variable in the previous code block.*/
                System.out.println("Now your score is " + finalScore);
            }
            /* The if statement identifies which statement or code block to run based on the value of an expression.
               In other words, based on a specific condition.

               Inside the code block, defined by curly braces { }, we can have one or multiple statements.

               We can use the else statement after the if. In that case, when the condition is false, the else block will be executed.

               We can also add else if to test multiple conditions.*/
        }
    }
}
