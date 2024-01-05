package com_pack1;

public class ClassD 
{
 public String makeabba(String a, String b)
 {
    return a+b+b+a;
 }   
 public static void main(String[] args) {
    ClassD obj = new ClassD();
    String r=obj.makeabba("a", "b");
    System.out.println(r);
 }
}
