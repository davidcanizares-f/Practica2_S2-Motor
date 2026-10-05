package negocio;

public class MainMotor {
    public static void main() {
        Motor motor1 = new Motor();
        motor1.nombre = "Motor de banda transportadora";
        motor1.potencia = 5.5;
        motor1.velocidad = 1450;
        motor1.encendido = false;

        Motor motor2 = new Motor();
        motor2.nombre = "Motor de bomba de agua";
        motor2.potencia = 3.0;
        motor2.velocidad = 1750;
        motor2.encendido = false;

        Motor motor3 = new Motor();
        motor3.nombre = "Motor de ventilador";
        motor3.potencia = 1.5;
        motor3.velocidad = 900;
        motor3.encendido = false;


        System.out.println("=== INFORMACIÓN INICIAL ===");
        motor1.mostrarInformacion();
        motor2.mostrarInformacion();
        motor3.mostrarInformacion();

        System.out.println("==== Encender Motores ====");
        motor2.encender();
        motor1.mostrarEstado();
        motor2.mostrarEstado();
        motor3.mostrarEstado();

        System.out.println("\n=== Apagar Motores ===");
        motor2.apagar();
        motor1.mostrarEstado();
        motor2.mostrarEstado();
        motor3.mostrarEstado();
    }

}
