
public class Avion {
    private String marca;
    private String modelo;
    private MotorDeAvion motor;
    private SistemaDeControlDeVuelo sistemaControl;
    private Ala[] alas;
    private int nroAsientos;
    private boolean entretenimientoABordo;

    /**
     * Constructor completo de Avion.
     *
     * @param marca                  Marca del avión
     * @param modelo                 Modelo del avión
     * @param motor                  MotorDeAvion que impulsa el avión
     * @param sistemaControl         SistemaDeControlDeVuelo que gestiona los modos de vuelo
     * @param alas                   Array de objetos Ala (2 o más)
     * @param nroAsientos            Número de asientos en cabina
     * @param entretenimientoABordo  true si dispone de sistema de entretenimiento
     */
    public Avion(String marca,
                 String modelo,
                 MotorDeAvion motor,
                 SistemaDeControlDeVuelo sistemaControl,
                 Ala[] alas,
                 int nroAsientos,
                 boolean entretenimientoABordo) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.sistemaControl = sistemaControl;
        this.alas = alas.clone();
        this.nroAsientos = nroAsientos;
        this.entretenimientoABordo = entretenimientoABordo;
    }

    // Getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public MotorDeAvion getMotor() {
        return motor;
    }

    public void setMotor(MotorDeAvion motor) {
        this.motor = motor;
    }

    public SistemaDeControlDeVuelo getSistemaControl() {
        return sistemaControl;
    }

    public void setSistemaControl(SistemaDeControlDeVuelo sistemaControl) {
        this.sistemaControl = sistemaControl;
    }

    public Ala[] getAlas() {
        return alas.clone();
    }

    public void setAlas(Ala[] alas) {
        this.alas = alas.clone();
    }

    public int getNroAsientos() {
        return nroAsientos;
    }

    public void setNroAsientos(int nroAsientos) {
        this.nroAsientos = nroAsientos;
    }

    public boolean hasEntretenimientoABordo() {
        return entretenimientoABordo;
    }

    public void setEntretenimientoABordo(boolean entretenimientoABordo) {
        this.entretenimientoABordo = entretenimientoABordo;
    }

    @Override
    public String toString() {
        return String.format(
                "Avión %s %s:%n" +
                        "  Motor      = %s%n" +
                        "  Control    = %s (modos: %d)%n" +
                        "  # Alas     = %d%n" +
                        "  Asientos   = %d%n" +
                        "  Entretenim.= %s",
                marca, modelo,
                motor.getMarca(),
                sistemaControl.getTipo(), sistemaControl.getnModos(),
                alas.length,
                nroAsientos,
                entretenimientoABordo ? "Sí" : "No"
        );
    }
}
