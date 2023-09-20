package reverseprograms;

public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=153;
		int temp=a;
		int rev=0,rem;
		
		while(a>0)
		{
			rem=a%10;
			rev=rev+rem*rem*rem;
			a=a/10;
		}
		if(temp==rev)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not Armstrong Number");
		}
		
	}

}
