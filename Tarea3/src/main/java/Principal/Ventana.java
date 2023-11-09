package Principal;

import javax.swing.*;
import java.awt.*;

/*Clase Ventana espacio bidimensional donde se proyectará el programa*/
class Ventana extends JFrame {
    private PanelPrincipal Pp; //Un panel para objetos gráficos

    Ventana(){
        this.setLayout(new BorderLayout());
        this.setTitle("Máquina Expendedora");
        Pp=new PanelPrincipal();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(Pp,BorderLayout.CENTER);
        this.setSize(1280,720);
        this.setVisible(true);
    }
}
