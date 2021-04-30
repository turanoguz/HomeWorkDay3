

public class UserManager {
    public void addUser(User user){
        System.out.println("Kullanıcı başarıyla eklendi\n"+
                            user.getFirsName()+user.getLastName());
    }

    public void addMultiple(User[] user ){
        for (User user2 : user) {
            addUser(user2);
        }
    }
    
    public void deleteUser(User user){
        System.out.println(user.getFirsName()+user.getLastName()+"başarıyla silindi");

    }
    

}
