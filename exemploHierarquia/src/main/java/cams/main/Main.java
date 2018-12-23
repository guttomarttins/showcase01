/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cams.main;

import cams.hierarquia.Animal;
import cams.hierarquia.Cachorro;
import cams.hierarquia.Passaro;
import cams.hierarquia.Team;

/**
 *
 * @author Carlos
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Exemplo 1");
        System.out.println("");
        Animal animal = new Animal();
        Passaro bird = new Passaro();
        Cachorro dog = new Cachorro();

        System.out.println();

        animal.sleep();
        animal.eat();
        System.out.println("");
        bird.sleep();
        bird.eat();
        System.out.println("");
        dog.sleep();
        dog.eat();
        System.out.println("");
        Animal a1 = new Cachorro();
        Animal a2 = new Passaro();

        a1.eat();
        a2.sleep();
        System.out.println("");
        Cachorro d = new Cachorro();
        if (d instanceof Animal) {
            Animal a = (Animal) d;
            a.sleep();
        }
        d.sleep();
        System.out.println("");
        System.out.println("Exemplo 2");
        Team t = new Team("Team A");
        t.printBasketballName();
        t.printFootballName();

    }
}
