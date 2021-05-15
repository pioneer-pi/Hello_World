package normal_code.L6;
//Collection

import java.util.*;
public class p6 {
    public static void main(String[] args) {
        User user1 = new User(1,"user1","H");
        User user2 = new User(2,"user2","W");
        User user3 = new User(3,"user3","W");
        User user4 = new User(4,"user4","Z");
        Set<User> set = new HashSet<>();
        set.add(user1);
        set.add(user2);
        set.add(user3);
        set.add(user4);
        toMap(set);
        }

    private static void toMap(Set<User> users){
        Map<String,List<User>> userMap = new HashMap<>();
        for (User u:users){
            if(userMap.get(u.getCity())==null){
                List<User> userList = new ArrayList<>();
                userList.add(u);
                userMap.put(u.getCity(),userList);
            }
            else{
                userMap.get(u.getCity()).add(u);
            }
        }
        for (String str1:userMap.keySet()){
            for (User u:userMap.get(str1)){
                System.out.println("city: " + str1 +",name: " + u.getName());
            }
        }

    }
}
