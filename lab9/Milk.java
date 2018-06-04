public class Milk extends AddOn {

    private final int PRICE_MILK = 2;

    public Milk(Beverage b){
        this.b = b;
    }

    @Override
    protected int cost() {
        return PRICE_MILK + b.cost();
    }

    @Override
    protected String description() {
        return b.description() + " with milk";
    }
}
