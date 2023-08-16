
public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossDamage(50);
        boss.setBossHp(1000);
        boss.setBossDefense("Magic");
        System.out.println("boss damage:"+boss.getBossDamage());
        System.out.println("boos hp:"+boss.getBossHp());
        System.out.println("boos defense:"+boss.getBossDefense());
        System.out.println("---------------------");
        createHeroes();
    }

    public static void createHeroes() {
        Hero hero = new Hero(100, 5, "miss");
        Hero heroNoSkill1 = new Hero(100, 5);
        Hero heroNoSkill2 = new Hero(150, 3);
        Hero[] heroes = {hero, heroNoSkill1, heroNoSkill2};
        for (int i = 0; i < heroes.length; i++) {
            Hero madeHero = heroes[i];
            System.out.println("hero" + (i + 1) + ", hp:" + madeHero.getHp() + " damage:" + madeHero.getDamage() + ", skill: " + madeHero.getSkill());
            return;
        }

    }
}