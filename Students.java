
// Created the class Pupil


class Pupil {
    int reg;
    String name;
    int marks;
}

// Created class Student with the main method

public class Students {

    // Main method

    public static void main(String[] args) {

        // Pupil pupils [] = new Pupil[4];

        // pupil objects

        Pupil p1 = new Pupil();
        p1.name = "Elvis";
        p1.reg = 02;
        p1.marks = 45;

        Pupil p2 = new Pupil();

        p2.name = "Mariga";
        p2.reg = 03;
        p2.marks = 85;

        Pupil p3 = new Pupil();

        p3.name = "Mayaka";
        p3.reg = 80;
        p3.marks = 95;

        // Created an array for the pupils

        Pupil pupils[] = new Pupil[3];
        pupils[0] = p1;
        pupils[1] = p2;
        pupils[2] = p3;

        // For each loop or advanced lopp

        for (Pupil stude : pupils) {
            System.out.println(stude.name + ": " + stude.reg + ", marks:" + stude.marks);
        }

        System.out.println( "----------------------");

        // Normal for loop
        for (int i = 0; i < pupils.length; i++) {
            System.out.println(pupils[i].name + " : " + pupils[i].reg + ", Mark:" + pupils[i].marks);
        }
    }

}
