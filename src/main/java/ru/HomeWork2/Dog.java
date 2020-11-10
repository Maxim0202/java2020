package ru.HomeWork2;

public class Dog extends Animal {
    public Dog(int age, int weigth, String clas) {
        super(age, weigth, clas);
    }
    public Dog(){
      this(1,9,"Млекопитающие");
    }
    @Override
    public void doVoice(){
        super.doVoice();
        System.out.println("Собака гавкает");
    }
    @Override
    public void doMove(){
        super.doMove();
        System.out.println("Передвигается на 4 лапах");
    }
    @Override
    public void doEat() {
        super.doEat();
        System.out.println("Питается мясом");
    }
    @Override
    public void doClimb(){
        super.doClimb();
        System.out.println("По деревьям не передвигается");
    }
    @Override
    public void doSwim(){
        super.doSwim();
        System.out.println("Плавает по собачьи");
    }
}
