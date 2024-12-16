package com.fileHandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;


public class BufferedByteStream {
	public void fileOpration1() throws IOException {
		BufferedInputStream bir=new BufferedInputStream(new FileInputStream("C:\\Users\\abhimanyu kumar\\Desktop\\New folder\\a.txt"));
		long start=System.currentTimeMillis();
		int x;
		while((x=bir.read())!=-1)
		{
			System.out.print((char)x);
		}
		long end=System.currentTimeMillis();
		System.out.println("\ntime : "+(end-start));
		bir.close();
	}
	
	public void fileOpration2() throws IOException
	{
		BufferedOutputStream bw=new BufferedOutputStream(new FileOutputStream("C:\\\\Users\\\\abhimanyu kumar\\\\Desktop\\\\New folder\\\\abhi.txt"));
		String s="this is BufferedWriter class";
		byte[] b = s.getBytes();
		bw.write(b);
		System.out.println("done");
		bw.close();
	}
	
	public static void main(String[] args) throws IOException {
		BufferedByteStream obj = new BufferedByteStream();
//		obj.fileOpration1();
		obj.fileOpration2();
	}

}
