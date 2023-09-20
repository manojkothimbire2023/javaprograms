package reverseprograms;

public class palimdromstring {

	public static void main(String[] args) {
		String s="madam";
		
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev))
		{
			System.out.println("palimdrom string");
		}
		else
		{
			System.out.println("Not palimdrom string");
		}


	}

}
