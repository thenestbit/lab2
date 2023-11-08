package Moves;
import ru.ifmo.se.pokemon.*;
public class RockThrow extends PhysicalMove {
    public RockThrow() {
        super(Type.ROCK, 50, 90);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        System.out.println("Меня тыкнули!");
    }

    @Override
    protected String describe() {
        return "бросает камень и наносит урон";
    }
}
