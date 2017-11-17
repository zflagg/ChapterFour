
public class Student
{
    private String name;
    private int idNumber;
    
    public Student()
    {
        
    }
    public Student(int num, String nm) {
        this.idNumber = num;
        this.name = nm;
    }
    public int combineIDNumbers() {
        return this.idNumber + bestFriend.idNumber;
    }
    public student newStudent(Student other) {
        Student temp = new Student(other.idNumber, this.name);
    }
    public int getID() {
        return this.idNumber;
    }
    public String toString() {
        return "The Student's name is: " + this.name;
    }
}
