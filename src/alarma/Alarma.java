package alarma;

import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class Alarma {

    private String nombre;
    private String dia;
    private String hora;
    private String minuto;
    private String sonido;
    private String estado;

    public Alarma() {
    }

    public Alarma(String nombre, String dia, String hora, String minuto, String sonido, String estado) {
        this.nombre = nombre;
        this.dia = dia;
        this.hora = hora;
        this.minuto = minuto;
        this.sonido = sonido;
        this.estado = estado;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMinuto() {
        return minuto;
    }

    public void setMinuto(String minuto) {
        this.minuto = minuto;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.dia);
        hash = 97 * hash + Objects.hashCode(this.hora);
        hash = 97 * hash + Objects.hashCode(this.minuto);
        hash = 97 * hash + Objects.hashCode(this.estado);

        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alarma other = (Alarma) obj;
        if (!Objects.equals(this.dia, other.dia)) {
            return false;
        }
        if (!Objects.equals(this.hora, other.hora)) {
            return false;
        }
        if (!Objects.equals(this.minuto, other.minuto)) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        return true;
    }

    void guardar(PrintWriter Escribe) {
        Escribe.println(nombre);
        Escribe.println(dia);
        Escribe.println(hora);
        Escribe.println(minuto);
        Escribe.println(sonido);
        Escribe.println(estado);
    }

    

}
