/*
RJ Dalusung
CMSC 401
Trial Assignment
 */
import java.util.Scanner;
import java.lang.Math;
public class CMSC401_A0 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numLines = input.nextInt(); //number of lines
        int[] nums = new int[1000]; //array for each row of nums
        int[] ans = new int [numLines]; //array for the solutions of each row
        for(int i = 0; i < numLines; i++){
            int numOfNums = input.nextInt() - 2; //number of ints in each row
            for(int j = 0; j < numOfNums; j++){
                nums[j] = input.nextInt(); //scan each number into the array
            }
            int boundA = input.nextInt() - 1;
            int boundB = input.nextInt() - 1;
            ans[i] = Math.max(nums[boundA], nums[boundB]);
        }
        for(int element: ans){
            System.out.println(element);
        }
    }
}