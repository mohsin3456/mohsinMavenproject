
package sept17FistDay;

public class SumOfEachSqureNo {
    
    // add each element squre sum
	public static void main(String[] args) {

		int num=125;
		int sum = 0;
		int rem = 0;
		while (num > 0) {
			rem = num % 10;

			sum = sum + (rem * rem);
			num = num / 10;
		}
		System.out.println("sum of indivisual digit:" +  sum);
	}

}

    

