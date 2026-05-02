public class Motosiklet extends Arac{
    private boolean kaskVarMi;
    public Motosiklet(String marka, String model, Motor motor, boolean kaskVarMi) {
        super(marka, model, motor);
        this.kaskVarMi = kaskVarMi;
    }

    @Override
    public void bilgiGoster() {
        super.bilgiGoster();
        System.out.println("Kask Var mı :" + this.kaskVarMi);
    }

    public boolean isKaskVarMi() {
        return kaskVarMi;
    }

    public void setKaskVarMi(boolean kaskVarMi) {
        this.kaskVarMi = kaskVarMi;
    }
}
