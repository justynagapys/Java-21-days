package com.java21days;

class EqualsTester{
    public static void main(String[] arguments){
        String str1, str2;
        str1 = "Chłopie, ale to się rozrasta.";
        str2 = str1;
        
        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);
        System.out.println("Ten sam obiekt? " + (str1 == str2));
        
        str2 = new String(str1);
        
        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);
        System.out.println("Ten sam obiekt? " + (str1 == str2));
        System.out.println("Ta sama wartość? " + str1.equals(str2));
    }
}