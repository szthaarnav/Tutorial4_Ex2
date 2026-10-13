public class Main{
    public static void main(String[] args) {
        Person jack = new Person("Jack Brooke", 27,"M");
        System.out.println(jack);
        Student beth = new Student("Elisabeth Smith", 16, "F", 122233);
        System.out.println(beth);
        Teacher sam = new Teacher("Sam Hamilton", 34, "M", "Computer Science",
                50000);
        System.out.println(sam);

//         Person p = new Teacher ("Sam Hamilton", 34, "M", "Computer Science", 50000); //Will work
        //Teacher t = new Person ("Sam Hamilton", 34, "M", "Computer Science", 50000); //Will not work as many constructor values
       // Person s = new Student ("Elisabeth Smith", 16, "F", "122233"); // Won't work as id is String here

        //Each teacher has 3 students assigned as personal tutees. How would you model and implement this
        //relationship?
        //Ans: We would define an array of students of size 3 as a field in  Teacher class and use it

    }
}
