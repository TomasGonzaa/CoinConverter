import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class Menu {
    String nombre = "";
    String divisa = "";
    String primerMoneda = "";
    String segundaMoneda = "";
    Scanner lectura = new Scanner(System.in);
    public void inicio(){
        System.out.println("""                
                    Seleccione la opción deseada:
                    .............................
                    1- Saber Tasa de Conversión.
                    2- Realizar Conversión.
                    3- Saber codigo Estándar Internacional ISO.
                    4- Salir.  
                    .............................
                    """);
    }
    public void firstMenu() throws IOException {
        int indice = 1;
        String historial= "";
        String nombreArchivo = "TazasConversion";
        while (true) {
            System.out.println("""
                Seleccione sobre qué pares quiere saber la taza de conversion:
                ..............................................................
                1- Euro -> Dólar
                2- Dólar -> Euro
                3- Dólar -> Dólar Canadiense
                4- Dólar Canadiense -> Dólar
                5- Peso Argentino -> Dólar
                6- Dólar -> Peso Argentino
                7- Crear archivo con Historial.
                8- Volver al Inicio.
                """);
            int choice = lectura.nextInt();
            switch (choice) {
                case 1:
                    primerMoneda = "EUR";
                    segundaMoneda = "USD";
                    break;
                case 2:
                    primerMoneda = "USD";
                    segundaMoneda = "EUR";
                    break;
                case 3:
                    primerMoneda = "USD";
                    segundaMoneda = "CAD";
                    break;
                case 4:
                    primerMoneda = "CAD";
                    segundaMoneda = "USD";
                    break;
                case 5:
                    primerMoneda = "ARS";
                    segundaMoneda = "USD";
                    break;
                case 6:
                    primerMoneda = "USD";
                    segundaMoneda = "ARS";
                    break;
                case 7:
                    Gson gson = new GsonBuilder().setPrettyPrinting().create();
                    FileWriter escritura = new FileWriter(nombreArchivo);
                    escritura.write(historial);
                    escritura.close();
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Opcion no valida, intente nuevamente...\n");
                    break;
            }if (choice <7) {
                Consulta consulta = new Consulta();
                Moneda moneda = consulta.tazaConversionPar(primerMoneda, segundaMoneda);
                String resultado = "La taza de conversión de " + primerMoneda + " con respecto a " + segundaMoneda + " es de: " + moneda.conversion_rate();
                System.out.println("................................................................\n" +
                        resultado + "\n" +
                        "................................................................\n");
                historial += indice + "- " + resultado + "\n";
                indice++;
            }if (choice == 8) {
                System.out.println("Volviendo al Inicio...\n");
                break;
            }
        }
    }

    public void secondMenu() throws IOException {
        int indice = 1;
        String historial= "";
        String nombreArchivo = "Conversiones";
        while (true){
            System.out.println("""
                Seleccione sobre qué pares quiere hacer la conversión:
                ..............................................................
                1- Euro -> Dólar
                2- Dólar -> Euro
                3- Dólar -> Dólar Canadiense
                4- Dólar Canadiense -> Dólar
                5- Peso Argentino -> Dólar
                6- Dólar -> Peso Argentino
                7- Crear archivo con Historial.
                8- Volver al Inicio.
                ..............................................................
                """);
            int choice = lectura.nextInt();
            switch (choice) {
                case 1:
                    primerMoneda = "EUR";
                    segundaMoneda = "USD";
                    break;
                case 2:
                    primerMoneda = "USD";
                    segundaMoneda = "EUR";
                    break;
                case 3:
                    primerMoneda = "USD";
                    segundaMoneda = "CAD";
                    break;
                case 4:
                    primerMoneda = "CAD";
                    segundaMoneda = "USD";
                    break;
                case 5:
                    primerMoneda = "ARS";
                    segundaMoneda = "USD";
                    break;
                case 6:
                    primerMoneda = "USD";
                    segundaMoneda = "ARS";
                    break;
                case 7:
                    Gson gson = new GsonBuilder().setPrettyPrinting().create();
                    FileWriter escritura = new FileWriter(nombreArchivo);
                    escritura.write(historial);
                    escritura.close();
                    break;
                case 8:
                    System.out.println("Volviendo al Inicio...\n");
                    break;
                default:
                    System.out.println("Opcion no valida, Intente nuevamente...\n" );
                    break;
            }
            if (choice == 8){
                break;
            }
            if (choice <7){
                System.out.println("Indique qué monto desea convertir: ");
                double cantidad = lectura.nextDouble();
                Consulta consulta = new Consulta();
                Moneda moneda = consulta.convertirMoneda(primerMoneda, segundaMoneda, cantidad);
                String resultado = "Resultado de conversíon: " + cantidad + " (" + primerMoneda + ") equivalen a " + moneda.conversion_result() + " (" + segundaMoneda + ")";
                System.out.println("...............................................................\n"
                        + resultado + "\n"
                        + "...............................................................\n" );
                historial += indice + "- " + resultado + "\n";
                indice++;
            }
        }
    }

    public void thirdMenu() throws IOException {
        int indice = 1;
        String historial= "";
        String nombreArchivo = "CodigosMonedas";
        while (true) {
            System.out.println("""
                Seleccione cuál es el codigo de moneda que desea obtener:
                ..............................................................
                1- Euro.
                2- Dólar.
                3- Dólar Canadiense.
                4- Peso Argentino.
                5- Libra Esterlina.
                6- Real Brasileño.
                7- Crear archivo con Historial.
                8- Volver al Inicio.
                ..............................................................
                """);
            int choice = lectura.nextInt();
            switch (choice) {
                case 1:
                    nombre = "Euro";
                    divisa = "EUR";
                    break;
                case 2:
                    nombre = "Dólar";
                    divisa = "USD";
                    break;
                case 3:
                    nombre = "Dólar Canadiense";
                    divisa = "CAD";
                    break;
                case 4:
                    nombre = "Peso Argentino";
                    divisa = "ARS";
                    break;
                case 5:
                    nombre = "Libra Esterlina";
                    divisa = "GBP";
                    break;
                case 6:
                    nombre = "Real Brasileño";
                    divisa = "BRL";
                    break;
                case 7:
                    Gson gson = new GsonBuilder().setPrettyPrinting().create();
                    FileWriter escritura = new FileWriter(nombreArchivo);
                    escritura.write(historial);
                    escritura.close();
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Opción no valida, intente nuevamente...\n");
                    break;
            }
            if (choice == 8) {
                System.out.println("Volviendo al Inicio...\n");
                break;
            }
            if (choice < 7) {
                Consulta consulta = new Consulta();
                Moneda moneda = consulta.tazaConversionMoneda(divisa);
                String resultado = "El codigo estándar internacional ISO de la divisa (" + nombre + ") es " + moneda.base_code();
                System.out.println("........................................................................\n"
                        + resultado + "\n"
                        + "........................................................................\n");
                historial += indice + "- " + resultado + "\n";
                indice++;
            }
        }
    }
}
