package org.academiadecodigo.politicianshell;

import org.academiadecodigo.politicianshell.field.Field;
import org.academiadecodigo.politicianshell.player.Player;

public class Main {

    public static void main(String[] args) {

        Field field = new Field();

        field.init();

        Player p = new Player(Field.WIDTH/2 - 15,Field.HEIGHT - 100,30,40);

    }
}
