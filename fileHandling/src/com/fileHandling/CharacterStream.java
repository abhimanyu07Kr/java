package com.fileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {
	
	public void fileOpration1() throws IOException
	{
		FileReader fr=new FileReader("C:\\Users\\abhimanyu kumar\\Desktop\\New folder\\a.txt");
		int c;
		while((c=fr.read())!=-1)
		{
			System.out.print((char)c);
		}
		System.out.println("Data");
		fr.close();
	}
	
	public void fileOpration2() throws Exception
	{
		FileWriter fw=new FileWriter("C:\\\\Users\\\\abhimanyu kumar\\\\Desktop\\\\New folder\\\\a.txt",true);
		String s=" because this is easy";
		fw.write(s);
		fw.close();
		System.out.println("Data entered");
	}
	
	public void fileOpration3() throws Exception
	{
		FileReader fr=new FileReader("C:\\\\Users\\\\abhimanyu kumar\\\\Desktop\\\\New folder\\\\a.txt");
		FileWriter fw=new FileWriter("C:\\\\Users\\\\abhimanyu kumar\\\\Desktop\\\\New folder\\\\b.txt");
		int x;
		while((x=fr.read())!=-1)
		{
			fw.write((char)x);
		}
		System.out.println("Data copied");
		fw.close();
		fr.close();
	}
	
	public static void main(String[] args)throws Exception 
	{
		CharacterStream obj = new CharacterStream();
//		obj.fileOpration1();
//		obj.fileOpration2();
		obj.fileOpration3();
	}

}
