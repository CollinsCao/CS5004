public class Student {
    private String firstName;
    private String lastName;
    private int studentID;
    private String email;

    public Student(String firstName, String lastName, int studentID, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getEmail() {
        return email;
    }

    public String toFileString() {
        return firstName + " " + lastName + " " + studentID + " " + email;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " | ID: " + studentID + " | Email: " + email;
    }
}
