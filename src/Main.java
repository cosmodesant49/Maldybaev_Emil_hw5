
public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss(100, 10, "Magik");
        System.out.println("boss hp : "+ boss.getBossHp() + ", boss damage : " + boss.getBossDamage()+ ", boss defense : "+ boss.getBossDefense());
        System.out.println("---------------------");
        createHeroes();
    }
    public static void createHeroes(){
        Hero hero = new Hero(100,5, "miss");
        Hero heroNoSkill1 = new Hero(100,5);
        Hero heroNoSkill2 = new Hero(150,3);
            Hero[]heroes = {hero,heroNoSkill1,heroNoSkill2};
        for (int i = 0; i < heroes.length; i++) {
            System.out.println("hero" + (1+i) + ", hp:" + hero.getHp() + "damage:" + hero.getDamage() + ", skill: " + hero.getSkill()  );
            System.out.println("hero" + (1+i) + ", hp:" + hero.getHp() + "damage:" + hero.getDamage()  );
            System.out.println("hero" + (1+i) + ", hp:" + hero.getHp() + "damage:" + hero.getDamage()  );
            return;
        }

    }
}