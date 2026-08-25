package Enunciado_00;

public class Temperatura {
    float magnitud;

    String unidad;

    public Temperatura(float magnitud, String unidad) throws Exception {
        if (!unidad.equals("C") && !unidad.equals("F")) {
            throw new Exception("La unidad debe ser C o F");
        }
        if (magnitud < -273.15 && unidad.equals("C")) {
            throw new Exception("La magnitud no debe ser inferior a -273.15");
        }
        this.magnitud = magnitud;
        this.unidad = unidad;
    }

    public void mostrar() {
        System.out.println(magnitud + " " + unidad);
    }

    @Override
    public String toString() {
        return this.magnitud + " °" + this.unidad;
    }

    public float getCelcius() {
        if (unidad.equals("C")) {
            return magnitud;
        } else {
            return (magnitud - 32) / 1.8f;
        }
    }

    public float getFahrenheit() {
        if (unidad.equals("C")) {
            return magnitud * 1.8f + 32;
        } else {
            return magnitud;
        }
    }

}