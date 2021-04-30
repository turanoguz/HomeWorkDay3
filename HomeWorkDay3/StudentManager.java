public class StudentManager {
    public void addStudent(Student user){
        System.out.println(user.getFirsName()+" "+user.getLastName()+" "+user.getId()+" ID'siyle kayıt edildi");
    }
    public void deleteStudent(Student user){
        System.out.println(user.getId()+" ID'li kullanıcı başarıyla silindi.");
    }
    
}
