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
            }else{
                //Repeats previous code until a valid input is made
                System.out.println("That was an invalid input. Please select an input from the list:\n-Addition\n-Subtraction\n-Division\n-Multiplication\n-Modulus\n");
                functionSelection = scan.next();
                functionSelection = functionSelection.toLowerCase();
            }
        }
    }
}
