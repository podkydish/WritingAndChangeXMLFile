public class Student {
    private int id;
    private String name;
    private int age;
    private String academicCourse;

    public Student() {
    }

    public Student(int id, String name, int age, String academicCourse) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.academicCourse = academicCourse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getacademicCourse() {
        return academicCourse;
    }

    public void setacademicCourse(String academicCourse) {
        this.academicCourse = academicCourse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}