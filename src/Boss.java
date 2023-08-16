public class Boss {
    private int bossHp;
    private int bossDamage;
    private String bossDefense;
    public Boss(int bossHp, int bossDamage, String bossDefense){
        this.bossHp=bossHp;
        this.bossDamage=bossDamage;
        this.bossDefense=bossDefense;
    }


    public int getBossHp() {
        return this.bossHp;
    }

    public int getBossDamage() {
        return this.bossDamage;
    }

    public String getBossDefense() {
        return this.bossDefense;
    }

    public void setBossHp(int bossHp) {
        if (bossHp <= 0) {
            System.out.println("boss hp must be more 0 ");
        } else{
            this.bossHp = bossHp;
    }
}
    public void setBossDamage(int bossDamage) {
        if (bossDamage <= 0) {
            System.out.println("boss damage must be more then 0");
        } else {
            this.bossDamage = bossDamage;
        }
    }
    public void setBossDefense(String bossDefense) {
        this.bossDefense = bossDefense;
    }

}
