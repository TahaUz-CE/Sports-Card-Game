package prolab2;

import java.util.ArrayList;

public class Oyuncu {

    private String oyuncuID;
    private String oyuncuAdi;
    private int skor;
    ArrayList<Sporcu> A_oyuncuDeck;
    ArrayList<Sporcu> B_oyuncuDeck;

    public Oyuncu(String oyuncuID, String oyuncuAdi, int skor) {
        this.oyuncuID = oyuncuID;
        this.oyuncuAdi = oyuncuAdi;
        this.skor = skor;
    }

    public Oyuncu() {
        this.oyuncuID = "DefaultOyuncuID#0000";
        this.oyuncuAdi = "DefaultOyuncuID";
        this.skor = 0;
    }

    public void setOyuncuID(String oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }

    public String getOyuncuID() {
        return oyuncuID;
    }

    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    public int getSkor() {
        return skor;
    }

    public Sporcu kartSec(int a) {
        return A_oyuncuDeck.get(0);
    }

    public String kartListesi() {
        return "";
    }

    public String skorArttir(int artis) {
        this.skor += artis;
        return "";
    }

    public String kartCikar(Sporcu kart) {
        return "";
    }

    public Sporcu desteGonder(int a) {
        return A_oyuncuDeck.get(a);
    }

    public int neKadarKaldi() {
        return 0;
    }

    public void SkorGoster() {
        System.out.println("Skor : " + this.skor);
    }
}
