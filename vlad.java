package com.company;
 import java.util.Scanner; 
 public class Main 
 {
 public static void main(String[] args) 
 {
 int res = 0;
 String text;    
 String find;    
 Scanner intext = new Scanner(System.in);  
 System.out.print("> Enter text: "); 
 text = intext.next();       
 System.out.print("> What to find?: ");  
 find = intext.next();     
 int lengthT = text.length();   
 char[] x1 ={ find.charAt(0), find.charAt(1), find.charAt(2), find.charAt(3) 
 }
 ;
 for(int i=0; i!=lengthT; i++) 
 {
 if(text.charAt(i) == x1[0]) 
 {                 
 if(text.charAt(i+1) == x1[1]){
 if(text.charAt(i+2) == x1[2]){   
 if(text.charAt(i+3) == x1[3]){   
 res +=1;     
 }     
 }  
 }  
 }
 }
 System.out.print(res);

 }
 }