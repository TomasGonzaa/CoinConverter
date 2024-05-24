import java.io.IOException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
    Scanner lectura = new Scanner(System.in);

    System.out.println("""
            ........................................
            ***** BIENVENIDO A PAIR CONVERTER *****
            ........................................
            """);
        while (true) {
            Menu miMenu = new Menu();
            miMenu.inicio();
        try{
            int menu = lectura.nextInt();

            switch (menu) {
                case 1: miMenu.firstMenu();
                    break;
                case 2: miMenu.secondMenu();
                    break;
                case 3: miMenu.thirdMenu();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opción no encontrada, intente nuevamente...\n");
                    break;
            }
            if (menu == 4){
                System.out.println("Muchas gracias por trabajar con nosotros, tenga un excelente día!" );
                break;
            }
        }catch (RuntimeException e){
            System.out.println("Divisa no encontrada");
            System.out.println("Finalizando aplicacion");
            break;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        }
    }
}
