package Moves;
import ru.ifmo.se.pokemon.*;
public class ChargeBeam extends SpecialMove{
    public ChargeBeam() {
        super(Type.ELECTRIC, 50, 90);
    }
    private boolean flag;
    @Override
    public void applySelfEffects(Pokemon p) {
        int chance = (int) (Math.random() * 101);
        if (chance <= 70) flag = true;
        if (flag) {
            p.setMod(Stat.SPECIAL_ATTACK, +1);
        }
    }

    @Override
    protected String describe() {
        if (flag) return "увеличивает специальную атаку на 1";
        else return "";
    }
}
