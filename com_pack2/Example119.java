package com_pack2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Example119 
{
    void fileOperation1() throws Exception
    {
        System.out.println("Implementing BufferByteStreams");
        System.out.println("Data reterive from the file");
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("C:\\Users\\abhimanyu kumar\\Desktop\\mannu\\file4.txt"));
        System.out.println("connection created");
        int x;
        while ((x=bis.read())!=-1) 
        {
            System.out.print((char)x);
            Thread.sleep(1000);
        }
        System.out.println();
        System.out.println("data reterive");
        bis.close();
    }
    void fileOperation2() throws Exception
    {
        System.out.println("Implementing BufferByteStream");
        System.out.println("data insert into the file");
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("C:\\Users\\abhimanyu kumar\\Desktop\\mannu\\file1.txt",true));
        String str="data inserted in new file";
        byte arr[]=str.getBytes();
        bos.write(arr);
        System.out.println("connection created");
        System.out.println("data entered in file");
        bos.close();
    }
    void fileOperation3() throws Exception
    {
        System.out.println("implementing BufferCharacterStram");
        System.out.println("data reterive from the file");
        BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\abhimanyu kumar\\Desktop\\mannu\\file1.txt"));
        int x;
        while ((x=br.read())!=-1) 
        {
            System.out.print((char)x);
        }
        System.out.println("\n");
        System.out.println("connection created");
        System.out.println("data reterived");
        br.close();
        }
        void fileOperation4() throws Exception
        {
            System.out.println("impelementing BufferCharacterStram");
            System.out.println("data insert into the file");
            BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\abhimanyu kumar\\Desktop\\mannu\\file1.txt",true));
            String str="\n this is bufferedCharacterString insertion section";
            bw.write(str);
            System.out.println("connection created");
            System.out.println("data writen in the file");
            bw.close();
        }
        void fileOperation5() throws Exception
        {
            System.out.println("copying the data");
            BufferedInputStream bis=new BufferedInputStream(new FileInputStream("C:\\Users\\abhimanyu kumar\\Desktop\\photography\\2nd.jpg"));
            BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("C:\\Users\\abhimanyu kumar\\Desktop\\7nd.jpg"));
            int x;
            while ((x=bis.read())!=-1) 
            {
                bos.write(x);
            }        
            System.out.println("data copied");
            bis.close();
            bos.close();
        }
    public static void main(String[] args)throws Exception {
        Example119 obj=new Example119();
        // obj.fileOperation1();
        // obj.fileOperation2();
        // obj.fileOperation3();
        // obj.fileOperation4();
        obj.fileOperation5();
    }
}
