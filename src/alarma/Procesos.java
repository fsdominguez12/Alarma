package alarma;

import Interfaz.Principal;
import static java.lang.Thread.sleep;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Procesos extends Thread {

    private Principal miPrincipal;
    private CargarArchivos miArchivo;

    boolean ejecucion = true;
    private LocalDateTime tiempo;

    public Procesos(String name, Principal miPrincipal) {
        super(name);
        this.miPrincipal = miPrincipal;
    }

    @Override
    public void run() {
        switch (getName()) {
            case "temporalizador":
                Cronometro();
                break;

            case "reloj":
                reloj();
                break;

            case "buscar":
                Busqueda();
                break;
        }
    }

    private void Cronometro() {

        int minutos = Integer.parseInt(miPrincipal.getLblMosTiempo().getText());
        int segundos = 0;
        //int minutos = 0;
        //int segundos = 10;
        while (!interrupted() && ejecucion) {
            miPrincipal.getLblMosTiRestante().setText(+minutos + " : " + segundos);
            if (minutos != 0 || segundos != 0) {
                if (segundos == 0) {
                    segundos = 59;
                    minutos--;
                } else {
                    segundos--;
                }
            } else {
                miPrincipal.getLblMosTiRestante().setText("Tiempo Agotado");
                JOptionPane.showMessageDialog(null, "Gracias por usar nuestro sistema");
                ejecucion = false;
                miPrincipal.setVisible(false);
            }
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                //Logger.getLogger(Procesos.class.getName()).log(Level.SEVERE, null, ex);
                interrupt();
            }
        }
    }

    public void reloj() {
        while (true) {
            tiempo = LocalDateTime.now();
            miPrincipal.getLblReloj().setText(tiempo.getHour() + " : " + tiempo.getMinute() + " : " + tiempo.getSecond());
            try {
                sleep(1000);
            } catch (InterruptedException ex) {

            }

        }
    }

    public void Busqueda() {

        while (true) {
            
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Procesos.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

}
