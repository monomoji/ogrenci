
public class Ogrenci {
    private String ad;
    private String bolum;
    private String girisYili;
    private String OgrenciNo;
    private double gano;
    private static final int bolumKodu=141;
    private static int sirano=0;

    public Ogrenci() {
        this(null,null,"1988",2.5);
    }

    public Ogrenci(String ad, String bolum) {
        this(ad,bolum,"1919",3.2);
    }

    public Ogrenci(String ad, String bolum, String girisYili, double gano) {
        if (gano<0||gano>4){
            throw new IllegalArgumentException("Gano hatalı!");
        }
        this.ad=ad;
        this.bolum=bolum;
        this.gano=gano;
        this.girisYili=girisYili;
    }

    public Ogrenci(Ogrenci ogrenci){
        this(ogrenci.ad, ogrenci.bolum,ogrenci.girisYili,ogrenci.gano);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getGirisYili() {
        return girisYili;
    }

    public void setGirisYili(String girisYili) {
        this.girisYili = girisYili;
    }

    public String getOgrenciNo() {
        return OgrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        OgrenciNo = ogrenciNo;
    }

    public double getGano() {
        if (gano<0 || gano>4) {
            throw new IllegalArgumentException("Gano hatalı!");

        }
        return gano;
    }

    public void setGano(double gano) {
        this.gano = gano;
    }

    public String OgrNoHesapla(){
        sirano++;
        if (sirano<10){
            OgrenciNo=""+girisYili+bolumKodu+"00"+sirano;
        }
        else if(sirano<100){
            OgrenciNo=""+girisYili+bolumKodu+"0"+sirano;
        }
        else
            OgrenciNo=OgrenciNo=""+girisYili+bolumKodu+sirano;
        return OgrenciNo;
    }
    public double HarcHesap(int derssayisi){
        double harc=derssayisi*120;
        return harc;
    }
    public double HarcHesaap(int derssayisi,int uzatmalar){
        double harc=derssayisi*120*uzatmalar;
        return harc;
    }



} 