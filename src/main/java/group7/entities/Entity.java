package group7.entities;

import java.awt.Rectangle;
import java.awt.Graphics;
import java.io.IOException;

// this class will be changed to abstract later
// it is not abstract for now just for testing
public abstract class Entity {
    double positionX;
    double positionY;
    double height;
    double width;

    public Entity(double positionX, double positionY, double height, double width) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.height = height;
        this.width = width;
    }

    public Rectangle getHitbox() {
        return new Rectangle((int)positionX,(int)positionY,(int)width,(int)height);
    }

    abstract void renderEntity(Graphics g);
}
