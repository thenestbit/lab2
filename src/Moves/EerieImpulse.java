package Moves;
import ru.ifmo.se.pokemon.*;
public class EerieImpulse extends SpecialMove{
    public EerieImpulse() {
        super(Type.ELECTRIC, 0, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_ATTACK,-1);
    }
    @Override
    protected boolean checkAccuracy(Pokemon p1, Pokemon p2){
        return true;
    }
    @Override
    protected String describe(){
        return "использует атаку EerieImpulse и уменьшает специальную атаку на 2";
    }

}
