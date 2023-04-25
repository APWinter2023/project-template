package ir.sharif.math.supermario.ui;

import ir.sharif.math.supermario.model.Game;

import javax.swing.*;

public class MyFrame extends JFrame {

    Game game;

    public MyFrame() {
        this.setBounds(10, 10, 200, 200);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public MyFrame(Game game) {
        this();
        this.game = game;
    }
}
