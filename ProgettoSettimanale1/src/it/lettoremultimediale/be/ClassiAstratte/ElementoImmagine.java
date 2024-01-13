package it.lettoremultimediale.be.ClassiAstratte;

import it.lettoremultimediale.be.Interfacce.InterfacciaLuminosità;

public abstract class ElementoImmagine extends ElementoMedia implements InterfacciaLuminosità {
    protected int luminosità;

    public ElementoImmagine(String titolo, int luminosità){
        super(titolo);
        if(luminosità > MAX_LUMINOSITÀ){
            System.out.println("la luminosità è già al massimo!");
            this.luminosità = MAX_LUMINOSITÀ;
        } else {
            this.luminosità = luminosità;
        }
    }

//    public abstract void show();
}
