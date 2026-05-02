public class Arac {
    private String marka;
    private String model;
    private Motor motor;

    public Arac(String marka, String model, Motor motor) {
        this.marka = marka;
        this.model = model;
        this.motor = motor;
    }

    public void bilgiGoster(){
        System.out.println("--- Araç Bilgisi ---");
        System.out.println("Marka :" + this.marka);
        System.out.println("Model :" + this.model);
        System.out.println("Motor :" + this.motor.motorBilgisiGoster());
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
