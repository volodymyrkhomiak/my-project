package com.company;

public class Main {

    public static void main(String[] args) {

        Duck a = new SimpleDuck();
        a.performQuack();

    }
}

abstract class Duck{
    IQuackBehav qb;

    void performQuack()
    {
        qb.quack();
    }

}

interface IQuackBehav{
    void quack();
}
interface ISwimBehav{
    void quack();
}

class QuackebleBehaviour implements IQuackBehav {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}

class SimpleDuck extends Duck{

    SimpleDuck(){

        qb = new QuackebleBehaviour();
    }

}
