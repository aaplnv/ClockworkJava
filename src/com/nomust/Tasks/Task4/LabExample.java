package com.nomust.Tasks.Task4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class LabExample extends JFrame {

    private int milan;
    private int rmadrir;
    JButton realMadrid = new JButton("Real Madrid");
    JButton acMilan = new JButton("AC Milan");
    JLabel result = new JLabel("Result 0 X 0");
    JLabel lastScorer = new JLabel("Last Scorer: N/A");
    Label winner = new Label("Winner DRAW");
    Font fnt = new Font("Times new roman",Font.BOLD,20);

    LabExample() {
        super("Football");
        setLayout(new FlowLayout());
        setSize(250 ,150);
        /*GridLayout gridLayout = new GridLayout(3, 3);
        gridLayout.*/
        add(realMadrid);
        add(acMilan);
        add(result);
        add(lastScorer);
        add(winner);
        realMadrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rmadrir++;
                result.setText("Result " + rmadrir + " X " + milan);
                lastScorer.setText("Last Scorer: Real Madrid");
                winner.setText("Winner: " + ((rmadrir > milan) ? "Real Madrid" : (rmadrir == milan) ? "DRAW" : "AC Milan"));
            }
        });

        acMilan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milan++;
                result.setText("Result " + rmadrir + " X " + milan);
                lastScorer.setText("Last Scorer: AC Milan");
                winner.setText("Winner: " + ((rmadrir > milan) ? "Real Madrid" : (rmadrir == milan) ? "DRAW" : "AC Milan"));
            }
        });
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void openWindow() {
            new LabExample();
        }
}
