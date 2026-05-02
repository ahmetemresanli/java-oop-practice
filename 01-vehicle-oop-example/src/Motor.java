public class Motor {
    private String motorTipi;
    private int beygirGucu;

    public Motor(String motorTipi, int beygirGucu) {
        this.motorTipi = motorTipi;
        this.beygirGucu = beygirGucu;
    }

    public String motorBilgisiGoster(){
        return this.getMotorTipi() + " - " + this.getBeygirGucu() + " HP";
    }

    public String getMotorTipi() {
        return motorTipi;
    }

    public void setMotorTipi(String motorTipi) {
        this.motorTipi = motorTipi;
    }

    public int getBeygirGucu() {
        return beygirGucu;
    }

    public void setBeygirGucu(int beygirGucu) {
        this.beygirGucu = beygirGucu;
    }
}
