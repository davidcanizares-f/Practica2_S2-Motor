package negocio;

public class Motor {
    public String nombre;
    public double potencia;
    double velocidad;
    boolean encendido;


    public void encender(){
        encendido=true;
        System.out.println("[!] El " + nombre + " ha sido encendido.");
    }

    public void mostrarInformacion(){
        String estado = encendido ? "Encendido" : "Apagado";;

        System.out.println("Motor: " + nombre);
        System.out.println("Potencia: " + potencia + " kW");
        System.out.println("Velocidad: " + velocidad + " rpm");
        System.out.println("Estado: " + estado);
        System.out.println("--------------------------\n");
    }

    void apagar(){
        encendido = false;
        velocidad = 0;
        System.out.println("[!] El " + nombre + " fue apagado.");
    }

    void mostrarEstado(){
        System.out.println("> " + nombre);
        if(encendido){
            System.out.println("\t -Estado: Encendido a " + velocidad + "rpm");
            System.out.println();
        } else {
            System.out.println("\t -Estado: Apagado");
            System.out.println();
        }

    }
}
