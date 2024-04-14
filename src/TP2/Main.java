package TP2;

public class Main {
    public static void main(String[] args) {
        // Crear una biblioteca
        Biblioteca sanMartín = new Biblioteca("Biblioteca José de San Martín");

        //Crear los libros
        Libro l1 = new Universitario("Física I","Sears",1990,false,"Ingenieria");
        Libro l2 = new Universitario("Calculo Vectorial","Claudio, Pita",1985,false,"Ingenieria");
        Libro l3 = new Universitario("Química Organica","Monica, Gutierrez y Leticia, Lopez",2000,false,"Profesorado en Química");
                                //Terminar de llenar la info de los libros
        Libro l4 = new Novela("Orgullo y prejuicio","Jane Austen",);
        Libro l5 = new Novela("Frankenstein","Mary Shelley",);
        Libro l6 = new Novela("Cumbres borrascosas","Emily Brontë",);

        Libro l7 = new Infantil("El libro de la selva",);
        Libro l8 = new Infantil("El principito",);
        Libro l9 = new Infantil("Los tres chanchitos",);

        //Agregar Estos libros a la biblioteca
        sanMartín.agregarLibro(l1);
        sanMartín.agregarLibro(l2);
        sanMartín.agregarLibro(l3);
        sanMartín.agregarLibro(l4);
        sanMartín.agregarLibro(l5);
        sanMartín.agregarLibro(l6);
        sanMartín.agregarLibro(l7);
        sanMartín.agregarLibro(l8);
        sanMartín.agregarLibro(l9);

        //Iniciamos los libros en false así que en el metodo ListarDisponibles tiene que salir todos
        sanMartín.librosDisponibles();

        //Uriel necesita el libro de física, pide prestado "Física I"
        sanMartín.prestarLibro("Física I");

        //Uriel pide prestado un libro para su amigo, "Química Organica"
        sanMartín.prestarLibro("Química Organica");

        //Rodrigo Pide prestado de la biblioteca una novela, "Orgullo y prejuicio"
        //tambien pide un libro infantil para su hermanito
        sanMartín.prestarLibro("Orgullo y prejuicio");
        sanMartín.prestarLibro("El principito");

        //Listamos los libros disponibles(En este caso tenemos 4 libros menos
        sanMartín.librosDisponibles();

        //Rodrigo volvio a los dias a devolver el libro del principito y se llevo otros dos libros
        sanMartín.devolverLibro("El principito");
        sanMartín.prestarLibro("El libro de la selva");
        sanMartín.prestarLibro("Frankenstein");


        sanMartín.librosDisponibles();
    }
}
