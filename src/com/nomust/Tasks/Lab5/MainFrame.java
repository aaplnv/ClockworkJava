package com.nomust.Tasks.Lab5;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class MainFrame extends JFrame {

    private JLabel imgLabel;
    private int i = 1;

    public MainFrame(){
        this.setSize(600, 500);
        imgLabel = new JLabel("", new ImageIcon(getClass().getResource("image_001.jpg")), SwingConstants.CENTER);

        getContentPane().add(imgLabel);

        Timer timer = new Timer(70, e -> next());
        timer.start();
    }

    private void next(){
        imgLabel.setIcon(new ImageIcon(getClass().getResource(String.format("image_%03d", ++i) + ".jpg")));
        if (i == 74) i = 0;
    }
}