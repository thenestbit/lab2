import Pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();
        Pokemon Heliolisk = new Heliolisk("Хелиолиск", 1);
        Pokemon Helioptile = new Helioptile("Гелиоптиль", 1);
        Pokemon Lunatone = new Lunatone("Лунатон", 1);
        Pokemon Mamoswine = new Mamoswine("Мамосвайн", 1);
        Pokemon Piloswine = new Piloswine("Пилосвайн", 1);
        Pokemon Swinub = new Swinub("Свинаб", 1);
        battle.addAlly(Heliolisk);
        battle.addAlly(Helioptile);
        battle.addAlly(Lunatone);
        battle.addFoe(Mamoswine);
        battle.addFoe(Piloswine);
        battle.addFoe(Swinub);
        battle.go();
    }
}