package alarma;

import Interfaz.AgregarAlarma;
import Interfaz.Edad;
import Interfaz.Estado;
import Interfaz.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import alarma.TablaControl;
import alarma.CargarArchivos;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.time.LocalDateTime;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.applet.AudioClip;
import java.util.Date;

public class Mainn {

    public static void main(String[] args) {

        Edad llamadoedad = new Edad();
        CargarArchivos cargaarchivo = new CargarArchivos();
        Principal llamadoprincipal = new Principal();
        AgregarAlarma llamadoagreAlarma = new AgregarAlarma();
        Estado llamadoestado = new Estado();

        llamadoedad.setVisible(true);

        Thread hilo1 = new Procesos("temporalizador", llamadoprincipal);
        Thread hilo2 = new Procesos("reloj", llamadoprincipal);
        Thread hilo3 = new Procesos("buscar", llamadoprincipal);

//////////////////////////////////////////////////////////////////////////////
        //FORMULARIO EDAD
        llamadoedad.getBtbEdaIngreso().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ingreso();
            }

            void ingreso() {
                LocalDate fechaNac = LocalDate.parse(new SimpleDateFormat("dd/MM/yyyy").format(llamadoedad.getjCalendar1().getDate()), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                Period periodo = Period.between(fechaNac, LocalDate.now());
                int año = periodo.getYears();
                String tiempo;

                if (año < 0) {
                    JOptionPane.showMessageDialog(null, "Fecha ingresada no valida");
                } else {
                    if (año < 18) {
                        tiempo = "5";
                    } else {
                        tiempo = "30";
                    }

                    llamadoedad.setVisible(false);
                    llamadoprincipal.setVisible(true);
                    llamadoprincipal.getLblMosEdad().setText(año + "");
                    llamadoprincipal.getLblMosTiempo().setText(tiempo);
                    new Thread(hilo1).start();
                    busquedatba();
                    hilo2.start();
                    llamadoprincipal.getjTableAlarma().setModel(new TablaControl(cargaarchivo.getArrayalarmas()));

                }

            }

            public void busquedatba() {

                boolean estado = true;

                Thread hilo = new Thread() {
                    public void run() {
                        for (;;) {
                            if (estado == true) {
                                try {

                                    LocalDateTime tiempo = LocalDateTime.now();

                                    if (tiempo.getSecond() == 0) {
                                        String hora = String.valueOf(tiempo.getHour()).toString();
                                        String minuto = String.valueOf(tiempo.getMinute()).toString();

                                        ArrayList<Alarma> ala1 = (ArrayList<Alarma>) cargaarchivo.getArrayalarmas();
                                        ArrayList<Alarma> emplebus = new ArrayList<Alarma>();

                                        Alarma e1 = new Alarma(null, verdia(), hora, minuto, null, "Activado");
                                       

                                        boolean existe = ala1.contains(e1);

                                        if (existe) {
                                            int indice = ala1.indexOf(e1);
                                            
                                            if (indice != -1) {
                                                emplebus.add(ala1.get(indice));

                                                llamadoprincipal.getjTableMosAlarma().setModel(new TablaControl(emplebus));
                                               
                                                int conta = ala1.get(indice).getSonido().length();

                                                AudioClip sonido;

                                                if (conta == 5) {
                                                    sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/Ahiva.wav"));
                                                    sonido.play();
                                                } else if (conta == 6) {
                                                    sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/Botella.wav"));
                                                    sonido.play();
                                                    System.out.println(ala1.get(indice).getSonido() + "jmkmnd");

                                                } else if (conta == 7) {
                                                    sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/Sirena.wav"));
                                                    sonido.play();
                                                }

                                                llamadoprincipal.getTxtMostrarMiAlarma().setText("Alarma Sonada");
                                                llamadoprincipal.getTxtMostrarDetaAla().setText("Nombre Alarma: "+ala1.get(indice).getNombre().replace("_", " "));

                                            } else {

                                            }
                                        }

                                    }

                                    if (tiempo.getSecond() == 5) {
                                        llamadoprincipal.getTxtMostrarMiAlarma().setText("_________");
                                        llamadoprincipal.getTxtMostrarDetaAla().setText(" ");
                                    }

                                    sleep(1000);

                                } catch (Exception e) {

                                }
                            } else {
                                break;
                            }
                        }
                    }
                };
                hilo.start();
            }

            public String verdia() {
                Date fecha = new Date();
                int a = fecha.getDay();
                String dias = "";
                switch (a) {
                    case 1:
                        dias = "Lunes";
                        break;
                    case 2:
                        dias = "Martes";
                        break;
                    case 3:
                        dias = "Miercoles";
                        break;
                    case 4:
                        dias = "Jueves";
                        break;
                    case 5:
                        dias = "Viernes";
                        break;
                    case 6:
                        dias = "Sabado";
                        break;
                    case 7:
                        dias = "Domingo";
                        break;

                }
                return dias;

            }

        });

        llamadoedad.getBtbEdaSalir().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null, "Gracias por usar nuestro sistema");
                llamadoedad.setVisible(false);
            }
        });

        ///////////////////////////////////////////////////////////////////////////////////////////////
        //FORMULARIO PRINCIPAL
        llamadoprincipal.getBtnNuevaAlarma().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                llamadoprincipal.setVisible(false);
                llamadoagreAlarma.setVisible(true);

            }
        });

        llamadoprincipal.getBtnEliminar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int c;
                try {
                    c = llamadoprincipal.getjTableAlarma().getSelectedRow();
                    cargaarchivo.getArrayalarmas().remove(c);
                    llamadoprincipal.getjTableAlarma().setModel(new TablaControl(cargaarchivo.getArrayalarmas()));
                    guardar();

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Favor escoja una fila");
                }

            }

            public void guardar() {
                File file = new File("C:\\Users\\Santiago\\Documents\\NetBeansProjects\\Alarma\\BaseAlarma.txt");
                PrintWriter Escribe;
                if (!file.exists()) {
                    try {
                        file.createNewFile();
                    } catch (Exception ex) {
                    }
                }
                try {
                    Alarma aux;
                    Escribe = new PrintWriter(file, "utf-8");

                    for (int i = 0; i < cargaarchivo.getArrayalarmas().size(); i++) {

                        aux = cargaarchivo.getArrayalarmas().get(i);
                        aux.guardar(Escribe);

                    }
                    Escribe.close();
                } catch (Exception ex) {
                }

            }
        });

        llamadoprincipal.getBtnSalirPrincipal().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                llamadoprincipal.setVisible(false);

            }
        });

        llamadoprincipal.getBtnModificar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                llamadoestado.setVisible(true);

            }
        });

        ////////////////////////////////////////////////////////////////////////////////////////
        //FORMULARIO AGREGAR ALARMA
        llamadoagreAlarma.getBtnRegresarAgreAla1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                llamadoagreAlarma.setVisible(false);
                llamadoprincipal.setVisible(true);

            }
        });

        llamadoagreAlarma.getBtnGuardarAgreAla().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    FileWriter guainf = new FileWriter("C:\\Users\\Santiago\\Documents\\NetBeansProjects\\Alarma\\BaseAlarma.txt", true);
                    guainf.write(llamadoagreAlarma.getTxtNombreAlm().getText().replace(" ", "_") + " " + llamadoagreAlarma.getCboDia().getSelectedItem().toString() + " " + llamadoagreAlarma.getCboHora().getSelectedItem().toString() + " " + llamadoagreAlarma.getCboMinuto().getSelectedItem().toString() + " " + llamadoagreAlarma.getCboSonido().getSelectedItem().toString() + " " + llamadoagreAlarma.getCboEstado().getSelectedItem().toString() + '\n');
                    guainf.close();
                    JOptionPane.showMessageDialog(null, "Se agregado Correctamente");
                    CargarArchivos a1 = new CargarArchivos();
                    llamadoprincipal.getjTableAlarma().setModel(new TablaControl(a1.getArrayalarmas()));

                } catch (IOException ex) {
                    //Logger.getLogger(Escribiendo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });

        ///////////////////////////////////////////////
        llamadoestado.getBtnEstadoGuardar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Alarma aux;
                int c;
                String estadoc;
                try {
                    c = llamadoprincipal.getjTableAlarma().getSelectedRow();
                    aux = cargaarchivo.getArrayalarmas().get(c);
                    estadoc = llamadoestado.getCboopcionmo().getSelectedItem().toString();
                    aux.setEstado(estadoc);
                    guardar();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Escoger una fila");
                }
                llamadoprincipal.getjTableAlarma().setModel(new TablaControl(cargaarchivo.getArrayalarmas()));
                llamadoestado.setVisible(false);

            }

            public void guardar() {

                File file = new File("C:\\Users\\Santiago\\Documents\\NetBeansProjects\\Alarma\\BaseAlarma.txt");
                PrintWriter Escribe;
                if (!file.exists()) {
                    try {
                        file.createNewFile();
                    } catch (Exception ex) {

                    }
                }
                try {
                    Alarma aux;
                    Escribe = new PrintWriter(file, "utf-8");

                    for (int i = 0; i < cargaarchivo.getArrayalarmas().size(); i++) {

                        aux = cargaarchivo.getArrayalarmas().get(i);
                        aux.guardar(Escribe);

                    }
                    Escribe.close();
                } catch (Exception ex) {

                }

            }
        });

    }

}
