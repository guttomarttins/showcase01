/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cams.hierarquia;

import cams.interfaces.BasketballTeam;
import cams.interfaces.FootballTeam;

/**
 *
 * @author Carlos
 */
public class Team implements BasketballTeam, FootballTeam {

    private String name = null;

    public Team(String name) {
        this.name = name;
    }

    @Override
    public void printBasketballName() {
        System.out.println("Basketball Team: \"" + name + " B.C.\"");
    }

    @Override
    public void printFootballName() {
        System.out.println("Football Team: \"" + name + " F.C.\"");
    }

}
