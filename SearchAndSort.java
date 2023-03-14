/*
 * Activity 4.10.2
 */
public class SearchAndSort
{ 
  public static void main(String[] args) 
  { 
    final int SIZE = 10000;
    final int RANGE = 100000;
    
    int[] arr = new int[SIZE];
    
    for (int i = 0; i < SIZE; i++)
      arr[i] = (int)(Math.random() * RANGE) + 1;
      
    // search for a random array element
    int intSearch = arr[(int)(Math.random() * SIZE)];
    
    long startTime = System.nanoTime();
    int result = iSearch(arr, intSearch, 0); 
    long endTime = System.nanoTime();
      
    System.out.println("Execution time: " +  (endTime - startTime) / 1e6  + " seconds");
    
    if (result == -1) 
      System.out.println(intSearch +" not found"); 
    else
      System.out.println(intSearch + " found at index  " + result);
  } 
  
  /**
   * Returns index of x if x's value is present in arr[], else return -1
   */
  public static int iSearch(int x[], int intSearch, int position)
  {
    if (position < x.length)
    {
      if (x[position] == intSearch)
        return position;
      else 
        return iSearch(x, intSearch, position + 1);
    }
    return -1;
  }

  /*
 * Activity 4.10.2
 *
 * Note: This file contains only methods and will not run in the code editor
 *
 */

 // requries an input of an int array, the index of the first vale, the index of the last value, and the value of x that you are searching for 
public static int binarySearch(int arr[], int lt, int rt, int x) 
{ 

    // this makes sure the list actually has volume 
  if (rt >= lt)
  { 
    // calculates the index of the middle value 
    int mid = lt + (rt - lt) / 2; 

    // checks if the value at the middle is the value of x that we want, if so returns the index of mid 
    if (arr[mid] == x) 
      return mid; 
        

      // if not then it checks if value of middle is greater than the value of the x, in which case it only starts searching to the left, otherwise to the right and recurisvly searches
    if (arr[mid] > x) 
      return binarySearch(arr, lt, mid - 1, x); 

    return binarySearch(arr, mid + 1, rt, x); 
  } 
  return -1; 
} 
} 