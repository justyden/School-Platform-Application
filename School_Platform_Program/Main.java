public class Main {
    public static void main(String[] args) {
        Course course1 = new Course("Name1", "1145", "0145", true, false);
        Course course2 = new Course("Name2", "0200", "0245", false, false);
        Course course3 = new Course("Name3", "0300", "0415", false, false);
        Course course4 = new Course("Name4", "0500", "0545", false, false);
        Course course5 = new Course("Name5", "0600", "0645", false, false);

        Schedule schedule = new Schedule();

        schedule.addCourse(course1);
        schedule.addCourse(course2);
        schedule.addCourse(course3);
        schedule.addCourse(course4);
        schedule.addCourse(course5);

        schedule.displayCourses();
        schedule.checkSchedule();

    }
}
