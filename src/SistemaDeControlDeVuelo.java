public class SistemaDeControlDeVuelo {
    private String fabricante;
    private int nModos;
    private String tipo ;

    public SistemaDeControlDeVuelo(String fabricante, int nModos) {
        this.fabricante = fabricante;
        this.nModos      = nModos;
        this.tipo        = "manual";
    }

    // 2) Constructor “completo”, recibe también el tipo
    public SistemaDeControlDeVuelo(String fabricante, int nModos, String tipo) {
        this.fabricante = fabricante;
        this.nModos      = nModos;
        this.tipo        = tipo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getnModos() {
        return nModos;
    }

    public void setnModos(int nModos) {
        this.nModos = nModos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void cambiarModo(String nuevoTipo) {
        if (!this.tipo.equalsIgnoreCase(nuevoTipo)) {
            this.tipo = nuevoTipo;
            System.out.println("Modo cambiado a " + this.tipo);
        }
    }


    @Override
    public String toString() {
        return "El sistema de control de vuelo tiene el modo " + nModos + "Con el tipo" +  tipo;
    }
}
