import java.util.Scanner;

public class Taxi {
    public int information(){
        return price;
    }
    private int shlyah;
    private int price = 10;
    void show(){
        System.out.println("������ �������: ");
        Scanner sc = new Scanner(System.in);
        shlyah = sc.nextInt();
        System.out.println("� ��� " + shlyah*information()+" �������");
    }
}
