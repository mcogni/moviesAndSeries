package Models;

public class PlantillaBase {

    //atributos comunes a peliculas y series
    private String introduccion;
    private String titulo;
    private int calificacion;
    private int anoLanzamiento;
    private String genero;
    private int duracion;

    //getters y setters
    public String getIntroduccion() {
        return introduccion;
    }
    public void setIntroduccion(String introduccion) {
        this.introduccion = introduccion;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    public int getAnoLanzamiento() {
        return anoLanzamiento;
    }
    public void setAnoLanzamiento(int anoLanzamiento) {
        this.anoLanzamiento = anoLanzamiento;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    //método para visualizar información básica
    public void muestraInformacionBasica(){
        System.out.println(introduccion);
        System.out.println("Título: "+titulo);
        System.out.println("Calificación: "+calificacion+" estrellas");
        System.out.println("Año de lanzamiento: "+anoLanzamiento);
        System.out.println("Género: "+genero);
        System.out.println("Duración: "+getDuracion()+" minutos");
    }
}
