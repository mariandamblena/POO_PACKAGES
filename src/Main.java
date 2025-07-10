 // Ajusta el paquete según donde hayas colocado tu clase Avion
public class Main {
    public static void main(String[] args) {
        // 1) Construyo las partes
        MotorDeAvion motor = new MotorDeAvion("RollsRoyce", 60000, 150000.0);
        SistemaDeControlDeVuelo scv = new SistemaDeControlDeVuelo("ACME FlightSys", 4);
        Ala ala1 = new Ala("10 m", "blanco", "aluminio");
        Ala ala2 = new Ala("10 m", "blanco", "aluminio");

        // 2) Ensamblar el avión
        Ala[] alas = new Ala[]{ ala1, ala2 };
        Avion boeing737 = new Avion(
                "Boeing",
                "737",
                motor,
                scv,
                alas,
                180,       // número de asientos
                true       // entretenimiento a bordo
        );

        // 3) Imprimo algunos valores significativos
        System.out.println("=== Datos del avión ===");
        System.out.println("Marca y modelo: "
                + boeing737.getMarca() + " " + boeing737.getModelo());
        System.out.println("Motor: "
                + motor.getMarca()
                + " | Empuje: " + motor.getEmpuje() + " lb");
        System.out.println("Control de vuelo: modo inicial = "
                + scv.getTipo()
                + " (modos disponibles: " + scv.getnModos() + ")");
        System.out.println("Cantidad de alas: " + boeing737.getAlas().length);
        System.out.println("Asientos: " + boeing737.getNroAsientos());
        System.out.println("Entretenimiento a bordo: "
                + (boeing737.hasEntretenimientoABordo() ? "Sí" : "No"));

        // 4) Simular comportamiento
        System.out.println("\n=== Simulación ===");
        motor.arrancar();
        scv.cambiarModo("pilotoAutomático");
        System.out.println("\nEstado final del avión:");
        System.out.println(boeing737);
    }
}
