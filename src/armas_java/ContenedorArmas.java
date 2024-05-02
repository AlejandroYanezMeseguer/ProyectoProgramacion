package armas_java;

import cargarArmas.*;
import jugador.TipoGuerrero;
import interfaces.IAcciones;

public class ContenedorArmas {

    public IAcciones[][] listaArmas = new IAcciones[3][8];

    public ContenedorArmas(TipoGuerrero tipoGuerrero){

        var Escudo = new CargarEscudos().cargar();

        if(tipoGuerrero == TipoGuerrero.Guerrero) {

            var espadas = new CargarEspadas().cargar();
            var hachas = new CargarHachas().cargar();

            for (int i = 0; i < 3; i++) {

                for (int j = 0; j < 8; j++) {

                    if (i == 0) {

                        listaArmas[i][j] = espadas.get(j);
                    }
                    if (i == 1) {
                        listaArmas[i][j] = hachas.get(j);
                    }
                    if (i == 2) {
                        listaArmas[i][j] = Escudo.get(j);
                    }
                }
            }
        }

        if(tipoGuerrero == TipoGuerrero.Samurai) {

            var Alabardas = new CargarAlabardas().cargar();
            var Katanas = new CargarKatanas().cargar();

            for (int i = 0; i < 3; i++) {

                for (int j = 0; j < 8; j++) {

                    if (i == 0) {

                        listaArmas[i][j] = Alabardas.get(j);
                    }
                    if (i == 1) {
                        listaArmas[i][j] = Katanas.get(j);
                    }
                    if (i == 2) {
                        listaArmas[i][j] = Escudo.get(j);
                    }
                }
            }
        }

        if(tipoGuerrero == TipoGuerrero.Mago) {

            var Bastones = new CargarBastones().cargar();
            var Catalizadores = new CargarCatalizadores().cargar();

            for (int i = 0; i < 3; i++) {

                for (int j = 0; j < 8; j++) {

                    if (i == 0) {

                        listaArmas[i][j] = Bastones.get(j);
                    }
                    if (i == 1) {
                        listaArmas[i][j] = Catalizadores.get(j);
                    }
                    if (i == 2) {
                        listaArmas[i][j] = Escudo.get(j);
                    }
                }
            }
        }

    }




}
