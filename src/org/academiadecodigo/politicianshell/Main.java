package org.academiadecodigo.politicianshell;

import org.academiadecodigo.politicianshell.field.Field;
import org.academiadecodigo.politicianshell.player.Player;

public class Main {

    public static void main(String[] args) {

        Field field = new Field();

        field.init();

        Player p = new Player(235,700,30,40);

    }
}
