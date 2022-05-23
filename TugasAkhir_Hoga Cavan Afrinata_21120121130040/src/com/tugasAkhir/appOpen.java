package com.tugasAkhir;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class appOpen extends sheet1{
    private JButton tombolMasuk;
    private JPanel PanelOpen;
    private JLabel bannerOpen;

    public appOpen() {
        tombolMasuk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("TOKO SOTO AYAM HOGA");
                frame.setContentPane(new sheet1().mainGUI);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
                frame.setSize(1200, 800);
                frame.setResizable(false);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SELAMAT DATANG!");
        frame.setContentPane(new appOpen().PanelOpen);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(900, 700);
        frame.setResizable(false);

    }
}
