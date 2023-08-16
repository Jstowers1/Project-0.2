//class calculator is a class with 5 methods inside 
//Each method takes two inputs, and does one mathmatical function
//Each function also returns a double to the call 

class calculator{
  //addition adds 2 numbers
  public static double addition(int num1, int num2){
    return (double) num1+num2;
  }
  //subtraction subtracts 2 numbers
  public static double subtraction(int num1, int num2){
    return (double) num1-num2;
  }
  //multiplication multiplies 2 numbers
  public static double multiplication(int num1, int num2){
    return (double) num1*num2;
  }
  //division divides 2 numbers
  public static double division(int num1, int num2){
    return (double) num1/num2;
  }
  //modulus divides 2 numbers and returns the remainder 
  public static modulus(int num1, int num2){
    return (double) num1%num2;
  }
}