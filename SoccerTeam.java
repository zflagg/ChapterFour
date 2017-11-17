
public class SoccerTeam
{
   
    public SoccerTeam()
    {
        Team acalanes = new Team("Acalanes Soccer", 20);
        Athlete joe = new Athlete("Joe", 16);
        acalanes.addAthlete(joe, 0);
        System.out.println(acalanes);
    }

}
