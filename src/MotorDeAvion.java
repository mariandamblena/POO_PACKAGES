// MotorDeAvion.java
public class MotorDeAvion {
    private String marca;
    private int hp;
    private double empuje;      // en libras
    private boolean encendido;

    public MotorDeAvion(String marca, int hp, double empuje) {
        this.marca    = marca;
        this.hp       = hp;
        this.empuje   = empuje;
        this.encendido = false;
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public int getHp() {
        return hp;
    }

    public double getEmpuje() {
        return empuje;
    }

    public boolean isEncendido() {
        return encendido;
    }

    // Métodos de comportamiento
    public void arrancar() {
        if (!encendido) {
            encendido = true;
        }
    }

    public void detener() {
        if (encendido) {
            encendido = false;
        }
    }

    @Override
    public String toString() {
        return String.format(
                "MotorDeAvion[marca=%s, hp=%d, empuje=%.1f lb, estado=%s]",
                marca, hp, empuje, (encendido ? "encendido" : "detenido")
        );
    }

    // Main de prueba
    public static void main(String[] args) {
        // Construir distintos motores
        MotorDeAvion m1 = new MotorDeAvion("RollsRoyce", 50000, 150000.0);
        MotorDeAvion m2 = new MotorDeAvion("Pratt & Whitney", 42000, 140000.0);
        MotorDeAvion m3 = new MotorDeAvion("GE Aviation", 60000, 160000.0);

        // Arrancarlos y mostrar fabricante + empuje
        m1.arrancar();
        System.out.println("Fabricante: " + m1.getMarca() + ", Empuje: " + m1.getEmpuje() + " lb\n");

        m2.arrancar();
        System.out.println("Fabricante: " + m2.getMarca() + ", Empuje: " + m2.getEmpuje() + " lb\n");

        m3.arrancar();
        System.out.println("Fabricante: " + m3.getMarca() + ", Empuje: " + m3.getEmpuje() + " lb\n");

        // Mostrar estado completo
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println();

        // Detenerlos
        m1.detener();
        m2.detener();
        m3.detener();
    }
}
