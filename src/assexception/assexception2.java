package assexception;

import java.util.Scanner;

public class assexception2 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the numerator and denominator: ");
	int n=s.nextInt();
	int d=s.nextInt();
	try {
		double r=divide(n,d);
		System.out.println("The quotient is: "+r);
	} 
	catch(UnsupportedOperationException e) {
		System.out.println("Can't divide by zero");
	}
}
private static double divide(int n, int d) throws UnsupportedOperationException{

	if(d==0) {
		throw new UnsupportedOperationException("Exception");
	}
	return n/d;
}
}
class UnsupportedOperationException extends Exception{
	UnsupportedOperationException(String exception){
		super(exception);
	}
}


