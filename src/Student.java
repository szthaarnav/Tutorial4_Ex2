public class Student extends Person{
    private int idNum;
    private double fee;
    private int grade;
    public Student(){}

    public Student(String myName, int myAge, String myGender, int idNum){
        super(myName,myAge,myGender);
        this.idNum = idNum;
    }

    public int getIdNum(){
        return idNum;
    }
    public void setIdNum(int idNum){
        this.idNum = idNum;
    }
    public double getFee(){
        return fee;
    }
    public void setFee(double fee){
        this.fee = fee;
    }
    public int getGrade(){
        return grade;
    }
    public void setGrade(int grade){
        this.grade = grade;
    }

    @Override
    public String toString() {
        return super.toString()+ ", Id: "+idNum+ ", Fee: "+fee+ ", Grade: "+grade;
    }
}
