import java.util.*;
public class part1_3
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a, b, c;
	    a = sc.nextInt();
	    b = sc.nextInt();
	    c = sc.nextInt();
	    int sum = a+b+c, prod = a*b*c;
	    double avg = sum/3.0;
	    int min = Math.min(Math.min(a, b), c);
	    int max = Math.max(Math.max(a, b), c);
	    System.out.println("Sum: " + sum);
	    System.out.println("Average:: " + avg);
	    System.out.println("Product: " + prod);
	    System.out.println("Min: " + min);
	    System.out.println("Max: " + max);
	}
}

