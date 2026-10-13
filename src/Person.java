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
}
