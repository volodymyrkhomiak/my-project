
public class NewYorkPizza implements IPizzaFactory{

    public void createPizza(String pizzaName){
        Pizza pizza;

        if (pizzaName.compareTo("����������")==0){
            pizza = new KarpatianPizza(" �� ���������");
        }
        else if (pizzaName.compareTo("���������")==0){
            pizza = new GavaiPizza(" �� ���������");
        }
    }
}
