package it.lettoremultimediale.be;

import it.lettoremultimediale.be.ClassiAstratte.ElementoVideo;
import it.lettoremultimediale.be.Interfacce.InterfacciaLuminosità;
import it.lettoremultimediale.be.Interfacce.InterfacciaPlay;
import it.lettoremultimediale.be.Interfacce.InterfacciaVolume;

public class VideoPlayer extends ElementoVideo implements InterfacciaPlay, InterfacciaVolume, InterfacciaLuminosità {

    public VideoPlayer(String titolo, int durata, int volume, int luminosità){
        super(titolo, durata, volume, luminosità);
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            printRepeatedCharacter("!", volume);
            printRepeatedCharacter("*", luminosità);
            System.out.println(" " + titolo);
        }
    }

    private void printRepeatedCharacter(String character, int count) {
        for (int j = 0; j < count; j++) {
            System.out.print(character);
        }
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
    public void abbassaVolume() {
        volume = Math.max(volume - 1, MIN_VOLUME);
    }

    @Override
    public void alzaVolume() {
        volume = Math.min(volume + 1, MAX_VOLUME);
    }

    @Override
    public void playMedia() {
        play();
    }
}

