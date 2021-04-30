public class App {

    public static void main(String[] args) {
        
        User user = new User();
        user.setId(1);
		user.setFirstName("Nur");
		user.setLastName("Vural");
        user.setEmail("nur@gmail.com");
        user.setPassword("1234");

        Instructor instructor = new Instructor();
        instructor.setId(2);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
        instructor.setEmail("engin@gmail.com");
        instructor.setPassword("1234");
        instructor.setCourse("JavaReact");
        
        Student student = new Student();
        student.setId(1);
		student.setFirstName("Nur");
		student.setLastName("Vural");
        student.setEmail("nur@gmail.com");
        student.setPassword("1234");
        student.setSchool("İnönü Üniversitesi");
        student.setEpisode("Bilgisayar Mühendisliği");
        
        StudentManager studentManager = new StudentManager();
        studentManager.studentAdd(student);

        UserManager userManager = new UserManager();
        userManager.userAdd(user);

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.instructorAdd(instructor);
    }
}
