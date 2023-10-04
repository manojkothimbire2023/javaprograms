package reverseprograms;

public class countofcharactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Floating minds infortech";
		int count=0;
		char s1='i';
		
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)==s1)
			{
				count++;
			}
		}
		System.out.println("count of i="+count);

		
		
		
		
		
	}

}
