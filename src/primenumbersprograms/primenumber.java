package primenumbersprograms;

public class primenumber {

	public static void main(String[] args) {
		int num=50;
		for(int i=2;i<=num;i++)
		{
			
			int t=0;

		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				t++;
			}
		
		}
		if(t==0)
				 {
			System.out.print(i+" ");
			
		}
		}

	}
	

}
