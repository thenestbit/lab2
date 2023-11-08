package Pokemons;
import Moves.*;
import ru.ifmo.se.pokemon.*;
public class Helioptile extends Pokemon {
    public Helioptile(String name, int level) {
        super(name, level);
        setType(Type.ELECTRIC, Type.NORMAL);
        setStats(44, 38, 33, 61, 43, 70);
        setMove(new LowSweep(), new Rest(), new ChargeBeam());
    }
}
