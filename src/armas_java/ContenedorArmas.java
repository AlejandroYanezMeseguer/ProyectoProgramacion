package armas_java;

import cargarArmas.*;
import jugador.TipoGuerrero;
import interfaces.IAcciones;

import java.sql.SQLException;

/**
 * clase que crea el contenedor de las armas
 */
public class ContenedorArmas {

    //Array bidimensional que guardas las armas
    public IAcciones[][] listaArmas = new IAcciones[3][9];

    /**
     * constructor de la clase ContenedorArmas en la que se le crean las armas a los diferentes jugadores en base a su tipo
     * @param tipoGuerrero
     */
    public ContenedorArmas(TipoGuerrero tipoGuerrero) {

        var Escudo = new CargarEscudos().cargar();

        //if que crea las armas de la clase guerrero
        if(tipoGuerrero == TipoGuerrero.Guerrero) {

            var espadas = new CargarEspadas().cargar();
            var hachas = new CargarHachas().cargar();


            //for que recorre el array listaArmas creando las armas
            for (int i = 0; i < 3; i++) {

                for (int j = 0; j < 9; j++) {

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

        //if que crea las armas de la clase Samurai
        if(tipoGuerrero == TipoGuerrero.Samurai) {

            var armas = CargarArmasSamurai.cargar(TipoGuerrero.Samurai);

            //for que recorre el array listaArmas creando las armas
            for (int i = 0; i < 3; i++) {

                for (int j = 0; j < 8; j++) {

                    if (i == 0) {

                        listaArmas[i][j] = armas.get(j);
                    }
                    if (i == 1) {
                        listaArmas[i][j] = armas.get(j+8);
                    }
                    if (i == 2) {
                        listaArmas[i][j] = Escudo.get(j);
                    }
                }
            }
        }

        //if que crea las armas de la clase Mago
        if(tipoGuerrero == TipoGuerrero.Mago) {

            var Bastones = new CargarBastones().cargar();
            var Catalizadores = new CargarCatalizadores().cargar();

            //for que recorre el array listaArmas creando las armas
            for (int i = 0; i < 3; i++) {

                for (int j = 0; j < 9; j++) {

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
