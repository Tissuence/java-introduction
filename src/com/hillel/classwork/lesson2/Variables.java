package com.hillel.classwork.lesson2;

public class Variables {

    public static void main(String[] args) {

   byte myByte = 101;
   System.out.println("this is byte: " + myByte);

   short myShort = 30000;
   System.out.println("this is short: " + myShort);

   int result = myByte + myShort;
   System.out.println(result);

   int myInt = 30_493_922;
   System.out.println("this is int: " + myInt);

   long myLong = 10_000_000_000L;
   System.out.println(myLong);

   float myFloat = 4823.94037F;
   System.out.println(myFloat);

   double myDouble = 594883.3938287483;
   System.out.println(myDouble);

   boolean isValid = false;
   System.out.println(isValid);

   char myChar = '&';
   System.out.println(myChar);

   char myNumericChar = 4835;
   System.out.println(myNumericChar);

   char ch3 = '\u0055';
   System.out.println(ch3);

   String string = "test";
   System.out.println(string);



    }
}
