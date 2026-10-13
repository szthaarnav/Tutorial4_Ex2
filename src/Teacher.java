public class Teacher extends Person{
    private double salary;
    private String subject;

    public Teacher(){}
    public Teacher(String myName,int myAge, String subject, double salary){
        super(myName,myAge);
        this.subject = subject;
        this.salary= salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
