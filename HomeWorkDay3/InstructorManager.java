public class InstructorManager  {
    public void addUser (Instructor user){
        System.out.println(user.getFirsName()+" "+user.getLastName()+ " "+user.getId()+"ID'siyle eklendi");
    }
    public void deleteUser(Instructor user){
        System.out.println(user.getId()+"ID'li eğitmen silindi");
    }
    
}
