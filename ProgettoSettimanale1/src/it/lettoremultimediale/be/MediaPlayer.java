package it.lettoremultimediale.be;

import it.lettoremultimediale.be.ClassiAstratte.ElementoMedia;

import java.util.Scanner;

public class MediaPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementoMedia[] playlist = new ElementoMedia[5];

        for (int i = 0; i < 5; i++) {
            String numeroElemento = i < 5 ? new String[]{"primo", "secondo", "terzo", "quarto", "quinto"}[i] : "";
            System.out.println("Inserisci il " + numeroElemento + " elemento (1 = Audio, 2 = Video, 3 = Immagine): ");
            int tipoElemento = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Inserisci il titolo: ");
            String titolo = scanner.nextLine();

            switch (tipoElemento) {
                case 1:
                    System.out.println("Inserisci la durata dell'audio: ");
                    int durataAudio = scanner.nextInt();
                    System.out.println("Inserisci il livello del volume: ");
                    int volume = scanner.nextInt();
                    playlist[i] = new AudioPlayer(titolo, durataAudio, volume);
                    break;
                case 2:
                    System.out.println("Inserisci la durata del video: ");
                    int durataVideo = scanner.nextInt();
                    System.out.println("Inserisci il livello del volume del video: ");
                    int volumeVideo = scanner.nextInt();
                    System.out.println("Inserisci l'intensità della luminosità del video: ");
                    int luminosita = scanner.nextInt();
                    playlist[i] = new VideoPlayer(titolo, durataVideo, volumeVideo, luminosita);
                    break;
                case 3:
                    System.out.println("Inserisci l'intensità della luminosità dell'immagine: ");
                    int luminositaImmagine = scanner.nextInt();
                    playlist[i] = new ImagePlayer(titolo, luminositaImmagine);
                    break;
                default:
                    System.out.println("Tipo non riconosciuto, inserire nuovamente.");
                    i--;
                    break;
            }
        }

        int sceltaElemento;
        do {
            System.out.println("Inserisci il numero dell'elemento che vuoi eseguire (1-5, 0 per uscire): ");
            sceltaElemento = scanner.nextInt();
            if (sceltaElemento >= 1 && sceltaElemento <= 5) {
                playlist[sceltaElemento - 1].playMedia();
            } else if (sceltaElemento != 0) {
                System.out.println("Selezione non valida");
            }
        } while (sceltaElemento != 0);
    }
}
