
public class Pet
{
    private String name;
    private boolean alive;
    private int age;
    public static int numPets;
    public Pet(String nm, boolean al, int ag)
    {
        this.name = nm;
        this.alive = al;
        numPets++;
    }
    public static void example() {
        System.out.println("This is static!");
    }
    public String getName() {
        return this.name;
    }
    public void setAlive(boolean al) {
        this.alive = al;
    }
    public String toString() {
        return "This pet is named: " + this.name;
    }
}
