public class Student {
    Course c1;
    Course c2;
    Course c3;
    Course finalGrade;
    String stuNo;
    String name;
    int classes;
    double average;
    double average1;
    double average2;
    double average3;
    boolean isPass;

    Student(String name,String stuNo,int classes,Course c1,Course c2,Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0;
        this.isPass = false;
    }
    public void addBulkExamNote(int note1,int note2,int note3){
        if(note1 >=0 && note1 <=100){
            this.c1.note = note1;
        }
        if(note1 >=0 && note1 <=100){
            this.c2.note = note2;
        }
        if(note1 >=0 && note1 <=100){
            this.c3.note = note3;
        }
    }
    public void addFinalGradeNote(int finalGrade1, int finalGrade2, int finalGrade3) {
        if(finalGrade1 >= 0 && finalGrade1 <= 100)
            this.c1.finalGrade = finalGrade1;
        if(finalGrade2 >= 0 && finalGrade2 <= 100)
            this.c2.finalGrade = finalGrade2;
        if(finalGrade3 >= 0 && finalGrade3 <= 100)
            this.c3.finalGrade = finalGrade3;
    }
    public void calsAvarage() {

        average1 = this.c1.note * 0.8 + this.c1.finalGrade * 0.2;
        average2 = this.c2.note * 0.8 + this.c2.finalGrade * 0.2;
        average3 = this.c3.note * 0.8 + this.c3.finalGrade * 0.2;

        this.average = (average1 + average2 + average3) / 3.0;
    }
    public void isPass(){
        System.out.println("**********************************");
        calsAvarage();
        if(this.average > 55){
            System.out.println(this.name+" successful in her classes and passed the class.");
            this.isPass = true;
        }else{
            System.out.println(this.name+" failed in her classes and failed the class.");
            this.isPass = false;
        }
        printNote();
    }

    public void printNote(){
        System.out.println(this.c1.name + " grade: " + this.c1.note +"\t"+ this.c1.name + " verbal grade: " + this.c1.finalGrade);
        System.out.println(this.c2.name + " grade: " + this.c2.note +"\t"+ this.c2.name + " verbal grade: " + this.c2.finalGrade);
        System.out.println(this.c3.name + " grade: " + this.c3.note +"\t"+ this.c3.name + " verbal grade: " + this.c3.finalGrade);
        System.out.println("Average of All Courses: " + this.average );
    }
}
