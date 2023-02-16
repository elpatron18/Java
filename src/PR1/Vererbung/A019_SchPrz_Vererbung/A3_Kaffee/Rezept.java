package PR1.Vererbung.A019_SchPrz_Vererbung.A3_Kaffee;

public class Rezept {

    String name;

    ZutatenBehaelter wasser = new ZutatenBehaelter("Wasser");
    ZutatenBehaelter kaffee = new ZutatenBehaelter("Kaffee");
    ZutatenBehaelter kakao = new ZutatenBehaelter("Kakao");
    ZutatenBehaelter zucker = new ZutatenBehaelter("Zucker");
    ZutatenBehaelter milch = new ZutatenBehaelter("Milch");
    AbfallBehaelter abfall = new AbfallBehaelter();

    double wasserM;
    double kaffeeM;
    double kakaoM;
    double zuckerM;
    double milchM;

    public Rezept(String name, double wasserM, double kaffeeM, double kakaoM, double zuckerM, double milchM) {
        this.name = name;
        this.wasserM = wasserM;
        this.kaffeeM = kaffeeM;
        this.kakaoM = kakaoM;
        this.zuckerM = zuckerM;
        this.milchM = milchM;
    }
    public void getInfo(){
        System.out.println(this.name+" "+ this.wasserM +" "+ this.kaffeeM +" "+ this.kakaoM +" "+ this.zuckerM +" "+ this.milchM);
    }

    public void machen(){
        wasser.entfernen(wasserM);
        kaffee.entfernen(kaffeeM);
        kakao.entfernen(kakaoM);
        zucker.entfernen(zuckerM);
        milch.entfernen(milchM);

        abfall.fuell(kaffeeM);
    }
}
