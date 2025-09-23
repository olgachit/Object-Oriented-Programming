package Controller;

import java.awt.event.*;
import javax.swing.*;
import Model.Pet;
import View.PetView;

public class PetController implements MouseMotionListener, MouseListener {
    private Pet pet;
    private PetView view;
    private boolean mouseInside = false;

    public PetController(Pet pet, PetView view) {
        this.pet = pet;
        this.view = view;

        view.addMouseMotionListener(this);
        view.addMouseListener(this);

        Timer timer = new Timer(16, e -> {
            if (mouseInside) pet.update();
            view.repaint();
        });
        timer.start();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        if (mouseInside) {
            pet.setTarget(e.getX(), e.getY());
        }
    }

    @Override public void mouseDragged(MouseEvent e) {}
    @Override public void mouseEntered(MouseEvent e) { mouseInside = true; }
    @Override public void mouseExited(MouseEvent e) { mouseInside = false; }
    @Override public void mouseClicked(MouseEvent e) {}
    @Override public void mousePressed(MouseEvent e) {}
    @Override public void mouseReleased(MouseEvent e) {}
}
