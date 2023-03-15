import java.util.*;

public class SideProject {

  /*public static void main(String[] args) {
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
  }*/

    public static void main(String[] args){
        System.out.println(doMath("5*2+7"));
    }
    
    
    public static String doMath(String str){

        /*
         *
         */
      
        ArrayList<String> numbers = new ArrayList<String>();
        //str.replace("+"||"-"||"^"||"*"||"/", "#");
        int previousIndex = 0;
        String continuingChar = "";
        for(int i = 0; i < str.length(); i ++){
          String currentChar = str.substring(i, i+1);
          
          if(currentChar.equals("+")||currentChar.equals("-")||currentChar.equals("/")||currentChar.equals("*")||currentChar.equals("^")){
            numbers.add()
          }
          previousIndex++;
        }
      
      
      
      /*ArrayList<String> initString = new ArrayList<String>();
        ArrayList<String> operators = new ArrayList<String>();
        ArrayList<String> numbers = new ArrayList<String>();

        String[] arr = str.split("");
        //System.out.println("arr is ");
        for(String s: arr){
            //System.out.println(s);
            initString.add(s);
        }
    
        for(int i = 0; i < initString.size(); i++){
            if(initString.get(i).equals("+") || initString.get(i).equals("-") || initString.get(i).equals("*") || initString.get(i).equals("+") || initString.get(i).equals("^")){
            operators.add(initString.get(i));
            initString.set(i, "#");
          }
          
        }
    
        int previousIndex = 0;
        for(int i = 0; i < initString.size(); i ++){
          if(initString.get(i).equals("#")){
            initString.remove(i);
            String number = "";
            System.out.println("How many times does this occur");
            for(int j = previousIndex; j < (i - previousIndex); j++){
              System.out.println(initString.get(j));
              number += initString.get(j);
              previousIndex++;
            }
            previousIndex--;
            i--;
            System.out.println("adding a number " + number);
            numbers.add(number);
          }
        }
    
        String finalString = "";
        for(int i = 0; i < operators.size(); i ++){
            
          int firstNumb = Integer.parseInt(numbers.get(i));
          int secondNumb = Integer.parseInt(numbers.get(i + 1));
          System.out.println("Numbers next is " + numbers.get(i+1));

          //ln("Operators is ");
          //System.out.println(operators.get(i));

          
          if(operators.get(i).equals("^")){
              finalString = Integer.toString((int) Math.pow(firstNumb,secondNumb));
          }

          if(operators.get(i).equals("*")){
            finalString = Integer.toString(firstNumb*secondNumb);
            System.out.println("Mult occurs. First numb is " + firstNumb + " second numb is " + secondNumb + " and finalstring is " + finalString);
          }

          if(operators.get(i).equals("/")){
          finalString = Integer.toString(firstNumb/secondNumb);
          }

          if(operators.get(i).equals("+")){
              finalString = Integer.toString(firstNumb+secondNumb);
          }

          if(operators.get(i).equals("-")){
              finalString = Integer.toString(firstNumb-secondNumb);
          }

          

          

          numbers.remove(i);
          numbers.remove(i);
          operators.remove(i);
          i = 0;
        }*/
        
    
        return "";
      }
    
      public static boolean isNumber(String str){
        if(str == "0" || str == "1" || str == "2" || str == "3" || str == "4" || str == "5" || str == "6" || str == "7" ||str == "8" || str == "9"){
          return true;
        }
        return false;
      }
}
