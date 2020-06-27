package Controlador;

import Model.DAO.DAO_ClsCuadrado;
import Model.DAO.DAO_ClsRectangulo;
import Model.DAO.DAO_ClsTriangulo;
import Model.VO.VO_ClsCuadrado;
import Model.VO.VO_ClsRectangulo;
import Model.VO.VO_ClsTriangulo;
import Vista.FrmFigura;

public class ClsMain {

    public static void main(String[] args) {
        FrmFigura Fig = new FrmFigura();
        VO_ClsCuadrado Cuadrado = new VO_ClsCuadrado();
        VO_ClsRectangulo Rectangulo = new VO_ClsRectangulo();
        VO_ClsTriangulo Triangulo = new VO_ClsTriangulo();
        DAO_ClsCuadrado Quad = new DAO_ClsCuadrado();
        DAO_ClsRectangulo Rect = new DAO_ClsRectangulo();
        DAO_ClsTriangulo Tria = new DAO_ClsTriangulo();

        Ctrl_ClsFigura Ctrl = new Ctrl_ClsFigura(Fig, Cuadrado, Rectangulo, Triangulo, Quad, Rect, Tria);
        Fig.setVisible(true);
        Fig.jLabel3.setVisible(false);
        Fig.jLabel8.setVisible(false);
        Fig.lblaltura.setVisible(false);
        Fig.txtL2.setVisible(false);
        Fig.txtL3.setVisible(false);
        Fig.txtL4.setVisible(false);
    }

}
