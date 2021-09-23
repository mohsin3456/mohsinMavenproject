// WAP to sum of array element (total element sum)
package sept17FistDay;
//import java.util.Scanner;// if we use take a data from user
public class SumOfArray {
    
    public static void main(String[] args) {
		int[] arr=new int[] {1,8,0,7};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("sum of elemt"+sum);

	}

}


