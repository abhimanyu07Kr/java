package com.fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ClassA {

	
	public void fileOpration1() 
	{
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("C:\\Users\\abhimanyu kumar\\Desktop\\New folder\\a.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("connection created");
		
		int x;
		try {
			while((x=fis.read())!=-1)
			{
				System.out.print((char)x);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void fileOpration2() throws IOException
	{
		 FileOutputStream fos=new FileOutputStream("C:\\Users\\abhimanyu kumar\\Desktop\\New folder\\b.txt");
		 String s="java is awesome";
		 byte[] barr = s.getBytes();
		 fos.write(barr);
		 System.out.println("data enter");
	}
	
	public void pattern()
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			int count=1;
			for(int j=1;j<=i*i;j++)
			{
				System.out.print(count);
				if(j%i==0)count++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) throws IOException {
		ClassA obj1 = new ClassA();
		obj1.fileOpration2();
//		obj1.pattern();
	}
}
