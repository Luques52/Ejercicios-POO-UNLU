package Enunciado_01;

public class Motor
{
    private float cilindrada;
    private int eficiencia;
    private float consumo;

    public Motor(float cilindrada, int eficiencia)
    {
        this.cilindrada = cilindrada;
        this.eficiencia = eficiencia;
    }

    public float estimarConsumo(float distancia)
    {
        consumo = (float) ((cilindrada * 0.05 + eficiencia) * (distancia/100));
        return consumo;
    }
}
