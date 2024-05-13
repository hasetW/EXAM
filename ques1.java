import java.util.Scanner;
public class ques1 {
    public static void main(String[] arg) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int number = scn.nextInt();
        int nums;
        int []arr=new int[number];
        for(int i=0;i<number;i++){
            System.out.println("enter nums: ");
             nums=scn.nextInt();
             for(int j=0;j<number;j++){
                 arr[j]=nums;
             }
        }
        System.out.println("enter target number: ");
        int target=scn.nextInt();
        int count=0;

        for(int i=0;i<arr.length;i++){
            if(target!=arr[i]){
                System.out.println("target is not found");
            }
            else{
                count=+1;
            }
        }
        System.out.println("the number of time it appears "+ count);


    }
}



