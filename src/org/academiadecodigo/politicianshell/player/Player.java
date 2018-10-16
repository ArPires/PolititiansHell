package org.academiadecodigo.politicianshell.player;

import org.academiadecodigo.politicianshell.field.Field;
import org.academiadecodigo.politicianshell.field.Position;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Player {

    private Rectangle rectangle;

    public Player(int X, int Y, int width, int height) {
        rectangle = new Rectangle(X,Y,width,height);
        rectangle.setColor(Color.BLUE);
        rectangle.fill();

    }

    public void moveLeft() {
        if(rectangle.getX() > 10) {
            rectangle.translate(-15, 0);
        }
    }

    public void moveRight() {
        if(rectangle.getX() < Field.WIDTH - 40) {
            rectangle.translate(15,0);
        }
    }

}
