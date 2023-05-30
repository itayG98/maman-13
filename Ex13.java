/**
 * Maman 13
 * @author Itay getahun
 * id 315573667
 * @version 30/05/23
 */

public class Ex13 {

    /**
     * The method calculate the shortest way withing two roads in a linear Time complexity of O(n)
     * and space complexity of O(1).
     * Approximately summery of operation = 4 + 2n + 1 + 4 + 7n + 1 = 10 + 9n  => linear expression . <br>
     * explanation : <br>
     * The algorithm runs over the arrays twice and use constant amount of variable regardless of the input.
     * The idea i demonstrated in the algorithm is called "Sliding windows"
     * @param road1 integers array represent the first road
     * @param road2 integers array represent the second road
     * @return The value of the shortest possible travel path
     */
    public static int shortestRoad (int [] road1, int [] road2) {
        // initialize the four options of travel summery
        int sumRoad1 =0 , sumRoad2 = 0 ,res;
        int n = road1.length;

        // Calculate roads within straight travel
        for (int i = 0 ; i < n ; i++) {
            sumRoad1 += road1[i];
            sumRoad2 += road2[i];
        }
        res = Math.min(sumRoad1,sumRoad2);

        int rightPart1 = 0;
        int rightPart2 = 0;
        int leftPart1 = sumRoad1;
        int leftPart2 = sumRoad2;

        // Use the last i roads sum to calculate the different roads when the passenger switch roads in each iteration
        // The i is the switching position
        for (int i=n-1 ; i>0 ; i--){
            leftPart1 -= road1[i];
            leftPart2 -= road2[i];
            rightPart1 += road1[i];
            rightPart2 += road2[i];
            if(leftPart1 + rightPart2 < leftPart2 + rightPart1)
                res = Math.min(leftPart1 + rightPart2 , res);
            else
                res = Math.min(leftPart2 + rightPart1 , res);
        }
        return res;
    }

    /**
     * The method finds the missing value in an arithmetic series with logarithmic time complexity of O(Log(n))
     * and space complexity of O(1).
     * Approximately summery of operation  = 3 + 6*Log(n) + 1 = 6*Log(n) +4 => Logarithmic expression . <br>
     * explanation : <br>
     * The algorithm runs over the arrays and slice it into two parts each iteration , ignoring the irrelevant half
     * (similar to Binary Search) and searching in the matching one .
     * The algorithm use constant amount of variables .
     * This method has use two helper methods with Time and Space complexity of O(1) :
     * @see #calcElementByLocation(int, int, int) <strong>calcElementByLocation</strong> - find the element that should
     * be in a specific location in the series whithin Time and Space complexity of O(1)
     * @see #calcDistance(int, int, int) <strong>calcDistance</strong> - calculate the distance of each step in given arithmetic series in a
     * Time and Space complexity of O(1)
     * @param arr An integers array represent an arithmetic series with missing value
     * @return The missing value
     */
    public static int missingValue (int [] arr) {
        // calculate the sequence distance
        int distance = calcDistance(arr[0],arr[arr.length-1],arr.length);
        int middle = 0;
        //Binary search to find the missing position
        for(int left = 0,right = arr.length-1 ; left <= right-1  ; ){
           middle = (left+right)/2;
           if (middle == left){
               return calcElementByLocation(arr[0],distance,middle+1);
           }
            int predicted = calcElementByLocation(arr[0],distance,middle);
           if (arr[middle] > predicted)
               right = middle;
           else if (arr[middle] == predicted)
               left = middle;
        }
        //if length of the array is not valid
        return -1;
    }

    /**
     * @param first The first element in an arithmetic series
     * @param distance The distance of arithmetic series
     * @param location the elements location
     * @return calculate element in arithmetic series by distance location and  first element
     * The method Time complexity is O(1)
     * The method Space complexity is O(1)
     */
    private static int calcElementByLocation(int first , int distance , int location){
        //calculating item in arithmetic series
        return first+distance*location;
    }

    /**
     * @param first first number in arithmetic series
     * @param last last number in arithmetic series
     * @param length length of the array
     * @return calculated distance of the arithmetic series
     * The method Time complexity is O(1)
     * The method Space complexity is O(1)
     */
    private static int calcDistance(int first ,int last , int length){
        //calculating distance in arithmetic series
        return Math.abs((first- last)/length);
    }

    /**
     * The method call overloading method and return its calculation of the longest palindrome length in Time complexity
     * of O(n^2) and space complexity of O(1). <br>
     * explanation : <br>
     * This method calls overloading method which has Time complexity of O(n^2) and Space complexity of O(1)
     * @param arr an array of integers
     * @return evaluate the longest palindrome
     *@see #longestPalindrome(int[] arr, int right, int left, int count) <strong>longestPalindrome</strong> - The
     * overloading method that recursivley call itself checking a smaller substring each call in O(n^2)
     */
    public static int longestPalindrome (int[] arr){
        //Initial helper method to start the recursive method
        //Overloading
        return longestPalindrome(arr,0,arr.length-1,0);
    }

    /**
     * The method recursively call itself and returns the longest palindrome length in Time complexity
     * of O(n^2) and space complexity of O(1). <br>
     * explanation : <br>
     * There are up to two recursive calls in each call and use constant number of variables regardless of the input
     * @param arr an array of integers
     * @param right the right index
     * @param left the left index
     * @param count the counter of how many element in the palindrome
     * @return evaluate the longest palindrome in substring
     */
    private static int longestPalindrome(int[] arr, int right, int left, int count) {
        // Two Stop conditions
        //If reached a single digit in length i.e. one number;
        if (right == left)
            return count+1;
        //If done go over the digits between the borders;
        if (right>left)
            return count;
        if (arr[right] == arr[left]) {
            // Evaluate palindrome by remove right and left borders and adding two to the counter
            return longestPalindrome(arr, right + 1, left - 1, count + 2);
        }
        //If there is no match of borders check for max palindrome without left border or right border
        return Math.max(longestPalindrome(arr, right + 1, left, 0),
                longestPalindrome(arr, right, left - 1, 0));
    }

    /**
     * The method call overloading method determines if a subset, excluding following 3 elements in the array  sum up
     * to the given number in Time complexity of O(n^2) and space complexity of O(1). <br>
     * explanation : <br>
     * This method calls overloading method which has Time complexity of O(n^2) and Space complexity of O(1)
     * @param arr an array of integers
     * @param num the target number
     * @return true or false determines if a subset, excluding following 3 elements in the array  sum up
     * to the given number
     *@see #isSum(int[] arr, int i, int num ,int sum,int counted ) <strong>isSum</strong> - The
     * overloading method that recursivley call itself checking if an apropriate valid combination sum up to the
     * given number using "Take no take" technique in Time complexity of O(n^2) and Space complexity of O(1)
     */
    public static boolean isSum (int[] arr, int num){
        if (num == 0 )
            return true;
        return  isSum(arr,0,num,0,0);
    }

    /**
     * The method recursively call itself and use "Take no take" technique to check if an appropriate valid combination
     * has the given sum in Time complexity of O(n^2) and space complexity of O(1). <br>
     * explanation : <br>
     * There are up to two recursive calls in each call and use constant number of variables regardless of the input
     * @param arr an array of integers
     * @param i the index of the mext element to take or no take in consideration
     * @param num the target number
     * @param sum the current summery
     * @param counted counter of how many element have calculated in a row
     * @return true or false determines if a subset, excluding following 3 elements in the array  sum up
     * to the given number
     */
    private static boolean isSum(int[] arr, int i, int num ,int sum,int counted ) {
        // stop condition
        if( i >  arr.length-1)
            return false;
        //if already considered two elements in a row
        if (counted == 2)
            return  isSum(arr,i+2,num,sum,0);
        if (sum + arr[i] == num)
            return true;
        //Take or no take the current number
        return isSum(arr,i+1,num,sum + arr[i], counted+1) || isSum(arr,i+1,num,sum,0) ;
    }
}
