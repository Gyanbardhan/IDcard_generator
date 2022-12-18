package Project1;
import java.util.*;
import java.io.*;
public class Part1 {
	public void iiitn(int n)
	{
		if(n%2!=0)
		{
			for(int i=1;i<=n;i++)
			{
				if(i==1||i==n)
				{
					for(int j=1;j<=n*5+4;j++)
					{
						if(j>=4*(n+1)+1)
						{
							if(j==4*(n+1)+1||j==4*(n+1)+n)
							System.err.print("* ");
							else
								System.err.print("  ");
						}
							
						else
						{
						
						if(i==n && j>=3*(n+1)+1 && j<4*(n+1))
						{
							if(j==((n+1)/2)+n*3+3)
								System.err.print("* ");
							else
								System.err.print("  ");
						}
						else
						{
							if(j%(n+1)==0)
								System.err.print("  ");
							else
								System.err.print("* ");
						}
					}
					}
				}
				else
				{
					for(int j=1;j<=n*5+4;j++)
					{
						if(j>=4*(n+1)+1)
						{
							if((j-4*(n+1))==i||j==4*(n+1)+1||j==4*(n+1)+n)
							{
								System.err.print("* ");
							}
							else
								System.err.print("  ");
						}
						else if(j==(n+1)/2||j==((n+1)/2)+n+1||j==((n+1)/2)+2*n+2||j==((n+1)/2)+n*3+3)
							System.err.print("* ");
						else
							System.err.print("  ");
					}
				}
				System.err.println();
			}
		}
	}

}
