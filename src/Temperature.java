import java.util.Scanner;

public class Temperature {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        float f,c;
        System.out.println("Enter the temperature value in  fahrenheit :");
        f= sc.nextFloat();
        c=((f-32)*5)/9;
        System.out.println("Temperature value in Celsius is : "+c);

    }

}
