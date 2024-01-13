package it.lettoremultimediale.be;

import it.lettoremultimediale.be.ClassiAstratte.ElementoImmagine;
import it.lettoremultimediale.be.Interfacce.InterfacciaLuminosità;

public class ImagePlayer extends ElementoImmagine implements InterfacciaLuminosità {

    public ImagePlayer(String titolo, int luminosità) {
        super(titolo, luminosità);
    }

    public void show() {
        System.out.println("*".repeat(luminosità) + " " + titolo);
    }

    @Override
    public void diminuisciLuminosità() {
        luminosità = Math.max(luminosità - 1, MIN_LUMINOSITÀ);
    }

    @Override
    public void aumentaLuminosità() {
        luminosità = Math.min(luminosità + 1, MAX_LUMINOSITÀ);
    }

    @Override
    public void playMedia() {
        show();
    }
}
