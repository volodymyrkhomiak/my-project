
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("vartist 10 grn za kilometr");
        Taxi s = new Taxi();
        s.show();
    }
}
   

import java.util.Scanner;

public class Taxi {
    public int information(){
        return price;
    }
    private int shlyah;
    private int price = 10;
    void show(){
        System.out.println("Vidstan: ");
        Scanner sc = new Scanner(System.in);
        shlyah = sc.nextInt();
        System.out.println("Z vas " + shlyah*information()+" gryven");
    }
}



