
public class Hat
{
    private boolean worn;
    private int age;
    public Hat(boolean wn, int ag)
    {
        this.worn = wn;
        this.age = ag;
    }
    public void setWorn(boolean wn) {
        this.worn = wn;
    }
    public String toString() {
        return "The hat is worn. " + this.worn;
    }
    public String tooString() {
        return "The hat is " + this.age + " years old.";
    }
}
