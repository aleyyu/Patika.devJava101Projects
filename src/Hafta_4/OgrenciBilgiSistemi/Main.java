package Hafta_4.OgrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        Course math = new Course("Matematik", "MAT101", "MAT");
        Course physics = new Course("Fizik", "FZK101", "FZK");
        Course chemistry = new Course("Kimya", "KMY101", "KMY");

        math.addTeacher(t1);
        physics.addTeacher(t2);
        chemistry.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 473, "140144015", math, physics, chemistry);
        Student s2 = new Student("Güdük Necmi", 27, "2211133", math, physics, chemistry);
        Student s3 = new Student("Hayta İsmail", 373, "221121312", math, physics, chemistry);

        s1.addBulkExamNote(95, 85, 88);
        s1.printNote();
        s1.addSozluNote(100, 95, 98);
        s1.printSozluNote();
        s1.isPass();



    }
}
