package Encapsulation;

public class Main {
    public static void main(String[] args) {

        //No new object created for each student in order to provide memory saving.
        //This project demonstrates the use of encapsulation to store student data by saving memory too.

        Student std = new Student();
        //student 1 :
        std.setStdName("volkan");
        std.setStdId("v123");
        std.setStdAge(18);
        std.setStdGpa(3.99);
        std.setStdHeight(1.70);
        std.getAll();


        //student 2 :
        std.setStdName("omar");
        std.setStdId("v328");
        std.setStdAge(18);
        std.setStdGpa(3.30);
        std.setStdHeight(1.73);
        std.getAll();

        //student 3 :
        std.setStdName("jack");
        std.setStdId("v67");
        std.setStdAge(18);
        std.setStdGpa(4.53);
        std.setStdHeight(1.83);
        std.getAll();

    }
}
