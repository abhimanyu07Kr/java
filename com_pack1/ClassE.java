package com_pack1;

public class ClassE 
{
      public String makeOutWord(String str)
      {
        String s="";
        if(str.length()>=2)
       {
         s=str.substring(str.length()-2);
            return s+s+s;
        }
        else
        {
            return"your string value is less than 2";
        }

      }
      
      public static void main(String[] args) {
        ClassE obj =new ClassE();
        String s=obj.makeOutWord("hAVO");
        System.out.println(s);
        
     
        
      } 
}
