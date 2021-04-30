public class Main {

	public static void main(String[] args) {
		Student student=new Student();
        student.setFirsName("Ahmet");
        student.setLastName("ERKİN");
        student.setEmail("ahmetergin@gmail.com");
        student.setNationalIdentity("12345678910");
        student.setId(0);
        Student student2=new Student();
        student2.setFirsName("Oğuzhan");
        student2.setLastName("TURAN");
        student2.setEmail("turanoguzhan58@gmail.com");
        student2.setNationalIdentity("45612378965");
        student2.setId(1);

        Instructor instructor=new Instructor();
        instructor.setFirsName("Engin");
        instructor.setLastName("DEMİROĞ");
        instructor.setNationalIdentity("98765432101");
        instructor.setEmail("engindemiroğ@gmail.com");
        instructor.setId(0);

        Instructor instructor2=new Instructor();
        instructor2.setFirsName("Mustafa Murat");
        instructor2.setLastName("COŞKUN");
        instructor2.setNationalIdentity("1256432459");
        instructor2.setEmail("mmuratcoskun@gmail.com");
        instructor2.setId(1);


        UserManager manager=new UserManager();
        System.out.println("Tek tek ekleme:");
        manager.addUser(student);
        manager.addUser(instructor);
        
        InstructorManager instructorManager=new InstructorManager();
        instructorManager.addUser(instructor2);

        StudentManager manager2=new StudentManager();
        manager2.addStudent(student2);

        User[] adduser= {student,instructor};
        System.out.println("Çoklu ekleme");
        manager.addMultiple(adduser);
        System.out.println();




	}

}
