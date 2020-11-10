package ru.HomeWork2;

public class Animal {
    private int age;
    protected int weigth;
    protected String clas;

    public Animal(int age, int weigth, String clas) {
        this.age = age;
        this.weigth = weigth;
        this.clas = clas;
    }

    public void doVoice() {
        System.out.println("Звук который издает животное");
    }


    public void doMove() {
        System.out.println("Способ передвижения");
    }

    public void doEat() {
        System.out.println("Еда которую ест животное");
    }

    public void doClimb() {
        System.out.println("Способность корабкаться по деревьям");
    }

    public void doSwim() {
        System.out.println("Способность плавать");
    }
}