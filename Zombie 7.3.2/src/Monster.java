public abstract class Monster extends Entity implements Fighter {
    Monster (String name, int force){
        super(name,force);
    }

    public Monster(String name) {
        super(name);
    }

    @Override
    public void attack(Entity m) {

    }

    public abstract void attack(Monster monster);
}