public class Main {
    public static void main(String[] args) {
        System.out.printf("Hola mundo por 5ta vez");
        System.out.println("Pelicula: 2 tipos de cuidado");
        /* la del moño colorado jsjsjsjsj
        aprendio a usar comentarios se nota
         */
        int fechaDeLanzamiento = 1950;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0) / 3;
        System.out.println(media);
        //pues es como c++ esto de los comentarios.
        String sinopsis = """
                pura pelicula ranchera 
                aguas que balacean personas en la peli
                nose que mas decir
                """ + fechaDeLanzamiento;
        System.out.println(sinopsis);

        int clasificacion = (int) (media / 2);

        System.out.println(clasificacion);




    /*
        // Variable en Celsius
        double celsius = 25.0;

        // Conversión a Fahrenheit usando la fórmula
        double fahrenheit = (celsius * 1.8) + 32;

        // Mostrar resultado con decimales
        System.out.println(celsius + " grados Celsius son " + fahrenheit + " grados Fahrenheit.");

        // Casting a entero para quitar decimales
        int fahrenheitEntero = (int) fahrenheit;

        // Mostrar resultado sin decimales
        System.out.println("Temperatura en Fahrenheit (sin decimales): " + fahrenheitEntero);
    */
    }
}