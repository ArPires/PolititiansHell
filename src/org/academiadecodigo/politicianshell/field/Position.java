package org.academiadecodigo.politicianshell.field;

public class Position {

    private int X;
    private int Y;
    private int width;
    private int height;

    public Position(int X, int Y, int width, int height) {
        this.X = X;
        this.Y = Y;
        this.width = width;
        this.height = height;
    }

    public int getX() {return X;}
    public int getY() {return Y;}
    public int getWidth() {return width;}
    public int getHeight() {return height;}

}
