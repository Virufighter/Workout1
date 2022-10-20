import java.util.Scanner;

public class Fibonacci {
    static int first=0,second=1,third=0;
    static void printFibonacci(int n){
        if(n>0){
            third = first + second;
            first = second;
            second = third;
            System.out.print(" "+third);
            printFibonacci(n-1);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a limit");
        int n= sc.nextInt();
        System.out.print(first+" "+second);
        printFibonacci(n-2);
    }

}
