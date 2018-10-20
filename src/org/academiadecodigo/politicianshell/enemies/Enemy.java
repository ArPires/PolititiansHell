package org.academiadecodigo.politicianshell.enemies;


import org.academiadecodigo.politicianshell.field.Field;
import org.academiadecodigo.politicianshell.Direction;
import org.academiadecodigo.politicianshell.weapons.Bullet;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Enemy {

    private EnemyType enemyType;
    private boolean dead;
    //private BulletType bulletType;
    private int currentHealth;
    private Picture enemyGfx;
    private Direction direction = Direction.RIGHT;


    public Enemy(EnemyType enemyType, int x, int y) {
        this.enemyType = enemyType;
        currentHealth = enemyType.getHealth();
        int random = (int) (Math.random() * EnemyPicture.values().length);
        String enemyPicture = EnemyPicture.values()[random].getUrl();

        enemyGfx = new Picture(x, y, enemyPicture.toString());
        enemyGfx.draw();
        //enemyGfx.setColor(Color.YELLOW);
        //enemyGfx.fill();
    }

    public void movePoliticians() {
        int maxY = 550;
        switch (direction) {
            case RIGHT:
                politicianMoveRight();
                break;
            case DOWN_TO_LEFT:
                if (enemyGfx.getY() > maxY) {
                    return;
                }
                politicianMoveDownToLeft();
                break;
            case LEFT:
                politicianMoveLeft();
                break;
            case DOWN_TO_RIGHT:
                if (enemyGfx.getY() > maxY) {
                    return;
                }
                politicianMoveDownToRight();
                break;
        }

    }

    public void politicianMoveLeft() {
        enemyGfx.translate(-15, 0);
        direction = Direction.DOWN_TO_RIGHT;
    }


    public void politicianMoveRight() {
        enemyGfx.translate(15, 0);
        direction = Direction.DOWN_TO_LEFT;
    }

    public void politicianMoveDownToLeft() {
        enemyGfx.translate(0, 15);
        direction = Direction.LEFT;

    }

    public void politicianMoveDownToRight() {
        enemyGfx.translate(0, 15);
        direction = Direction.RIGHT;

    }

    public void hit(Bullet bullet) {

        //currentHealth = enemyType.getHealth() > weaponType.getBulletPower() ? currentHealth - weaponType.getBulletPower() : 0;


        if (currentHealth == 0) {
            dead = true;
            System.out.println("This enemy is dead!");
        }
    }

    public boolean isDead() {
        return this.dead;
    }

    public int getEnemyGfxX() {
        return enemyGfx.getX();
    }
}
