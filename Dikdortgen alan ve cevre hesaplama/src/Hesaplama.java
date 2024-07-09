public class Hesaplama {

    private double uzunluk;
    private double genislik;


    public Hesaplama(double uzunluk, double genislik) {
        this.uzunluk = uzunluk;
        this.genislik = genislik;
    }


    public double getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(double uzunluk) {
        this.uzunluk = uzunluk;
    }

    public double getGenislik() {
        return genislik;
    }

    public void setGenislik(double genislik) {
        this.genislik = genislik;
    }

    public double alanHesapla() {
        return uzunluk * genislik;
    }


    public double cevreHesapla() {
        return 2 * (uzunluk + genislik);
    }
}
