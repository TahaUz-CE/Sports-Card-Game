package prolab2;

public class Futbolcu extends Sporcu {

    private int penalti;
    private int serbestAtis;
    private int kaleciKarsiKarsiya;
    private boolean kartKullanildiMi;

    public Futbolcu(String sporcuIsim, String sporcuTakim, int penalti, int serbestAtis, int kaleciKarsiKarsiya) {
        super(sporcuIsim, sporcuTakim);
        this.penalti = penalti;
        this.serbestAtis = serbestAtis;
        this.kaleciKarsiKarsiya = kaleciKarsiKarsiya;
    }

    public Futbolcu() {
        super();
        this.penalti = 0;
        this.serbestAtis = 0;
        this.kaleciKarsiKarsiya = 0;
    }

    @Override
    public int getPenalti() {
        return penalti;
    }

    public void setPenalti(int penalti) {
        this.penalti = penalti;
    }

    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }

    public void setKaleciKarsiKarsiya(int kaleciKarsiKarsiya) {
        this.kaleciKarsiKarsiya = kaleciKarsiKarsiya;
    }

    public void setKartKullanildiMi(boolean kartKullanildiMi) {
        this.kartKullanildiMi = kartKullanildiMi;
    }

    @Override
    public int getSerbestAtis() {
        return serbestAtis;
    }

    @Override
    public int getKaleciKarsiKarsiya() {
        return kaleciKarsiKarsiya;
    }

    @Override
    public String SporTuru() {
        return "Futbolcu";
    }

    @Override
    public String sporcuPuaniGoster() {
        super.sporcuPuaniGoster();
        this.kartKullanildiMi = true;
        System.out.println("Penalti : " + this.penalti + "\nSerbest Atıs : " + this.serbestAtis + "\nKaleci ile karsi karsiya : " + this.kaleciKarsiKarsiya);

        return "";
    }
}
