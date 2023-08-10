package logica;


public abstract class Pokemon {
    
    protected int numPokedex;
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;
    
    
    //asi se declara un metodo en una clase abstracta
    //para una interfaz no hace falta utilizar abstract
    protected abstract void atacarPlacaje();
    protected abstract void atacarAraniazo();
    protected abstract void atacarMordisco();
    
    
    
}
