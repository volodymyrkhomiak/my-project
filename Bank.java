public class Banks{
    public static void main(String[] args) {
        Bank bank [] = new Bank[3];
        bank [0] = new PrivatBank();
        bank [1] = new AlphaBank();
        bank [2] = new NaftogazBank();
        for(int i = 0;i < bank.length; i++){
            bank[i].deposit(180);
            bank[i].withDraw(800);
            bank[i].deposit(220);
            System.out.println(bank[i].account());
        }      

    }

}



abstract class Bank{
    protected String name;
    protected float depositPerc;
    protected float withDrawPerc;
    protected double depositAmoun;
    protected double vidsotokAdd(double add, double rate){
        double fill;
        fill = Math.pow((double)(1+(rate/100)),3)*add;        
        return fill;
    }
    protected double vidsotokTake(double take, double rate){
        double fill;
        fill = Math.pow((double)(1-(rate/100)),3)*take;        
        return fill;
    }
    abstract void deposit(double add);  
    abstract void withDraw(double add);
    abstract String account();
}








 class AlphaBank extends Bank{
    void deposit(double add){     
        super.depositAmoun += super.vidsotokAdd(add,8);
    }
    void withDraw(double add){     
        super.depositAmoun -= super.vidsotokTake(add,1);
    }
    String account(){
        super.name = "Balance in AlphaBank: ";
        return super.name + super.depositAmoun + "₴";
    }  
}





class PrivatBank extends Bank{   
    void deposit(double add){      
        super.depositAmoun += super.vidsotokAdd(add,15);
    }
    void withDraw(double add){     
        super.depositAmoun -= super.vidsotokTake(add,3);
    }
    String account(){
        super.name = "Balance in PrivatBank: ";
        return super.name + super.depositAmoun + "₴";
    }  
}
 
 
 
 
 
 






class NaftogazBank extends Bank{
  void deposit(double add){    
        super.depositAmoun += super.vidsotokAdd(add,4);
    }
    void withDraw(double add){    
       super.depositAmoun -= super.vidsotokTake(add,14);
    }
    String account(){
        super.name = "Balance in NaftogazBank: "; 
        return super.name + super.depositAmoun + "₴";
    }  
}