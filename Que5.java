package com.tejas;

public class Que5 {

	public static void main(String[] args) 
	{
		int n =20; 
	
		
		for(int i=0;i<n-1;i++) {
			
			for(int j=0;j<n-1;j++) {
				
				if((i==0&&j>=0)||(i<n/2&&j<(3*n/4)-i)||(i==n-2&&j<=n-1)||(i<n-1&&j<i*3/4)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
	}
}