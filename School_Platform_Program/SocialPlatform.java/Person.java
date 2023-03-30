public class Person extends Account {
    protected String name = "";
    protected int id = 0;
    protected int age = 0;
    protected int year = 0;

    protected Schedule schedule = new Schedule();

    private Address currentAddress;

    Person() {
    }

    Person(String inputUserName, String inputPassword) {
        this.userName = inputUserName;
        this.password = inputPassword;
    }

    Person(String inputUserName, String inputPassword, String inputName, int inputId, int inputAge, int inputYear) {
        Account account = new Account(inputUserName, inputPassword);
        name = inputName;
        id = inputId;
        age = inputAge;
        year = inputYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setID(int inputID) {
        this.id = inputID;
    }

    public int getID() {
        return id;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void displaySchedule() {
        System.out.println(name + " Schedule"); 
        schedule.displayCourses();
        }
    }

