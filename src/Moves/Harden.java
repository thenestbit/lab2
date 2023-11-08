package Moves;
import ru.ifmo.se.pokemon.*;
public class Harden extends SpecialMove{
    public Harden() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.DEFENSE,+1);
    }

    @Override
    protected String describe() {
        return "использует Harden и увеличивает защиту на 1";
    }
}
