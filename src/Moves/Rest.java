package Moves;
import ru.ifmo.se.pokemon.*;
public class Rest extends SpecialMove{
    public Rest() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect.sleep(p);
    }

    @Override
    protected String describe() {
        return "засыпает...";
    }
}
