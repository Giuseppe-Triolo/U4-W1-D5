package it.lettoremultimediale.be.ClassiAstratte;

import it.lettoremultimediale.be.Interfacce.InterfacciaVolume;

public abstract class ElementoAudio extends ElementoMedia implements InterfacciaVolume {
    protected int volume;
    protected int durata;
    public ElementoAudio(String titolo, int durata, int volume){
        super(titolo);
        if(volume > MAX_VOLUME){
            System.out.println("il volume è già al massimo!");
            this.volume = MAX_VOLUME;
        } else {
            this.volume = volume;
        };
        this.durata = durata;

    }


}
