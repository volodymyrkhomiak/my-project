public class Americano extends Beverage{


    @Override
    protected int cost() {
        return 12;
    }

    @Override
    protected String description() {
        return "Americano";
    }
}
