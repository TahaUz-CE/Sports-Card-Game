package prolab2;

import java.util.ArrayList;

public class Bilgisayar extends Oyuncu {

    private String temp_SporTuru = "Basketbolcu";

    public Bilgisayar(int skor, ArrayList<Sporcu> A_oyuncuDeck) {
        super("Bilgisayar#0000", "Bilgisayar", skor);
        this.A_oyuncuDeck = A_oyuncuDeck;
    }

    public Bilgisayar() {
        super();
    }

    @Override
    public Sporcu kartSec(int a) {
        int randomSayi = (int) (Math.random() * A_oyuncuDeck.size());
        int cikis = 1, sayacF = 0, sayacB = 0;
        for (int i = 0; i < A_oyuncuDeck.size(); i++) {
            if (A_oyuncuDeck.get(i).SporTuru().equals("Futbolcu")) {
                sayacF++;
            } else if (A_oyuncuDeck.get(i).SporTuru().equals("Basketbolcu")) {
                sayacB++;
            }
        }
        if (sayacF == 0 || sayacB == 0) {
            return A_oyuncuDeck.get(randomSayi);
        } else {
            while (cikis != 0) {
                if (A_oyuncuDeck.get(randomSayi).SporTuru().equals(temp_SporTuru)) {
                    randomSayi = (int) (Math.random() * A_oyuncuDeck.size());
                } else if (!A_oyuncuDeck.get(randomSayi).SporTuru().equals(temp_SporTuru) && a != 5) {
                    temp_SporTuru = A_oyuncuDeck.get(randomSayi).SporTuru();
                    cikis = 0;
                } else if (a == 5) {//Bu kontrol arayüz tasarimda spor turunu kontrol etmek icin yapiliyor.
                    cikis = 0;
                }
            }
        }
        return A_oyuncuDeck.get(randomSayi);
    }

    @Override
    public String kartCikar(Sporcu kart) {
        A_oyuncuDeck.remove(kart);
        return "";
    }

    @Override
    public int neKadarKaldi() {

        return A_oyuncuDeck.size();
    }

    @Override
    public String kartListesi() {
        System.out.println(getOyuncuID() + " OYUNCUSUNUN DESTESI");
        System.out.println("*********************************************************");
        for (int i = 0; i < A_oyuncuDeck.size(); i++) {
            System.out.println(A_oyuncuDeck.get(i).sporcuPuaniGoster());
        }
        System.out.println("*********************************************************");
        return "";
    }

    @Override
    public Sporcu desteGonder(int a) {
        return A_oyuncuDeck.get(a);
    }

}
