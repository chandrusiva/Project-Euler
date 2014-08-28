/*
 * This program computes the sum of multiples of 3 or 5 until a user specified number
 */


public class Euler1 {
	int compute_result(int number) {
		int i;
		int sum=0;
		for(i=1;i<number;i++) {
			if(i%3==0 || i%5==0)
				sum = sum+i;
		}
		return sum;
	}
	public static void main(String args[]) {
		Euler1 ob = new Euler1();
		//Pass the number until which you need to compute the sum
		System.out.println(ob.compute_result(1000000000));
	}
	
}
