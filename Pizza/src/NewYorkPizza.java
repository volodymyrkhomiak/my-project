
public class NewYorkPizza implements IPizzaFactory{

    public void createPizza(String pizzaName){
        Pizza pizza;

        if (pizzaName.compareTo(" арпатська")==0){
            pizza = new KarpatianPizza(" по Ќю…орськи");
        }
        else if (pizzaName.compareTo("√авайська")==0){
            pizza = new GavaiPizza(" по Ќю…орськи");
        }
    }
}
