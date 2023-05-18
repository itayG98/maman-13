/**
 * Maman 13
 * @author Itay getahun
 * id 315573667
 * @version 20/05/23
 */

public class Ex13 {

    /**
     *The method calculate the shortest way withing two roads in a linear Time complexity of O(n)
     *Approximately summery of operation = 4 + 2n + 1 + 4 + 7n + 1 = 10 + 9n  => linear expression
     *explanation :
     *The algorithm runs over the arrays twice
     *This method uses constant amount of variables regardless of the arrays therefore have Space complexity of O(1)
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

        // Use the last i items to calculate the different roads when the passenger switch roads
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
     *The method find the missing int in arithmetic series in logarithmic Time complexity of O(Log(n))
     * *Approximately summery of operation = 3 + 6*Log(n) + 1 = 6*Log(n) +4 => Logarithmic expression
     * *explanation :
     * The algorithm runs over the arrays and slice it into two parts each iteration , ignoring the irrelevant half
     * (similar to Binary Search) and searching in the matching one .
     *This method uses constant amount of variables regardless of the arrays therefore have Space complexity of O(1)
     * @param arr An integers array represent an arithmetic series with missing value
     * @return The missing value
     */
    public static int missingValue (int [] arr) {
        int distance = calcDistance(arr[0],arr[arr.length-1],arr.length);
        int middle = 0;
        for(int left = 0,right = arr.length-1 ; left+1 < right  ; ){
           middle = (left+right)/2;
           int predicted = calcElementByLocation(arr[0],distance,middle);
           if (arr[middle] > predicted)
               right = middle;
           else if (arr[middle] == predicted)
               left = middle;
        }
        return calcElementByLocation(arr[0],distance,middle);
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
        return Math.abs((first- last)/length);
    }

    public static int longestPalindrome (int[] arr){
        //Initial helper method to start the recursive method
        //Overloading
        return longestPalindrome(arr,0,arr.length-1,0);
    }

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
            count = longestPalindrome(arr, right + 1, left - 1, count + 2);
            return count;
        }
        //If there is no match of borders check for max palindrome without left border or right border
        return Math.max(longestPalindrome(arr, right + 1, left, 0), longestPalindrome(arr, right, left - 1, 0));
    }

    public static boolean isSum (int[] a, int num){
        return true;
    }
}

