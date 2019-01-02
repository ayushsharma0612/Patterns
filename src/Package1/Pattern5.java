package Package1;

public class Pattern5 {
	
	public static void main(String[] args) {
		
		String str="welcome";
        int n=str.length();
		for(int i=0;i<=n-1;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(str.charAt(j));
				
			}
			System.out.println();
			
		}
		
		
	}

}
