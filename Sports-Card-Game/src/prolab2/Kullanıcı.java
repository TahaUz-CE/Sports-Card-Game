package prolab2;

import java.util.ArrayList;

public class Kullanıcı extends Oyuncu {

    public Kullanıcı(String oyuncuID, String oyuncuAdi, int skor, ArrayList<Sporcu> B_oyuncuDeck) {
        super(oyuncuID, oyuncuAdi, skor);
        this.B_oyuncuDeck = B_oyuncuDeck;
    }

    public Kullanıcı(int skor) {
        super("DefaultOyuncuID#0000", "DefaultOyuncuID", skor);
    }

    public Kullanıcı() {
        super();
    }

    @Override
    public Sporcu kartSec(int a) {
        System.out.println("Kacinci karti atmak istiyorsunuz [1-" + B_oyuncuDeck.size() + "]?");
        int kullaniciClass = 0;
        while (true) {
            kullaniciClass = a;
            if (kullaniciClass <= B_oyuncuDeck.size()) {
                break;
            } else {
                System.out.println("*********************************************************");
                System.out.println("Hatali deger girdiniz tekrar deneyiniz !");
                System.out.println("*********************************************************");
            }
        }
        return B_oyuncuDeck.get(kullaniciClass);
    }

    @Override
    public String kartCikar(Sporcu kart) {
        B_oyuncuDeck.remove(kart);
        return "";
    }

    @Override
    public int neKadarKaldi() {

        return B_oyuncuDeck.size();
    }

    @Override
    public String kartListesi() {
        System.out.println(getOyuncuID() + " OYUNCUSUNUN DESTESI");
        System.out.println("*********************************************************");
        for (int i = 0; i < B_oyuncuDeck.size(); i++) {
            System.out.println(B_oyuncuDeck.get(i).sporcuPuaniGoster());
        }
        System.out.println("*********************************************************");
        return "";
    }

    @Override
    public Sporcu desteGonder(int a) {
        return B_oyuncuDeck.get(a);
    }
}
