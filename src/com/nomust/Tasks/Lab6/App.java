// Реализация программу на Java с JTextArea и двумя меню:
// Цвет: который имеет возможность выбора из три возможных : синий,
// красный и черный
// Шрифт: тривида: “Times New Roman”, “MS Sans Serif”, “Courier
// New”.Вы должны написать прогамму, которая с помощью меню,
// может изменять шрифт и цвет текста, написанного в JTextArea

package com.nomust.Tasks.Lab6;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

public class App extends JFrame {

    public void Run(){
        setSize(1000, 480);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 12));

        String[] colorNames = {"Black color", "Red color", "Blue color"};
        JComboBox<String> colors = new JComboBox<>(colorNames);
        colors.setSelectedIndex(0);

        String[] fontNames = {"Times New Roman", "MS Sans Serif", "Courier New"};
        JComboBox<String> fonts = new JComboBox<>(fontNames);
        fonts.setSelectedIndex(0);

        fonts.addItemListener(e -> textArea.setFont(new Font(fontNames[fonts.getSelectedIndex()], Font.PLAIN, 12)));

        colors.addItemListener(e -> {
            switch (colors.getSelectedIndex()){
                case 0:
                    textArea.setForeground(Color.BLACK);
                    break;
                case 1:
                    textArea.setForeground(Color.RED);
                    break;
                case 2:
                    textArea.setForeground(Color.BLUE);
                    break;
            }
        });

        getContentPane().add(colors, BorderLayout.BEFORE_FIRST_LINE);
        getContentPane().add(fonts, BorderLayout.BEFORE_LINE_BEGINS);
        getContentPane().add(textArea);
        setVisible(true);
    }
}