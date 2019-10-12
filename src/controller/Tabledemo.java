package controller;

import java.awt.Color;

import javax.swing.JTable;

public class Tabledemo {
    private String[] columnNames = { "Planet", "Radius", "Moons", "Gaseous", "Color" };
    private Object[][] cells = { { "Mercury", 2440.0, 0, false, Color.YELLOW },
            { "Venus", 6052.0, 0, false, Color.YELLOW }, { "Earth", 6378.0, 1, false, Color.BLUE },
            { "Mars", 3397.0, 2, false, Color.RED }, { "Jupiter", 71492.0, 16, true, Color.ORANGE },
            { "Saturn", 60268.0, 18, true, Color.ORANGE }, { "Uranus", 25559.0, 17, true, Color.BLUE },
            { "Neptune", 24766.0, 8, true, Color.BLUE }, { "Pluto", 1137.0, 1, false, Color.BLACK } };

    public JTable search() {
        JTable JTable = new JTable(cells, columnNames);// 创建表格
        return JTable;
        }
}
