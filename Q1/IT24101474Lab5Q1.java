import java.util.Scanner;
public class IT24101474Lab5Q1{
public static void main (String[]args){

Scanner scanner= new Scanner(System.in);

System.out.println("Enter the first number: ");
int num1=scanner.nextInt();

System.out.println("Enter the second number: ");
int num2=scanner.nextInt();

System.out.println("Enter the third number: ");
int num3=scanner.nextInt();

//compare the smallest number
int smallest = num1;
if(num2<smallest){
smallest=num2;
}

if (num3<smallest){
smallest=num3;
}

// compare the largest number
int largest=num1;
if(num2>largest){
largest=num2;
}

if(num3>largest){
largest=num3;
}

System.out.println("User entered numbers are: "+num1+", "+num2+", "+num3+"");

System.out.println("The smallest number is: " +smallest );
System.out.println("The largest number is: " +largest);


}
}