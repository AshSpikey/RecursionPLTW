import java.util.*;

public class SideProject {
    public static void main(String[] args){
        System.out.println(doMath("77+422*71"));
    }
    
    
    public static String doMath(String str){
        ArrayList<String> initString = new ArrayList<String>();
        ArrayList<String> operators = new ArrayList<String>();
        ArrayList<String> numbers = new ArrayList<String>();

        String[] arr = str.split("");
        //System.out.println("arr is ");
        for(String s: arr){
            //System.out.println(s);
            initString.add(s);
        }
    
        for(int i = 0; i < initString.size(); i++){
            System.out.println(initString.get(i));
            if(initString.get(i).equals("+") || initString.get(i).equals("-") || initString.get(i).equals("*") || initString.get(i).equals("+") || initString.get(i).equals("^")){
            operators.add(initString.get(i));
            System.out.println("get here " + initString.get(i));
            initString.set(i, "#");
          }
          
        }
    
        int previousIndex = 0;
        for(int i = 0; i < initString.size(); i ++){
          if(initString.get(i).equals("#")){
            initString.remove(i);
            String number = "";
            for(int j = previousIndex; j < (i - previousIndex); j++){
              number += initString.get(j);
            }
            i--;
            numbers.add(number);
          }
        }
    
        String finalString = "";
        for(int i = 0; i < numbers.size() - 1; i ++){
            int firstNumb = Integer.parseInt(numbers.get(i));
            int secondNumb = Integer.parseInt(numbers.get(i + 1));

            System.out.println("Operators is ");
            System.out.println(operators.get(i));

            
            if(operators.get(i).equals("^")){
                finalString = Integer.toString((int) Math.pow(firstNumb,secondNumb));
            }

            if(operators.get(i).equals("+")){
                finalString = Integer.toString(firstNumb+secondNumb);
            }

            if(operators.get(i).equals("-")){
                finalString = Integer.toString(firstNumb-secondNumb);
            }

            if(operators.get(i).equals("*")){
                finalString = Integer.toString(firstNumb*secondNumb);
            }

            if(operators.get(i).equals("/")){
                finalString = Integer.toString(firstNumb/secondNumb);
            }

            operators.remove(i);
            i = 0;
        }
        
    
        return finalString;
      }
    
      public static boolean isNumber(String str){
        if(str == "0" || str == "1" || str == "2" || str == "3" || str == "4" || str == "5" || str == "6" || str == "7" ||str == "8" || str == "9"){
          return true;
        }
        return false;
      }
}
