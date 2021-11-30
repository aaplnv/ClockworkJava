// Реализация программу на Java с JTextArea и двумя меню:
// Цвет: который имеет возможность выбора из три возможных : синий,
// красный и черный
// Шрифт: тривида: “Times New Roman”, “MS Sans Serif”, “Courier
// New”.Вы должны написать прогамму, которая с помощью меню,
// может изменять шрифт и цвет текста, написанного в JTextArea

package com.nomust.Tasks.Lab6;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame {

    public void Run(){
        setSize(1000, 480);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 12));


        var colorMenu = new JMenu("Colors");

        var blackColor = new JMenuItem("Black");
        colorMenu.add(blackColor);
        blackColor.addActionListener(e -> textArea.setForeground(Color.BLACK));

        var redColor = new JMenuItem("Red");
        colorMenu.add(redColor);
        redColor.addActionListener(e -> textArea.setForeground(Color.RED));

        var blueColor = new JMenuItem("Blue");
        colorMenu.add(blueColor);
        blueColor.addActionListener(e -> textArea.setForeground(Color.BLUE));


        var fontMenu = new JMenu("Fonts");

        var timesNewRomanFont = new JMenuItem("Times New Roman");
        fontMenu.add(timesNewRomanFont);
        timesNewRomanFont.addActionListener(e -> textArea.setFont(new Font("Times New Roman", Font.PLAIN, 12)));

        var msSansSerif = new JMenuItem("MS Sans Serif");
        fontMenu.add(msSansSerif);
        msSansSerif.addActionListener(e -> textArea.setFont(new Font("MS Sans Serif", Font.PLAIN, 12)));

        var courierNew = new JMenuItem("Courier New");
        fontMenu.add(courierNew);
        courierNew.addActionListener(e -> textArea.setFont(new Font("Courier New", Font.PLAIN, 12)));


        JMenuBar menu = new JMenuBar();
        menu.add(colorMenu);
        menu.add(fontMenu);


        getContentPane().add(menu, BorderLayout.NORTH);
        getContentPane().add(textArea);
        setVisible(true);
    }
}