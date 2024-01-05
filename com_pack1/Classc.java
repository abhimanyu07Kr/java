package com_pack1;

public class Classc 
{

public String helloName(String name)
{
    return "hello "+name+"!";
}
public static void main(String[] args) {
    Classc obj = new Classc();
    String result = obj.helloName("abhi");
    System.out.println(result);
}
}
