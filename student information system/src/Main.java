public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Suzan", "553", "His");
        Teacher t2 = new Teacher("Kenny", "216", "Phy");
        Teacher t3 = new Teacher("Szabolai", "367","Mat");

        Course history = new Course("History", "123", "His");
        Course physics = new Course("Physics", "472", "Phy");
        Course mathematic = new Course("Mathematic", "846", "Mat");

        history.addTeacher(t1);
        physics.addTeacher(t2);
        mathematic.addTeacher(t3);

        Student s1 = new Student("Antony","816",3,history,physics,mathematic);
        s1.addBulkExamNote(20,10,55);
        s1.addFinalGradeNote(70,55,91);
        s1.isPass();

        Student s2 = new Student("Rivaldo","474",2,history,physics,mathematic);
        s2.addBulkExamNote(44,88,95);
        s2.addFinalGradeNote(50,55,71);
        s2.isPass();

        Student s3 = new Student("Nonda","474",2,history,physics,mathematic);
        s3.addBulkExamNote(57,80,55);
        s3.addFinalGradeNote(77,75,81);
        s3.isPass();
    }
}
