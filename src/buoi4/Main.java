package buoi4;

public class Main {
    
    public static void main(String[] args) {
        Character king = new King();
        Character queen = new Queen();
        Character knight = new Knight();
        Character troll = new Troll();

        AxeBehavior axe = new AxeBehavior();
        BowAndArrowBehavior bowAndArrow = new BowAndArrowBehavior();
        KnifeBehavior knife = new KnifeBehavior();
        SwordBehavior sword = new SwordBehavior();

        System.out.println("Star Program");
        king.fight();
        queen.fight();
        knight.fight();
        troll.fight();

        axe.useWeapon();
        bowAndArrow.useWeapon();
        knife.useWeapon();
        sword.useWeapon();
        
    }

    
}
