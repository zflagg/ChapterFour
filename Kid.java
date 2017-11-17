import java.util.Scanner;
public class Kid
{
    private String name;
    private int test1;
    private int test2;
    private int average;
    Scanner scan = new Scanner(System.in);
    
    public Kid(String nm)
    {
        this.name = nm;
    }
    public void getName() {
        System.out.println("What's their name?");
        name = scan.nextString();
        System.out.println("What did they get on their first test?");
        
    }
    public void inputGrades() {
        
    }
    public void getAverage() {
        
    }
}
