package Principal;

import Logica.Expendedor;

import javax.swing.*;
import java.awt.*;

/*Clase BotonesItems encargada del desarrollo de botones e imagen para la elección del producto*/

public class BotonesItems extends JPanel {
    private RadioButtonConImagen sprite;
    private RadioButtonConImagen coca;
    private RadioButtonConImagen snickers;
    private RadioButtonConImagen super8;
    private RadioButtonConImagen fanta;

    private ButtonGroup group;

    /*Método constructor clase Principal.BotonesItems*/
    public BotonesItems(){
        sprite = new RadioButtonConImagen("res/sprite.png", 100, 100);
        coca = new RadioButtonConImagen("res/coca.png", 100, 100);
        fanta = new RadioButtonConImagen("res/fanta.png",100,100);
        snickers = new RadioButtonConImagen("res/snickers.png", 100, 100);
        super8 = new RadioButtonConImagen("res/super8.png", 100, 100);

        this.setLayout(new GridLayout(2, 2));

        this.add(coca);
        this.add(sprite);
        this.add(fanta);
        this.add(snickers);
        this.add(super8);

        group = new ButtonGroup();

        sprite.addButtonGroup(group);
        coca.addButtonGroup(group);
        fanta.addButtonGroup(group);
        snickers.addButtonGroup(group);
        super8.addButtonGroup(group);
    }

    public int idDelProductoSeleccionado(){
        if(sprite.isSelected()){
            return Expendedor.SPRITE;
        }
        else if(fanta.isSelected()){
            return Expendedor.FANTA;
        }
        else if(coca.isSelected()){
            return Expendedor.COCA;
        }
        else if(snickers.isSelected()){
            return Expendedor.SNICKERS;
        }
        else if(super8.isSelected()){
            return Expendedor.SUPER8;
        }

        else{
            return -1;
        }
    }
}
