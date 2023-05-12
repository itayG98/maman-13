public class Ex13 {

    public static int shortestRoad (int [] road1, int [] road2) {
        // initialize the four options of travel summery
        int sumRoad1 , sumRoad2 , beginRoad1 , beginRoad2 ;
        sumRoad1 = sumRoad2 = beginRoad1 = beginRoad2 = 0 ;
        for (int i = 0 ; i< road1.length ; i++){
            sumRoad1+=road1[i];
            sumRoad2+=road2[i];
        }
        System.out.println("Sum of road 1 :"+sumRoad1);
        System.out.println("Sum of road 2 :"+sumRoad2);
        int sumMin = Math.min(sumRoad1,sumRoad2);
        int beginMin = Math.min(beginRoad1,beginRoad2);
        System.out.println("Minimal road is :"+Math.min(beginMin,sumMin));
        return -1;
    }

    public static int missingValue (int [] arr) {
        return 0;
    }

    public static int longestPalindrome (int[] arr){
        return 0;
    }

    public static boolean isSum (int[] a, int num){
        return true;
    }
}

