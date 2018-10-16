package org.academiadecodigo.politicianshell.player;

import org.academiadecodigo.politicianshell.field.Field;
import org.academiadecodigo.politicianshell.field.Position;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Player implements KeyboardHandler {

    private Position position;
    private Rectangle rectangle;
    private Field field;

    public Player(int X, int Y, int width, int height) {
        rectangle = new Rectangle(X,Y,width,height);
        rectangle.setColor(Color.BLUE);
        rectangle.fill();

        Keyboard k = new Keyboard(this);

        KeyboardEvent left = new KeyboardEvent();
        left.setKey(KeyboardEvent.KEY_LEFT);
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(left);

        KeyboardEvent right = new KeyboardEvent();
        right.setKey(KeyboardEvent.KEY_RIGHT);
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(right);
    }

    public void moveLeft() {
        if(rectangle.getX() > 0) {
            rectangle.translate(-10 , 0);
        }
    }

    public void moveRight() {
        if(rectangle.getX() < 500) {

            rectangle.translate(10,0);
        }
    }

    @Override
    public void keyPressed(KeyboardEvent e) {
        if(e.getKey() == KeyboardEvent.KEY_LEFT) {
            this.moveLeft();
            System.out.println("gelo");
        }
        if(e.getKey() == KeyboardEvent.KEY_RIGHT) {
            this.moveRight();
        }
    }

    @Override
    public void keyReleased(KeyboardEvent e) {}

}
