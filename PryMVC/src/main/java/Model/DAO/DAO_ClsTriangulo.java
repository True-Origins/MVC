package Model.DAO;

import Model.VO.VO_ClsTriangulo;

/**
 *
 * @author True Origins
 */
public class DAO_ClsTriangulo {

    private double Area;
    private double Perimetro;

    public String Area(VO_ClsTriangulo C) {
        Area = 0;
        Area = C.getLBase() * C.getLAltura() / 2;
        return "El área del Triángulo es: " + Area;
    }

    public String Perimetro(VO_ClsTriangulo C) {
        Perimetro = 0;
        Perimetro = C.getLadoA() + C.getLBase() + C.getLadoC();
        return "El perímetro del Triángulo es: " + Perimetro;
    }

    public String Descripcion(VO_ClsTriangulo C) {
        String Res = "";
        if (C.getLadoA() == C.getLBase() && C.getLBase() == C.getLadoC()) {
            Res = "Equilatero";
        } else if (C.getLadoA() != C.getLBase() && C.getLBase() != C.getLadoC() && C.getLadoC() != C.getLadoA()) {
            Res = "Escaleno";
        } else {
            Res = "Isosceles";
        }
        return "La figura es un Triángulo " + Res;
    }
}
