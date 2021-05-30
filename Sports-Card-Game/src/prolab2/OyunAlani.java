package prolab2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class OyunAlani extends javax.swing.JFrame {

    private Bilgisayar bilgisayar;
    private Kullanıcı player;
    ArrayList<Sporcu> bilgisayarDeck = new ArrayList<>();
    ArrayList<Sporcu> playerDeck = new ArrayList<>();

    public OyunAlani() {
        initComponents();

    }

    public OyunAlani(Bilgisayar bilgisayar, Kullanıcı player) {
        initComponents();
        this.bilgisayar = bilgisayar;
        this.player = player;
        this.kullaniciAdPanel.setText(player.getOyuncuID());
        Kazanan.setVisible(false);
        ExitButton.setVisible(false);
        buton1.setVisible(false);
        buton2.setVisible(false);
        buton3.setVisible(false);
        buton4.setVisible(false);
        buton5.setVisible(false);
        buton6.setVisible(false);
        buton7.setVisible(false);
        buton8.setVisible(false);
        Kurallar.setText("1-)Oyuna Baslamak Icın Ilk Olarak Kartlari Diz Butonuna BASINIZ !"
                +"\n2-)Oyundaki Hamle Sistemi Ardışık Olarak Hareket Eder ve Ilk Hamle Futbolcu 'dur .");
    }

    public String pozisyonSec(String HangiSpor) {

        int randomPozisyon = (int) (Math.random() * 3);

        if (HangiSpor.equals("Futbolcu")) {
            if (randomPozisyon == 0) {
                return "penalti";
            } else if (randomPozisyon == 1) {
                return "serbestVurus";
            } else if (randomPozisyon == 2) {
                return "kaleciKarsiKarsiya";
            }
        }

        if (HangiSpor.equals("Basketbolcu")) {
            if (randomPozisyon == 0) {
                return "ikilik";
            } else if (randomPozisyon == 1) {
                return "ucluk";
            } else if (randomPozisyon == 2) {
                return "serbestAtis";
            }
        }

        return "pozisyon";
    }

    public boolean KimKazanir(Sporcu A, Sporcu B) {

        String pozisyon = pozisyonSec(A.SporTuru());
        Pozisyon.setText(pozisyon);

        if (pozisyon.equals("penalti")) {
            System.out.println("!!!  POZISYON PENALTI !!!");
            if (A.getPenalti() > B.getPenalti()) {
                bilgisayar.skorArttir(10);
                System.out.println(bilgisayar.getOyuncuAdi() + " oyuncusu kazandi.\n" + bilgisayar.getOyuncuAdi() + "_Skor : " + bilgisayar.getSkor());

            } else if (A.getPenalti() < B.getPenalti()) {
                player.skorArttir(10);
                System.out.println(player.getOyuncuAdi() + " oyuncusu kazandi.\n" + player.getOyuncuAdi() + "_Skor : " + player.getSkor());

            } else if (A.getPenalti() == B.getPenalti()) {
                System.out.println("Eşitlik Saglandi.\n" + bilgisayar.getOyuncuAdi() + "_Skor : " + bilgisayar.getSkor() + "\n" + player.getOyuncuAdi() + "_Skor : " + player.getSkor());
                return true;
            }

        } else if (pozisyon.equals("serbestVurus")) {
            System.out.println("!!! POZISYON SERBESTVURUS !!!");
            if (A.getSerbestAtis() > B.getSerbestAtis()) {
                bilgisayar.skorArttir(10);
                System.out.println(bilgisayar.getOyuncuAdi() + " oyuncusu kazandi.\n" + bilgisayar.getOyuncuAdi() + "_Skor : " + bilgisayar.getSkor());

            } else if (A.getSerbestAtis() < B.getSerbestAtis()) {
                player.skorArttir(10);
                System.out.println(player.getOyuncuAdi() + " oyuncusu kazandi.\n" + player.getOyuncuAdi() + "_Skor : " + player.getSkor());

            } else if (A.getSerbestAtis() == B.getSerbestAtis()) {
                System.out.println("Eşitlik Saglandi.\n" + bilgisayar.getOyuncuAdi() + "_Skor : " + bilgisayar.getSkor() + "\n" + player.getOyuncuAdi() + "_Skor : " + player.getSkor());
                return true;
            }
        } else if (pozisyon.equals("kaleciKarsiKarsiya")) {
            System.out.println("!!! POZISYON KALECIYLEKARSIKARSIYA !!!");
            if (A.getKaleciKarsiKarsiya() > B.getKaleciKarsiKarsiya()) {
                bilgisayar.skorArttir(10);
                System.out.println(bilgisayar.getOyuncuAdi() + " oyuncusu kazandi.\n" + bilgisayar.getOyuncuAdi() + "_Skor : " + bilgisayar.getSkor());

            } else if (A.getKaleciKarsiKarsiya() < B.getKaleciKarsiKarsiya()) {
                player.skorArttir(10);
                System.out.println(player.getOyuncuAdi() + " oyuncusu kazandi.\n" + player.getOyuncuAdi() + "_Skor : " + player.getSkor());

            } else if (A.getKaleciKarsiKarsiya() == B.getKaleciKarsiKarsiya()) {
                System.out.println("Eşitlik Saglandi.\n" + bilgisayar.getOyuncuAdi() + "_Skor : " + bilgisayar.getSkor() + "\n" + player.getOyuncuAdi() + "_Skor : " + player.getSkor());
                return true;
            }

        } else if (pozisyon.equals("ikilik")) {
            System.out.println("!!! POZISYON IKILIK !!!");
            if (A.getIkilik() > B.getIkilik()) {
                bilgisayar.skorArttir(10);
                System.out.println(bilgisayar.getOyuncuAdi() + " oyuncusu kazandi.\n" + bilgisayar.getOyuncuAdi() + "_Skor : " + bilgisayar.getSkor());

            } else if (A.getIkilik() < B.getIkilik()) {
                player.skorArttir(10);
                System.out.println(player.getOyuncuAdi() + " oyuncusu kazandi.\n" + player.getOyuncuAdi() + "_Skor : " + player.getSkor());

            } else if (A.getIkilik() == B.getIkilik()) {
                System.out.println("Eşitlik Saglandi.\n" + bilgisayar.getOyuncuAdi() + "_Skor : " + bilgisayar.getSkor() + "\n" + player.getOyuncuAdi() + "_Skor : " + player.getSkor());
                return true;
            }
        } else if (pozisyon.equals("ucluk")) {
            System.out.println("!!! POZISYON UCLUK !!!");
            if (A.getUcluk() > B.getUcluk()) {
                bilgisayar.skorArttir(10);
                System.out.println(bilgisayar.getOyuncuAdi() + " oyuncusu kazandi.\n" + bilgisayar.getOyuncuAdi() + "_Skor : " + bilgisayar.getSkor());

            } else if (A.getUcluk() < B.getUcluk()) {
                player.skorArttir(10);
                System.out.println(player.getOyuncuAdi() + " oyuncusu kazandi.\n" + player.getOyuncuAdi() + "_Skor : " + player.getSkor());

            } else if (A.getUcluk() == B.getUcluk()) {
                System.out.println("Eşitlik Saglandi.\n" + bilgisayar.getOyuncuAdi() + "_Skor : " + bilgisayar.getSkor() + "\n" + player.getOyuncuAdi() + "_Skor : " + player.getSkor());
                return true;
            }

        } else if (pozisyon.equals("serbestAtis")) {
            System.out.println("!!! POZISYON SERBESTATIS !!!");
            if (A.getSerbestAtis() > B.getSerbestAtis()) {
                bilgisayar.skorArttir(10);
                System.out.println(bilgisayar.getOyuncuAdi() + " oyuncusu kazandi.\n" + bilgisayar.getOyuncuAdi() + "_Skor : " + bilgisayar.getSkor());

            } else if (A.getSerbestAtis() < B.getSerbestAtis()) {
                player.skorArttir(10);
                System.out.println(player.getOyuncuAdi() + " oyuncusu kazandi.\n" + player.getOyuncuAdi() + "_Skor : " + player.getSkor());

            } else if (A.getSerbestAtis() == B.getSerbestAtis()) {
                System.out.println("Eşitlik Saglandi.\n" + bilgisayar.getOyuncuAdi() + "_Skor : " + bilgisayar.getSkor() + "\n" + player.getOyuncuAdi() + "_Skor : " + player.getSkor());
                return true;
            }
        }

        SkorBord.setText(bilgisayar.getOyuncuID() + " : " + bilgisayar.getSkor() + "\n" + player.getOyuncuID() + " : " + player.getSkor());

        return false;
    }

    public void sonKontrol(Sporcu A, Sporcu B) {
        
        int tut = 0;
        if (A.SporTuru().equals("Futbolcu")) {
            if (A.getPenalti() > B.getPenalti()) {
                Pozisyon.setText("Penalti");
                bilgisayar.skorArttir(10);
                System.out.println(bilgisayar.getOyuncuAdi() + " oyuncusu kazandi.\n" + bilgisayar.getOyuncuAdi() + "_Skor : " + bilgisayar.getSkor());

            } else if (A.getPenalti() < B.getPenalti()) {
                Pozisyon.setText("Penalti");
                player.skorArttir(10);
                System.out.println(player.getOyuncuAdi() + " oyuncusu kazandi.\n" + player.getOyuncuAdi() + "_Skor : " + player.getSkor());

            } else if (A.getSerbestAtis() > B.getSerbestAtis()) {
                Pozisyon.setText("Serbest Vurus");
                bilgisayar.skorArttir(10);
                System.out.println(bilgisayar.getOyuncuAdi() + " oyuncusu kazandi.\n" + bilgisayar.getOyuncuAdi() + "_Skor : " + bilgisayar.getSkor());

            } else if (A.getSerbestAtis() < B.getSerbestAtis()) {
                Pozisyon.setText("Serbest Vurus");
                player.skorArttir(10);
                System.out.println(player.getOyuncuAdi() + " oyuncusu kazandi.\n" + player.getOyuncuAdi() + "_Skor : " + player.getSkor());

            } else if (A.getKaleciKarsiKarsiya() > B.getKaleciKarsiKarsiya()) {
                Pozisyon.setText("Kaleci Karsi Karsiya");
                bilgisayar.skorArttir(10);
                System.out.println(bilgisayar.getOyuncuAdi() + " oyuncusu kazandi.\n" + bilgisayar.getOyuncuAdi() + "_Skor : " + bilgisayar.getSkor());

            } else if (A.getKaleciKarsiKarsiya() < B.getKaleciKarsiKarsiya()) {
                Pozisyon.setText("Kaleci Karsi Karsiya");
                player.skorArttir(10);
                System.out.println(player.getOyuncuAdi() + " oyuncusu kazandi.\n" + player.getOyuncuAdi() + "_Skor : " + player.getSkor());

            }

            if (A.getPenalti() == B.getPenalti()) {
                System.out.println("Penalti Eşitlik Saglandi.\n" + bilgisayar.getOyuncuAdi() + "_Skor : " + bilgisayar.getSkor() + "\n" + player.getOyuncuAdi() + "_Skor : " + player.getSkor());
                tut++;
            }
            if (A.getSerbestAtis() == B.getSerbestAtis()) {
                System.out.println("Serbest Vurus Eşitlik Saglandi.\n" + bilgisayar.getOyuncuAdi() + "_Skor : " + bilgisayar.getSkor() + "\n" + player.getOyuncuAdi() + "_Skor : " + player.getSkor());
                tut++;
            }
            if (A.getKaleciKarsiKarsiya() == B.getKaleciKarsiKarsiya()) {
                System.out.println("Kaleci ile Karsi Karsiya Eşitlik Saglandi.\n" + bilgisayar.getOyuncuAdi() + "_Skor : " + bilgisayar.getSkor() + "\n" + player.getOyuncuAdi() + "_Skor : " + player.getSkor());
                tut++;
            }
            if (tut == 3) {
                Pozisyon.setText("Tum Pozisyonlar Eşit !");

            }
        }
        if (A.SporTuru().equals("Basketbolcu")) {
            if (A.getIkilik() > B.getIkilik()) {
                Pozisyon.setText("Ikilik");
                bilgisayar.skorArttir(10);
                System.out.println(bilgisayar.getOyuncuAdi() + " oyuncusu kazandi.\n" + bilgisayar.getOyuncuAdi() + "_Skor : " + bilgisayar.getSkor());

            } else if (A.getIkilik() < B.getIkilik()) {
                Pozisyon.setText("Ikilik");
                player.skorArttir(10);
                System.out.println(player.getOyuncuAdi() + " oyuncusu kazandi.\n" + player.getOyuncuAdi() + "_Skor : " + player.getSkor());

            } else if (A.getUcluk() > B.getUcluk()) {
                Pozisyon.setText("Ucluk");
                bilgisayar.skorArttir(10);
                System.out.println(bilgisayar.getOyuncuAdi() + " oyuncusu kazandi.\n" + bilgisayar.getOyuncuAdi() + "_Skor : " + bilgisayar.getSkor());

            } else if (A.getUcluk() < B.getUcluk()) {
                Pozisyon.setText("Ucluk");
                player.skorArttir(10);
                System.out.println(player.getOyuncuAdi() + " oyuncusu kazandi.\n" + player.getOyuncuAdi() + "_Skor : " + player.getSkor());

            } else if (A.getSerbestAtis() > B.getSerbestAtis()) {
                Pozisyon.setText("Serbest Atis");
                bilgisayar.skorArttir(10);
                System.out.println(bilgisayar.getOyuncuAdi() + " oyuncusu kazandi.\n" + bilgisayar.getOyuncuAdi() + "_Skor : " + bilgisayar.getSkor());

            } else if (A.getSerbestAtis() < B.getSerbestAtis()) {
                Pozisyon.setText("Serbest Atis");
                player.skorArttir(10);
                System.out.println(player.getOyuncuAdi() + " oyuncusu kazandi.\n" + player.getOyuncuAdi() + "_Skor : " + player.getSkor());

            }
            if (A.getIkilik() == B.getIkilik()) {
                System.out.println("Ikilik Eşitlik Saglandi.\n" + bilgisayar.getOyuncuAdi() + "_Skor : " + bilgisayar.getSkor() + "\n" + player.getOyuncuAdi() + "_Skor : " + player.getSkor());
                tut++;
            }
            if (A.getUcluk() == B.getUcluk()) {
                System.out.println("Ucluk Eşitlik Saglandi.\n" + bilgisayar.getOyuncuAdi() + "_Skor : " + bilgisayar.getSkor() + "\n" + player.getOyuncuAdi() + "_Skor : " + player.getSkor());
                tut++;
            }
            if (A.getSerbestAtis() == B.getSerbestAtis()) {
                System.out.println("Serbest Atis Eşitlik Saglandi.\n" + bilgisayar.getOyuncuAdi() + "_Skor : " + bilgisayar.getSkor() + "\n" + player.getOyuncuAdi() + "_Skor : " + player.getSkor());
                tut++;
            }
            if (tut == 3) {
                Pozisyon.setText("Tum Pozisyonlar Eşit !");

            }

        }

        SkorBord.setText(bilgisayar.getOyuncuID() + " : " + bilgisayar.getSkor() + "\n" + player.getOyuncuID() + " : " + player.getSkor());
        if (bilgisayar.neKadarKaldi() == 1) {
            Kazanan.setVisible(true);

            if (bilgisayar.getSkor() == player.getSkor()) {
                Kazanan.setText("SKOR BERABERE DOSTLUK KAZANDI!");
            } else if (bilgisayar.getSkor() > player.getSkor()) {
                Kazanan.setText(bilgisayar.getOyuncuID() + " KAZANDI TEBRIKLER!");
            } else if (bilgisayar.getSkor() < player.getSkor()) {
                Kazanan.setText(player.getOyuncuID() + " KAZANDI TEBRIKLER!");
            }

            ExitButton.setVisible(true);
        }
    }

    public void kartlariArenayaYaz() {

        for (int i = 0; i < 8; i++) {
            bilgisayarDeck.add(bilgisayar.desteGonder(i));
            playerDeck.add(player.desteGonder(i));
        }

        if (playerDeck.get(0).SporTuru().equals("Futbolcu")) {
            textpanel1.setText(playerDeck.get(0).getSporcuIsim() + "\n"
                    + "\nTakim : " + playerDeck.get(0).getSporcuTakim() + "\n"
                    + "\nPenalti : " + playerDeck.get(0).getPenalti() + "\n"
                    + "\nSerbest Vurus : " + playerDeck.get(0).getSerbestAtis() + "\n"
                    + "\nKaleci ile Karsi karsiya : " + playerDeck.get(0).getKaleciKarsiKarsiya());
        }
        if (playerDeck.get(0).SporTuru().equals("Basketbolcu")) {
            textpanel1.setText(playerDeck.get(0).getSporcuIsim() + "\n"
                    + "\nTakim : " + playerDeck.get(0).getSporcuTakim() + "\n"
                    + "\nIkilik : " + playerDeck.get(0).getIkilik() + "\n"
                    + "\nUcluk : " + playerDeck.get(0).getUcluk() + "\n"
                    + "\nSerbest Atis : " + playerDeck.get(0).getSerbestAtis());
        }

        if (playerDeck.get(1).SporTuru().equals("Futbolcu")) {
            textpanel2.setText(playerDeck.get(1).getSporcuIsim() + "\n"
                    + "\nTakim : " + playerDeck.get(1).getSporcuTakim() + "\n"
                    + "\nPenalti : " + playerDeck.get(1).getPenalti() + "\n"
                    + "\nSerbest Vurus : " + playerDeck.get(1).getSerbestAtis() + "\n"
                    + "\nKaleci ile Karsi karsiya : " + playerDeck.get(1).getKaleciKarsiKarsiya());
        }
        if (playerDeck.get(1).SporTuru().equals("Basketbolcu")) {
            textpanel2.setText(playerDeck.get(1).getSporcuIsim() + "\n"
                    + "\nTakim : " + playerDeck.get(1).getSporcuTakim() + "\n"
                    + "\nIkilik : " + playerDeck.get(1).getIkilik() + "\n"
                    + "\nUcluk : " + playerDeck.get(1).getUcluk() + "\n"
                    + "\nSerbest Atis : " + playerDeck.get(1).getSerbestAtis());
        }

        if (playerDeck.get(2).SporTuru().equals("Futbolcu")) {
            textpanel3.setText(playerDeck.get(2).getSporcuIsim() + "\n"
                    + "\nTakim : " + playerDeck.get(2).getSporcuTakim() + "\n"
                    + "\nPenalti : " + playerDeck.get(2).getPenalti() + "\n"
                    + "\nSerbest Vurus : " + playerDeck.get(2).getSerbestAtis() + "\n"
                    + "\nKaleci ile Karsi karsiya : " + playerDeck.get(2).getKaleciKarsiKarsiya());
        }
        if (playerDeck.get(2).SporTuru().equals("Basketbolcu")) {
            textpanel3.setText(playerDeck.get(2).getSporcuIsim() + "\n"
                    + "\nTakim : " + playerDeck.get(2).getSporcuTakim() + "\n"
                    + "\nIkilik : " + playerDeck.get(2).getIkilik() + "\n"
                    + "\nUcluk : " + playerDeck.get(2).getUcluk() + "\n"
                    + "\nSerbest Atis : " + playerDeck.get(2).getSerbestAtis());
        }

        if (playerDeck.get(3).SporTuru().equals("Futbolcu")) {
            textpanel4.setText(playerDeck.get(3).getSporcuIsim() + "\n"
                    + "\nTakim : " + playerDeck.get(3).getSporcuTakim() + "\n"
                    + "\nPenalti : " + playerDeck.get(3).getPenalti() + "\n"
                    + "\nSerbest Vurus : " + playerDeck.get(3).getSerbestAtis() + "\n"
                    + "\nKaleci ile Karsi karsiya : " + playerDeck.get(3).getKaleciKarsiKarsiya());
        }
        if (playerDeck.get(3).SporTuru().equals("Basketbolcu")) {
            textpanel4.setText(playerDeck.get(3).getSporcuIsim() + "\n"
                    + "\nTakim : " + playerDeck.get(3).getSporcuTakim() + "\n"
                    + "\nIkilik : " + playerDeck.get(3).getIkilik() + "\n"
                    + "\nUcluk : " + playerDeck.get(3).getUcluk() + "\n"
                    + "\nSerbest Atis : " + playerDeck.get(3).getSerbestAtis());
        }

        if (playerDeck.get(4).SporTuru().equals("Futbolcu")) {
            textpanel5.setText(playerDeck.get(4).getSporcuIsim() + "\n"
                    + "\nTakim : " + playerDeck.get(4).getSporcuTakim() + "\n"
                    + "\nPenalti : " + playerDeck.get(4).getPenalti() + "\n"
                    + "\nSerbest Vurus : " + playerDeck.get(4).getSerbestAtis() + "\n"
                    + "\nKaleci ile Karsi karsiya : " + playerDeck.get(4).getKaleciKarsiKarsiya());
        }
        if (playerDeck.get(4).SporTuru().equals("Basketbolcu")) {
            textpanel5.setText(playerDeck.get(4).getSporcuIsim() + "\n"
                    + "\nTakim : " + playerDeck.get(4).getSporcuTakim() + "\n"
                    + "\nIkilik : " + playerDeck.get(4).getIkilik() + "\n"
                    + "\nUcluk : " + playerDeck.get(4).getUcluk() + "\n"
                    + "\nSerbest Atis : " + playerDeck.get(4).getSerbestAtis());
        }

        if (playerDeck.get(5).SporTuru().equals("Futbolcu")) {
            textpanel6.setText(playerDeck.get(5).getSporcuIsim() + "\n"
                    + "\nTakim : " + playerDeck.get(5).getSporcuTakim() + "\n"
                    + "\nPenalti : " + playerDeck.get(5).getPenalti() + "\n"
                    + "\nSerbest Vurus : " + playerDeck.get(5).getSerbestAtis() + "\n"
                    + "\nKaleci ile Karsi karsiya : " + playerDeck.get(5).getKaleciKarsiKarsiya());
        }
        if (playerDeck.get(5).SporTuru().equals("Basketbolcu")) {
            textpanel6.setText(playerDeck.get(5).getSporcuIsim() + "\n"
                    + "\nTakim : " + playerDeck.get(5).getSporcuTakim() + "\n"
                    + "\nIkilik : " + playerDeck.get(5).getIkilik() + "\n"
                    + "\nUcluk : " + playerDeck.get(5).getUcluk() + "\n"
                    + "\nSerbest Atis : " + playerDeck.get(5).getSerbestAtis());
        }

        if (playerDeck.get(6).SporTuru().equals("Futbolcu")) {
            textpanel7.setText(playerDeck.get(6).getSporcuIsim() + "\n"
                    + "\nTakim : " + playerDeck.get(6).getSporcuTakim() + "\n"
                    + "\nPenalti : " + playerDeck.get(6).getPenalti() + "\n"
                    + "\nSerbest Vurus : " + playerDeck.get(6).getSerbestAtis() + "\n"
                    + "\nKaleci ile Karsi karsiya : " + playerDeck.get(6).getKaleciKarsiKarsiya());
        }
        if (playerDeck.get(6).SporTuru().equals("Basketbolcu")) {
            textpanel7.setText(playerDeck.get(6).getSporcuIsim() + "\n"
                    + "\nTakim : " + playerDeck.get(6).getSporcuTakim() + "\n"
                    + "\nIkilik : " + playerDeck.get(6).getIkilik() + "\n"
                    + "\nUcluk : " + playerDeck.get(6).getUcluk() + "\n"
                    + "\nSerbest Atis : " + playerDeck.get(6).getSerbestAtis());
        }

        if (playerDeck.get(7).SporTuru().equals("Futbolcu")) {
            textpanel8.setText(playerDeck.get(7).getSporcuIsim() + "\n"
                    + "\nTakim : " + playerDeck.get(7).getSporcuTakim() + "\n"
                    + "\nPenalti : " + playerDeck.get(7).getPenalti() + "\n"
                    + "\nSerbest Vurus : " + playerDeck.get(7).getSerbestAtis() + "\n"
                    + "\nKaleci ile Karsi karsiya : " + playerDeck.get(7).getKaleciKarsiKarsiya());
        }
        if (playerDeck.get(7).SporTuru().equals("Basketbolcu")) {
            textpanel8.setText(playerDeck.get(7).getSporcuIsim() + "\n"
                    + "\nTakim : " + playerDeck.get(7).getSporcuTakim() + "\n"
                    + "\nIkilik : " + playerDeck.get(7).getIkilik() + "\n"
                    + "\nUcluk : " + playerDeck.get(7).getUcluk() + "\n"
                    + "\nSerbest Atis : " + playerDeck.get(7).getSerbestAtis());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bilgisayarAdPanel = new javax.swing.JTextField();
        kullaniciAdPanel = new javax.swing.JTextField();
        Skor = new javax.swing.JTextField();
        Pozisyon = new javax.swing.JTextField();
        buton2 = new javax.swing.JButton();
        buton1 = new javax.swing.JButton();
        buton3 = new javax.swing.JButton();
        buton4 = new javax.swing.JButton();
        buton5 = new javax.swing.JButton();
        buton6 = new javax.swing.JButton();
        buton7 = new javax.swing.JButton();
        buton8 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textpanel1 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        textpanel2 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        textpanel3 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        textpanel4 = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        textpanel5 = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        textpanel6 = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        textpanel7 = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        textpanel8 = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        SkorBord = new javax.swing.JTextPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        ArenaCardBilgisayar = new javax.swing.JTextPane();
        jScrollPane11 = new javax.swing.JScrollPane();
        ArenaCardPlayer = new javax.swing.JTextPane();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        KartlariDiz = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        Kazanan = new javax.swing.JTextField();
        ExitButton = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        Kurallar = new javax.swing.JTextPane();
        KurallarBaslik = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        bilgisayarAdPanel.setEditable(false);
        bilgisayarAdPanel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bilgisayarAdPanel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bilgisayarAdPanel.setText("Bilgisayar#0000");
        getContentPane().add(bilgisayarAdPanel);
        bilgisayarAdPanel.setBounds(30, 90, 290, 50);

        kullaniciAdPanel.setEditable(false);
        kullaniciAdPanel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        kullaniciAdPanel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kullaniciAdPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullaniciAdPanelActionPerformed(evt);
            }
        });
        getContentPane().add(kullaniciAdPanel);
        kullaniciAdPanel.setBounds(30, 590, 280, 50);

        Skor.setEditable(false);
        Skor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Skor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Skor.setText("SKOR");
        getContentPane().add(Skor);
        Skor.setBounds(1670, 160, 100, 40);

        Pozisyon.setEditable(false);
        Pozisyon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Pozisyon.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Pozisyon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PozisyonActionPerformed(evt);
            }
        });
        getContentPane().add(Pozisyon);
        Pozisyon.setBounds(1630, 370, 200, 50);

        buton2.setText("USE CARD");
        buton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton2ActionPerformed(evt);
            }
        });
        getContentPane().add(buton2);
        buton2.setBounds(340, 870, 190, 40);

        buton1.setText("USE CARD");
        buton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton1ActionPerformed(evt);
            }
        });
        getContentPane().add(buton1);
        buton1.setBounds(120, 870, 190, 40);

        buton3.setText("USE CARD");
        buton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton3ActionPerformed(evt);
            }
        });
        getContentPane().add(buton3);
        buton3.setBounds(550, 870, 190, 40);

        buton4.setText("USE CARD");
        buton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton4ActionPerformed(evt);
            }
        });
        getContentPane().add(buton4);
        buton4.setBounds(760, 870, 190, 40);

        buton5.setText("USE CARD");
        buton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton5ActionPerformed(evt);
            }
        });
        getContentPane().add(buton5);
        buton5.setBounds(980, 870, 190, 40);

        buton6.setText("USE CARD");
        buton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton6ActionPerformed(evt);
            }
        });
        getContentPane().add(buton6);
        buton6.setBounds(1200, 870, 190, 40);

        buton7.setText("USE CARD");
        buton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton7ActionPerformed(evt);
            }
        });
        getContentPane().add(buton7);
        buton7.setBounds(1420, 870, 190, 40);

        buton8.setText("USE CARD");
        buton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton8ActionPerformed(evt);
            }
        });
        getContentPane().add(buton8);
        buton8.setBounds(1630, 870, 190, 40);

        textpanel1.setEditable(false);
        textpanel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jScrollPane1.setViewportView(textpanel1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(120, 660, 190, 200);

        textpanel2.setEditable(false);
        textpanel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jScrollPane2.setViewportView(textpanel2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(340, 660, 190, 200);

        textpanel3.setEditable(false);
        textpanel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jScrollPane3.setViewportView(textpanel3);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(550, 660, 190, 200);

        textpanel4.setEditable(false);
        textpanel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jScrollPane4.setViewportView(textpanel4);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(760, 660, 190, 200);

        textpanel5.setEditable(false);
        textpanel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jScrollPane5.setViewportView(textpanel5);

        getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(980, 660, 190, 200);

        textpanel6.setEditable(false);
        textpanel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jScrollPane6.setViewportView(textpanel6);

        getContentPane().add(jScrollPane6);
        jScrollPane6.setBounds(1200, 660, 190, 200);

        textpanel7.setEditable(false);
        textpanel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jScrollPane7.setViewportView(textpanel7);

        getContentPane().add(jScrollPane7);
        jScrollPane7.setBounds(1420, 660, 190, 200);

        textpanel8.setEditable(false);
        textpanel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jScrollPane8.setViewportView(textpanel8);

        getContentPane().add(jScrollPane8);
        jScrollPane8.setBounds(1630, 660, 190, 200);

        SkorBord.setEditable(false);
        SkorBord.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jScrollPane9.setViewportView(SkorBord);

        getContentPane().add(jScrollPane9);
        jScrollPane9.setBounds(1610, 220, 230, 50);

        ArenaCardBilgisayar.setEditable(false);
        ArenaCardBilgisayar.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jScrollPane10.setViewportView(ArenaCardBilgisayar);

        getContentPane().add(jScrollPane10);
        jScrollPane10.setBounds(770, 340, 190, 190);

        ArenaCardPlayer.setEditable(false);
        ArenaCardPlayer.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jScrollPane11.setViewportView(ArenaCardPlayer);

        getContentPane().add(jScrollPane11);
        jScrollPane11.setBounds(1020, 340, 190, 190);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("BİLGİSAYAR");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(770, 280, 190, 50);

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("OYUNCU");
        getContentPane().add(jTextField2);
        jTextField2.setBounds(1020, 280, 190, 50);

        KartlariDiz.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        KartlariDiz.setText("Kartlari Diz");
        KartlariDiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KartlariDizActionPerformed(evt);
            }
        });
        getContentPane().add(KartlariDiz);
        KartlariDiz.setBounds(880, 90, 220, 90);

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("Pozisyon");
        getContentPane().add(jTextField3);
        jTextField3.setBounds(1670, 310, 110, 40);

        Kazanan.setEditable(false);
        Kazanan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Kazanan.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(Kazanan);
        Kazanan.setBounds(700, 190, 570, 70);

        ExitButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ExitButton.setText("EXIT GAME");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButton);
        ExitButton.setBounds(910, 550, 140, 50);

        Kurallar.setEditable(false);
        Kurallar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jScrollPane12.setViewportView(Kurallar);

        getContentPane().add(jScrollPane12);
        jScrollPane12.setBounds(60, 340, 350, 90);

        KurallarBaslik.setEditable(false);
        KurallarBaslik.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        KurallarBaslik.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        KurallarBaslik.setText("KURALLAR");
        getContentPane().add(KurallarBaslik);
        KurallarBaslik.setBounds(170, 260, 130, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\G731GV\\OneDrive\\Documents\\NetBeansProjects\\ProLab2\\src\\MenuEkranResim\\S-SP24.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1920, 1080);

        jPanel1.setMinimumSize(new java.awt.Dimension(1920, 1080));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1920, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kullaniciAdPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullaniciAdPanelActionPerformed

    }//GEN-LAST:event_kullaniciAdPanelActionPerformed

    private void buton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton2ActionPerformed
        Sporcu sportPerson;

        sportPerson = bilgisayar.kartSec(5); //Ayni Spor turu kontrolu icin 5 girdim bu duruma ozel kontrol sagladim.
        if (sportPerson.SporTuru().equals(playerDeck.get(1).SporTuru())) {
            sportPerson = bilgisayar.kartSec(1);
            if (sportPerson.SporTuru().equals("Futbolcu")) {
                ArenaCardBilgisayar.setText(sportPerson.getSporcuIsim() + "\n"
                        + "\nTakim : " + sportPerson.getSporcuTakim() + "\n"
                        + "\nPenalti : " + sportPerson.getPenalti() + "\n"
                        + "\nSerbest Vurus : " + sportPerson.getSerbestAtis() + "\n"
                        + "\nKaleci ile Karsi karsiya : " + sportPerson.getKaleciKarsiKarsiya());
            }
            if (sportPerson.SporTuru().equals("Basketbolcu")) {
                ArenaCardBilgisayar.setText(sportPerson.getSporcuIsim() + "\n"
                        + "\nTakim : " + sportPerson.getSporcuTakim() + "\n"
                        + "\nIkilik : " + sportPerson.getIkilik() + "\n"
                        + "\nUcluk : " + sportPerson.getUcluk() + "\n"
                        + "\nSerbest Atis : " + sportPerson.getSerbestAtis());
            }

            if (playerDeck.get(1).SporTuru().equals("Futbolcu")) {
                ArenaCardPlayer.setText(playerDeck.get(1).getSporcuIsim() + "\n"
                        + "\nTakim : " + playerDeck.get(1).getSporcuTakim() + "\n"
                        + "\nPenalti : " + playerDeck.get(1).getPenalti() + "\n"
                        + "\nSerbest Vurus : " + playerDeck.get(1).getSerbestAtis() + "\n"
                        + "\nKaleci ile Karsi karsiya : " + playerDeck.get(1).getKaleciKarsiKarsiya());
            }
            if (playerDeck.get(1).SporTuru().equals("Basketbolcu")) {
                ArenaCardPlayer.setText(playerDeck.get(1).getSporcuIsim() + "\n"
                        + "\nTakim : " + playerDeck.get(1).getSporcuTakim() + "\n"
                        + "\nIkilik : " + playerDeck.get(1).getIkilik() + "\n"
                        + "\nUcluk : " + playerDeck.get(1).getUcluk() + "\n"
                        + "\nSerbest Atis : " + playerDeck.get(1).getSerbestAtis());
            }

            if (player.neKadarKaldi() == 1 && bilgisayar.neKadarKaldi() == 1) {
                sonKontrol(sportPerson, playerDeck.get(1));
                bilgisayar.kartCikar(sportPerson);
                player.kartCikar(playerDeck.get(1));
                buton2.setVisible(false);
                textpanel2.setVisible(false);
                jScrollPane2.setVisible(false);
            }

            if (player.neKadarKaldi() > 1 && bilgisayar.neKadarKaldi() > 1) {
                if (KimKazanir(sportPerson, playerDeck.get(1)) != true) {
                    bilgisayar.kartCikar(sportPerson);
                    player.kartCikar(playerDeck.get(1));
                    buton2.setVisible(false);
                    textpanel2.setVisible(false);
                    jScrollPane2.setVisible(false);
                }

            }
        } else {
            JOptionPane.showMessageDialog(this, "HAMLE SIRASI HATALI,ONCEKI HAMLE ILE AYNI SPOR DALI KULLANDINIZ . ", "UYARI MESAJI", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_buton2ActionPerformed

    private void buton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton1ActionPerformed
        Sporcu sportPerson;

        sportPerson = bilgisayar.kartSec(5); //Ayni Spor turu kontrolu icin 5 girdim bu duruma ozel kontrol sagladim.
        if (sportPerson.SporTuru().equals(playerDeck.get(0).SporTuru())) {
            sportPerson = bilgisayar.kartSec(1);
            if (sportPerson.SporTuru().equals("Futbolcu")) {
                ArenaCardBilgisayar.setText(sportPerson.getSporcuIsim() + "\n"
                        + "\nTakim : " + sportPerson.getSporcuTakim() + "\n"
                        + "\nPenalti : " + sportPerson.getPenalti() + "\n"
                        + "\nSerbest Vurus : " + sportPerson.getSerbestAtis() + "\n"
                        + "\nKaleci ile Karsi karsiya : " + sportPerson.getKaleciKarsiKarsiya());
            }
            if (sportPerson.SporTuru().equals("Basketbolcu")) {
                ArenaCardBilgisayar.setText(sportPerson.getSporcuIsim() + "\n"
                        + "\nTakim : " + sportPerson.getSporcuTakim() + "\n"
                        + "\nIkilik : " + sportPerson.getIkilik() + "\n"
                        + "\nUcluk : " + sportPerson.getUcluk() + "\n"
                        + "\nSerbest Atis : " + sportPerson.getSerbestAtis());
            }

            if (playerDeck.get(0).SporTuru().equals("Futbolcu")) {
                ArenaCardPlayer.setText(playerDeck.get(0).getSporcuIsim() + "\n"
                        + "\nTakim : " + playerDeck.get(0).getSporcuTakim() + "\n"
                        + "\nPenalti : " + playerDeck.get(0).getPenalti() + "\n"
                        + "\nSerbest Vurus : " + playerDeck.get(0).getSerbestAtis() + "\n"
                        + "\nKaleci ile Karsi karsiya : " + playerDeck.get(0).getKaleciKarsiKarsiya());
            }
            if (playerDeck.get(0).SporTuru().equals("Basketbolcu")) {
                ArenaCardPlayer.setText(playerDeck.get(0).getSporcuIsim() + "\n"
                        + "\nTakim : " + playerDeck.get(0).getSporcuTakim() + "\n"
                        + "\nIkilik : " + playerDeck.get(0).getIkilik() + "\n"
                        + "\nUcluk : " + playerDeck.get(0).getUcluk() + "\n"
                        + "\nSerbest Atis : " + playerDeck.get(0).getSerbestAtis());
            }

            if (player.neKadarKaldi() == 1 && bilgisayar.neKadarKaldi() == 1) {
                sonKontrol(sportPerson, playerDeck.get(0));
                bilgisayar.kartCikar(sportPerson);
                player.kartCikar(playerDeck.get(0));
                buton1.setVisible(false);
                textpanel1.setVisible(false);
                jScrollPane1.setVisible(false);
            }

            if (player.neKadarKaldi() > 1 && bilgisayar.neKadarKaldi() > 1) {
                if (KimKazanir(sportPerson, playerDeck.get(0)) != true) {
                    bilgisayar.kartCikar(sportPerson);
                    player.kartCikar(playerDeck.get(0));
                    buton1.setVisible(false);
                    textpanel1.setVisible(false);
                    jScrollPane1.setVisible(false);
                }

            }
        } else {
            JOptionPane.showMessageDialog(this, "HAMLE SIRASI HATALI,ONCEKI HAMLE ILE AYNI SPOR DALI KULLANDINIZ . ", "UYARI MESAJI", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_buton1ActionPerformed

    private void KartlariDizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KartlariDizActionPerformed
        kartlariArenayaYaz();
        KartlariDiz.setVisible(false);
        buton1.setVisible(true);
        buton2.setVisible(true);
        buton3.setVisible(true);
        buton4.setVisible(true);
        buton5.setVisible(true);
        buton6.setVisible(true);
        buton7.setVisible(true);
        buton8.setVisible(true);
        Kurallar.setVisible(false);
        jScrollPane12.setVisible(false);
        KurallarBaslik.setVisible(false);
    }//GEN-LAST:event_KartlariDizActionPerformed

    private void PozisyonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PozisyonActionPerformed

    }//GEN-LAST:event_PozisyonActionPerformed

    private void buton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton7ActionPerformed
        Sporcu sportPerson;

        sportPerson = bilgisayar.kartSec(5); //Ayni Spor turu kontrolu icin 5 girdim bu duruma ozel kontrol sagladim.
        if (sportPerson.SporTuru().equals(playerDeck.get(6).SporTuru())) {
            sportPerson = bilgisayar.kartSec(1);
            if (sportPerson.SporTuru().equals("Futbolcu")) {
                ArenaCardBilgisayar.setText(sportPerson.getSporcuIsim() + "\n"
                        + "\nTakim : " + sportPerson.getSporcuTakim() + "\n"
                        + "\nPenalti : " + sportPerson.getPenalti() + "\n"
                        + "\nSerbest Vurus : " + sportPerson.getSerbestAtis() + "\n"
                        + "\nKaleci ile Karsi karsiya : " + sportPerson.getKaleciKarsiKarsiya());
            }
            if (sportPerson.SporTuru().equals("Basketbolcu")) {
                ArenaCardBilgisayar.setText(sportPerson.getSporcuIsim() + "\n"
                        + "\nTakim : " + sportPerson.getSporcuTakim() + "\n"
                        + "\nIkilik : " + sportPerson.getIkilik() + "\n"
                        + "\nUcluk : " + sportPerson.getUcluk() + "\n"
                        + "\nSerbest Atis : " + sportPerson.getSerbestAtis());
            }

            if (playerDeck.get(6).SporTuru().equals("Futbolcu")) {
                ArenaCardPlayer.setText(playerDeck.get(6).getSporcuIsim() + "\n"
                        + "\nTakim : " + playerDeck.get(6).getSporcuTakim() + "\n"
                        + "\nPenalti : " + playerDeck.get(6).getPenalti() + "\n"
                        + "\nSerbest Vurus : " + playerDeck.get(6).getSerbestAtis() + "\n"
                        + "\nKaleci ile Karsi karsiya : " + playerDeck.get(6).getKaleciKarsiKarsiya());
            }
            if (playerDeck.get(6).SporTuru().equals("Basketbolcu")) {
                ArenaCardPlayer.setText(playerDeck.get(6).getSporcuIsim() + "\n"
                        + "\nTakim : " + playerDeck.get(6).getSporcuTakim() + "\n"
                        + "\nIkilik : " + playerDeck.get(6).getIkilik() + "\n"
                        + "\nUcluk : " + playerDeck.get(6).getUcluk() + "\n"
                        + "\nSerbest Atis : " + playerDeck.get(6).getSerbestAtis());
            }

            if (player.neKadarKaldi() == 1 && bilgisayar.neKadarKaldi() == 1) {
                sonKontrol(sportPerson, playerDeck.get(6));
                bilgisayar.kartCikar(sportPerson);
                player.kartCikar(playerDeck.get(6));
                buton7.setVisible(false);
                textpanel7.setVisible(false);
                jScrollPane7.setVisible(false);
            }

            if (player.neKadarKaldi() > 1 && bilgisayar.neKadarKaldi() > 1) {
                if (KimKazanir(sportPerson, playerDeck.get(6)) != true) {
                    bilgisayar.kartCikar(sportPerson);
                    player.kartCikar(playerDeck.get(6));
                    buton7.setVisible(false);
                    textpanel7.setVisible(false);
                    jScrollPane7.setVisible(false);
                }

            }
        } else {
            JOptionPane.showMessageDialog(this, "HAMLE SIRASI HATALI,ONCEKI HAMLE ILE AYNI SPOR DALI KULLANDINIZ . ", "UYARI MESAJI", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_buton7ActionPerformed

    private void buton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton3ActionPerformed
        Sporcu sportPerson;

        sportPerson = bilgisayar.kartSec(5); //Ayni Spor turu kontrolu icin 5 girdim bu duruma ozel kontrol sagladim.
        if (sportPerson.SporTuru().equals(playerDeck.get(2).SporTuru())) {
            sportPerson = bilgisayar.kartSec(1);
            if (sportPerson.SporTuru().equals("Futbolcu")) {
                ArenaCardBilgisayar.setText(sportPerson.getSporcuIsim() + "\n"
                        + "\nTakim : " + sportPerson.getSporcuTakim() + "\n"
                        + "\nPenalti : " + sportPerson.getPenalti() + "\n"
                        + "\nSerbest Vurus : " + sportPerson.getSerbestAtis() + "\n"
                        + "\nKaleci ile Karsi karsiya : " + sportPerson.getKaleciKarsiKarsiya());
            }
            if (sportPerson.SporTuru().equals("Basketbolcu")) {
                ArenaCardBilgisayar.setText(sportPerson.getSporcuIsim() + "\n"
                        + "\nTakim : " + sportPerson.getSporcuTakim() + "\n"
                        + "\nIkilik : " + sportPerson.getIkilik() + "\n"
                        + "\nUcluk : " + sportPerson.getUcluk() + "\n"
                        + "\nSerbest Atis : " + sportPerson.getSerbestAtis());
            }

            if (playerDeck.get(2).SporTuru().equals("Futbolcu")) {
                ArenaCardPlayer.setText(playerDeck.get(2).getSporcuIsim() + "\n"
                        + "\nTakim : " + playerDeck.get(2).getSporcuTakim() + "\n"
                        + "\nPenalti : " + playerDeck.get(2).getPenalti() + "\n"
                        + "\nSerbest Vurus : " + playerDeck.get(2).getSerbestAtis() + "\n"
                        + "\nKaleci ile Karsi karsiya : " + playerDeck.get(2).getKaleciKarsiKarsiya());
            }
            if (playerDeck.get(2).SporTuru().equals("Basketbolcu")) {
                ArenaCardPlayer.setText(playerDeck.get(2).getSporcuIsim() + "\n"
                        + "\nTakim : " + playerDeck.get(2).getSporcuTakim() + "\n"
                        + "\nIkilik : " + playerDeck.get(2).getIkilik() + "\n"
                        + "\nUcluk : " + playerDeck.get(2).getUcluk() + "\n"
                        + "\nSerbest Atis : " + playerDeck.get(2).getSerbestAtis());
            }

            if (player.neKadarKaldi() == 1 && bilgisayar.neKadarKaldi() == 1) {
                sonKontrol(sportPerson, playerDeck.get(2));
                bilgisayar.kartCikar(sportPerson);
                player.kartCikar(playerDeck.get(2));
                buton3.setVisible(false);
                textpanel3.setVisible(false);
                jScrollPane3.setVisible(false);
            }

            if (player.neKadarKaldi() > 1 && bilgisayar.neKadarKaldi() > 1) {
                if (KimKazanir(sportPerson, playerDeck.get(2)) != true) {
                    bilgisayar.kartCikar(sportPerson);
                    player.kartCikar(playerDeck.get(2));
                    buton3.setVisible(false);
                    textpanel3.setVisible(false);
                    jScrollPane3.setVisible(false);
                }

            }
        } else {
            JOptionPane.showMessageDialog(this, "HAMLE SIRASI HATALI,ONCEKI HAMLE ILE AYNI SPOR DALI KULLANDINIZ . ", "UYARI MESAJI", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_buton3ActionPerformed

    private void buton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton4ActionPerformed
        Sporcu sportPerson;

        sportPerson = bilgisayar.kartSec(5); //Ayni Spor turu kontrolu icin 5 girdim bu duruma ozel kontrol sagladim.
        if (sportPerson.SporTuru().equals(playerDeck.get(3).SporTuru())) {
            sportPerson = bilgisayar.kartSec(1);
            if (sportPerson.SporTuru().equals("Futbolcu")) {
                ArenaCardBilgisayar.setText(sportPerson.getSporcuIsim() + "\n"
                        + "\nTakim : " + sportPerson.getSporcuTakim() + "\n"
                        + "\nPenalti : " + sportPerson.getPenalti() + "\n"
                        + "\nSerbest Vurus : " + sportPerson.getSerbestAtis() + "\n"
                        + "\nKaleci ile Karsi karsiya : " + sportPerson.getKaleciKarsiKarsiya());
            }
            if (sportPerson.SporTuru().equals("Basketbolcu")) {
                ArenaCardBilgisayar.setText(sportPerson.getSporcuIsim() + "\n"
                        + "\nTakim : " + sportPerson.getSporcuTakim() + "\n"
                        + "\nIkilik : " + sportPerson.getIkilik() + "\n"
                        + "\nUcluk : " + sportPerson.getUcluk() + "\n"
                        + "\nSerbest Atis : " + sportPerson.getSerbestAtis());
            }

            if (playerDeck.get(3).SporTuru().equals("Futbolcu")) {
                ArenaCardPlayer.setText(playerDeck.get(3).getSporcuIsim() + "\n"
                        + "\nTakim : " + playerDeck.get(3).getSporcuTakim() + "\n"
                        + "\nPenalti : " + playerDeck.get(3).getPenalti() + "\n"
                        + "\nSerbest Vurus : " + playerDeck.get(3).getSerbestAtis() + "\n"
                        + "\nKaleci ile Karsi karsiya : " + playerDeck.get(3).getKaleciKarsiKarsiya());
            }
            if (playerDeck.get(3).SporTuru().equals("Basketbolcu")) {
                ArenaCardPlayer.setText(playerDeck.get(3).getSporcuIsim() + "\n"
                        + "\nTakim : " + playerDeck.get(3).getSporcuTakim() + "\n"
                        + "\nIkilik : " + playerDeck.get(3).getIkilik() + "\n"
                        + "\nUcluk : " + playerDeck.get(3).getUcluk() + "\n"
                        + "\nSerbest Atis : " + playerDeck.get(3).getSerbestAtis());
            }

            if (player.neKadarKaldi() == 1 && bilgisayar.neKadarKaldi() == 1) {
                sonKontrol(sportPerson, playerDeck.get(3));
                bilgisayar.kartCikar(sportPerson);
                player.kartCikar(playerDeck.get(3));
                buton4.setVisible(false);
                textpanel4.setVisible(false);
                jScrollPane4.setVisible(false);
            }

            if (player.neKadarKaldi() > 1 && bilgisayar.neKadarKaldi() > 1) {
                if (KimKazanir(sportPerson, playerDeck.get(3)) != true) {
                    bilgisayar.kartCikar(sportPerson);
                    player.kartCikar(playerDeck.get(3));
                    buton4.setVisible(false);
                    textpanel4.setVisible(false);
                    jScrollPane4.setVisible(false);
                }

            }
        } else {
            JOptionPane.showMessageDialog(this, "HAMLE SIRASI HATALI,ONCEKI HAMLE ILE AYNI SPOR DALI KULLANDINIZ . ", "UYARI MESAJI", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buton4ActionPerformed

    private void buton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton5ActionPerformed
        Sporcu sportPerson;

        sportPerson = bilgisayar.kartSec(5); //Ayni Spor turu kontrolu icin 5 girdim bu duruma ozel kontrol sagladim.
        if (sportPerson.SporTuru().equals(playerDeck.get(4).SporTuru())) {
            sportPerson = bilgisayar.kartSec(1);
            if (sportPerson.SporTuru().equals("Futbolcu")) {
                ArenaCardBilgisayar.setText(sportPerson.getSporcuIsim() + "\n"
                        + "\nTakim : " + sportPerson.getSporcuTakim() + "\n"
                        + "\nPenalti : " + sportPerson.getPenalti() + "\n"
                        + "\nSerbest Vurus : " + sportPerson.getSerbestAtis() + "\n"
                        + "\nKaleci ile Karsi karsiya : " + sportPerson.getKaleciKarsiKarsiya());
            }
            if (sportPerson.SporTuru().equals("Basketbolcu")) {
                ArenaCardBilgisayar.setText(sportPerson.getSporcuIsim() + "\n"
                        + "\nTakim : " + sportPerson.getSporcuTakim() + "\n"
                        + "\nIkilik : " + sportPerson.getIkilik() + "\n"
                        + "\nUcluk : " + sportPerson.getUcluk() + "\n"
                        + "\nSerbest Atis : " + sportPerson.getSerbestAtis());
            }

            if (playerDeck.get(4).SporTuru().equals("Futbolcu")) {
                ArenaCardPlayer.setText(playerDeck.get(4).getSporcuIsim() + "\n"
                        + "\nTakim : " + playerDeck.get(4).getSporcuTakim() + "\n"
                        + "\nPenalti : " + playerDeck.get(4).getPenalti() + "\n"
                        + "\nSerbest Vurus : " + playerDeck.get(4).getSerbestAtis() + "\n"
                        + "\nKaleci ile Karsi karsiya : " + playerDeck.get(4).getKaleciKarsiKarsiya());
            }
            if (playerDeck.get(4).SporTuru().equals("Basketbolcu")) {
                ArenaCardPlayer.setText(playerDeck.get(4).getSporcuIsim() + "\n"
                        + "\nTakim : " + playerDeck.get(4).getSporcuTakim() + "\n"
                        + "\nIkilik : " + playerDeck.get(4).getIkilik() + "\n"
                        + "\nUcluk : " + playerDeck.get(4).getUcluk() + "\n"
                        + "\nSerbest Atis : " + playerDeck.get(4).getSerbestAtis());
            }

            if (player.neKadarKaldi() == 1 && bilgisayar.neKadarKaldi() == 1) {
                sonKontrol(sportPerson, playerDeck.get(4));
                bilgisayar.kartCikar(sportPerson);
                player.kartCikar(playerDeck.get(4));
                buton5.setVisible(false);
                textpanel5.setVisible(false);
                jScrollPane5.setVisible(false);
            }

            if (player.neKadarKaldi() > 1 && bilgisayar.neKadarKaldi() > 1) {
                if (KimKazanir(sportPerson, playerDeck.get(4)) != true) {
                    bilgisayar.kartCikar(sportPerson);
                    player.kartCikar(playerDeck.get(4));
                    buton5.setVisible(false);
                    textpanel5.setVisible(false);
                    jScrollPane5.setVisible(false);
                }

            }
        } else {
            JOptionPane.showMessageDialog(this, "HAMLE SIRASI HATALI,ONCEKI HAMLE ILE AYNI SPOR DALI KULLANDINIZ . ", "UYARI MESAJI", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_buton5ActionPerformed

    private void buton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton6ActionPerformed
        Sporcu sportPerson;

        sportPerson = bilgisayar.kartSec(5); //Ayni Spor turu kontrolu icin 5 girdim bu duruma ozel kontrol sagladim.
        if (sportPerson.SporTuru().equals(playerDeck.get(5).SporTuru())) {
            sportPerson = bilgisayar.kartSec(1);
            if (sportPerson.SporTuru().equals("Futbolcu")) {
                ArenaCardBilgisayar.setText(sportPerson.getSporcuIsim() + "\n"
                        + "\nTakim : " + sportPerson.getSporcuTakim() + "\n"
                        + "\nPenalti : " + sportPerson.getPenalti() + "\n"
                        + "\nSerbest Vurus : " + sportPerson.getSerbestAtis() + "\n"
                        + "\nKaleci ile Karsi karsiya : " + sportPerson.getKaleciKarsiKarsiya());
            }
            if (sportPerson.SporTuru().equals("Basketbolcu")) {
                ArenaCardBilgisayar.setText(sportPerson.getSporcuIsim() + "\n"
                        + "\nTakim : " + sportPerson.getSporcuTakim() + "\n"
                        + "\nIkilik : " + sportPerson.getIkilik() + "\n"
                        + "\nUcluk : " + sportPerson.getUcluk() + "\n"
                        + "\nSerbest Atis : " + sportPerson.getSerbestAtis());
            }

            if (playerDeck.get(5).SporTuru().equals("Futbolcu")) {
                ArenaCardPlayer.setText(playerDeck.get(5).getSporcuIsim() + "\n"
                        + "\nTakim : " + playerDeck.get(5).getSporcuTakim() + "\n"
                        + "\nPenalti : " + playerDeck.get(5).getPenalti() + "\n"
                        + "\nSerbest Vurus : " + playerDeck.get(5).getSerbestAtis() + "\n"
                        + "\nKaleci ile Karsi karsiya : " + playerDeck.get(5).getKaleciKarsiKarsiya());
            }
            if (playerDeck.get(5).SporTuru().equals("Basketbolcu")) {
                ArenaCardPlayer.setText(playerDeck.get(5).getSporcuIsim() + "\n"
                        + "\nTakim : " + playerDeck.get(5).getSporcuTakim() + "\n"
                        + "\nIkilik : " + playerDeck.get(5).getIkilik() + "\n"
                        + "\nUcluk : " + playerDeck.get(5).getUcluk() + "\n"
                        + "\nSerbest Atis : " + playerDeck.get(5).getSerbestAtis());
            }

            if (player.neKadarKaldi() == 1 && bilgisayar.neKadarKaldi() == 1) {
                sonKontrol(sportPerson, playerDeck.get(5));
                bilgisayar.kartCikar(sportPerson);
                player.kartCikar(playerDeck.get(5));
                buton6.setVisible(false);
                textpanel6.setVisible(false);
                jScrollPane6.setVisible(false);
            }

            if (player.neKadarKaldi() > 1 && bilgisayar.neKadarKaldi() > 1) {
                if (KimKazanir(sportPerson, playerDeck.get(5)) != true) {
                    bilgisayar.kartCikar(sportPerson);
                    player.kartCikar(playerDeck.get(5));
                    buton6.setVisible(false);
                    textpanel6.setVisible(false);
                    jScrollPane6.setVisible(false);
                }

            }
        } else {
            JOptionPane.showMessageDialog(this, "HAMLE SIRASI HATALI,ONCEKI HAMLE ILE AYNI SPOR DALI KULLANDINIZ . ", "UYARI MESAJI", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_buton6ActionPerformed

    private void buton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton8ActionPerformed
        Sporcu sportPerson;

        sportPerson = bilgisayar.kartSec(5); //Ayni Spor turu kontrolu icin 5 girdim bu duruma ozel kontrol sagladim.
        if (sportPerson.SporTuru().equals(playerDeck.get(7).SporTuru())) {
            sportPerson = bilgisayar.kartSec(1);
            if (sportPerson.SporTuru().equals("Futbolcu")) {
                ArenaCardBilgisayar.setText(sportPerson.getSporcuIsim() + "\n"
                        + "\nTakim : " + sportPerson.getSporcuTakim() + "\n"
                        + "\nPenalti : " + sportPerson.getPenalti() + "\n"
                        + "\nSerbest Vurus : " + sportPerson.getSerbestAtis() + "\n"
                        + "\nKaleci ile Karsi karsiya : " + sportPerson.getKaleciKarsiKarsiya());
            }
            if (sportPerson.SporTuru().equals("Basketbolcu")) {
                ArenaCardBilgisayar.setText(sportPerson.getSporcuIsim() + "\n"
                        + "\nTakim : " + sportPerson.getSporcuTakim() + "\n"
                        + "\nIkilik : " + sportPerson.getIkilik() + "\n"
                        + "\nUcluk : " + sportPerson.getUcluk() + "\n"
                        + "\nSerbest Atis : " + sportPerson.getSerbestAtis());
            }

            if (playerDeck.get(7).SporTuru().equals("Futbolcu")) {
                ArenaCardPlayer.setText(playerDeck.get(7).getSporcuIsim() + "\n"
                        + "\nTakim : " + playerDeck.get(7).getSporcuTakim() + "\n"
                        + "\nPenalti : " + playerDeck.get(7).getPenalti() + "\n"
                        + "\nSerbest Vurus : " + playerDeck.get(7).getSerbestAtis() + "\n"
                        + "\nKaleci ile Karsi karsiya : " + playerDeck.get(7).getKaleciKarsiKarsiya());
            }
            if (playerDeck.get(7).SporTuru().equals("Basketbolcu")) {
                ArenaCardPlayer.setText(playerDeck.get(7).getSporcuIsim() + "\n"
                        + "\nTakim : " + playerDeck.get(7).getSporcuTakim() + "\n"
                        + "\nIkilik : " + playerDeck.get(7).getIkilik() + "\n"
                        + "\nUcluk : " + playerDeck.get(7).getUcluk() + "\n"
                        + "\nSerbest Atis : " + playerDeck.get(7).getSerbestAtis());
            }

            if (player.neKadarKaldi() == 1 && bilgisayar.neKadarKaldi() == 1) {
                sonKontrol(sportPerson, playerDeck.get(7));
                bilgisayar.kartCikar(sportPerson);
                player.kartCikar(playerDeck.get(7));
                buton8.setVisible(false);
                textpanel8.setVisible(false);
                jScrollPane8.setVisible(false);
            }

            if (player.neKadarKaldi() > 1 && bilgisayar.neKadarKaldi() > 1) {
                if (KimKazanir(sportPerson, playerDeck.get(7)) != true) {
                    bilgisayar.kartCikar(sportPerson);
                    player.kartCikar(playerDeck.get(7));
                    buton8.setVisible(false);
                    textpanel8.setVisible(false);
                    jScrollPane8.setVisible(false);
                }

            }
        } else {
            JOptionPane.showMessageDialog(this, "HAMLE SIRASI HATALI,ONCEKI HAMLE ILE AYNI SPOR DALI KULLANDINIZ . ", "UYARI MESAJI", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_buton8ActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane ArenaCardBilgisayar;
    private javax.swing.JTextPane ArenaCardPlayer;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton KartlariDiz;
    private javax.swing.JTextField Kazanan;
    private javax.swing.JTextPane Kurallar;
    private javax.swing.JTextField KurallarBaslik;
    private javax.swing.JTextField Pozisyon;
    private javax.swing.JTextField Skor;
    private javax.swing.JTextPane SkorBord;
    private javax.swing.JTextField bilgisayarAdPanel;
    private javax.swing.JButton buton1;
    private javax.swing.JButton buton2;
    private javax.swing.JButton buton3;
    private javax.swing.JButton buton4;
    private javax.swing.JButton buton5;
    private javax.swing.JButton buton6;
    private javax.swing.JButton buton7;
    private javax.swing.JButton buton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField kullaniciAdPanel;
    private javax.swing.JTextPane textpanel1;
    private javax.swing.JTextPane textpanel2;
    private javax.swing.JTextPane textpanel3;
    private javax.swing.JTextPane textpanel4;
    private javax.swing.JTextPane textpanel5;
    private javax.swing.JTextPane textpanel6;
    private javax.swing.JTextPane textpanel7;
    private javax.swing.JTextPane textpanel8;
    // End of variables declaration//GEN-END:variables
}
