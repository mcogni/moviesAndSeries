import java.util.Scanner;
import Models.Pelicula;
import Models.Serie;
import Models.PlantillaBase;

public class Menu {
    int option=10;
    public void muestraMenu(){

        Scanner teclado=new Scanner(System.in);
        while(option!=0){
            String menu= """
                --------------------------------------------------------------
                Bienvenido a MOVIES AND SERIES ***Inmersión JAVA ALURA 2024***
                --------------------------------------------------------------
                "Por favor selecciona una opción:"
                1) Registra una película y califícala.
                2) Registra una serie y califícala.
                3) Maratones. Organiza tus tiempos.
                0) SALIR
                --------------------------------------------------------------
                """;
            System.out.println(menu);
            option= teclado.nextInt();
            teclado.nextLine();//reconoce cadenas de texto
            switch (option){
                case 1:
                    System.out.println("Ingresa el título de la pelicula:");
                    String titulo=teclado.nextLine();
                    System.out.println("Ingrese tu calificación (1-5 estrellas):");
                    int calificacion = teclado.nextInt();teclado.nextLine();
                    while (calificacion > 5 || calificacion < 1) {
                        System.out.println("Los valores posibles son 1,2,3,4 o 5");
                        System.out.println("Por favor ingrese una opción válida...");
                        calificacion = teclado.nextInt();teclado.nextLine();
                        }
                    System.out.println("Ingresa el año de lanzamiento: ");
                    int anoLanzamiento=teclado.nextInt();teclado.nextLine();
                    System.out.println("Ingresa el género: ");
                    String genero=teclado.nextLine();
                    System.out.println("Ingresa la duracion en minutos: ");
                    int duracion=teclado.nextInt();teclado.nextLine();

                    Pelicula peliculaUsuario=new Pelicula();
                    System.out.println(peliculaUsuario.muestraIntroduccion());
                    peliculaUsuario.setTitulo(titulo);
                    peliculaUsuario.setCalificacion(calificacion);
                    peliculaUsuario.setAnoLanzamiento(anoLanzamiento);
                    peliculaUsuario.setGenero(genero);
                    peliculaUsuario.setDuracion(duracion);
                    peliculaUsuario.muestraInformacionBasica();
                    break;

                case 2:
                    System.out.println("Ingresa el título de la serie:");
                    String tituloSerie=teclado.nextLine();
                    System.out.println("Ingrese tu calificación (1-5 estrellas):");
                    int calificacionSerie = teclado.nextInt();teclado.nextLine();
                    while (calificacionSerie > 5 || calificacionSerie < 1) {
                        System.out.println("Los valores posibles son 1,2,3,4 o 5");
                        System.out.println("Por favor ingrese una opción válida...");
                        calificacionSerie = teclado.nextInt();teclado.nextLine();
                    }
                    System.out.println("Ingresa el año de lanzamiento: ");
                    int anoLanzamientoSerie = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingresa el género: ");
                    String generoSerie=teclado.nextLine();
                    System.out.println("Ingresa el número de temporadas: ");
                    int temporadas=teclado.nextInt();teclado.nextLine();
                    System.out.println("Ingresa el número de episodios de cada temporada: ");
                    int episodiosPorTemporada=teclado.nextInt();teclado.nextLine();
                    System.out.println("Ingresa la duración de cada episodio en minutos: ");
                    int duracionEpisodio=teclado.nextInt();teclado.nextLine();

                    Serie serieUsuario=new Serie();
                    System.out.println(serieUsuario.muestraIntroduccion());
                    serieUsuario.setTitulo(tituloSerie);
                    serieUsuario.setCalificacion(calificacionSerie);
                    serieUsuario.setAnoLanzamiento(anoLanzamientoSerie);
                    serieUsuario.setGenero(generoSerie);
                    serieUsuario.setTemporadas(temporadas);
                    serieUsuario.setEpisodiosPorTemporada(episodiosPorTemporada);
                    serieUsuario.setDuracionEpisodio(duracionEpisodio);
                    serieUsuario.muestraInformacionBasica();
                    serieUsuario.muestraInfoSeries();
                    break;

                case 3:
                    System.out.println("Ingresa el título de la serie que verás:");
                    String tituloMaraton=teclado.nextLine();
                    System.out.println("Ingresa el número de temporadas: ");
                    int temporadasMaraton=teclado.nextInt();teclado.nextLine();
                    System.out.println("Ingresa el número de episodios de cada temporada: ");
                    int episodiosPorTemporadaMaraton=teclado.nextInt();teclado.nextLine();
                    System.out.println("Ingresa la duración de cada episodio en minutos: ");
                    int duracionEpisodioMaraton=teclado.nextInt();teclado.nextLine();
                    System.out.println("Ingresa el tiempo diario en minutos que dedicarás a la serie: ");
                    int tiempoDiario=teclado.nextInt();teclado.nextLine();

                    Serie maraton=new Serie();
                    maraton.setTitulo(tituloMaraton);
                    maraton.setTemporadas(temporadasMaraton);
                    maraton.setEpisodiosPorTemporada(episodiosPorTemporadaMaraton);
                    maraton.setDuracionEpisodio(duracionEpisodioMaraton);
                    maraton.setTiempoMaraton((double) maraton.getDuracion() /tiempoDiario);
                    System.out.println("Podrás realizar la maratón de la serie "+tituloMaraton+" en aproximadamente "+maraton.getTiempoMaraton()+" días");
                    break;

                    case 0:
                    break;
                default: System.out.println("Opción no válida");
                    break;
            }
        }
    }
}
