/*
RJ Dalusung
CMSC401
Assignment 1
*/
import java.util.Scanner;
public class CMSC401_A1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); //number of ints in array

        int array[] = new int[n]; //new array, size is the max size of array
        int cme1 = 0; //candidate majority element 1
        int cme2 = 0; //candidate majority element 2
        int cme1_count = 0; //counter for cme1
        int cme2_count = 0; //counter for cme2

        for (int i = 0; i < n; i++){
            array[i] = input.nextInt(); //scans each input into array
            if(i == 0) cme1 = array[0]; //assigns first element to cme1
            if(i > 0 && array[i] != cme1) cme2 = array[i]; //assigns any element that isn't 
        }
        //finding cme1 and cme2
        for(int i = 0; i < n; i++){
            if(cme1_count == 0){
                cme1 = array[i];
            }else if(cme2_count == 0){
                cme2 = array[i];
            }
            if(cme1 != array[i] && cme2 != array[i]){
                cme1_count--;
                cme2_count--;
            }else if(cme1 == array[i]){
                cme1_count++;
            }else if(cme2 == array[i]){
                cme2_count++;
            }
        }

        //determining if it actually is a majority element or not
        cme1_count = 0;
        cme2_count = 0;
        //goes through the array again, checks for each occurrence of the element and increments counter
        for(int i = 0; i < n; i++){
            if(cme1 == array[i]) cme1_count++;
            if(cme2 == array[i]) cme2_count++;
        }
        //checking how to print the numbers, if there are majority elements
        if(cme1_count > n/3){
            if(cme2_count > n/3){
                if(cme1_count > cme2_count){
                    System.out.print(cme2);
                    System.out.println(" " + cme1);
                }else{
                    System.out.print(cme1);
                    System.out.println(" " + cme2);
                }
            }else{
                System.out.println(cme1);
            }
        }else if(cme2_count > n/3){
            System.out.println(cme2);
        }else{
            System.out.println(-1);
        }
    }
}