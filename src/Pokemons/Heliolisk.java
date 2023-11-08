package Pokemons;
import Moves.*;
import ru.ifmo.se.pokemon.*;
public class Heliolisk extends Helioptile {
    public Heliolisk(String name, int level) {
        super(name, level);
        setType(Type.ELECTRIC, Type.NORMAL);
        setStats(50, 45, 40, 65, 50, 75);
        addMove(new EerieImpulse());
    }
}
