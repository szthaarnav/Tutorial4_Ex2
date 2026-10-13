public class Person {
    protected String myName;
    protected int myAge;
    protected String myGender;


    public Person(String myName, int myAge, String myGender) {
        this.myName = myName;
        this.myAge = myAge;
        this.myGender = myGender;
    }

    public String toString() {
        return myName+", age: "+myAge+", gender: "+myGender;
    }
    public String getName(){
        return myName;
    }

    public void setName(String myName) {
        this.myName = myName;
    }

    public int getAge(){
        return myAge;
    }

    public void setAge(int myAge) {
        this.myAge = myAge;
    }
    public String getGender(){
        return myGender;
    }
    public void setGender(String myGender){
        this.myGender = myGender;
    }

}
