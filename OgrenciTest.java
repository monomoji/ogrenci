public class OgrenciTest {
    public static void main(String[] args) {
        Ogrenci o1= new Ogrenci();
        Ogrenci o2= new Ogrenci("Pelin","Bilgisayar");
        Ogrenci o3= new Ogrenci("Selin","Bilgisayar","2017",2.5);
        System.out.println("Ogrenciler");
        System.out.println("OGR-1 " + o1.getAd()+ " "+ o1.getBolum() + " " + o1.getGano()+ " " + o1.getGirisYili());
        System.out.println("OGR-2 " + o2.getAd()+ " "+ o2.getBolum() + " " + o2.getGano()+ " " + o2.getGirisYili());
        System.out.println("OGR-3 " + o3.getAd()+ " "+ o3.getBolum() + " " + o3.getGano()+ " " + o3.getGirisYili());
        System.out.println("OGR-1 ogrNo "+o1.OgrNoHesapla());
        System.out.println("OGR-3 ogrNo "+o3.OgrNoHesapla());

        System.out.println("OGR-1 Harc "+o1.HarcHesap(4));
        System.out.println("OGR-2 Harc "+o2.HarcHesaap(4,3));
    }

}