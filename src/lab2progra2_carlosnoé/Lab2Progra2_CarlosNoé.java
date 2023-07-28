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
                            CrearConsecionaria();
                            break;
                        case 2:
                            MODCliente();
                            break;
                        case 3:
                            
                            break;
                        case 4:
                            
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
                            CrearConsecionaria();
                            break;
                        case 2:
                            MODCliente();
                            break;
                        case 3:
                            
                            break;
                        case 4:
                            
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
                            CrearConsecionaria();
                            break;
                        case 2:
                            MODCliente();
                            break;
                        case 3:
                            
                            break;
                        case 4:
                            
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
                            CrearConsecionaria();
                            break;
                        case 2:
                            MODCliente();
                            break;
                        case 3:
                            
                            break;
                        case 4:
                            
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

}
