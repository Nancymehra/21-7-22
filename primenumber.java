import java.util.Scanner;
class primenumber
{
	public static void main(String args[])
		int n1,n2,i,j;
		System.out.print("prime number between ");
		Scanner na=new Scanner(System.in);
		n1=na.nextInt();
		n2=na.nextInt();
	for(i=n1;i<=n2;i++)
	{
		for(j=2;j<=i;j++)
		{
			if(i%j==0)
			break;
		}
		if(i==j)
		System.out.print(j+" ");
	}
}
}