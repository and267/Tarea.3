package Wrappers;

import Logica.*;

import javax.swing.*;
import java.awt.*;

/*Clase PanelProducto encargada de dar forma a cada uno de los productos que estarán a la venta*/

public class PanelProducto extends JPanel {

    private String path;
    private Point pos;
    private Image image;

    /*Método constructor clase Wrappers.PanelProducto
     * @param x primero int
     * @param y segundo int
     * @param type tercero int
     */
    PanelProducto(int x, int y, int type){
        pos = new Point(x, y);

        path = "";
        switch (type) {
            case Expendedor.COCA -> path = "res/coca.png";
            case Expendedor.SPRITE -> path = "res/sprite.png";
            case Expendedor.FANTA -> path = "res/fanta.png";
            case Expendedor.SNICKERS -> path = "res/snickers.png";
            case Expendedor.SUPER8 -> path = "res/super8.png";
            case 100 -> path = "res/100.png";

            default -> System.out.println("Error al cargar imagen");
        }
        image = new ImageIcon(path).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(image, pos.x, pos.y, this);
    }
}
