import java.util.*;

class Main {
    public static void main(String[] args) {
        //Initializing scanner and introducing program
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the five function calculator!\nThis calculator has five separate functions:\n-Addition\n-Subtraction\n-Division\n-Multiplication\n-Modulus\n ");
        System.out.println("What would you like to select?");

        //Taking user-input 
        String functionSelection = new String(scan.nextLine());
        functionSelection = functionSelection.toLowerCase();

        //Checking user-input to ensure that a valid input was made
        boolean inputCheck = false;
        while(inputCheck == false){
            if(functionSelection.equals("addition") || functionSelection.equals("subtraction") || functionSelection.equals("multiplication") || functionSelection.equals("division") || functionSelection.equals("modulus")){
                inputCheck = true;
                break;
            }else{
                //Repeats previous code until a valid input is made
                System.out.println("That was an invalid input. Please select an input from the list:\n-Addition\n-Subtraction\n-Division\n-Multiplication\n-Modulus\n");
                functionSelection = scan.next();
                functionSelection = functionSelection.toLowerCase();
            }
        }
      //Grabs the two numbers the user wants to input
      System.out.println("What's the first number you want to input?");
      double num1 = scan.nextDouble();
      System.out.println("What's the second number you want to input?");
      double num2 = scan.nextDouble();

      //Switch case to call the corresponding calculator function
      double output = 0.0;
      switch(functionSelection){
        case "addition":
          output = calculator.addition(num1, num2);
          break;
        case "subtraction":
          output = calculator.subtraction(num1, num2);
          break;
        case "multiplication":
          output = calculator.multiplication(num1, num2);
          break;
        case "division":
          output = calculator.division(num1, num2);
          break;
        case "modulus":
          output = calculator.modulus(num1, num2);
          break;
      }

      //Output
      System.out.printf("\nBy using %s with %.3f and %.3f, your resulting number would be %.4f.",functionSelection, num1, num2, output);
    }
}
