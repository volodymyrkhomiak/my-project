import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    System.out.print("�� �� �?\n 1 - NewYork \n 2 - Chicago \n>: ");
        IPizzaFactory newYorkPizza = new NewYorkPizza();
        IPizzaFactory chicagoPizza = new ChicagoPizza();

        switch (scanner.nextInt()){
            case 1: System.out.print("��� ��� �� ��������?\n 1 - ����������\n 2 - ��������� \n>: ");
                    if (scanner.nextInt() == 1)
                         newYorkPizza.createPizza("����������");
                    else
                         newYorkPizza.createPizza("���������");
                break;
            case 2: System.out.print("��� ��� �� ��������?\n 1 - ����������\n 2 - ��������� \n>: ");
                     if (scanner.nextInt() == 1)
                         chicagoPizza.createPizza("����������");
                    else
                         chicagoPizza.createPizza("���������");
                break;
        }
    }
}