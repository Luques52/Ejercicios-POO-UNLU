package Enunciado_01;

public class Viaje
{
    private float kilo;
    private Motor motor;

    public Viaje (float kilo, Motor motor)
    {
        this.kilo = kilo;
        this.motor = motor;
    }

    public float obtenerConsumoTotal()
    {
        return motor.estimarConsumo(kilo);
    }
}
