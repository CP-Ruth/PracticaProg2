package Parcial1;

public class Main {
    public static void main(String[] args) {
        //Atletas que participan de los juegos
        Athlete a1 = new Athlete(123451, "Thomas", 1.70, 80, 26);
        Athlete a2 = new Athlete(123452, "Uriel", 1.65, 75, 25);
        Athlete a3 = new Athlete(123453, "Paula", 1.59, 60, 22);
        Athlete a4 = new Athlete(123454, "Nazareno", 1.56, 71, 19);
        Athlete a5 = new Athlete(123455, "Valentina", 1.55, 60, 22);
        Athlete a6 = new Athlete(123456, "Piers", 1.87, 89, 28);
        Athlete a7 = new Athlete(123457, "Jeremias", 1.82, 88,27);

        //Equipos que compiten
        NationalTeam arg = new NationalTeam("Celeste", "Argentina");
        NationalTeam bra = new NationalTeam("verde", "Brasil");
        NationalTeam can = new NationalTeam("Rojo","Canada");

        //Atletas pertenecientes a cada equipo
        arg.add(a1);
        arg.add(a5);
        arg.add(a7);
        bra.add(a3);
        bra.add(a2);
        can.add(a4);
        can.add(a6);

        //Mostramos los atletas de los equipos
        arg.show();
        bra.show();
        can.show();

        //Pruebas
        Test swimming =new Test(101,"Natacion");
        Test archery = new Test(102,"Tiro con arco");
        Test cycling = new Test(103, "Ciclismo");

        //Atletas en cada prueba/Juego
        //Primera prueba code101
        swimming.add(a6);
        swimming.add(a3);
        //Segunda prueba code102
        archery.add(a5);
        archery.add(a2);
        archery.add(a7);
        //Tercera prueba code103
        cycling.add(a1);
        cycling.add(a4);

        //Instalaciones
        Facilities f1 = new Facilities("Espacio deportivo","Seul","SeulSeul","2");
        Facilities f2 = new Facilities("Complejo deportivo","Sejong","SejongSejong","1");

        //Sede de los juegos
        Headquarters first = new Headquarters(1,"25/05/2024","8",swimming,f1);
        Headquarters second = new Headquarters(1,"25/05/2024", "15", archery,f2);
        Headquarters third = new Headquarters(1,"2/05/2024", "8", cycling,f2);


        //Desde Instalacion: Nombre del 3er atleta de la 2da prueba.
        //Sede de la prueba, numero del atleta
        f1.showTestAthle(second,3);
    }

}
