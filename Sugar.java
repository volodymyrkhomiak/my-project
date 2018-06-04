public class Sugar extends AddOn {

    private final int PRICE_SUGAR = 1;

    public Sugar(Beverage b){
        this.b = b;
    }

    @Override
    protected int cost() {
        return PRICE_SUGAR + b.cost();
    }

    @Override
    protected String description() {
        return b.description() + " with sugar";
    }
}