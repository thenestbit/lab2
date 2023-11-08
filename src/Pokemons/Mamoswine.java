package Pokemons;
import Moves.*;
import ru.ifmo.se.pokemon.*;
public class Mamoswine extends Swinub{
    public Mamoswine(String name, int level) {
        super(name, level);
        setType(Type.ICE, Type.GROUND);
        setStats(150, 150, 100, 80, 80, 50);
        setMove(new Confide(), new AncientPower(), new DoubleHit(), new IcyWind());
    }
}
