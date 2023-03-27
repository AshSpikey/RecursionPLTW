import java.util.*;

public class SideProject {

  public static void main(String[] args) {
    // creating the scanner object
    Scanner sc = new Scanner(System.in);
    
    // gathering the user input
    System.out.println("Please input an expression");
    String userInput = sc.nextLine();

    //remove spaces from the user input
    userInput = userInput.replaceAll(" ", ""); //replace spaces with nothing, removing all spaces

    // calling the math method 
    System.out.println(math(userInput));
  
    sc.close(); //because it doesn't like me if i don't do this
  }

  public static int math(String str) {
    System.out.println(str + " start"); //debug
    for (int i = 0; i < str.length(); i++) { //loops through all, looking for parentheses
      if (str.substring(i, i+1).equals("(")) { //if it finds an open parentheses at that point: 
        int parenthesesNum = 1; //keep track of number of open/closed parentheses
        int j = i+1; //i is start of parentheses, j will continue through end of parentheses
        while (parenthesesNum > 0) { //while loop because i feel like it, loops until all parentheses that have been opened have been closed
          String substr = str.substring(j, j+1); //current character
          if (substr.equals("(")) { //if there's another opened parentheses
            parenthesesNum += 1; //make sure we wait for one more parentheses to be closed
          } else if (substr.equals(")")) { //if one parentheses closes
            parenthesesNum -= 1; //get one closer to exiting the while loop
          }
          j++; //ofc iterate j
        }
        //System.out.println(str.substring(0, i)); //debug
        //System.out.println(str.substring(i+1, j-1)); //debug
        //System.out.println(str.substring(j)); //debug
        //System.out.println("^^^3"); //debug

        // *before parentheses* + *inside of parentheses passed through math and solved* + *after parentheses*
        //RECURSION!!!!!!!!!!!!!
        str = str.substring(0, i) + math(str.substring(i+1, j-1)) + str.substring(j); 
      }
    }
    //System.out.println("complete"); //debug

    //by now, all the parentheses should be gone and buried
    //just operators now
    //do the math itself:
    
    return 999;
  }



    
    
    public static String doMath(String str){
      // the inputted string should be of just a number followed by an operator, then another number
      // the code checks if the indexOf the operator is not -1, which means it does exist
      // it goes along an if, else if set, to make sure that PEMDAS is followed
      // if the operator does exist then it splits the string at the point the operator exists at
      // this kills the operator, and seperates the two sides (the two numbers) into seperate arrays
      // then, the arrays are converted into integers and the math is completed
      // finally, the final answer is returned to a string and returned
      
      String returnString = "";

      if(str.indexOf("^") != -1){
        // if the index of "^" is NOT -1 (meaning it does exist in the string), the following code occurs
        
        
        String[] twoNumbers = str.split("\\^", 0);
        // An array is created with two elements, one being each value in the equation 
        // Side note: the reason why the string is escaped is because I was getting a floating something error
        // Which I had never heard of before, and when I looked it up it said some of the Strings were actually
        // Like keywords, and so in order to fix it, you escape it, meaning you put the two backslashes in front

        int firstNumber = Integer.parseInt(twoNumbers[0]);
        int secondNumber = Integer.parseInt(twoNumbers[1]);
        // both numbers are parsed into integers 

        int answer = (int) Math.pow(firstNumber, secondNumber);
        // the actual math occurs, in this case we have to cast our Math.pow into an integer because it returns a float 


        returnString = Integer.toString(answer);
        // the final answer is parsed from a String into an int

      }else if(str.indexOf("*") != -1){
        // the only difference between this block of code and the previous one is the operator 
        String[] twoNumbers = str.split("\\*", 0);
        int firstNumber = Integer.parseInt(twoNumbers[0]);
        int secondNumber = Integer.parseInt(twoNumbers[1]);
        int answer = (firstNumber * secondNumber);
        // this here is the only difference, because it simply does multiplication instead of exponent 
        returnString = Integer.toString(answer);

      }else if(str.indexOf("/") != -1){
        String[] twoNumbers = str.split("\\/", 0);
        int firstNumber = Integer.parseInt(twoNumbers[0]);
        int secondNumber = Integer.parseInt(twoNumbers[1]);
        int answer = (firstNumber / secondNumber);
        returnString = Integer.toString(answer);

      }else if(str.indexOf("+") != -1){
        String[] twoNumbers = str.split("\\+", 0);
        int firstNumber = Integer.parseInt(twoNumbers[0]);
        int secondNumber = Integer.parseInt(twoNumbers[1]);
        int answer = (firstNumber + secondNumber);
        returnString = Integer.toString(answer);

      }else if(str.indexOf("-") != -1){
        String[] twoNumbers = str.split("\\-", 0);
        int firstNumber = Integer.parseInt(twoNumbers[0]);
        int secondNumber = Integer.parseInt(twoNumbers[1]);
        int answer = (firstNumber - secondNumber);
        returnString = Integer.toString(answer);

      }

      return returnString;
      // here returns the final answer in string form

    }
  }
