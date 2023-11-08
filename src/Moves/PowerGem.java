package Moves;
import ru.ifmo.se.pokemon.*;
public class PowerGem extends PhysicalMove{
    public PowerGem() {
        super(Type.ROCK, 80, 100, 0,1);
    }

    @Override
    protected boolean checkAccuracy(Pokemon p1, Pokemon p2) {
        return true;
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        System.out.println(p.toString() + ": ай, меня тыкнули!");
    }

    @Override
    protected String describe() {
        return "применяет атаку PowerGem и наносит урон";
    }
}
