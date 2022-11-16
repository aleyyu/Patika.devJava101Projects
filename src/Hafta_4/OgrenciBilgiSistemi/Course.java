package Hafta_4.OgrenciBilgiSistemi;

public class Course {
    String name;
    String code;
    String prefix;
    int note;
    int sozluNotu;
    Teacher teacher;


    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.sozluNotu = 0;
    }

    public void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
            //printTeacher();
        }
        else{
            System.out.println("Öğretmen ve ders bilgisi uyuşmuyor");
        }

    }

    public void printTeacher(){
        this.teacher.print();
    }


}
