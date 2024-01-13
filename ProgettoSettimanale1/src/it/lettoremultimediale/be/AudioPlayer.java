package it.lettoremultimediale.be;

import it.lettoremultimediale.be.ClassiAstratte.ElementoAudio;
import it.lettoremultimediale.be.Interfacce.InterfacciaPlay;
import it.lettoremultimediale.be.Interfacce.InterfacciaVolume;

public class AudioPlayer extends ElementoAudio implements InterfacciaPlay, InterfacciaVolume {

    public AudioPlayer(String titolo, int durata, int volume) {
        super(titolo, durata, volume);
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println("! ".repeat(volume) + titolo);
        }
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
