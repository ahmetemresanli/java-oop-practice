public class Otomobil extends Arac{
    private int kapiSayisi;
    public Otomobil(String marka, String model, Motor motor, int kapiSayisi){
        super(marka, model, motor);
        this.kapiSayisi = kapiSayisi;
    }

    @Override
    public void bilgiGoster() {
        super.bilgiGoster();
        System.out.println("Kapı Sayısı :" + this.kapiSayisi);
    }

    public int getKapiSayisi() {
        return kapiSayisi;
    }

    public void setKapiSayisi(int kapiSayisi) {
        this.kapiSayisi = kapiSayisi;
    }
}
