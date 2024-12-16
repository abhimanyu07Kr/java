package com.fileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
	
	public void fileOpration1() throws IOException
	{
		FileOutputStream fis = new FileOutputStream("C:\\Users\\abhimanyu kumar\\Desktop\\New folder\\a.txt");
		System.out.println("connection created");
		String s="java is awesome";
		byte[] b = s.getBytes();
		fis.write(b);
		fis.close();
	}
	
	public void fileOpration2() throws Exception
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\abhimanyu kumar\\Desktop\\New folder\\a.txt");
		System.out.println("connection created");
		int x;
		while((x=fis.read())!=-1)
		{
			System.out.print((char)x);
		}
		System.out.println("\ndata fatched");
		fis.close();
	}
	
	
	public void fileOpration3() throws Exception
	{
		FileOutputStream fos=new FileOutputStream("C:\\Users\\abhimanyu kumar\\Desktop\\New folder\\b.txt");
		FileInputStream fis = new FileInputStream("C:\\Users\\abhimanyu kumar\\Desktop\\New folder\\a.txt");
		System.out.println("connection created");
		int x;
		while((x=fis.read())!=-1)
		{
			fos.write((char)x);
		}
		System.out.println("data copied");
	}
	
	public static void main(String[] args) throws Exception {
		ByteStream obj = new ByteStream();
//		obj.fileOpration1();
//		obj.fileOpration2();
		obj.fileOpration3();
		
	}

}
