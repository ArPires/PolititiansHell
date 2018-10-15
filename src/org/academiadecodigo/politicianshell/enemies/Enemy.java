package org.academiadecodigo.politicianshell.enemies;

import org.academiadecodigo.politicianshell.field.Position;
import org.academiadecodigo.politicianshell.weapons.Weapon;

abstract public class Enemy {

    private EnemyType enemyType;
    private Position position;



    public abstract Position move();

    public abstract void hit(Weapon weapon);

}
