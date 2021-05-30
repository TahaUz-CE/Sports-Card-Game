package prolab2;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        Futbolcu CristianoRonaldo = new Futbolcu("Cristiano Ronaldo", "Juventus", 95, 95, 95);
        Futbolcu LionelMessi = new Futbolcu("Lionel Messi", "Barcelona", 95, 95, 95);
        Futbolcu RobertLewandowski = new Futbolcu("Robert Lewandowski", "Bayern Münih", 86, 80, 90);
        Futbolcu AlexTelles = new Futbolcu("Alex Telles", "Manchester United", 81, 83, 86);
        Futbolcu AndrewRobertson = new Futbolcu("Andrew Robertson", "Liverpool", 82, 80, 87);
        Futbolcu HakanCalhanoglu = new Futbolcu("Hakan Calhanoglu", "Milan", 85, 91, 83);
        Futbolcu LukaModric = new Futbolcu("Luka Modric", "Real Madrid", 92, 95, 95);
        Futbolcu SergioAguero = new Futbolcu("Sergio Aguero", "Manchester City", 92, 89, 94);

        ArrayList<Futbolcu> futbolcuListe = new ArrayList<>();

        futbolcuListe.add(CristianoRonaldo);
        futbolcuListe.add(LionelMessi);
        futbolcuListe.add(RobertLewandowski);
        futbolcuListe.add(AlexTelles);
        futbolcuListe.add(AndrewRobertson);
        futbolcuListe.add(HakanCalhanoglu);
        futbolcuListe.add(LukaModric);
        futbolcuListe.add(SergioAguero);

        Basketbolcu LeBronJames = new Basketbolcu("LeBron James", "Los Angeles Lakers", 99, 95, 97);
        Basketbolcu KobeBryant = new Basketbolcu("Kobe Bryant", "Los Angeles Lakers", 98, 98, 98);
        Basketbolcu MichaelJordan = new Basketbolcu("Michael Jordan", "Chicago Bulls", 100, 100, 100);
        Basketbolcu StephenCurry = new Basketbolcu("Stephen Curry", "Golden State Warriors", 91, 99, 95);
        Basketbolcu JamesHarden = new Basketbolcu("James Harden", " Houston Rockets", 93, 96, 95);
        Basketbolcu KawhiLeonard = new Basketbolcu("Kawhi Leonard", "Los Angeles Clippers", 94, 94, 94);
        Basketbolcu PauGasol = new Basketbolcu("Pau Gasol", "Milwaukee Bucks", 90, 82, 87);
        Basketbolcu CediOsman = new Basketbolcu("Cedi Osman", "Cleveland Cavaliers", 90, 89, 87);

        ArrayList<Basketbolcu> basketbolcuListe = new ArrayList<>();

        basketbolcuListe.add(LeBronJames);
        basketbolcuListe.add(KobeBryant);
        basketbolcuListe.add(MichaelJordan);
        basketbolcuListe.add(StephenCurry);
        basketbolcuListe.add(JamesHarden);
        basketbolcuListe.add(KawhiLeonard);
        basketbolcuListe.add(PauGasol);
        basketbolcuListe.add(CediOsman);

        int j;

        int[] sayilar = {0, 1, 2, 3, 4, 5, 6, 7};
        int[] sayilar1 = {0, 1, 2, 3, 4, 5, 6, 7};

        ArrayList<Sporcu> A_oyuncuDeck = new ArrayList<>();
        ArrayList<Sporcu> B_oyuncuDeck = new ArrayList<>();

        //*************************************************************
        for (int i = 0; i < 8; i++) {

            j = (int) (Math.random() * 8);

            for (int l = 0; l < sayilar.length; l++) {

                if (sayilar[l] == j && A_oyuncuDeck.size() != 4) {
                    A_oyuncuDeck.add(basketbolcuListe.get(j));
                    sayilar[l] = -1;
                }

            }

        }

        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] != -1) {
                B_oyuncuDeck.add(basketbolcuListe.get(i));
            }
        }

        //*************************************************************
        for (int i = 0; i < 8; i++) {

            j = (int) (Math.random() * 8);

            for (int l = 0; l < sayilar1.length; l++) {

                if (sayilar1[l] == j && A_oyuncuDeck.size() != 8) {
                    A_oyuncuDeck.add(futbolcuListe.get(j));
                    sayilar1[l] = -1;
                }

            }

        }

        for (int i = 0; i < sayilar1.length; i++) {
            if (sayilar1[i] != -1) {
                B_oyuncuDeck.add(futbolcuListe.get(i));
            }
        }

        //*************************************************************
        int A_Skor = 0, B_Skor = 0;

        String kullaniciAd = "";
        Bilgisayar A_oyuncu = new Bilgisayar(A_Skor, A_oyuncuDeck);
        Kullanıcı B_oyuncu = new Kullanıcı(kullaniciAd + "#1346", kullaniciAd, B_Skor, B_oyuncuDeck);

        System.out.println(A_oyuncu.kartListesi());
        System.out.println(B_oyuncu.kartListesi());

        AnaMenu menu = new AnaMenu(A_oyuncu, B_oyuncu);
        menu.setVisible(true);

    }
}
