
package logica;


public class JuegoPokemon {

    public static void main(String[] args) {
        
        //Creacion de los objetos
        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasaur bulba = new Bulbasaur();
        Pikachu pika = new Pikachu();
        
        //lo que hace cada objeto
        //Cada objeto realiza su accion a su manera
        squirtle.atacarAraniazo();
        squirtle.atacarHidroBomba();
        charmander.atacarAraniazo();
        charmander.atacarLanzaLlamas();
        bulba.atacarAraniazo();
        bulba.atacarDrenaje();
        pika.atacarAraniazo();
        pika.atacarImpactrueno();
        
        
        
        
    }
    
}
