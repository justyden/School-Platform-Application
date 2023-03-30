public class Course {
    private String courseName = "";
    private String courseTimeStart = "";
    private String courseTimeEnd = "";
    private boolean isInMorningStart = false;
    private boolean isInMorningEnd = false;
    private int courseTimeStartValue = 0;
    private int courseTimeEndValue = 0;

    public Course() {
    }

    public Course(String courseName, String courseTimeStart, String courseTimeEnd, boolean isInMorningStart,
            boolean isInMorningEnd) {

        this.courseName = courseName;
        this.courseTimeStart = courseTimeStart;
        this.courseTimeEnd = courseTimeEnd;
        this.isInMorningStart = isInMorningStart;
        this.isInMorningEnd = isInMorningEnd;
        this.courseTimeStartValue = getActualStartTime();
        this.courseTimeEndValue = getActualEndTime();
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseTimeStart(String courseTimeStart) {
        this.courseTimeStart = courseTimeStart;
        this.courseTimeStartValue = getActualStartTime();
    }

    public String getCourseTimeStart() {
        return courseTimeStart;
    }

    public void setCourseTimeEnd(String courseTimeEnd) {
        this.courseTimeEnd = courseTimeEnd;
        this.courseTimeEndValue = getActualEndTime();
    }

    public String getCourseTimeEnd() {
        return courseTimeEnd;
    }

    public void setIsInMorningStart(boolean isInMorningStart) {
        this.isInMorningStart = isInMorningStart;
    }

    public boolean getIsInMorningStart() {
        return isInMorningStart;
    }

    public void setIsInMorningEnd(boolean isInMorningEnd) {
        this.isInMorningEnd = isInMorningEnd;
    }

    public boolean getIsInMorningEnd() {
        return isInMorningEnd;
    }

    public int getRealStartTime() {
        return courseTimeStartValue;
    }

    public int getRealEndTime() {
        return courseTimeEndValue;
    }

    private int getActualStartTime() {
        if (getIsInMorningStart()) {
            return Integer.parseInt(this.getCourseTimeStart());
        }

        else {
            return (Integer.parseInt(this.courseTimeStart) + 1200);
        }
    }

    private int getActualEndTime() {
        if (getIsInMorningEnd()) {
            return Integer.parseInt(this.getCourseTimeEnd());
        }

        else {
            return (Integer.parseInt(this.courseTimeEnd) + 1200);
        }
    }

    private String formatTime() {
        String combinedTime = "";
        String tempStringStart = "";
        String tempStringEnd = "";

        if (this.getIsInMorningStart()) {
            tempStringStart = this.getCourseTimeStart();
            tempStringStart = tempStringStart.substring(0, 2) + ":" +
                    tempStringStart.substring(2) + " A.M.";
        }

        else {
            tempStringStart = this.getCourseTimeStart();
            tempStringStart = tempStringStart.substring(0, 2) + ":" +
                    tempStringStart.substring(2) + " P.M.";
        }

        if (this.getIsInMorningEnd()) {
            tempStringEnd = this.getCourseTimeEnd();
            tempStringEnd = tempStringEnd.substring(0, 2) + ":" +
                    tempStringEnd.substring(2) + " A.M.";
        }

        else {
            tempStringEnd = this.getCourseTimeEnd();
            tempStringEnd = tempStringEnd.substring(0, 2) + ":" +
                    tempStringEnd.substring(2) + " P.M.";
        }

        combinedTime = tempStringStart + " to " + tempStringEnd;
        return combinedTime;

    }

    public void displayCourse() {
        System.out.println(courseName + " " + this.formatTime());
    }
}
