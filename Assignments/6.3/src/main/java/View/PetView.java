package View;

import javax.swing.*;
import java.awt.*;
import Model.Pet;

public class PetView extends JPanel {
    private Pet pet;

    public PetView(Pet pet) {
        this.pet = pet;
        setPreferredSize(new Dimension(600, 400));
        setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image img = pet.getImage();
        if (img != null) {
            g.drawImage(img, pet.getX() - 25, pet.getY() - 25, 50, 50, this);
        } else {
            g.setColor(Color.RED);
            g.fillOval(pet.getX() - 10, pet.getY() - 10, 20, 20); // fallback
        }
    }
}
