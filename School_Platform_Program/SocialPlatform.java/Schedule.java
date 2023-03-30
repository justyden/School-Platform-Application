import java.util.LinkedList;

public class Schedule {
    private LinkedList<Course> courses = new LinkedList<>();

    public Schedule() {

    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    public void displayCourses() {
        if (!(this.courses.isEmpty())) {
            for (int i = 0; i < courses.size(); i++) {
                courses.get(i).displayCourse();
            }
        }

        else {
            System.out.println("There are no courses in here.");
        }
    }

    public void checkSchedule() {
        boolean check = true;
        if (!(this.courses.isEmpty())) {
            for (int i = 0; i < courses.size(); i++) {
                for (int j = i + 1; j < courses.size(); j++) {
                    if ((courses.get(i).getRealStartTime() <= courses.get(j).getRealStartTime()) &&
                            (courses.get(j).getRealStartTime() <= courses.get(i).getRealEndTime()) ||
                            (courses.get(i).getRealStartTime() <= courses.get(j).getRealEndTime()) &&
                                    (courses.get(j).getRealEndTime() <= courses.get(i).getRealEndTime())) {
                        System.out.println("The courses " + courses.get(i).getCourseName() +
                                " and " + courses.get(j).getCourseName() + " are at the same time.");
                        check = false;
                    }
                }
            }
        }

        if (check) {
            System.out.println("The schedule is good.");
        }
    }
}