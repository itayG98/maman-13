
// Maman 13
// Student Itay Getahun
// Date 20/05/23

public class Ex13 {

    public static int shortestRoad (int [] road1, int [] road2) {
        // initialize the four options of travel summery
        int sumRoad1 =0 , sumRoad2 = 0 ,res;
        int n = road1.length;

        // Calculate roads straight travel summery
        for (int i = 0 ; i < n ; i++) {
            sumRoad1 += road1[i];
            sumRoad2 += road2[i];
        }
        res = Math.min(sumRoad1,sumRoad2);

        int lastiRoad1 = 0;
        int lastiRoad2 = 0;
        int firstiRoad1 = sumRoad1;
        int firstiRoad2 = sumRoad2;

        for (int i=n-1 ; i>0 ; i--){
            firstiRoad1 -= road1[i];
            firstiRoad2 -= road2[i];
            lastiRoad1 += road1[i];
            lastiRoad2 += road2[i];
            if(firstiRoad1 + lastiRoad2 < firstiRoad2 + lastiRoad1)
                res = Math.min(firstiRoad1 + lastiRoad2 , res);
            else
                res = Math.min(firstiRoad2 + lastiRoad1 , res);
        }
        return res;
    }

    public static int missingValue (int [] arr) {
        int distance = calcDistance(arr[0],arr[arr.length-1],arr.length);
        int middle = 0;
        for(int left = 0,right = arr.length-1 ; left+1 < right  ; ){
           middle = (left+right)/2;
           int predicted = calcNElement(arr[0],distance,middle);
           if (arr[middle] > predicted)
               right = middle;
           else if (arr[middle] == predicted)
               left = middle;
        }
        return calcNElement(arr[0],distance,middle);
    }
    private static int calcNElement(int first , int distance , int location){
        return first+distance*location;
    }
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

