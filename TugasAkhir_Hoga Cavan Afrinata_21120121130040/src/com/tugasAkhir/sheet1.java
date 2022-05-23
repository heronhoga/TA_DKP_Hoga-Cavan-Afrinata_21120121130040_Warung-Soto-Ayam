package com.tugasAkhir;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class sheet1 {
    private JFrame frame;
    protected JPanel mainGUI;
    private JLabel noMeja;
    private JLabel sotoAyam;
    private JTextField textSoto;
    private JLabel minuman;
    private JLabel tehPanas;
    private JLabel esTeh;
    private JTextField textTehPan;
    private JTextField textEsTeh;
    private JLabel jerukPanas;
    private JLabel esJeruk;
    private JTextField textJerPan;
    private JTextField textEsJer;
    private JLabel gorengan;
    private JLabel mendoan;
    private JLabel tempeGoreng;
    private JLabel perkedel;
    private JTextField textMend;
    private JTextField textTemGor;
    private JTextField textPerked;
    private JLabel sate;
    private JLabel sateAyam;
    private JLabel sateKerang;
    private JLabel sateUsus;
    private JTextField textSatUs;
    private JTextField textSatRang;
    private JTextField textSatYam;
    private JTextArea hasilTulisan;
    private JTextField textUangMu;
    private JButton bayarButton;
    private JButton printStruk;
    private JLabel inputUang;
    private JButton buttonKonf;
    private JLabel labelKasir;
    private JComboBox listKasir;
    private JComboBox ListMeja;
    private JLabel GambarSoto;


    String SotoTextHasil ="";


    public sheet1() {

        //DAFTAR ORANG KASIR
        listKasir.addItem("Agus");
        listKasir.addItem("Budi");
        listKasir.addItem("Ayu");

        //DAFTAR NOMOR MEJA
        ListMeja.addItem("1");
        ListMeja.addItem("2");
        ListMeja.addItem("3");
        ListMeja.addItem("4");
        ListMeja.addItem("5");
        ListMeja.addItem("6");
        ListMeja.addItem("7");
        ListMeja.addItem("8");
        ListMeja.addItem("9");
        ListMeja.addItem("10");
        ListMeja.addItem("11");
        ListMeja.addItem("12");
        ListMeja.addItem("13");
        ListMeja.addItem("14");
        ListMeja.addItem("15");

        String defaultNumb = "0";
        textSoto.setText(defaultNumb);
        textTehPan.setText(defaultNumb);
        textEsTeh.setText(defaultNumb);
        textJerPan.setText(defaultNumb);
        textEsJer.setText(defaultNumb);
        textMend.setText(defaultNumb);
        textTemGor.setText(defaultNumb);
        textPerked.setText(defaultNumb);
        textSatUs.setText(defaultNumb);
        textSatRang.setText(defaultNumb);
        textSatYam.setText(defaultNumb);
        textUangMu.setText(defaultNumb);

        buttonKonf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int totalHarga = 0; //TEMPAT MENJUMLAHKAN HARGA

                String sotAyy = textSoto.getText();
                int intSotAyy = Integer.parseInt(sotAyy);
                for (int i = 0; i < intSotAyy; i++) {
                    totalHarga = totalHarga+8000;
                } //HITUNG SOTO

                String tehPanaS = textTehPan.getText();
                int intTehPanas = Integer.parseInt(tehPanaS);
                for (int i = 0; i < intTehPanas; i++) {
                    totalHarga = totalHarga+2500;
                } //HITUNG TEH PANAS

                String essTeh = textEsTeh.getText();
                int intEsTeh = Integer.parseInt(essTeh);
                for (int i = 0; i < intEsTeh; i++) {
                    totalHarga = totalHarga+2000;
                } //HITUNG ES TEH

                String jjerukPan = textJerPan.getText();
                int intJerukPanas = Integer.parseInt(jjerukPan);
                for (int i = 0; i < intJerukPanas; i++) {
                    totalHarga = totalHarga+3500;
                } //HITUNG JERUK PANAS

                String esJerr = textEsJer.getText();
                int intesJer = Integer.parseInt(esJerr);
                for (int i = 0; i < intesJer; i++) {
                    totalHarga=totalHarga+3000;
                } //HITUNG ES JERUK

                String TemMendo = textMend.getText();
                int intTemMendo = Integer.parseInt(TemMendo);
                for (int i = 0; i < intTemMendo; i++) {
                    totalHarga=totalHarga+2000;
                } //HITUNG TEMPE MENDOAN

                String temGorr = textTemGor.getText();
                int intTemGor = Integer.parseInt(temGorr);
                for (int i = 0; i < intTemGor; i++) {
                    totalHarga=totalHarga+1000;
                } //HITUNG TEMPE GORENG

                String Perkedd = textPerked.getText();
                int intPerked = Integer.parseInt(Perkedd);
                for (int i = 0; i < intPerked; i++) {
                    totalHarga=totalHarga+2500;
                } //HITUNG PERKEDEL

                String satUss = textSatUs.getText();
                int intsatUs = Integer.parseInt(satUss);
                for (int i = 0; i < intsatUs; i++) {
                    totalHarga=totalHarga+3000;
                } //HITUNG SATE USUS

                String satRangg = textSatRang.getText();
                int intSatRang = Integer.parseInt(satRangg);
                for (int i = 0; i < intSatRang; i++) {
                    totalHarga=totalHarga+4500;
                } //HITUNG SATE KERANG

                String satYamm = textSatYam.getText();
                int intSatYam = Integer.parseInt(satYamm);
                for (int i = 0; i < intSatYam; i++) {
                    totalHarga=totalHarga+5000;
                } //HITUNG SATE AYAM

                String hasilTulisanSoto = sotoAyam.getText() + " " + textSoto.getText() + "\n"; //TULISAN DISPLAY SOTO
                String hasilTulisanTehPan = tehPanas.getText() + " " + textTehPan.getText() + "\n"; //TULISAN DISPLAY TEH PANAS
                String hasilTulisanEsTeh = esTeh.getText() + " " + textEsTeh.getText() + "\n"; //TULISAN DISPLAY ES TEH
                String hasilTulisanJerPan = jerukPanas.getText() + " " + textJerPan.getText() + "\n"; //TULISAN DISPLAY JERUK PANAS
                String hasilTulisanEsJer = esJeruk.getText() + " " + textEsJer.getText() + "\n"; //TULISAN DISPLAY ES JERUK
                String hasilTulisanMendo = mendoan.getText() + " " + textMend.getText() + "\n"; //TULISAN DISPLAY MENDOAN
                String hasilTulisanTemGor = tempeGoreng.getText() + " " + textTemGor.getText() + "\n"; //TULISAN DISPLAY TEMPE GORENG
                String hasilTulisanPerked = perkedel.getText() + " " + textPerked.getText() + "\n"; //TULISAN DISPLAY PERKEDEL
                String hasilTulisanSatUs = sateUsus.getText() + " " + textSatUs.getText() + "\n"; //TULISAN DISPLAY SATE USUS
                String hasilTulisanSatRang = sateKerang.getText() + " " + textSatRang.getText() + "\n"; //TULISAN DISPLAY SATE KERANG
                String hasilTulisanSatYam = sateAyam.getText() + " " + textSatYam.getText() + "\n"; //TULISAN DISPLAY SATE AYAM

                if (intSotAyy < 0) {
                    JOptionPane.showMessageDialog(frame,
                            "PEMBELIAN TIDAK BOLEH NEGATIF!.",
                            "Inane error",
                            JOptionPane.ERROR_MESSAGE);
                            textSoto.setText(defaultNumb);
                            hasilTulisanSoto = "";
                } //MESSAGE BOX ERROR NOMOR MEJA
                else if (intSotAyy == 0) {
                    hasilTulisanSoto = "";
                }

                if (intTehPanas < 0) {
                    JOptionPane.showMessageDialog(frame,
                            "PEMBELIAN TIDAK BOLEH NEGATIF!.",
                            "Inane error",
                            JOptionPane.ERROR_MESSAGE);
                            textTehPan.setText(defaultNumb);
                            hasilTulisanTehPan = "";
                } //MESSAGE BOX ERROR TEH PANAS
                else if(intTehPanas == 0) {
                    hasilTulisanTehPan = "";
                }

                if (intEsTeh < 0) {
                    JOptionPane.showMessageDialog(frame,
                            "PEMBELIAN TIDAK BOLEH NEGATIF!.",
                            "Inane error",
                            JOptionPane.ERROR_MESSAGE);
                    textEsTeh.setText(defaultNumb);
                    hasilTulisanEsTeh = "";
                } //MESSAGE BOX ERROR ESTEH
                else if (intEsTeh == 0) {
                    hasilTulisanEsTeh = "";
                }

                if (intJerukPanas < 0) {
                    JOptionPane.showMessageDialog(frame,
                            "PEMBELIAN TIDAK BOLEH NEGATIF!.",
                            "Inane error",
                            JOptionPane.ERROR_MESSAGE);
                    textJerPan.setText(defaultNumb);
                    hasilTulisanJerPan = "";
                } //MESSAGE BOX ERROR JERUK PANAS
                else if (intJerukPanas == 0) {
                    hasilTulisanJerPan = "";
                }

                if (intesJer < 0) {
                    JOptionPane.showMessageDialog(frame,
                            "PEMBELIAN TIDAK BOLEH NEGATIF!.",
                            "Inane error",
                            JOptionPane.ERROR_MESSAGE);
                    textEsJer.setText(defaultNumb);
                    hasilTulisanEsJer = "";
                } //MESSAGE BOX ERROR ES JERUK
                else if (intesJer == 0) {
                    hasilTulisanEsJer = "";
                }

                if (intTemMendo < 0) {
                    JOptionPane.showMessageDialog(frame,
                            "PEMBELIAN TIDAK BOLEH NEGATIF!.",
                            "Inane error",
                            JOptionPane.ERROR_MESSAGE);
                    textMend.setText(defaultNumb);
                    hasilTulisanMendo = "";
                } //MESSAGE BOX ERROR MENDOAN
                else if (intTemMendo == 0) {
                    hasilTulisanMendo = "";
                }

                if (intTemGor < 0) {
                    JOptionPane.showMessageDialog(frame,
                            "PEMBELIAN TIDAK BOLEH NEGATIF!.",
                            "Inane error",
                            JOptionPane.ERROR_MESSAGE);
                    textTemGor.setText(defaultNumb);
                    hasilTulisanTemGor = "";
                } //MESSAGE BOX ERROR TEMPE GORENG
                else if (intTemGor == 0) {
                    hasilTulisanTemGor = "";
                }

                if (intPerked < 0) {
                    JOptionPane.showMessageDialog(frame,
                            "PEMBELIAN TIDAK BOLEH NEGATIF!.",
                            "Inane error",
                            JOptionPane.ERROR_MESSAGE);
                    textPerked.setText(defaultNumb);
                    hasilTulisanPerked = "";
                } //MESSAGE BOX ERROR PERKEDEL
                else if (intPerked == 0) {
                    hasilTulisanPerked = "";
                }

                if (intsatUs < 0) {
                    JOptionPane.showMessageDialog(frame,
                            "PEMBELIAN TIDAK BOLEH NEGATIF!.",
                            "Inane error",
                            JOptionPane.ERROR_MESSAGE);
                    textSatUs.setText(defaultNumb);
                    hasilTulisanSatUs = "";
                } //MESSAGE BOX ERROR SATE USUS
                else if (intsatUs == 0) {
                    hasilTulisanSatUs = "";
                }

                if (intSatRang < 0) {
                    JOptionPane.showMessageDialog(frame,
                            "PEMBELIAN TIDAK BOLEH NEGATIF!.",
                            "Inane error",
                            JOptionPane.ERROR_MESSAGE);
                    textSatRang.setText(defaultNumb);
                    hasilTulisanSatRang = "";
                } //MESSAGE BOX ERROR SATE KERANG
                else if (intSatRang == 0) {
                    hasilTulisanSatRang = "";
                }

                if (intSatYam < 0) {
                    JOptionPane.showMessageDialog(frame,
                            "PEMBELIAN TIDAK BOLEH NEGATIF!.",
                            "Inane error",
                            JOptionPane.ERROR_MESSAGE);
                    textSatYam.setText(defaultNumb);
                    hasilTulisanSatYam = "";
                } //MESSAGE BOX ERROR SATE AYAM
                else if (intSatYam == 0) {
                    hasilTulisanSatYam = "";
                }

                String KasirName = (String)listKasir.getSelectedItem();
                String DaftarMeja = (String)ListMeja.getSelectedItem();

                hasilTulisan.setText("Pesanan Nomor Meja "+ DaftarMeja +"\n" +
                        "Nama Kasir : " + KasirName + "\n" +
                        "----------------\n" +
                        hasilTulisanSoto  +
                        hasilTulisanTehPan +
                        hasilTulisanEsTeh +
                        hasilTulisanJerPan +
                        hasilTulisanEsJer +
                        hasilTulisanMendo +
                        hasilTulisanTemGor +
                        hasilTulisanPerked +
                        hasilTulisanSatUs +
                        hasilTulisanSatRang +
                        hasilTulisanSatYam
                        + "----------------\n" + "Jumlah = " + totalHarga);
            }
        });

        bayarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int totalHarga = 0; //TEMPAT MENJUMLAHKAN HARGA

                String sotAyy = textSoto.getText();
                int intSotAyy = Integer.parseInt(sotAyy);
                for (int i = 0; i < intSotAyy; i++) {
                    totalHarga = totalHarga+8000;
                } //HITUNG SOTO

                String tehPanaS = textTehPan.getText();
                int intTehPanas = Integer.parseInt(tehPanaS);
                for (int i = 0; i < intTehPanas; i++) {
                    totalHarga = totalHarga+2500;
                } //HITUNG TEH PANAS

                String essTeh = textEsTeh.getText();
                int intEsTeh = Integer.parseInt(essTeh);
                for (int i = 0; i < intEsTeh; i++) {
                    totalHarga = totalHarga+2000;
                } //HITUNG ES TEH

                String jjerukPan = textJerPan.getText();
                int intJerukPanas = Integer.parseInt(jjerukPan);
                for (int i = 0; i < intJerukPanas; i++) {
                    totalHarga = totalHarga+3500;
                } //HITUNG JERUK PANAS

                String esJerr = textEsJer.getText();
                int intesJer = Integer.parseInt(esJerr);
                for (int i = 0; i < intesJer; i++) {
                    totalHarga=totalHarga+3000;
                } //HITUNG ES JERUK

                String TemMendo = textMend.getText();
                int intTemMendo = Integer.parseInt(TemMendo);
                for (int i = 0; i < intTemMendo; i++) {
                    totalHarga=totalHarga+2000;
                } //HITUNG TEMPE MENDOAN

                String temGorr = textTemGor.getText();
                int intTemGor = Integer.parseInt(temGorr);
                for (int i = 0; i < intTemGor; i++) {
                    totalHarga=totalHarga+1000;
                } //HITUNG TEMPE GORENG

                String Perkedd = textPerked.getText();
                int intPerked = Integer.parseInt(Perkedd);
                for (int i = 0; i < intPerked; i++) {
                    totalHarga=totalHarga+2500;
                } //HITUNG PERKEDEL

                String satUss = textSatUs.getText();
                int intsatUs = Integer.parseInt(satUss);
                for (int i = 0; i < intsatUs; i++) {
                    totalHarga=totalHarga+3000;
                } //HITUNG SATE USUS

                String satRangg = textSatRang.getText();
                int intSatRang = Integer.parseInt(satRangg);
                for (int i = 0; i < intSatRang; i++) {
                    totalHarga=totalHarga+4500;
                } //HITUNG SATE KERANG

                String satYamm = textSatYam.getText();
                int intSatYam = Integer.parseInt(satYamm);
                for (int i = 0; i < intSatYam; i++) {
                    totalHarga=totalHarga+5000;
                } //HITUNG SATE AYAM
                int intUang = Integer.parseInt(textUangMu.getText());
                int kembalian = intUang-totalHarga;
                if (intUang-totalHarga>=0) {
                    JOptionPane.showMessageDialog(frame,
                            "PEMBAYARAN SUKSES! (Kembalian = " +kembalian + ")");
                } else {
                    JOptionPane.showMessageDialog(frame,
                            "PEMBAYARAN GAGAL! (UANG PELANGGAN KURANG DARI TOTAL HARGA)",
                            "PERINGATAN",
                            JOptionPane.WARNING_MESSAGE);
                            textUangMu.setText("0");
                }
            }
        });

        printStruk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,
                        "STRUK PEMBAYARAN AKAN SEGERA DIPRINT",
                        "PESAN",
                        JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            }
        });
    }
}


