public class Student extends Account {
    private String name = "";
    private int id = 0;
    private int age = 0;
    private int year = 0;

    private Grades grade;

    private Contact contact;
    private Contact guardianContact;
    private Contact emergancyContact;

    private Course[] enrolledCourses;

    private Address currentAddress;

    Student() {
        Account account = new Account();
    }

    Student(String inputUserName, String inputPassword) {
        Account account = new Account(inputUserName, inputPassword);
    }

    Student(String inputUserName, String inputPassword, String inputName, int inputId, int inputAge, int inputYear) {
        Account account = new Account(inputUserName, inputPassword);
        name = inputName;
        id = inputId;
        age = inputAge;
        year = inputYear;
    }

    public void addEmergencyContact(Contact inputContact) {
        emergancyContact = inputContact;
    }

    public void enroll(Course inputCourse) {
    }

}
