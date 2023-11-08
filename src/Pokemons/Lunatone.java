package Pokemons;
import Moves.*;
import ru.ifmo.se.pokemon.*;
public class Lunatone extends Pokemon {
    public Lunatone(String name, int level) {
        super(name, level);
        setType(Type.ROCK, Type.PSYCHIC);
        setStats(73, 100, 60, 100, 60, 65);
        setMove(new PowerGem(), new RockThrow(), new Facade(), new Harden());
    }
}
