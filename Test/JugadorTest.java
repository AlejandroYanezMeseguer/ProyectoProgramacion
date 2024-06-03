import armas_java.ContenedorArmas;
import jugador.Guerrero;
import jugador.Jugador;
import jugador.Posicion;
import jugador.TipoGuerrero;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JugadorTest{
    private Jugador jugador;
    private Posicion posicionArma;
    private Posicion posicionEscudo;

    @BeforeEach
    public void setUp() {
        // Se crea un jugador con valores arbitrarios
        jugador = new Jugador(10, 10, 10, 10, 10, 10, "Jugador");

        // Se crea un listener arbitrario
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
        // Se asigna el listener al jugador
        jugador.addActionListener(actionListener);

    }

    /**
     * Test para comprobar que el jugador cambia de arma correctamente correctamente
     */
    @Test
    public void changingWeaponUpdatesSelectedWeapon() {
        Posicion newWeaponPosition = new Posicion(1, 1);
        jugador.cambiarArma(newWeaponPosition, new ActionEvent(this, ActionEvent.ACTION_PERFORMED, null));
        assertEquals(newWeaponPosition, jugador.armasSeleccionadas[0]);
    }

    /**
     * Test para comprobar que el jugador cambia de escudo correctamente correctamente
     */
    @Test
    public void changingShieldUpdatesSelectedShield() {
        Posicion newShieldPosition = new Posicion(1, 1);
        jugador.cambiarEscudo(newShieldPosition, new ActionEvent(this, ActionEvent.ACTION_PERFORMED, null));
        assertEquals(newShieldPosition, jugador.armasSeleccionadas[1]);
    }

}
