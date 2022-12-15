/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package tarea3pds;
import java.util.*;

public class App {

    static void accesoLibro(ArrayList<Libro> biblioteca, int libroIndex){
        Scanner input2 = new Scanner(System.in);
        Libro librito = biblioteca.get(libroIndex);
        System.out.println("\n----Bienvenido al menu de opciones de libro");
        System.out.println("Actualmente tiene seleccionado el libro con el siguiente titulo: " + librito.titulo);
        System.out.println("Seleccione una de las opciones a realizar  (ingrese la tecla \"s\" para volver atras)");
        System.out.println("[1]: Editar libro");
        System.out.println("[2]: Cambiar estado del libro");
        System.out.println("[3]: Eliminar libro");
        String opcion = input2.next().trim();

        int intOpcion = 0;
        try {
            intOpcion = Integer.parseInt(opcion);
        }
        catch (Exception e) {
            System.out.println("Opcion invalida. Por favor intentelo nuevamente.");
        }

        //Editar libro
        if (intOpcion == 1){
            input2.nextLine();
            System.out.println("\nIngrese la opcion de lo que desea editar  (ingrese la tecla \"s\" para volver atras)");
            System.out.println("[1]: Titulo  |  (Actualmente) " + librito.titulo);
            System.out.println("[2]: Autor  |  (Actualmente) " + librito.autor);
            System.out.println("[3]: Fecha edicion  |  (Actualmente) " + librito.fecha);
            System.out.println("[4]: Numero de paginas  |  (Actualmente) " + librito.paginas);
            System.out.println("[5]: Editorial  |  (Actualmente) " + librito.editorial);
            System.out.println("[6]: Genero  |  (Actualmente) " + librito.genero);
            System.out.println("[7]: ISBN  |  (Actualmente) " + librito.isbn);
            System.out.println("[8]: Estante  |  (Actualmente) " + librito.estante);
            System.out.println("[9]: Descripcion  |  (Actualmente) " + librito.descripcion);
            Integer opcionEdit = 0;
            try {
                opcionEdit = input2.nextInt();
            }
            catch (Exception e) {
                System.out.println("Opcion invalida. Por favor intentelo nuevamente.");
                return;
            }

            if (opcionEdit == 1){
                input2.nextLine();
                System.out.println("Ingrese el nuevo titulo");
                String nuevo = input2.nextLine();
                librito.titulo = nuevo;
                System.out.println("**Titulo actualizado exitosamente**");
            }
            else if (opcionEdit == 2){
                input2.nextLine();
                System.out.println("Ingrese el nuevo autor");
                String nuevo = input2.nextLine();
                librito.autor = nuevo;
                System.out.println("**Autor actualizado exitosamente**");
            }
            else if (opcionEdit == 3){
                input2.nextLine();
                System.out.println("Ingrese la nueva fecha de edicion");
                String nuevo = input2.nextLine();
                librito.fecha = nuevo;
                System.out.println("**Fecha actualizada exitosamente**");
            }
            else if (opcionEdit == 4){
                input2.nextLine();
                System.out.println("Ingrese el nuevo numero de paginas");
                String nuevo = input2.nextLine();
                librito.paginas = nuevo;
                System.out.println("**Numero de paginas actualizado exitosamente**");
            }
            else if (opcionEdit == 5){
                input2.nextLine();
                System.out.println("Ingrese la nueva editorial");
                String nuevo = input2.nextLine();
                librito.editorial = nuevo;
                System.out.println("**Editorial actualizada exitosamente**");
            }
            else if (opcionEdit == 6){
                input2.nextLine();
                System.out.println("Ingrese el nuevo genero");
                String nuevo = input2.nextLine();
                librito.genero = nuevo;
                System.out.println("**Genero actualizado exitosamente**");
            }
            else if (opcionEdit == 7){
                input2.nextLine();
                System.out.println("Ingrese el nuevo ISBN");
                String nuevo = input2.nextLine();
                librito.isbn = nuevo;
                System.out.println("**ISBN actualizado exitosamente**");
            }
            else if (opcionEdit == 8){
                input2.nextLine();
                System.out.println("Ingrese el nuevo estante");
                String nuevo = input2.nextLine();
                librito.estante = nuevo;
                System.out.println("**Estante actualizado exitosamente**");
            }
            else if (opcionEdit == 9){
                input2.nextLine();
                System.out.println("Ingrese la nueva descripcion");
                String nuevo = input2.nextLine();
                librito.descripcion = nuevo;
                System.out.println("**Descripcion actualizada exitosamente**");
            }
            else {
                System.out.println("Opcion invalida. Por favor intentelo nuevamente.");
            }

            
        }

        //Cambiar estado libro
        else if (intOpcion == 2){
            input2.nextLine();
            System.out.println("\nIngrese la opcion del nuevo estado (ingrese la tecla \"s\" para volver atras)");
            System.out.println("El estado actual es: " + librito.estado);
            System.out.println("[1]: Disponible");
            System.out.println("[2]: Prestado");
            System.out.println("[3]: Extraviado");
            String nuevoEstado = input2.nextLine();
            intOpcion = 0;
            try {
                intOpcion = Integer.parseInt(nuevoEstado);
            }
            catch (Exception e) {
                System.out.println("Opcion invalida. Por favor intentelo nuevamente.");
                return;
            }
            if (intOpcion == 1){
                librito.estado = "Disponible";
                System.out.println("**Estado actualizado exitosamente!**");
            }
            else if (intOpcion == 2){
                librito.estado = "Prestado";
                System.out.println("**Estado actualizado exitosamente!**");
            }
            else if (intOpcion == 3){
                librito.estado = "Extraviado";
                System.out.println("**Estado actualizado exitosamente!**");
            }
            else{
                System.out.println("Opcion invalida. Por favor intentelo nuevamente.");
            }
        }

        //Eliminar libro
        else if (intOpcion == 3){
            biblioteca.remove(libroIndex);
            System.out.println("**Se ha eliminado exitosamente el libro!**");
        }

        else{

        }
        //input2.close();
    }

    //Funcion Main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Libro> biblioteca = new ArrayList<>();

        while(true){
            System.out.println("\n---------Bienvenido al Sistema de registro y busqueda de libros");
            System.out.println("Seleccione una de las opciones a realizar");
            System.out.println("[1]: Registrar un libro");
            System.out.println("[2]: Buscar un libro");
            System.out.println("[3]: Ver lista de todos los libros");
            System.out.println("[4]: Poblar biblioteca (3 libros)");
            System.out.println("[5]: Salir del programa");
            String opcion = input.next().trim();

            int intOpcion;
            try {
                intOpcion = Integer.parseInt(opcion);
            }
            catch (Exception e) {
                System.out.println("Opcion invalida. Por favor intentelo nuevamente.");
                continue;
            }

            //Registrar libro
            if (intOpcion == 1){
             
                input.nextLine();
                System.out.println("\n--Ingrese el titulo del libro");
                String titulo = input.nextLine().trim();

                System.out.println("\n--Ingrese el autor del libro (separar con coma si es mas de uno)");
                String autor = input.nextLine();

                System.out.println("\n--Ingrese la fecha de edicion del libro");
                String fecha = input.nextLine();

                System.out.println("\n--Ingrese la cantidad de paginas del libro");
                String paginas = input.nextLine();

                System.out.println("\n--Ingrese la editorial del libro");
                String editorial = input.nextLine();

                System.out.println("\n--Ingrese el genero del libro");
                String genero = input.nextLine();

                System.out.println("\n--Ingrese el codigo ISBN del libro");
                String isbn = input.nextLine();

                System.out.println("\n--Ingrese la estante de la biblioteca donde esta libro");
                String estante = input.nextLine();

                System.out.println("\n--Ingrese el estado del libro (Prestado, Disponible o Extraviado)");
                String estado = input.nextLine();

                System.out.println("\n--Ingrese una descripcion del libro");
                String descripcion = input.nextLine();
                
                Libro nuevoLibro = new Libro(titulo, autor, fecha, paginas, editorial, genero, isbn, estante, estado, descripcion);
                System.out.println("\n***Libro registrado con exito***");
                System.out.println(nuevoLibro);
                
                biblioteca.add(nuevoLibro);

            }
            //Buscar Libro
            else if (intOpcion == 2){
                ArrayList<Libro> resultados = new ArrayList<>();
                if (biblioteca.size() == 0){
                    System.out.println("\n**No existen libros registrados en la biblioteca**");
                    continue;
                }
                System.out.println("Ingrese el metodo de busqueda (ingrese la tecla \"s\" para volver atras)");
                System.out.println("[1]: Buscar por titulo");
                System.out.println("[2]: Buscar por autor");
                System.out.println("[3]: Buscar por ISBN");
                Integer seleccion = 0;
                try {
                    seleccion = input.nextInt();
                }
                catch (Exception e) {
                    System.out.println("Opcion invalida. Por favor intentelo nuevamente.");
                    continue;
                }

                //Buscar por titulo
                if (seleccion == 1){
                    input.nextLine();
                    System.out.println("Escriba el titulo que desea buscar");
                    String busqueda = input.nextLine();
                    for (Libro librito : biblioteca) {
                        if (librito.titulo.toLowerCase().contains(busqueda.toLowerCase())){
                            resultados.add(librito);
                        }
                    }
                }
                //Buscar por autor
                else if (seleccion == 2){
                    input.nextLine();
                    System.out.println("Escriba el autor que desea buscar");
                    String busqueda = input.nextLine();
                    for (Libro librito : biblioteca) {
                        if (librito.autor.toLowerCase().contains(busqueda.toLowerCase())){
                            resultados.add(librito);
                        }
                    }
                }
                //Buscar por ISBN
                else if (seleccion == 3){
                    input.nextLine();
                    System.out.println("Escriba el ISBN que desea buscar");
                    String busqueda = input.nextLine();
                    for (Libro librito : biblioteca) {
                        if (librito.isbn.equals(busqueda)){
                            resultados.add(librito);
                        }
                    }
                }

                System.out.println("\n--Resultados de su busqueda");
                int index = 0;
                if (resultados.size() == 0){
                    System.out.println("**No existen libros registrados en la biblioteca**");
                    continue;
                }
                System.out.println("Ingrese el numero del libro con el que desea interactuar (ingrese la tecla \"s\" para volver atras)");
                while (index < resultados.size()){
                    System.out.println("[" + index + "]: " + resultados.get(index));
                    index += 1;
                }
                opcion = input.next().trim();
                try {
                intOpcion = Integer.parseInt(opcion);
                }
                catch (Exception e) {
                    System.out.println("Opcion invalida. Por favor intentelo nuevamente.");
                    continue;
                }

                if (intOpcion >= resultados.size() || intOpcion < 0){
                    System.out.println("Opcion invalida. Por favor intentelo nuevamente");
                }
                else{
                    Libro aux = resultados.get(intOpcion);
                    intOpcion = biblioteca.indexOf(aux);
                    accesoLibro(biblioteca, intOpcion);
                    continue;
                }

            }
            //Ver Lista Libros
            else if (intOpcion == 3){
                int index = 0;
                System.out.println("\n------Lista de todos los Libros registrados");
                if (biblioteca.size() == 0){
                    System.out.println("**No existen libros registrados en la biblioteca**");
                    continue;
                }
                System.out.println("Ingrese el numero del libro con el que desea interactuar (ingrese la tecla \"s\" para volver atras)");
                while (index < biblioteca.size()){
                    System.out.println("[" + index + "]: " + biblioteca.get(index));
                    index += 1;
                }

                opcion = input.next().trim();
                try {
                intOpcion = Integer.parseInt(opcion);
                }
                catch (Exception e) {
                    System.out.println("Opcion invalida. Por favor intentelo nuevamente.");
                    continue;
                }

                if (intOpcion >= biblioteca.size() || intOpcion < 0){
                    System.out.println("Opcion invalida. Por favor intentelo nuevamente");
                }
                else{
                    accesoLibro(biblioteca, intOpcion);
                    continue;
                }


            }

            //Poblar Biblioteca
            else if (intOpcion == 4){
                Libro nuevoLibro = new Libro("Harry Potter y La Piedra Filosofal", "Joanne K. Rowling", "2021", 
                "285", "Salamandra", "Narrativa Juvenil", "9789878000107", "H", "Disponible",
                "El niño ese que es como huerfano pero hace magia");
                biblioteca.add(nuevoLibro);

                nuevoLibro = new Libro("Cancion de Hielo y Fuego 1: Juego de Tronos", "George R. R. Martin", "2015", 
                "800", "Debolsillo", "Fantasia", "9789563251951", "F", "Disponible",
                "El libro basado en la serie Juego de Tronos, o algo asi");
                biblioteca.add(nuevoLibro);

                nuevoLibro = new Libro("Seconds", "Bryan Lee O' Malley", "2014", 
                "336", "Debolsillo", "Literatura contemporanea", "9788490623145", "C", "Prestado",
                "Un comic muy bueno y relativamente corto del creador de Scott Pilgrim");
                biblioteca.add(nuevoLibro);
            }

            //Salir
            else if (intOpcion == 5){
                break;
            }

            else{
                System.out.println("Opcion invalida. Por favor intentelo nuevamente");
                continue;
            }
        }
      

        //input.close();
    }
}
