import com.sun.source.doctree.AuthorTree;

public class EjemploAutomovil {
    public static void main(String[] args) {

        /* CREACIÓN DE INSTANCIA DEL OBJETO -> CREARÁ UNA REFERENCIA INICIALIZANDO LAS VARIABLES
        Y LO GUARDARÁ A MODO DE PUNTERO, ES DECIR SE GUARDARÁ LA REFERENCIA , PERO NO SE GUARDARÁ
        EL OBJETO COMO TAL
        */

        Automovil auto = new Automovil(); // -> aquí solo se inicializan los atributos pero pueden ir cambiando.
        // acceder al atributo (nombre objeto -> nombre atributo ) / pero esto es algo que rompe el principio de POO
        // ya que nosotros queremos proteger estos atributos para que nadie nos los cambie , que sólo puedan cambiarse a través de métodos GET Y SET, etc.. para ello
        // solución: hacer nuestros atributos privados.

        auto.fabricante = "Subaru";
        auto.modelo="Impreza";
        auto.cilindrada = 2.0;
        auto.color = "Blanco";

        // también podemos darle unos valores a nuestros atributos desde aquí , en caso de que no sean privados, pero esto no sería correcto, ya
        // que se pueden tocar desde cualquier lado. -> esto referenciaría a un objeto de la clase, no a todos; es decir
        // así definimos las cualidades de un objeto de la clase pero no las definimos para todos como si lo hiciesemos desde la propia clase.

        System.out.println("auto.fabricante = " + auto.fabricante);
        System.out.println("auto.modelo = " + auto.modelo);
        System.out.println("auto.color = " + auto.color);
        System.out.println("auto.cilindrada = " + auto.cilindrada);

        // como al principio no hemos inicializado los valores lo que pasará es que saldrá por defecto 0 y null.
        // pero esto como repito no es lo correcto ya que cualquiera puede acceder a nuestros atributos y alterarlos de cualquier forma.

        Automovil auto2 = new Automovil();
        // aquí creamos el objeto sin ni si quiera definir sus atributos como arriba hemos hecho y se crearan cómo lo hemos hecho por defecto
        // en la clase, con los valores que le hemos asignado en la propia clase.
        System.out.println("auto2.fabricante = " + auto2.fabricante);
        System.out.println("auto2.modelo = " + auto2.modelo);
        System.out.println("auto2.color = " + auto2.color);
        System.out.println("auto2.cilindrada = " + auto2.cilindrada);

        Automovil auto3 = new Automovil();

        auto3.fabricante = "Mazda";
        auto3.modelo="BT-50";
        auto3.cilindrada = 3.0;
        auto3.color = "Rojo";

        System.out.println("mazda.fabricante = " + auto3.fabricante);
        System.out.println("mazda.modelo = " + auto3.modelo);
        System.out.println("mazda.color = " + auto3.color);
        System.out.println("mazda.cilindrada = " + auto3.cilindrada);

    }
}
