package Model.DAO;

import Model.VO.VO_ClsCuadrado;

/**
 *
 * @author True Origins
 */
public class DAO_ClsCuadrado {

    private double Area;
    private double Perimetro;

    public String Area(VO_ClsCuadrado A) {
        Area = 0;
        Area = A.getLado() * A.getLado();
        return "El área del Cuadrado es: " + Area;
    }

    public String Perimetro(VO_ClsCuadrado A) {
        Perimetro = 0;
        Perimetro = A.getLado() * 4;
        return "El perímetro del Cuadrado es: " + Perimetro;
    }

    public String Descripcion() {
        return "La figura es un Cuadrado";
    }
}
