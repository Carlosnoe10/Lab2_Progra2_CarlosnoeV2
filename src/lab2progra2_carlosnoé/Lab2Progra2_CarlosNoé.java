package lab2progra2_carlosnoé;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2Progra2_CarlosNoé {

    public static void main(String[] args) {
        ArrayList<Gerente> ING = new ArrayList();
        ArrayList<Meseros> Meseros = new ArrayList();
        ArrayList<Bartenders> Barten = new ArrayList();
        ArrayList<Mesas> Mesas = new ArrayList();
        ArrayList<Chefs> Chefs = new ArrayList();
        ING = PreLogin(ING);
        Scanner k1ng = new Scanner(System.in);
        boolean Log = true;
        while (Log == true) {
            System.out.println("--Bienvenido al menu--");
            System.out.println("Ingrese el numero adecuado a la opcion que desea ingresar: ");
            System.out.println("Opcion 1. Menu Chefs");
            System.out.println("Opcion 2. Menu Meseros");
            System.out.println("Opcion 3. Menu Bartenders");
            System.out.println("Opcion 4. Menu Mesas");
            System.out.println("Opcion 5. Cerrar Sesion / Salida");

            int menu = k1ng.nextInt();
            for (int x = 0; x < 1; x++) {
                while (menu != 5) {
                    if ((menu > 0) && (menu < 6)) {
                        x++;
                        switch (menu) {
                            case 1:
                                System.out.println("--Bienvenido al submenu Chefs--");
                                CRUDChefs(Chefs);
                                break;

                            case 2:
                                System.out.println("--Bienvenido al submenu Meseros--");
                                CRUDMeseros(Meseros);
                                break;

                            case 3:
                                System.out.println("--Bienvenido al submenu Bartenders--");
                                CRUDBartenders(Barten);
                                break;

                            case 4:
                                System.out.println("--Bienvenido al submenu Mesas--");
                                CRUDMesas(Mesas);

                                break;
                        }
                        System.out.println("--Bienvenido al menu--");
                        System.out.println("Ingrese el numero adecuado a la opcion que desea ingresar: ");
                        System.out.println("Opcion 1. Menu Chefs");
                        System.out.println("Opcion 2. Menu Meseros");
                        System.out.println("Opcion 3. Menu Bartenders");
                        System.out.println("Opcion 4. Menu Mesas");
                        System.out.println("Opcion 5. Cerrar Sesion / Salida");

                        menu = k1ng.nextInt();
                    } else {
                        x--;
                    }
                }
                Log = false;
            }
        }
    }

    public static ArrayList<Gerente> PreLogin(ArrayList<Gerente> ING) {
        String one = "gerente";
        String contra = "g3r$nt0";

        Gerente Gerr = new Gerente(one, contra);
        ING.add(Gerr);
        return ING;
    }

    public static boolean Login(boolean Key, ArrayList<Gerente> ING) {
        Scanner k1ng = new Scanner(System.in);
        Scanner Queen = new Scanner(System.in);
        System.out.println("--Bienvenido al Login de Gerentes--");
        System.out.println("Ingrese su nombre de usuario");
        String Nombre = k1ng.nextLine();
        System.out.println("Ingrese la Contrasenya");
        String Contrasenya = Queen.nextLine();
        Scanner k1NT = new Scanner(System.in);
        System.out.println("Desea Salir? Escriba 1");
        int Num = k1ng.nextInt();
        Gerente Gerr = new Gerente(ING.get(0).getUsuario(), ING.get(0).getContra());

        if ((ING.get(0).getUsuario().equalsIgnoreCase(Nombre)) && (ING.get(0).getContra().equalsIgnoreCase(Contrasenya)) && ((Num != 1))) {
            return Key;

        } else if ((ING.get(0).getUsuario().equalsIgnoreCase(Nombre)) && (ING.get(0).getContra().equalsIgnoreCase(Contrasenya)) && ((Num == 1))) {
            return false;
        } else {
            System.out.println("Usuario o Contrasenya Equivocados");
            return Login(Key, ING);
        }
    }

    public static void CrearChefs(ArrayList<Chefs> ING) {
        Scanner k1ng3 = new Scanner(System.in);
        Scanner k1ng4 = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        String Name = k1ng3.nextLine();
        System.out.println("Ingrese la edad: ");
        int edad = k1ng4.nextInt();
        System.out.println("Ingrese las estrellas michellin");
        int Michellin = k1ng3.nextInt();
        boolean DiaoNoc = false;
        for (int i = 0; i < 1; i++) {
            System.out.println("Ingrese su turno if es de dia 1 si no 2");
            int Turn = k1ng4.nextInt();
            if (Turn == 1) {
                DiaoNoc = true;
                i++;
            } else if (Turn == 2) {
                DiaoNoc = false;
                i++;
            } else {
                i--;
            }
        }
        System.out.println("Ingrese su sueldo");
        double Sueldo = k1ng3.nextDouble();

        if ((edad >= 18) && (Michellin >= 0) && (Michellin <= 5) && (Sueldo > 0)) {
            Chefs chef = new Chefs(Name, edad, Michellin, DiaoNoc, Sueldo);
            ING.add(chef);
        } else {
            System.out.println("Valores Invalidos ");
        }

    }

    public static void MODChefs(ArrayList<Chefs> ING) {
        Scanner k1ng = new Scanner(System.in);
        System.out.println("Bienvenid al menu \n"
                + "1. Cambiar el nombre del Chef \n"
                + "2. Cambiar la edad del chef \n"
                + "3. Cambiar las estrellas Michellin \n"
                + "4. Cambiar el turno\n"
                + "5. Cambiar el sueldo"
                + "6. Salida");
        int menu = k1ng.nextInt();
        for (int x = 0; x < 1; x++) {
            while (menu != 6) {
                if ((menu > 0) && (menu < 7)) { // 4 es igual al numero limite que deseo agregar
                    x++;
                    switch (menu) {
                        case 1:
                            ListarChefs(ING);
                            for (int i = 0; i < 1; i++) {
                                System.out.println("Ingrese el numero del chef que desea cambiar el Nombre: ");
                                int Cambiar = k1ng.nextInt();
                                if (Cambiar >= ING.size()) {
                                    i--;
                                    System.out.println("Mal Ingresado");
                                } else {
                                    i++;
                                    System.out.println("Ingrese el nuevo nombre");
                                    String nombre = k1ng.nextLine();
                                    ING.get(Cambiar).setNombre(nombre);
                                }
                            }
                            break;
                        case 2:
                            ListarChefs(ING);
                            for (int i = 0; i < 1; i++) {
                                System.out.println("Ingrese el numero de la persona que desea cambiarle la edad: ");
                                int Cambiar = k1ng.nextInt();
                                if (Cambiar >= ING.size()) {
                                    i--;
                                    System.out.println("Mal Ingresado");
                                } else {
                                    i++;
                                    for (int j = 0; j < 1; j++) {
                                        System.out.println("Ingrese la nueva edad");
                                        int Edad = k1ng.nextInt();
                                        if (Edad >= 18) {
                                            j++;
                                            ING.get(Cambiar).setEdad(Edad);
                                        } else {
                                            System.out.println("Valor invalido");
                                            j--;
                                        }
                                    }
                                }
                            }
                            break;
                        case 3:
                            ListarChefs(ING);
                            for (int i = 0; i < 1; i++) {
                                System.out.println("Ingrese el numero de la persona que desea cambiarle las estrellas michellin: ");
                                int Cambiar = k1ng.nextInt();
                                if (Cambiar >= ING.size()) {
                                    i--;
                                    System.out.println("Mal Ingresado");
                                } else {
                                    i++;
                                    for (int j = 0; j < 1; j++) {
                                        System.out.println("Ingrese la nueva cantidad de estrellas");
                                        int Edad = k1ng.nextInt();
                                        if (Edad <= 5) {
                                            j++;
                                            ING.get(Cambiar).setEstrellasMiche(Edad);
                                        } else {
                                            System.out.println("Valor invalido");
                                            j--;
                                        }
                                    }
                                }
                            }
                            break;
                        case 4:
                            ListarChefs(ING);
                            boolean marca;
                            for (int i = 0; i < 1; i++) {
                                System.out.println("Ingrese el numero de la persona que desea cambiar el turno: ");
                                marca = ING.get(i).isTurno();
                                int Cambiar = k1ng.nextInt();
                                if (Cambiar >= ING.size()) {
                                    i--;
                                    System.out.println("Mal Ingresado");
                                } else {
                                    if (marca = false) {
                                        ING.get(i).setTurno(true);
                                    } else {
                                        ING.get(i).setTurno(false);
                                    }
                                    i++;

                                }
                            }
                            break;
                        case 5:
                            ListarChefs(ING);
                            for (int i = 0; i < 1; i++) {
                                System.out.println("Ingrese el numero de la persona que desea cambiarle el sueldo: ");
                                int Cambiar = k1ng.nextInt();
                                if (Cambiar >= ING.size()) {
                                    i--;
                                    System.out.println("Mal Ingresado");
                                } else {
                                    i++;
                                    for (int j = 0; j < 1; j++) {
                                        System.out.println("Ingrese el nuevo sueldo");
                                        double Edad = k1ng.nextDouble();
                                        if (Edad > 0) {
                                            j++;
                                            ING.get(Cambiar).setSueldo(Edad);
                                        } else {
                                            System.out.println("Valor invalido");
                                            j--;
                                        }
                                    }
                                }
                            }

                            break;

                    }// switch menu p
                    System.out.println("Bienvenid al menu \n"
                            + "1. Cambiar el nombre del Chef \n"
                            + "2. Cambiar la edad del chef \n"
                            + "3. Cambiar las estrellas Michellin \n"
                            + "4. Cambiar el turno\n"
                            + "5. Cambiar el sueldo"
                            + "6. Salida");
                    menu = k1ng.nextInt();

                } else {
                    System.out.println("Ingrese adecuadamente el numero");
                    x--;
                }//if
            }//while
        }//for

        System.out.println("Fin");

    }

    public static void EliminarChefs(ArrayList<Chefs> ING) {
        ListarChefs(ING);
        Scanner k1ng2 = new Scanner(System.in);
        for (int i = 0; i < 1; i++) {
            System.out.println("Ingrese el numero del chef que desea eliminar: ");
            int Cambiar = k1ng2.nextInt();
            if (Cambiar >= ING.size()) {
                i--;
                System.out.println("Mal Ingresado");
            } else {
                i++;
                ING.remove(Cambiar);
            }
        }
    }

    public static void ListarChefs(ArrayList<Chefs> ING) {
        for (int i = 0; i < ING.size(); i++) {
            System.out.println(i + "- " + ING.get(i).getNombre());
        }
    }

    public static void CRUDChefs(ArrayList<Chefs> ING) {
        Scanner k1ng2 = new Scanner(System.in);
        System.out.println("Bienvenid al menu \n"
                + "1. Crear \n"
                + "2. Modificar\n"
                + "3. Eliminar \n"
                + "4. listar \n"
                + "5. Salida");
        int menu = k1ng2.nextInt();
        for (int x = 0; x < 1; x++) {
            while (menu != 5) {
                if ((menu > 0) && (menu < 5)) { // 4 es igual al numero limite que deseo agregar
                    x++;
                    switch (menu) {
                        case 1:
                            CrearChefs(ING);
                            break;
                        case 2:
                            MODChefs(ING);
                            break;
                        case 3:
                            EliminarChefs(ING);
                            break;
                        case 4:
                            ListarChefs(ING);
                            break;

                    }// switch menu p
                    System.out.println("Bienvenid al menu \n"
                            + "1. Crear \n"
                            + "2. Modificar\n"
                            + "3. Eliminar \n"
                            + "4. listar\n"
                            + "5. Salida");
                    menu = k1ng2.nextInt();

                } else {
                    System.out.println("Ingrese adecuadamente el numero");
                    x--;
                }//if
            }//while
        }//for

        System.out.println("Fin");
    }

    public static void CRUDMeseros(ArrayList<Meseros> ING) {
        Scanner k1ng2 = new Scanner(System.in);
        System.out.println("Bienvenid al menu \n"
                + "1. Crear \n"
                + "2. Modificar\n"
                + "3. Eliminar \n"
                + "4. listar \n"
                + "5. Salida");
        int menu = k1ng2.nextInt();
        for (int x = 0; x < 1; x++) {
            while (menu != 5) {
                if ((menu > 0) && (menu < 5)) { // 4 es igual al numero limite que deseo agregar
                    x++;
                    switch (menu) {
                        case 1:
                            CrearMeseros(ING);
                            break;
                        case 2:
                            MODMeseros(ING);
                            break;
                        case 3:
                            EliminarMeseros(ING);
                            break;
                        case 4:
                            ListarMeseros(ING);

                            break;

                    }// switch menu p
                    System.out.println("Bienvenid al menu \n"
                            + "1. Crear \n"
                            + "2. Modificar\n"
                            + "3. Eliminar \n"
                            + "4. listar\n"
                            + "5. Salida");
                    menu = k1ng2.nextInt();

                } else {
                    System.out.println("Ingrese adecuadamente el numero");
                    x--;
                }//if
            }//while
        }//for

        System.out.println("Fin");

    }

    public static void ListarMeseros(ArrayList<Meseros> ING) {
        for (int i = 0; i < ING.size(); i++) {
            System.out.println(i + "- " + ING.get(i).getNombre());
        }
    }

    public static void EliminarMeseros(ArrayList<Meseros> ING) {
        ListarMeseros(ING);
        Scanner k1ng2 = new Scanner(System.in);
        for (int i = 0; i < 1; i++) {
            System.out.println("Ingrese el numero del mesero que desea eliminar: ");
            int Cambiar = k1ng2.nextInt();
            if (Cambiar >= ING.size()) {
                i--;
                System.out.println("Mal Ingresado");
            } else {
                i++;
                ING.remove(Cambiar);
            }
        }
    }

    public static void CrearMeseros(ArrayList<Meseros> ING) {
        Scanner k1ng3 = new Scanner(System.in);
        Scanner k1ng4 = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        String Name = k1ng3.nextLine();
        System.out.println("Ingrese la edad: ");
        int edad = k1ng4.nextInt();
        System.out.println("Ingrese el sueldo: ");
        double Sueldo = k1ng3.nextDouble();
        boolean DiaoNoc = false;
        for (int i = 0; i < 1; i++) {
            System.out.println("Ingrese su turno if es de dia 1 si no 2");
            int Turn = k1ng4.nextInt();
            if (Turn == 1) {
                DiaoNoc = true;
                i++;
            } else if (Turn == 2) {
                DiaoNoc = false;
                i++;
            } else {
                i--;
            }
        }
        System.out.println("Ingrese su sueldo");
        double Propina = k1ng3.nextDouble();

        if ((edad >= 18) && (Sueldo > 0.00) && (Sueldo > 0)) {
            Meseros mes = new Meseros(Name, edad, DiaoNoc, Sueldo, Propina);
            ING.add(mes);
        } else {
            System.out.println("Valores Invalidos ");
        }

    }

    public static void MODMeseros(ArrayList<Meseros> ING) {
        Scanner k1ng = new Scanner(System.in);
        System.out.println("Bienvenid al menu \n"
                + "1. Cambiar el nombre del Chef \n"
                + "2. Cambiar la edad del chef \n"
                + "3. Cambiar las propinas \n"
                + "4. Cambiar el turno\n"
                + "5. Cambiar el sueldo"
                + "6. Salida");
        int menu = k1ng.nextInt();
        for (int x = 0; x < 1; x++) {
            while (menu != 6) {
                if ((menu > 0) && (menu < 7)) { // 4 es igual al numero limite que deseo agregar
                    x++;
                    switch (menu) {
                        case 1:
                            ListarMeseros(ING);
                            for (int i = 0; i < 1; i++) {
                                System.out.println("Ingrese el numero del chef que desea cambiar el Nombre: ");
                                int Cambiar = k1ng.nextInt();
                                if (Cambiar >= ING.size()) {
                                    i--;
                                    System.out.println("Mal Ingresado");
                                } else {
                                    i++;
                                    System.out.println("Ingrese el nuevo nombre");
                                    String nombre = k1ng.nextLine();
                                    ING.get(Cambiar).setNombre(nombre);
                                }
                            }
                            break;
                        case 2:
                            ListarMeseros(ING);
                            for (int i = 0; i < 1; i++) {
                                System.out.println("Ingrese el numero de la persona que desea cambiarle la edad: ");
                                int Cambiar = k1ng.nextInt();
                                if (Cambiar >= ING.size()) {
                                    i--;
                                    System.out.println("Mal Ingresado");
                                } else {
                                    i++;
                                    for (int j = 0; j < 1; j++) {
                                        System.out.println("Ingrese la nueva edad");
                                        int Edad = k1ng.nextInt();
                                        if (Edad >= 18) {
                                            j++;
                                            ING.get(Cambiar).setEdad(Edad);
                                        } else {
                                            System.out.println("Valor invalido");
                                            j--;
                                        }
                                    }
                                }
                            }
                            break;
                        case 3:
                            ListarMeseros(ING);
                            for (int i = 0; i < 1; i++) {
                                System.out.println("Ingrese el numero de la persona que desea cambiarle el sueldo: ");
                                int Cambiar = k1ng.nextInt();
                                if (Cambiar >= ING.size()) {
                                    i--;
                                    System.out.println("Mal Ingresado");
                                } else {
                                    i++;
                                    for (int j = 0; j < 1; j++) {
                                        System.out.println("Ingrese la nnueva propina");
                                        double Edad = k1ng.nextDouble();
                                        if (Edad > 0) {
                                            j++;
                                            ING.get(Cambiar).setSueldo(Edad);
                                        } else {
                                            System.out.println("Valor invalido");
                                            j--;
                                        }
                                    }
                                }
                            }
                            break;
                        case 4:
                            ListarMeseros(ING);
                            boolean marca;
                            for (int i = 0; i < 1; i++) {
                                System.out.println("Ingrese el numero de la persona que desea cambiar el turno: ");
                                marca = ING.get(i).isTurno();
                                int Cambiar = k1ng.nextInt();
                                if (Cambiar >= ING.size()) {
                                    i--;
                                    System.out.println("Mal Ingresado");
                                } else {
                                    if (marca = false) {
                                        ING.get(i).setTurno(true);
                                    } else {
                                        ING.get(i).setTurno(false);
                                    }
                                    i++;

                                }
                            }

                            break;
                        case 5:
                            ListarMeseros(ING);
                            for (int i = 0; i < 1; i++) {
                                System.out.println("Ingrese el numero de la persona que desea cambiarle el sueldo: ");
                                int Cambiar = k1ng.nextInt();
                                if (Cambiar >= ING.size()) {
                                    i--;
                                    System.out.println("Mal Ingresado");
                                } else {
                                    i++;
                                    for (int j = 0; j < 1; j++) {
                                        System.out.println("Ingrese el nuevo sueldo");
                                        int Edad = k1ng.nextInt();
                                        if (Edad > 0) {
                                            j++;
                                            ING.get(Cambiar).setSueldo(Edad);
                                        } else {
                                            System.out.println("Valor invalido");
                                            j--;
                                        }
                                    }
                                }
                            }

                            break;

                    }// switch menu p
                    System.out.println("Bienvenid al menu \n"
                            + "1. Cambiar el nombre del Chef \n"
                            + "2. Cambiar la edad del chef \n"
                            + "3. Cambiar las propinas \n"
                            + "4. Cambiar el turno\n"
                            + "5. Cambiar el sueldo"
                            + "6. Salida");

                } else {
                    System.out.println("Ingrese adecuadamente el numero");
                    x--;
                }//if
            }//while
        }//for

        System.out.println("Fin");

    }

    public static void CrearBartenders(ArrayList<Bartenders> ING) {
        Scanner k1ng3 = new Scanner(System.in);
        Scanner k1ng4 = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        String Name = k1ng3.nextLine();
        System.out.println("Ingrese la edad: ");
        int edad = k1ng4.nextInt();
        System.out.println("Ingrese el sueldo: ");
        double Sueldo = k1ng3.nextDouble();
        boolean DiaoNoc = false;
        for (int i = 0; i < 1; i++) {
            System.out.println("Ingrese su turno if es de dia 1 si no 2");
            int Turn = k1ng4.nextInt();
            if (Turn == 1) {
                DiaoNoc = true;
                i++;
            } else if (Turn == 2) {
                DiaoNoc = false;
                i++;
            } else {
                i--;
            }
        }
        System.out.println("Ingrese el numero de licores");
        int Licores = k1ng3.nextInt();

        if ((edad >= 18) && (Sueldo > 0.00) && (Sueldo > 0)) {
            Bartenders mes = new Bartenders(Name, edad, DiaoNoc, Sueldo, Licores);
            ING.add(mes);
        } else {
            System.out.println("Valores Invalidos ");
        }
    }

    public static void ModBartenders(ArrayList<Bartenders> ING) {
        Scanner k1ng = new Scanner(System.in);
        System.out.println("Bienvenid al menu \n"
                + "1. Cambiar el nombre del Bartenders \n"
                + "2. Cambiar la edad del Bartenders \n"
                + "3. Cambiar las propinas \n"
                + "4. Cambiar el turno\n"
                + "5. Cambiar el sueldo"
                + "6. Salida");
        int menu = k1ng.nextInt();
        for (int x = 0; x < 1; x++) {
            while (menu != 6) {
                if ((menu > 0) && (menu < 7)) { // 4 es igual al numero limite que deseo agregar
                    x++;
                    switch (menu) {
                        case 1:
                            ListarBartenders(ING);
                            for (int i = 0; i < 1; i++) {
                                System.out.println("Ingrese el numero del chef que desea cambiar el Nombre: ");
                                int Cambiar = k1ng.nextInt();
                                if (Cambiar >= ING.size()) {
                                    i--;
                                    System.out.println("Mal Ingresado");
                                } else {
                                    i++;
                                    System.out.println("Ingrese el nuevo nombre");
                                    String nombre = k1ng.nextLine();
                                    ING.get(Cambiar).setNombre(nombre);
                                }
                            }
                            break;
                        case 2:
                            ListarBartenders(ING);
                            for (int i = 0; i < 1; i++) {
                                System.out.println("Ingrese el numero de la persona que desea cambiarle la edad: ");
                                int Cambiar = k1ng.nextInt();
                                if (Cambiar >= ING.size()) {
                                    i--;
                                    System.out.println("Mal Ingresado");
                                } else {
                                    i++;
                                    for (int j = 0; j < 1; j++) {
                                        System.out.println("Ingrese la nueva edad");
                                        int Edad = k1ng.nextInt();
                                        if (Edad >= 18) {
                                            j++;
                                            ING.get(Cambiar).setEdad(Edad);
                                        } else {
                                            System.out.println("Valor invalido");
                                            j--;
                                        }
                                    }
                                }
                            }
                            break;
                        case 3:
                            ListarBartenders(ING);
                            for (int i = 0; i < 1; i++) {
                                System.out.println("Ingrese el numero de la persona que desea cambiarle el numero de licores: ");
                                int Cambiar = k1ng.nextInt();
                                if (Cambiar >= ING.size()) {
                                    i--;
                                    System.out.println("Mal Ingresado");
                                } else {
                                    i++;
                                    for (int j = 0; j < 1; j++) {
                                        System.out.println("Ingrese la nueva numero de lic");
                                        int Edad = k1ng.nextInt();
                                        if (Edad >= 18) {
                                            j++;
                                            ING.get(Cambiar).setNumeroLico(Edad);
                                        } else {
                                            System.out.println("Valor invalido");
                                            j--;
                                        }
                                    }
                                }
                            }
                            break;
                        case 4:
                            ListarBartenders(ING);
                            boolean marca;
                            for (int i = 0; i < 1; i++) {
                                System.out.println("Ingrese el numero de la persona que desea cambiar el turno: ");
                                marca = ING.get(i).isTurno();
                                int Cambiar = k1ng.nextInt();
                                if (Cambiar >= ING.size()) {
                                    i--;
                                    System.out.println("Mal Ingresado");
                                } else {
                                    if (marca = false) {
                                        ING.get(i).setTurno(true);
                                    } else {
                                        ING.get(i).setTurno(false);
                                    }
                                    i++;

                                }
                            }

                            break;
                        case 5:
                            ListarBartenders(ING);
                            for (int i = 0; i < 1; i++) {
                                System.out.println("Ingrese el numero de la persona que desea cambiarle el sueldo: ");
                                int Cambiar = k1ng.nextInt();
                                if (Cambiar >= ING.size()) {
                                    i--;
                                    System.out.println("Mal Ingresado");
                                } else {
                                    i++;
                                    for (int j = 0; j < 1; j++) {
                                        System.out.println("Ingrese el nuevo sueldo");
                                        double Edad = k1ng.nextDouble();
                                        if (Edad > 0) {
                                            j++;
                                            ING.get(Cambiar).setSueldo(Edad);
                                        } else {
                                            System.out.println("Valor invalido");
                                            j--;
                                        }
                                    }
                                }
                            }

                            break;

                    }// switch menu p
                    System.out.println("Bienvenid al menu \n"
                            + "1. Cambiar el nombre del Chef \n"
                            + "2. Cambiar la edad del chef \n"
                            + "3. Cambiar las propinas \n"
                            + "4. Cambiar el turno\n"
                            + "5. Cambiar el sueldo"
                            + "6. Salida");

                } else {
                    System.out.println("Ingrese adecuadamente el numero");
                    x--;
                }//if
            }//while
        }//for

        System.out.println("Fin");

    }

    public static void ListarBartenders(ArrayList<Bartenders> ING) {
        for (int i = 0; i < ING.size(); i++) {
            System.out.println(i + "- " + ING.get(i).getNombre());
        }
    }

    public static void EliminarBartenders(ArrayList<Bartenders> ING) {
        ListarBartenders(ING);
        Scanner k1ng2 = new Scanner(System.in);
        for (int i = 0; i < 1; i++) {
            System.out.println("Ingrese el numero del Bartenders que desea eliminar: ");
            int Cambiar = k1ng2.nextInt();
            if (Cambiar >= ING.size()) {
                i--;
                System.out.println("Mal Ingresado");
            } else {
                i++;
                ING.remove(Cambiar);
            }
        }
    }

    public static void CRUDBartenders(ArrayList<Bartenders> ING) {
        Scanner k1ng2 = new Scanner(System.in);
        System.out.println("Bienvenid al menu \n"
                + "1. Crear \n"
                + "2. Modificar\n"
                + "3. Eliminar \n"
                + "4. listar \n"
                + "5. Salida");
        int menu = k1ng2.nextInt();
        for (int x = 0; x < 1; x++) {
            while (menu != 5) {
                if ((menu > 0) && (menu < 5)) { // 4 es igual al numero limite que deseo agregar
                    x++;
                    switch (menu) {
                        case 1:
                            CrearBartenders(ING);
                            break;
                        case 2:
                            ModBartenders(ING);
                            break;
                        case 3:
                            EliminarBartenders(ING);
                            break;
                        case 4:
                            ListarBartenders(ING);
                            break;

                    }// switch menu p
                    System.out.println("Bienvenid al menu \n"
                            + "1. Crear \n"
                            + "2. Modificar\n"
                            + "3. Eliminar \n"
                            + "4. listar\n"
                            + "5. Salida");
                    menu = k1ng2.nextInt();

                } else {
                    System.out.println("Ingrese adecuadamente el numero");
                    x--;
                }//if
            }//while
        }//for

        System.out.println("Fin");
    }

    public static void CrearMesas(ArrayList<Mesas> ING) {
        Scanner k1ng3 = new Scanner(System.in);
        Scanner k1ng4 = new Scanner(System.in);
        System.out.println("Ingrese el Numero de platos: ");
        int Name = k1ng3.nextInt();
        System.out.println("Ingrese el numero de utencilios ");
        int edad = k1ng4.nextInt();
        System.out.println("Ingrese el precio total");
        double precio = k1ng3.nextDouble();
        Mesas mes = new Mesas(Name, edad, precio);
        ING.add(mes);
    }

    public static void MODMesas(ArrayList<Mesas> ING) {
        Scanner k1ng = new Scanner(System.in);
        System.out.println("1. Mod Numero De mesas\n"
                + "2. Mod Numero de utencilios \n"
                + "3. Mod Precio mesas");
        int Mas = k1ng.nextInt();
        for (int w = 0; w < 1; w++) {
            while (Mas != 3) {
                if ((Mas > 0) && (Mas < 4)) {
                    w++;
                    switch (Mas) {
                        case 1:
                            ListarMesas(ING);
                            for (int i = 0; i < 1; i++) {
                                System.out.println("Ingrese el numero de la mesa que desea cambiarle el numero: ");
                                int Cambiar = k1ng.nextInt();
                                if (Cambiar >= ING.size()) {
                                    i--;
                                    System.out.println("Mal Ingresado");
                                } else {
                                    i++;
                                    for (int j = 0; j < 1; j++) {
                                        System.out.println("Ingrese la nueva cantidad");
                                        int Edad = k1ng.nextInt();
                                        if (Edad > 0) {
                                            j++;
                                            ING.get(Cambiar).setNumeroDePlatos(Edad);
                                        } else {
                                            System.out.println("Valor invalido");
                                            j--;
                                        }
                                    }
                                }
                            }
                            break;
                        case 2:
                            ListarMesas(ING);
                            for (int i = 0; i < 1; i++) {
                                System.out.println("Ingrese el numero de la mesa que desea cambiarle el numero de utencilios: ");
                                int Cambiar = k1ng.nextInt();
                                if (Cambiar >= ING.size()) {
                                    i--;
                                    System.out.println("Mal Ingresado");
                                } else {
                                    i++;
                                    for (int j = 0; j < 1; j++) {
                                        System.out.println("Ingrese la nueva cantidad");
                                        int Edad = k1ng.nextInt();
                                        if (Edad > 0) {
                                            j++;
                                            ING.get(Cambiar).setNumeroDeUtencilios(Edad);
                                        } else {
                                            System.out.println("Valor invalido");
                                            j--;
                                        }
                                    }
                                }
                            }
                            break;
                        case 3:
                            ListarMesas(ING);
                            for (int i = 0; i < 1; i++) {
                                System.out.println("Ingrese el numero de la mesa que desea cambiarle el precio: ");
                                int Cambiar = k1ng.nextInt();
                                if (Cambiar >= ING.size()) {
                                    i--;
                                    System.out.println("Mal Ingresado");
                                } else {
                                    i++;
                                    for (int j = 0; j < 1; j++) {
                                        System.out.println("Ingrese el nuevo precio");
                                        double Edad = k1ng.nextDouble();
                                        if (Edad > 0) {
                                            j++;
                                            ING.get(Cambiar).setPrecioTotal(Edad);
                                        } else {
                                            System.out.println("Valor invalido");
                                            j--;
                                        }
                                    }
                                }
                            }

                            break;

                    }
                } else {
                    w--;
                    System.out.println("Termino Incorrecto");
                }
            }
        }
    }

    public static void CRUDMesas(ArrayList<Mesas> ING) {
        Scanner k1ng2 = new Scanner(System.in);
        System.out.println("Bienvenid al menu \n"
                + "1. Crear \n"
                + "2. Modificar\n"
                + "3. Eliminar \n"
                + "4. listar \n"
                + "5. Salida");
        int menu = k1ng2.nextInt();
        for (int x = 0; x < 1; x++) {
            while (menu != 5) {
                if ((menu > 0) && (menu < 5)) { // 4 es igual al numero limite que deseo agregar
                    x++;
                    switch (menu) {
                        case 1:
                            CrearMesas(ING);
                            break;
                        case 2:
                            MODMesas(ING);
                            break;
                        case 3:
                            EliminarMesas(ING);
                            break;
                        case 4:
                            ListarMesas(ING);
                            break;

                    }// switch menu p
                    System.out.println("Bienvenid al menu \n"
                            + "1. Crear \n"
                            + "2. Modificar\n"
                            + "3. Eliminar \n"
                            + "4. listar\n"
                            + "5. Salida");
                    menu = k1ng2.nextInt();

                } else {
                    System.out.println("Ingrese adecuadamente el numero");
                    x--;
                }//if
            }//while
        }//for

        System.out.println("Fin");
    }

    public static void ListarMesas(ArrayList<Mesas> ING) {
        for (int i = 0; i < ING.size(); i++) {
            System.out.println(i + "- " + ING.get(i).getNumeroDePlatos());
        }
    }

    public static void EliminarMesas(ArrayList<Mesas> ING) {
        ListarMesas(ING);
        Scanner k1ng2 = new Scanner(System.in);
        for (int i = 0; i < 1; i++) {
            System.out.println("Ingrese el numero del Bartenders que desea eliminar: ");
            int Cambiar = k1ng2.nextInt();
            if (Cambiar >= ING.size()) {
                i--;
                System.out.println("Mal Ingresado");
            } else {
                i++;
                ING.remove(Cambiar);
            }
        }
    }
}
