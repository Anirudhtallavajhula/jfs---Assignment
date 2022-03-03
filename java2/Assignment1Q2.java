package java2;

public class Assignment1Q2 {
	public static void main (String [] args) {
		int n=100;
		int temp=0;
		int r=0;
		
		for(n=100;n<=999;n++)
		{
			int a=n;
			while(a>0)
			{
				r=a%10;
				temp=temp+(r*r*r);
				a=a/10;
			}
			if(temp==n)
			{
				System.out.println(n+ "is an armstrong Number");
			}
		}
	}

}