public class Espresso extends Beverage{

    @Override
    protected int cost() {
        return 10;
    }

    @Override
    protected String description() {
        return "Espresso";
    }
}
