package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



    System.out.println("Enter length of foursquare: ");
        int sqlength = sc.nextInt();
    System.out.println("Enter width of foursquare: ");
        int sqwidth = sc.nextInt();


        Foursquare sq = new Foursquare(sqlength,sqwidth, 0);
    System.out.println(">> Square of foursquare: " + sq.Square());
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

// ----------------------------------------------------------------------------------

    System.out.println("Enter length of prism: ");
        int prlength = sc.nextInt();
    System.out.println("Enter width of prism: ");
        int prwidth = sc.nextInt();
    System.out.println("Enter height of prism: ");
        int prheight = sc.nextInt();


        Prism pr = new Prism(prlength,prwidth,prheight);
    System.out.println(">> Square of prism: " + pr.Square());


    }}
