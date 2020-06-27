package Model.DAO;

import Model.VO.VO_ClsRectangulo;

/**
 *
 * @author True Origins
 */
public class DAO_ClsRectangulo {

    private double Area;
    private double Perimetro;

    public String Area(VO_ClsRectangulo B) {
        Area = 0;
        Area = B.getLBase() * B.getLAltura();
        return "El área del Rectángulo es: " + Area;
    }

    public String Perimetro(VO_ClsRectangulo B) {
        Perimetro = 0;
        Perimetro = (B.getLBase() + B.getLAltura()) * 2;
        return "El perímetro del Rectángulo es: " + Perimetro;
    }

    public String Descripcion() {
        return "La figura es un Rectángulo";
    }
}
