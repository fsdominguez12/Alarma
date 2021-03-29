package alarma;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

public class TablaControl extends AbstractTableModel {

    private List<Alarma> table;
    private int rowcount;
    private Object[][] objeto;

    public TablaControl(List<Alarma> table) {
        this.table = table;
        this.rowcount = table.size();
        objectos();
    }

    public TablaControl() {
    }
    
    

    public List<Alarma> getTable() {
        return table;
    }

    public void setTable(List<Alarma> table) {
        this.table = table;
    }

    public Object[][] getObjeto() {
        return objeto;
    }

    public void setObjeto(Object[][] objeto) {
        this.objeto = objeto;
    }

    @Override
    public int getRowCount() {
        return rowcount;
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return objeto[rowIndex][columnIndex];
    }

    public String getColumnName(int d) {
        return nombre[d];
    }

    public int getRowcount() {
        return rowcount;
    }

    public void setRowcount(int rowcount) {
        this.rowcount = rowcount;
    }

    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    public void objectos() {
        Object carac[][] = new Object[getRowcount()][6];
        for (int i = 0; i < table.size(); i++) {
            for (int j = 0; j < 6; j++) {
                if (j == 0) {
                    carac[i][j] = table.get(i).getNombre().replace("_", " ") + "";
                }
                if (j == 1) {
                    carac[i][j] = table.get(i).getDia() + "";
                }
                if (j == 2) {
                    carac[i][j] = table.get(i).getHora() + "";
                }
                if (j == 3) {
                    carac[i][j] = table.get(i).getMinuto() + "";
                }
                if (j == 4) {
                    carac[i][j] = table.get(i).getSonido() + "";
                }
                if (j == 5) {
                    carac[i][j] = table.get(i).getEstado() + "";
                }
            }
        }

        setObjeto(carac);
    }

    String nombre[] = {"Nombre", "Dia", "Hora", "Minutos", "Sonido", "Estado"};
}
