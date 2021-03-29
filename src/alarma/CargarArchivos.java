package alarma;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class CargarArchivos {

    private List<Alarma> arrayalarmas;

    public static void main(String[] args) {

        CargarArchivos ar1 = new CargarArchivos();
        try {
            ar1.CaArchivos();
        } catch (IOException ex) {
            Logger.getLogger(CargarArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public CargarArchivos() {
        try {
            CaArchivos();
        } catch (IOException ex) {
            System.out.println("Archivo no disponible");
            Logger.getLogger(CargarArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Alarma> getArrayalarmas() {
        return arrayalarmas;
    }

    public void setArrayalarmas(List<Alarma> arrayalarmas) {
        this.arrayalarmas = arrayalarmas;
    }

    public void CaArchivos() throws FileNotFoundException, IOException {
        arrayalarmas = new ArrayList<Alarma>();
        BufferedReader buffer1 = new BufferedReader(new FileReader("C:\\Users\\Santiago\\Documents\\NetBeansProjects\\Alarma\\BaseAlarma.txt"));
        String linea = "";
        while (linea != null) {
            linea = buffer1.readLine();
            int i = 0;
            if (linea != null) {
                StringTokenizer st = new StringTokenizer(linea);
                Alarma alarma = new Alarma();
                while (st.hasMoreTokens()) {
                    if (i == 0) {
                        alarma.setNombre(st.nextToken());
                    } else if (i == 1) {
                        alarma.setDia(st.nextToken());
                    } else if (i == 2) {
                        alarma.setHora(st.nextToken());
                    } else if (i == 3) {
                        alarma.setMinuto(st.nextToken());
                    } else if (i == 4) {
                        alarma.setSonido(st.nextToken());
                    } else {
                        alarma.setEstado(st.nextToken());
                    }
                    i++;

                }
                arrayalarmas.add(alarma);
            }
        }

    }

}
