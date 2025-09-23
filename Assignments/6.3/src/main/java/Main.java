import Controller.PetController;
import Model.Pet;
import View.PetView;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Virtual Pet Walk");

            Pet pet = new Pet(100, 100, 3, "/images/cat.png");

            PetView view = new PetView(pet);
            new PetController(pet, view);

            frame.add(view);
            frame.pack();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
