mport java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Beverage: ");
        System.out.println("Americano");
        System.out.println("Espresso");
        String coffee = scanner.next();
        System.out.println("Enter coffee add-ons: ");
        System.out.println("with milk");
        System.out.println("with sugar");
        System.out.println("with all");
        System.out.println("with nothing");
        String addOns = scanner.next();
        switch (coffee){
            case "Espresso":
                addOnsEspresso(addOns);
            case "Americano":
                addOnsAmericano(addOns);
        }
    }

    public static void addOnsEspresso(String addOns){
        switch (addOns){
            case "with sugar":
                Beverage withSugar = new Sugar(new Espresso());
                System.out.println(withSugar.description());
                System.out.println(withSugar.cost());
                break;
            case "with milk":
                Beverage withMilk = new Milk(new Espresso());
                System.out.println(withMilk.description());
                System.out.println(withMilk.cost());
                break;
            case "with all":
                Beverage withAll = new Sugar(new Milk(new Espresso()));
                System.out.println(withAll.description());
                System.out.println(withAll.cost());
                break;
            case "with nothing":
                Beverage withNothing = new Sugar(new Milk(new Espresso()));
                System.out.println(withNothing.description());
                System.out.println(withNothing.cost());
                break;

        }
    }

    public static void addOnsAmericano(String addOns){
        switch (addOns){
            case "with sugar":
                Beverage withSugar = new Sugar(new Americano());
                System.out.println(withSugar.description());
                System.out.println(withSugar.cost());
                break;
            case "with milk":
                Beverage withMilk = new Milk(new Americano());
                System.out.println(withMilk.description());
                System.out.println(withMilk.cost());
                break;
            case "with all":
                Beverage withAll = new Sugar(new Milk(new Americano()));
                System.out.println(withAll.description());
                System.out.println(withAll.cost());
                break;
            case "with nothing":
                Beverage withNothing = new Sugar(new Milk(new Americano()));
                System.out.println(withNothing.description());
                System.out.println(withNothing.cost());
                break;

        }
    }


}
