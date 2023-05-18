import java.lang.reflect.Array;

public class Ex13StudentTester2023b
{
    public static void main(String[] args) {

        System.out.println("----------------------------------------");
        System.out.println("***       Q1  - shortestRoad         ***");
        System.out.println("----------------------------------------");
        System.out.println("Road1:[5,4,5,8,12,9,9,3]");
        System.out.println("Road2:[7,3,3,12,10,2,10,7]");
        int[] road1={5,4,5,8,12,9,9,3};
        int[] road2={7,3,3,12,10,2,10,7};
        int result1=Ex13.shortestRoad(road1, road2);
        if (result1==49)
            System.out.println("Passed, result is 49");
        else
            System.out.println("Failed,  expected: 49   student's result: "+result1);

        System.out.println("----------------------------------------");
        System.out.println("***       Q1  - shortestRoad         ***");
        System.out.println("----------------------------------------");
        System.out.println("Road1:[10, 2, 5, 7, 8, 3, 1, 6]");
        System.out.println("Road2:[7,3,3,12,10,2,10,7]");
        int[] road3={10, 2, 5, 7, 8, 3, 1, 6};
        int[] road4={5, 8, 3, 6, 1, 9, 4, 7};
        int result2=Ex13.shortestRoad(road3, road4);
        if (result2==33)
            System.out.println("Passed, result is 33");
        else
            System.out.println("Failed,  expected: 33   student's result: "+result2);

        System.out.println("----------------------------------------");
        System.out.println("***       Q1  - shortestRoad         ***");
        System.out.println("----------------------------------------");
        System.out.println("Road1:[10]");
        System.out.println("Road2:[7]");
        int[] road5={10};
        int[] road6={7};
        int result3=Ex13.shortestRoad(road5, road6);
        if (result3==7)
            System.out.println("Passed, result is 7");
        else
            System.out.println("Failed,  expected: 7   student's result: "+result3);

        System.out.println("----------------------------------------");
        System.out.println("***     Q2  - missingValue           ***");
        System.out.println("----------------------------------------");
        {
            int []arr = {7,10,13,16,22,25};
            System.out.println("arr: [7,10,13,16,22,25]");
            int result4=Ex13.missingValue(arr);
            if (result4==19)
                System.out.println("Passed, result is 19");
            else
                System.out.println("Failed,  expected: 19  student's result: "+result4);
        }

        System.out.println("----------------------------------------");
        System.out.println("***     Q2  - missingValue           ***");
        System.out.println("----------------------------------------");
        {
            int []arr = {7,13,16,19,22,25};
            System.out.println("arr: [7,13,16,19,22,25]");
            int result5=Ex13.missingValue(arr);
            if (result5==10)
                System.out.println("Passed, result is 10");
            else
                System.out.println("Failed,  expected: 10  student's result: "+result5);
        }


        System.out.println("----------------------------------------");
        System.out.println("***     Q3  - longestPalindrome      ***");
        System.out.println("----------------------------------------");
        {
            int[] arr= {1,3,2,3,10,10,3,2,4};
            System.out.println("arr: [1,3,2,3,10,10,3,2,4]");
            int result6=Ex13.longestPalindrome(arr);
            if(result6==6)
                System.out.println("Passed, result is 6");
            else
                System.out.println("Failed,  expected: 6  student's result: "+result6);
        }

        System.out.println("----------------------------------------");
        System.out.println("***     Q3  - longestPalindrome      ***");
        System.out.println("----------------------------------------");
        {
            int[] arr= {1,1,1,1,10,10,1,1,1,4};
            System.out.println("arr: [1,1,1,1,10,10,1,1,1,4]");
            int result7=Ex13.longestPalindrome(arr);
            if(result7==8)
                System.out.println("Passed, result is 8");
            else
                System.out.println("Failed,  expected: 8  student's result: "+result7);
        }

        System.out.println("----------------------------------------");
        System.out.println("***     Q3  - longestPalindrome      ***");
        System.out.println("----------------------------------------");
        {
            int[] arr= {1,1,1,1,10,1,1,1,4};
            System.out.println("arr: [1,1,1,1,10,1,1,1,4]");
            int result8=Ex13.longestPalindrome(arr);
            if(result8==7)
                System.out.println("Passed, result is 7");
            else
                System.out.println("Failed,  expected: 7  student's result: "+result8);
        }


//        System.out.println("----------------------------------------");
//        System.out.println("***       Q4  - isSum                ***");
//        System.out.println("----------------------------------------");
//        {
//            int[] arr={5,4,2,1,3};
//            int num=8;
//            System.out.println("arr: [5,4,2,1,3]  num: 8");
//            boolean result4=Ex13.isSum(arr, num);
//            if (result4==true)
//                System.out.println("Passed, result is true");
//            else
//                System.out.println("Failed,  expected: true   student's result: "+result4);
//            System.out.println("----------------------------------------");
//
//        }
    }
}
