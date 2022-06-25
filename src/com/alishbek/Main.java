package com.alishbek;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setDamage(60);
        boss.setHealth(960);
        boss.setDefenseType("Magical");
        System.out.println("Boss health:  "+boss.getHealth()+"   ["+boss.getDamage()+"]");
        System.out.println("Boss defense type: "+boss.getDefenseType());
    }
}
