package Enunciado_00;

public class ReporteMeteorologico {
    private Temperatura temperatura;
    private String ciudad;

    public ReporteMeteorologico(String ciudad, Temperatura temperatura) {
        this.temperatura = temperatura;
        this.ciudad = ciudad;
    }

    public String mostrarReporte() {
        return ciudad + ": " + temperatura;
    }
}
