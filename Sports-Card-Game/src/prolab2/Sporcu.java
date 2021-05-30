package prolab2;

public class Sporcu {

    private String sporcuIsim;
    private String sporcuTakim;

    public Sporcu(String sporcuIsim, String sporcuTakim) {
        this.sporcuIsim = sporcuIsim;
        this.sporcuTakim = sporcuTakim;
    }

    public Sporcu() {
        this.sporcuIsim = "Default sporcuIsim";
        this.sporcuTakim = "Default sporcuTakim";
    }
    
    public void setSporcuIsim(String sporcuIsim) {
        this.sporcuIsim = sporcuIsim;
    }

    public void setSporcuTakim(String sporcuTakim) {
        this.sporcuTakim = sporcuTakim;
    }
    
    public String sporcuPuaniGoster() {
        System.out.println("Sporcunun Adi : " + this.sporcuIsim 
                + "\nSporcunun Takimi : " + this.sporcuTakim);
        return "";
    }

    public String getSporcuIsim() {
        return sporcuIsim;
    }

    public String getSporcuTakim() {
        return sporcuTakim;
    }

    public int getPenalti() {
        return 0;
    }

    public int getSerbestAtis() {
        return 0;
    }

    public int getKaleciKarsiKarsiya() {
        return 0;
    }

    public int getIkilik() {
        return 0;
    }

    public int getUcluk() {
        return 0;
    }

    public String SporTuru() {
        return "";
    }
}
