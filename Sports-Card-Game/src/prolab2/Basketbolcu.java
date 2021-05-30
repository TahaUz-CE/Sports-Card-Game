package prolab2;

public class Basketbolcu extends Sporcu {

    private int ikilik;
    private int ucluk;
    private int serbestAtis;
    private boolean kartKullanildiMi;

    public Basketbolcu(String sporcuIsim, String sporcuTakim, int ikilik, int ucluk, int serbestAtis) {
        super(sporcuIsim, sporcuTakim);
        this.ikilik = ikilik;
        this.ucluk = ucluk;
        this.serbestAtis = serbestAtis;
    }

    public Basketbolcu() {
        super();
        this.ikilik = 0;
        this.ucluk = 0;
        this.serbestAtis = 0;
    }

    @Override
    public int getIkilik() {
        return ikilik;
    }

    @Override
    public int getUcluk() {
        return ucluk;
    }

    @Override
    public int getSerbestAtis() {
        return serbestAtis;
    }

    public void setIkilik(int ikilik) {
        this.ikilik = ikilik;
    }

    public void setUcluk(int ucluk) {
        this.ucluk = ucluk;
    }

    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }

    public void setKartKullanildiMi(boolean kartKullanildiMi) {
        this.kartKullanildiMi = kartKullanildiMi;
    }

    @Override
    public String SporTuru() {
        return "Basketbolcu";
    }

    @Override
    public String sporcuPuaniGoster() {
        super.sporcuPuaniGoster();
        this.kartKullanildiMi = true;
        System.out.println("Ikilik : " + this.ikilik + "\nUcluk : " + this.ucluk + "\nSerbest Atis : " + this.serbestAtis);

        return "";
    }
}
