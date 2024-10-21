public class Madic extends Hero {
    private int healPoints;

    public Madic(int health, int damage, int healPoints) {
        super(health, damage, "HEALING");
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил супер способность HEALING");
    }

    public void increaseExperience() {
        healPoints += healPoints * 0.1;
    }
}