package Hafta_4.OgrenciBilgiSistemi;

public class Student {
    String name;
    int studentNo;
    String classes;
    Course math;
    Course physics;
    Course chemistry;
    double average;
    boolean isPass;

    public Student(String name, int studentNo, String classes, Course math, Course physics, Course chemistry) {
        this.name = name;
        this.studentNo = studentNo;
        this.classes = classes;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        //this.average = average;
        calcAverage();
        this.isPass = false;
    }


    public void addBulkExamNote(int math, int physics, int chemistry){
        if(math <= 100 && math >= 0){
            this.math.note = math;
        }
        if(physics <= 100 && physics >= 0){
            this.physics.note = physics;
        }
        if(chemistry <= 100 && chemistry >= 0){
            this.chemistry.note = chemistry;
        }
    }

    public void addSozluNote(int math, int physics, int chemistry){
        if(math <= 100 && math >= 0){
            this.math.sozluNotu = math;
        }
        if(physics <= 100 && physics >= 0){
            this.physics.sozluNotu = physics;
        }
        if(chemistry <= 100 && chemistry >= 0){
            this.chemistry.sozluNotu = chemistry;
        }
    }

    public void isPass(){
        if(this.math.note == 0 ||this.physics.note == 0 ||this.chemistry.note == 0){
            System.out.println("Notlar tam olarak girilmemiş.");
        }
        else {
            this.isPass = isCheckPass();
            System.out.println("Ortalama: " + this.average);
            if(this.isPass){
                System.out.println("Sınıfı geçti");
            }
            else{
                System.out.println("Sınıfta kaldı");
            }
        }
    }

    public void calcAverage(){
        this.average = (((this.math.note*0.8) + (this.math.sozluNotu*0.2)) +
                        ((this.physics.note*0.8) + (this.physics.sozluNotu*0.2)) +
                        ((this.chemistry.note*0.8) + (this.chemistry.sozluNotu*0.2))) / 3.0;
    }

    public boolean isCheckPass(){
        calcAverage();
        return this.average > 55;
    }

    public void printNote(){
        System.out.println(math.name + " Notu\t:" + math.note);
        System.out.println(physics.name + " Notu\t\t:" + physics.note);
        System.out.println(chemistry.name + " Notu\t\t:" + chemistry.note);
    }

    public void printSozluNote(){
        System.out.println(math.sozluNotu + " Sözlü Notu\t:" + math.sozluNotu);
        System.out.println(physics.sozluNotu + " Sözlü Notu\t:" + physics.sozluNotu);
        System.out.println(chemistry.sozluNotu + " Sözlü Notu\t:" + chemistry.sozluNotu);
    }
}
