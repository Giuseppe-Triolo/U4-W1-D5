package it.lettoremultimediale.be.ClassiAstratte;

import it.lettoremultimediale.be.Interfacce.InterfacciaLuminosità;
import it.lettoremultimediale.be.Interfacce.InterfacciaVolume;

public abstract class ElementoVideo extends ElementoMedia implements InterfacciaLuminosità, InterfacciaVolume {
    protected int volume;
    protected int luminosità;

    protected int durata;

    public ElementoVideo(String titolo, int durata, int volume, int luminosità){
        super(titolo);
        if(volume > MAX_VOLUME){
            System.out.println("il volume è già al massimo !");
            this.volume = MAX_VOLUME;
        } else {
            this.volume = volume;
        };
        if(luminosità > MAX_LUMINOSITÀ){
            System.out.println("la luminosità è già al massimo !");
            this.luminosità = MAX_LUMINOSITÀ;
        } else {
            this.luminosità = luminosità;
        };
        this.durata = durata;

    }


}
