package buoi4;

public abstract class Character {
    WeaponBehavior weaponBehavior;

    abstract void fight();

    public void setWeaponBehavior(WeaponBehavior w) {
        this.weaponBehavior = w;
    }

}
