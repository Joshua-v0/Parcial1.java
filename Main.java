import java.util.Scanner;
import java.util.Date;
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        Date date = new Date();

        int menu = 1;
        String usuario = "";
        String pass = "";
        String tickets = "";
        String nombre = "";
        String apellido = "";
        String ID = "";
        String correo = "";
        String carrera = "";
        String comment = "";
        String ident = "";
        String enter = "";
        String u = "joshuavoitier@gmail.com";
        String p = "ingeniero";
        int opc = 0;

        //ingresando datos del estudiante
        System.out.println("Universidad Interamericana de Panama");
        System.out.println("Ingrese su usuario: ");
        usuario = entrada.nextLine();
        System.out.println("Ingrese su contraseña: ");
        pass = entrada.nextLine();

        if (usuario.equals(u) && pass.equals(p)){
            System.out.println("Ingresó al sistema el: "+date);

            while (true) {
                System.out.println("== Envie un tickets ==");
                System.out.println("1. Subir tickets");
                System.out.println("2. Ver tickets");
                System.out.println("3. Cambiar Contraseña");
                System.out.println("4. Salir");
                System.out.print("Eliga una opcion: ");
                opc = entrada.nextInt();

                switch (opc) {
                    case 1: {
                        System.out.print("Nombre: ");
                        nombre = scan.nextLine();
                        System.out.print("Apellido: ");
                        apellido = scan.nextLine();
                        System.out.print("ID: ");
                        ID = scan.nextLine();
                        System.out.print("Correo: ");
                        correo = scan.nextLine();
                        System.out.print("Carrera: ");
                        carrera = scan.nextLine();
                        System.out.println("Descripcion");
                        comment = scan.nextLine();
                        break;
                    }

                    case 2: {
                        System.out.println("== Tickets del estudiante ==");
                        System.out.println(nombre);
                        System.out.println(apellido);
                        System.out.println(ID);
                        System.out.print(correo);
                        System.out.println(carrera);
                        System.out.println(comment);
                        break;
                    }

                    case 3: {
                        System.out.println("Ingrese su clave nueva: ");
                        pass = scan.nextLine();
                        break;
                    }

                    case 4: {
                        System.out.println("Gracias por su visita, vuelva pronto");
                        enter = entrada.nextLine();
                        System.exit(0);
                        break;
                    }

                }

            }
        }else{
            System.out.println("El usuario y contraseña son incorrectos");

        }

    }

}


