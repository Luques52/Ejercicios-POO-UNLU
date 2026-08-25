package Enunciado_00;

public class Main {
    public static void main(String[] args) {
        try {
            Temperatura t1 = new Temperatura(21, "C");
            Temperatura t2 = new Temperatura(89.6f, "F");
            t1.mostrar();
            t2.mostrar();
            ReporteMeteorologico reporte = new ReporteMeteorologico("Buenos Aires", t1);
            ReporteMeteorologico reporte2 = new ReporteMeteorologico("Bogotá", t2);
            System.out.println(reporte.mostrarReporte());
            System.out.println(reporte2.mostrarReporte());
        } catch (Exception excepcion) {
            System.out.println( excepcion.getMessage());
        }
    }
}
