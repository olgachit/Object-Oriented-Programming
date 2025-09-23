package Model;

import javax.swing.*;
import java.awt.*;

public class Pet {
    private int x, y;
    private int targetX, targetY;
    private int speed;
    private Image image;

    public Pet(int x, int y, int speed, String imagePath) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.targetX = x;
        this.targetY = y;

        java.net.URL imgURL = getClass().getResource("/image/cat.png");
        if (imgURL != null) {
            this.image = new ImageIcon(imgURL).getImage();
        } else {
            System.err.println("Could not find image: " + imagePath);
        }
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public Image getImage() { return image; }

    public void setTarget(int tx, int ty) {
        targetX = tx;
        targetY = ty;
    }

    public void update() {
        int dx = targetX - x;
        int dy = targetY - y;
        double distance = Math.sqrt(dx * dx + dy * dy);

        if (distance < speed) {
            x = targetX;
            y = targetY;
        } else if (distance > 0) {
            x += (int) Math.round((dx / distance) * speed);
            y += (int) Math.round((dy / distance) * speed);
        }
    }
}
