import java.util.ArrayList;

public class StudentPractice {
    public static void main(String[] args){
        //insantiate your Student class below
        Student student = new Student("Nick", 12, 1, 3.5);
        System.out.println("Name: " + student.getName());
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Credits: " + student.getNumberOfCredits());
        System.out.println("GPA: " + student.getGpa());


    }
    public class Course {
        private String topic;
        private String instructor;
        private ArrayList<Student> enrolledStudents;
    }
    public class Teacher {
        private String firstName;
        private String lastName;
        private String subject;
        private Integer yearsTeaching;

        public Teacher(String firstName, String lastName, String subject, Integer yearsTeaching) {
           this.firstName = firstName;
           this.lastName = lastName;
           this.subject = subject;
           this.yearsTeaching = yearsTeaching;
        }
        public void setFirstName(String firstName){
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public void setYearsTeaching(Integer yearsTeaching) {
            this.yearsTeaching = yearsTeaching;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getSubject() {
            return subject;
        }

        public Integer getYearsTeaching() {
            return yearsTeaching;
        }

    }

}
