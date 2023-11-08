package Moves;
import ru.ifmo.se.pokemon.*;
public class LowSweep extends SpecialMove{
    public LowSweep() {
        super(Type.FIGHTING, 65, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPEED, -1);
    }
    @Override
    protected boolean checkAccuracy(Pokemon p1, Pokemon p2) {
        return true;
    }

    @Override
    protected String describe() {
        return "использует LowSweep и уменьшает скорость";
    }
}
