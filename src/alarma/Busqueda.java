package alarma;

import Interfaz.Principal;
import java.util.ArrayList;
import alarma.Busqueda;

import javax.swing.JOptionPane;

public class Busqueda {
    private Principal miPrincipal;
    private CargarArchivos miArchivo;
    
    public void BusquedaDa() {
        
        ArrayList<Alarma> ala1 = (ArrayList<Alarma>) miArchivo.getArrayalarmas();
        ArrayList<Alarma> emplebus = new ArrayList<Alarma>();
        Alarma e1 = new Alarma(null, "Jueves", "4", "5", null, "Activado");
        boolean existe = ala1.contains(e1);

        if (existe) {
            int indice = ala1.indexOf(e1);
            if (indice != -1) {
                emplebus.add(ala1.get(indice));
                miPrincipal.getjTableMosAlarma().setModel(new TablaControl(emplebus));

            } else {

            }
        } else {
            JOptionPane.showMessageDialog(null, "No existe el objeto de Busqueda");
        }
    }
}
