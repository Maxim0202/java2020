package ru.HomeWork2;

public class Cat extends Animal {
    public Cat(int age, int weigth, String clas) {
        super(age, weigth, clas);
    }
    public Cat(){
        this(3,4,"Млекопитающие");
    }
    @Override
    public void doVoice(){
        super.doVoice();
        System.out.println("Кошки мяукают");
    }
    @Override
    public void doMove(){
        super.doMove();
        System.out.println("Передвигается на 4 лапах");
    }
    @Override
    public void doEat() {
        super.doEat();
        System.out.println("Питается рыбой");
    }
    @Override
    public void doClimb(){
        super.doClimb();
        System.out.println("Способна передвигаться по деревьям");
    }
    @Override
    public void doSwim(){
        super.doSwim();
        System.out.println("Не любит плавать");
    }
}
