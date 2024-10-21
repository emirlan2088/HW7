public class Main {
    public static void main(String[] args) {
        Hero[] heroes = new Hero[]{
                new Magic(100, 30),
                new Madic(80, 10, 50),
                new Warrior(120, 40)
        };

        for (Hero hero : heroes) {
            hero.applySuperAbility();
            if (hero instanceof Madic) {
                Madic medic = (Madic) hero; // Приведение типов
                medic.increaseExperience(); // Увеличиваем опыт лечения
            }
        }
    }
}