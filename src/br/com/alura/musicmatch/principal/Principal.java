package br.com.alura.musicmatch.principal;

import br.com.alura.musicmatch.modelos.MinhasPreferidas;
import br.com.alura.musicmatch.modelos.Musica;
import br.com.alura.musicmatch.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.setTitulo("Forever");
        musica1.setCantor("Kiss");

        for (int i = 0; i < 1000; i++) {
            musica1.reproduz();
        }

        for (int i = 0; i < 50; i++) {

        }

        Podcast podcast1 = new Podcast();
        podcast1.setTitulo("BolhaDev");
        podcast1.setApresentador("Marcus Mendes");

        for (int i = 0; i < 5000; i++) {
            podcast1.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            podcast1.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(musica1);
        preferidas.inclui(podcast1);
    }

}