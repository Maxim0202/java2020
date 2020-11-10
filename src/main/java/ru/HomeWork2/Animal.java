package ru.HomeWork2;

public class Animal {
    private int age;
    private int weigth;
    private String clas;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getWeigth() {
        return weigth;
    }
    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }
    public String getClas() {
        return clas;
    }
    public void setClas(String clas) {
        this.clas = clas;
    }

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