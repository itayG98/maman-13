public class Ex13 {

    public static int shortestRoad (int [] road1, int [] road2) {
        // initialize the four options of travel summery
        int sumRoad1 =0 , sumRoad2 = 0 ,res = 0;
        int n = road1.length;

        // Calculate roads straight travel summery
        for (int i = 0 ; i < n ; i++) {
            sumRoad1 += road1[i];
            sumRoad2 += road2[i];
        }
        res = Math.min(sumRoad1,sumRoad2);

        // Calculate the switching road options
        // I initialized the straight travel to zero to use the ongoing summery
//        sumRoad1 = sumRoad2 =  0 ;
//        for (int i = 0 ; i < length ; i++) {
//            sumRoad1 += road1[i];
//            sumRoad2 += road2[i];
//            int beignRoad1Temp = sumRoad1 ;
//            int beignRoad2Temp = sumRoad2  ;
//        // Check current summery with next length-i second road
//            for( int j = i+1 ; j < length ; j++){
//                beignRoad1Temp+=road2[j];
//                beignRoad2Temp+=road1[j];
//            }
//            res = beignRoad1Temp < beignRoad2Temp ? Math.min(beignRoad1Temp,res) : Math.min(beignRoad2Temp,res);
//        }

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
        return 0;
    }

    public static int longestPalindrome (int[] arr){
        return 0;
    }

    public static boolean isSum (int[] a, int num){
        return true;
    }
}
