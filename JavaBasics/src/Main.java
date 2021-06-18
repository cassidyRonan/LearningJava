import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        //        double studentGPA = 3.45;
        //        String firstName = "Kayla";
        //        String lastName = "Hammon";
        //
        //        System.out.println(firstName + " " + lastName + " has a GPA of " + studentGPA);
        //        System.out.println("What is the new GPA of this student?");
        //
        //        Scanner input = new Scanner(System.in);
        //        studentGPA = input.nextDouble();
        //
        //        System.out.println(firstName + " " + lastName + " now has a GPA of " + studentGPA);


        String question = "What is the largest planet in our solar system?";
        String[] choices = new String[] {"Earth","Saturn","Jupiter"};
        String correctAnswer = choices[2];

        //Write a print statement asking question
        System.out.println(question);

        //Write a print statement giving answer choices
        System.out.println("The choices are as follows:");
        for (String choice : choices)
        {
            System.out.println(choice);
        }

        //Have the user input an answer and retrieve it
        Scanner input = new Scanner(System.in);
        String userChoice = input.next();

        //If user's input matches correct answer then print congrats message
        if(userChoice.toLowerCase().equals(correctAnswer.toLowerCase()))
        {
            System.out.println("Congrats you were right!");
        }
        else{
            System.out.println("That was the wrong answer!");
        }

        //If user input does not match correct answer than print failure message
    }



}
