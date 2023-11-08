package Moves;
import ru.ifmo.se.pokemon.*;

public class DoubleHit extends PhysicalMove{
    public DoubleHit() {
        super(Type.NORMAL, 35, 90, 0,2);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        System.out.println("Меня тыкнули!");
    }

    @Override
    protected String describe() {
        return "применяет атаку DoubleHit и бьет два раза";
    }
}

