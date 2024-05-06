package Models;

public class Serie extends PlantillaBase{

    //atributos propios de series
    private int temporadas;
    private int episodiosPorTemporada;
    private int duracionEpisodio;
    private int tiempoDiario;
    private double tiempoMaraton;

    //getters y setters
    public int getTemporadas() {
        return temporadas;
    }
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }
    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }
    public int getDuracionEpisodio() {
        return duracionEpisodio;
    }
    public void setDuracionEpisodio(int duracionEpisodio) {
        this.duracionEpisodio = duracionEpisodio;
    }
    public int getTiempoDiario() {
        return tiempoDiario;
    }
    public void setTiempoDiario(int tiempoDiario) {
        this.tiempoDiario = tiempoDiario;
    }
    public double getTiempoMaraton() {
        return tiempoMaraton;
    }
    public void setTiempoMaraton(double tiempoMaraton) {
        this.tiempoMaraton = tiempoMaraton;
    }

    public String muestraIntroduccion() {
        String introduccion="-----Información sobre esta serie-----";
        return introduccion;
    }

    @Override
    public int getDuracion() {
        return getTemporadas()*getEpisodiosPorTemporada()*getDuracionEpisodio();
    }

    public void muestraInfoSeries(){
        System.out.println("Temporadas: "+temporadas);
        System.out.println("Episodios por temporada: "+episodiosPorTemporada);
        System.out.println("Duración de cada episodio: "+duracionEpisodio);
    }

}
