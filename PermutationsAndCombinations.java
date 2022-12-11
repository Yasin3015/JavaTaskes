import java.util.Scanner;
class PermutationsAndCombinations{
	// function to calc factorial of number 
	public static double fact(double num)
	{
        double fact=1;
		for(int i = 1; i <= num ; i++)
		{
			fact=fact*i;
		}
  	    return fact;
	}
	// function to calc Permutations of number 
	public static double perm(int n,int r ){
		//nPr = (!n)/(!(n-r))
		double P = fact(n)/fact(n-r);	
		return P;
	}
	// function to calc Combinations of number
	public static double comb(int n,int r)
	{
		//nCr = (!n)/(!(n-r)*!(r))
		double C = fact(n)/(fact(n-r)*fact(r));
		return C;
	}
	public static void main(String arg[])	
	{
		// object to get values from the user 
		Scanner obj = new Scanner(System.in);
		// get value of (n) from the user 
		System.out.print("enter value of n");
        int n = obj.nextInt();
		// get value of (r) from the user
		System.out.print("enter value of r");
        int r = obj.nextInt();
		// check the value of (n) as it must not be less than (r) 
		if(n >= r)
		{
			System.out.println("The value of ( "+n+"P"+r+" ) is : "+perm(n,r));	
			System.out.println("The value of ( "+n+"C"+r+" ) is : "+comb(n,r));
		}
		else
			System.out.println("The value of (n) can't be less than (r) .");
		
	}	
}