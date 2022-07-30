import java.util.Scanner;

public class LoopandMapEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,n=0,s=0;
		double avg;
		{
		   
	        System.out.println("Input the 5 numbers : ");  
	         
		}
			for (i=0;i<5;i++)
			{
			    Scanner in = new Scanner(System.in);
			    n = in.nextInt();
			    
	  		s +=n;
		}
		avg=s/5;
		System.out.println("The sum of 5 no is : " +s+"\nThe Average is : " +avg);


		Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int sum;
        int average;
        int product;
        int largest;
        int smallest;

        System.out.print("Enter First Integer: ");
        num1 = input.nextInt();

        System.out.print("Enter Second Integer: ");
        num2 = input.nextInt();

        System.out.print("Enter Third Integer: ");
        num3 = input.nextInt();

        sum = num1 + num2 + num3;
        average = sum / 3;
        product = num1 * num2 * num3;

        largest = num1;
        smallest = num1;

        if(num2 > largest)
            largest = num2;

        if(num3 > largest)
            largest = num3;

        if(num2 < smallest)
            smallest = num2;

        if (num3 < smallest)
            smallest = num3;

        System.out.println("The sum is " + sum);

        System.out.println("The average is " + average);

        System.out.println("The product is " + product);

        System.out.println("Largest of three integers is " + largest + " and the smallest is "+ smallest + ".");
    }

		
	}
	