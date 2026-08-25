package Enunciado_01;

public class Main
{
    public static void main(String[] args)
    {
        Motor m1 = new Motor(1.2f, 10);
        Viaje v1 = new Viaje(100, m1);

        System.out.println("El consumo es de: " + v1.obtenerConsumoTotal());

    }
}
