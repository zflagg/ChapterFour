
public class Team
{
    private String teamName;
    private Athlete[] members;
    public Team(String name, int size)
    {
        this.teamName = name;
        this.members = new Athlete[size];
    }
    public void addAthlete(Athlete a, int index) {
        members[index] = a;
    }
    public String toString() {
        String output = "The team members for " + this.teamName + "\n";
        for (Athlete a : members) {
            output += a + "\n";
        }
        return output;
    }
}
