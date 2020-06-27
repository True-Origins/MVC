package Controlador;

import Model.DAO.DAO_ClsCuadrado;
import Model.DAO.DAO_ClsRectangulo;
import Model.DAO.DAO_ClsTriangulo;
import Model.VO.VO_ClsCuadrado;
import Model.VO.VO_ClsRectangulo;
import Model.VO.VO_ClsTriangulo;
import Vista.FrmFigura;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Ctrl_ClsFigura implements ActionListener {

    FrmFigura Fig;
    VO_ClsCuadrado Cuadrado;
    VO_ClsRectangulo Rectangulo;
    VO_ClsTriangulo Triangulo;
    DAO_ClsCuadrado Quad;
    DAO_ClsRectangulo Rect;
    DAO_ClsTriangulo Tria;

    public Ctrl_ClsFigura(FrmFigura Fig,
            VO_ClsCuadrado Cuadrado,
            VO_ClsRectangulo Rectangulo,
            VO_ClsTriangulo Triangulo,
            DAO_ClsCuadrado Quad,
            DAO_ClsRectangulo Rect,
            DAO_ClsTriangulo Tria) {
        this.Fig = Fig;
        this.Cuadrado = Cuadrado;
        this.Rectangulo = Rectangulo;
        this.Triangulo = Triangulo;
        this.Quad = Quad;
        this.Rect = Rect;
        this.Tria = Tria;

        this.Fig.btnCalcular.addActionListener(this);
        this.Fig.cmbFiguras.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                GG();
            }
        });

    }

    public void GG() {
        if ("Cuadrado".equals(Fig.cmbFiguras.getSelectedItem().toString())) {
            Fig.jLabel1.setVisible(true);
            Fig.jLabel3.setVisible(false);
            Fig.jLabel8.setVisible(false);
            Fig.lblaltura.setVisible(false);
            Fig.txtL1.setVisible(true);
            Fig.txtL2.setVisible(false);
            Fig.txtL3.setVisible(false);
            Fig.txtL4.setVisible(false);
            Fig.txtL1.setText("");
            Fig.txtL2.setText("");
            Fig.txtL3.setText("");
            Fig.txtL4.setText("");
        } else if ("Rectángulo".equals(Fig.cmbFiguras.getSelectedItem().toString())) {
            Fig.jLabel1.setVisible(true);
            Fig.jLabel3.setVisible(true);
            Fig.jLabel8.setVisible(false);
            Fig.lblaltura.setVisible(false);
            Fig.txtL1.setVisible(true);
            Fig.txtL2.setVisible(true);
            Fig.txtL3.setVisible(false);
            Fig.txtL4.setVisible(false);
            Fig.txtL1.setText("");
            Fig.txtL2.setText("");
            Fig.txtL3.setText("");
            Fig.txtL4.setText("");
        } else if ("Triángulo".equals(Fig.cmbFiguras.getSelectedItem().toString())) {
            Fig.jLabel1.setText("Base");
            Fig.jLabel3.setText("Lado 2");
            Fig.lblaltura.setText("Altura");
            Fig.jLabel1.setVisible(true);
            Fig.jLabel3.setVisible(true);
            Fig.jLabel8.setVisible(true);
            Fig.lblaltura.setVisible(true);
            Fig.txtL1.setVisible(true);
            Fig.txtL2.setVisible(true);
            Fig.txtL3.setVisible(true);
            Fig.txtL4.setVisible(true);
            Fig.txtL1.setText("");
            Fig.txtL2.setText("");
            Fig.txtL3.setText("");
            Fig.txtL4.setText("");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Cuadrado".equals(Fig.cmbFiguras.getSelectedItem().toString())) {
            Cuadrado();
        } else if ("Rectángulo".equals(Fig.cmbFiguras.getSelectedItem().toString())) {
            Rectangulo();
        } else if ("Triángulo".equals(Fig.cmbFiguras.getSelectedItem().toString())) {
            Triangulo();
        }
    }

    public void Cuadrado() {
        this.Cuadrado.setLado(Double.parseDouble(this.Fig.txtL1.getText()));
        this.Fig.txtArea.setText(this.Quad.Area(Cuadrado));
        this.Fig.txtPerimetro.setText(this.Quad.Perimetro(Cuadrado));
        this.Fig.txtDetalles.setText(this.Quad.Descripcion());
    }

    public void Rectangulo() {
        this.Rectangulo.setLBase(Double.parseDouble(this.Fig.txtL1.getText()));
        this.Rectangulo.setLAltura(Double.parseDouble(this.Fig.txtL2.getText()));
        this.Fig.txtArea.setText(this.Rect.Area(Rectangulo));
        this.Fig.txtPerimetro.setText(this.Rect.Perimetro(Rectangulo));
        this.Fig.txtDetalles.setText(this.Rect.Descripcion());
    }

    public void Triangulo() {
        this.Triangulo.setLBase(Double.parseDouble(this.Fig.txtL1.getText()));
        this.Triangulo.setLadoA(Double.parseDouble(this.Fig.txtL2.getText()));
        this.Triangulo.setLadoC(Double.parseDouble(this.Fig.txtL3.getText()));
        this.Triangulo.setLAltura(Double.parseDouble(this.Fig.txtL4.getText()));
        this.Fig.txtArea.setText(this.Tria.Area(Triangulo));
        this.Fig.txtPerimetro.setText(this.Tria.Perimetro(Triangulo));
        this.Fig.txtDetalles.setText(this.Tria.Descripcion(Triangulo));
    }
}
