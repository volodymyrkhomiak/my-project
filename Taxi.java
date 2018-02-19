import java.util.Scanner;

public class Taxi {
    public int information(){
        return price;
    }
    private int shlyah;
    private int price = 10;
    void show(){
        System.out.println("Введіть відстань: ");
        Scanner sc = new Scanner(System.in);
        shlyah = sc.nextInt();
        System.out.println("З вас " + shlyah*information()+" гривень");
    }
}
