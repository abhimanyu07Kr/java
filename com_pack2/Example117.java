//implementing BYTE STREAM IN IO Stream
package com_pack2;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Example117 
{
    void fileOperations1() throws Exception
    {
        System.out.println("implementing read() method ");
        FileInputStream fis=new FileInputStream("C:\\Users\\abhimanyu kumar\\Desktop\\photography\\10st.jpg");
        System.out.println("connection created ");
        int x;
        while ((x=fis.read())!=-1) 
        {
            System.out.print((char)x);
        }
        System.out.println();
        fis.close();
    }
    void fileOperations2() throws Exception 
    {
        System.out.println("implementing write() method");
        FileOutputStream fos=new FileOutputStream("C:\\Users\\abhimanyu kumar\\Desktop\\mannu\\file4.txt",true);
        System.out.println("connection created ");
        String str="because java is so easy ";
        byte arr[]=str.getBytes();
        fos.write(arr);
        System.out.println("data entered");
        fos.close();
    }
    void fileOperations3() throws Exception
    {
        FileInputStream fis=new FileInputStream("C:\\Users\\abhimanyu kumar\\Desktop\\photography\\1st.jpg");
        FileOutputStream fos=new FileOutputStream("C:\\Users\\abhimanyu kumar\\Desktop\\photography\\10st.jpg");
        System.out.println("connection created");
        int x;
        while ((x=fis.read())!=-1) 
        {
            fos.write(x);
        }
        System.out.println("data copied");
        fis.close();
        fos.close();
    }
    public static void main(String[] args) throws Exception {
        Example117 obj= new Example117();
        obj.fileOperations3();
    }
    
}
