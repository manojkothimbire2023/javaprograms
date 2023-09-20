package reverseprograms;

public class palimdromnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=121;
		int temp=a;
		int rev=0,rem;
		
		while(a>0)
		{
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		if(temp==rev)
		{
			System.out.println("palimdrom number");
		}
		else
		{
			System.out.println("Not palimdrom number");
		}
		
	}

}
