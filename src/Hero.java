public class Hero {
    private int hp;
    private int damage;
    private String skill;
    public int getHp(){
       return this.hp;
    }
    public int getDamage(){
        return this.hp;
    }
    public String getSkill (){
        return this.skill;
    }
    public Hero (int hp,int damage, String  skill){
        this.hp=hp;
        this.damage=damage;
        this.skill=skill;
    }
    public Hero(int hp, int damage){
        this.hp=hp;
        this.damage=damage;
    }

}
