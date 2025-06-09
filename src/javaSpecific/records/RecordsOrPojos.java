package javaSpecific.records;

public class RecordsOrPojos {

    // Class definition
    private static class UserClass {
        private String firstName;
        private String lastName;
        private String email;
        private int age;

        public UserClass(String firstName, String lastName, String email, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.age = age;
        }

        @Override
        public String toString() {
            return "UserClass{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", email='" + email + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    // Record - in far lesser lines we have the same information
    public record UserRecord(String firstName, String lastName, String email, int age) {
    } // final; implicitly extend the `java.lang.Record` class

    public static void main(String[] args) {
        UserClass uc = new UserClass("John", "Doe", "john@email.com", 56);
        UserRecord ur = new UserRecord("Jane", "Doe", "jane@email.com", 65);
        System.out.println("Class:  " + uc);
        System.out.println("Record: " + ur); //Records automatically generates hashCode(), equals(), getter methods, and toString() method code for the class.
    }
}
