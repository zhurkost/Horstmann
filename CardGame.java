public class CardGame {

    public static void main(String[] args) {
        Unit wolf = new Unit(20, 15, 0, 0);
        Unit dragon = new Unit(40, 18, 3, 0);
        Unit spaceMarine = new Unit(20, 22, 0, 0);
        Unit golem = new Unit(100, 16, 2, 0);
        Unit hydra = new Unit(80, 20, 4, 30);
        Unit darkElf = new Unit(60, 25, 0, 50);
        Unit paladin = new Unit(120, 15, 8, 0);
        Unit dracula = new Unit(80, 25, 5, 20);
        Unit ent = new Unit(180, 20, 0, 0);
        Unit assassin = new Unit(50, 35, 0, 30);
        Hero hercules = new Hero(200, 40, 5, 20, 10);
        Hero undead = new Hero(200, 25, 0, 20, 20);

        Team leftTeam = new Team();
        leftTeam.addMember(hercules);
        leftTeam.addMember(golem);
        leftTeam.addMember(spaceMarine);
        leftTeam.addMember(hydra);
        leftTeam.addMember(darkElf);

        Team rightTeam = new Team();
        rightTeam.addMember(dragon);
        rightTeam.addMember(undead);
        rightTeam.addMember(ent);
        rightTeam.addMember(assassin);
        rightTeam.addMember(dracula);

        FightManager f1 = new FightManager();
        System.out.println(f1.fight(leftTeam, rightTeam));
    }


}

class Unit {
    private int health;
    private int damage;
    private int armor;
    private int evasion;

    public Unit(int health, int damage, int armor, int evasion) {
        this.health = health;
        this.damage = damage;
        this.armor = armor;
        this.evasion = evasion;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public int getArmor() {
        return armor;
    }

    public int getEvasion() {
        return evasion;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String toString() {
        return getClass().getName() +
                "[health=" + health +
                ",damage=" + damage +
                ",armor=" + armor +
                ",evasion=" + evasion + "]";
    }
}

class Hero extends Unit {
    int maxHealth;
    int regeneration;

    public Hero(int health, int damage, int armor, int evasion, int regeneration) {
        super(health, damage, armor, evasion);
        this.regeneration = regeneration;
        this.maxHealth = health;
    }

    public void regenerate() {
        if ((getHealth() + regeneration) < maxHealth) {
            setHealth(getHealth() + regeneration);
        } else {
            setHealth(maxHealth);
        }
    }

}

class Team {
    public final int TEAM_CAPACITY = 5;
    private Unit[] members = new Unit[TEAM_CAPACITY];
    private int teamSize = 0;

    public void addMember(Unit fighter) {
        this.members[teamSize] = fighter;
        this.teamSize++;
    }

    public void clearSlot(int slotNumber) {
        this.members[slotNumber] = null;
        this.teamSize--;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public Unit getMember(int i) {
        return members[i];
    }
}

class FightManager {
    private int turn;
    private int victoryCounter;

    public int fight(Team team1, Team team2) {
        while (team1.getTeamSize() > 0 && team2.getTeamSize() > 0 && turn < 100) {
            for (int i = 0; i < team1.TEAM_CAPACITY; i++) {
                if (team1.getMember(i) != null) {
                    if (isEnemyOpposite(team2, i)) {
                        attack(team1.getMember(i), team2.getMember(i));
                        if (team2.getMember(i).getHealth() <= 0) {
                            team2.clearSlot(i);
                        }
                    } else {
                        victoryCounter += team1.getMember(i).getDamage();
                    }
                }
            }
            for (int i = 0; i < team2.TEAM_CAPACITY; i++) {
                if (team2.getMember(i) != null) {
                    if (isEnemyOpposite(team1, i)) {
                        attack(team2.getMember(i), team1.getMember(i));
                        if (team1.getMember(i).getHealth() <= 0) {
                            team1.clearSlot(i);
                        }
                    } else {
                        victoryCounter -= team2.getMember(i).getDamage();
                    }
                }
            }
            turn++;
            System.out.println(turn);
        }
        return victoryCounter;
    }

    private void attack(Unit attacker, Unit defender) {
        int accuracy = (int) (Math.random() * 100);
        if (accuracy > defender.getEvasion()) {
            int remainingHealth = defender.getHealth() - (attacker.getDamage() - defender.getArmor());
            defender.setHealth(remainingHealth);

        }
    }

    private boolean isEnemyOpposite(Team team, int slotNumber) {
        return team.getMember(slotNumber) != null;
    }

}