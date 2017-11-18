package com.springboot;
 
import java.net.URI;
import java.util.LinkedHashMap;
import java.util.List;

import com.springboot.model.User;
import org.springframework.web.client.RestTemplate;
 

public class SpringBootRestTestClient {
 
    public static final String REST_SERVICE_URI = "http://localhost:8080/SpringBootRestApi/api";
     
    /* GET */
    @SuppressWarnings("unchecked")
    private static void listAllUsers(){
        System.out.println("Testing listAllUsers API-----------");
         
        RestTemplate restTemplate = new RestTemplate();
        List<LinkedHashMap<String, Object>> usersMap = restTemplate.getForObject(REST_SERVICE_URI+"/user/", List.class);
         
        if(usersMap!=null){
            for(LinkedHashMap<String, Object> map : usersMap){
                System.out.println("User : id="+map.get("id")+","
                		+ " Firstname="+map.get("fName")+", "
                		+ "Lastame="+map.get("lName")+","
                				+  " BirthDate="+map.get("birthDate")+","
                		+ "Email="+map.get("email"));
            }
        }else{
            System.out.println("No user exist----------");
        }
    }
     
      /* POST */
    private static void createUser() {
        System.out.println("Testing create User API----------");
        RestTemplate restTemplate = new RestTemplate();
        User user = new User(0,"Sarah","raut","dd.@g.com",12121,"1-1-2019");
        URI uri = restTemplate.postForLocation(REST_SERVICE_URI+"/user/", user, User.class);
        System.out.println("Location : "+uri.toASCIIString());
    }
 
    /* PUT */
    private static void updateUser() {
        System.out.println("Testing update User API----------");
        RestTemplate restTemplate = new RestTemplate();
        User user = new User(0,"Sarah","raut","AAAAAAAAAAA.@g.com",12121,"1-1-2019");
        restTemplate.put(REST_SERVICE_URI+"/user/1", user);
        System.out.println(user);
    }
 
    /* DELETE */
    private static void deleteUser() {
        System.out.println("Testing delete User API----------");
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(REST_SERVICE_URI+"/user/1");
    }
 
 
 
    public static void main(String args[]){
      //  listAllUsers();
    
      //  createUser();
     
       // updateUser();
       
        //deleteUser();
        //listAllUsers();
    
    }
}