package Principal;

import Wrappers.PanelComprador;
import Wrappers.PanelExpendedor;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/*Clase PanelPrincipal establece un panel que albergará a los 2 paneles principales del programa: PanelComprador y PanelExpendedor*/

class PanelPrincipal extends JPanel {

    private PanelComprador com;
    private PanelExpendedor exp;

    /*Método constructor clase Principal.PanelPrincipal*/
    public PanelPrincipal(){

        exp = new PanelExpendedor(570, 50);
        com = new PanelComprador(exp);

        EmptyBorder espacio = new EmptyBorder(50,0,0,800);
        com.setBorder(espacio);
        this.add(com);

        this.add(exp);

        setVisible(true);
    }


    public void paint(Graphics g) {
        super.paint(g);
        exp.paint(g);
        updateUI();
    }
}

