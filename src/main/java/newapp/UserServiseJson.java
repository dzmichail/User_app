package newapp;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class UserServiseJson implements IUserServiceJson {
    public void save(User user){
        ObjectMapper objectMapper = new ObjectMapper();
        try{
            objectMapper.writeValue(new File("target/" +user.getName() + ".json"), user);
        }catch (IOException ex){
            ex.printStackTrace();
        }

    }
    public User get(String name){
        ObjectMapper objectMapper= new ObjectMapper();
        try{
             User user = objectMapper.readValue(new File( "target/" + name+".json"), User.class);
             return  user;
        }catch (IOException ex){
            ex.printStackTrace();
            return new User("null", "null", "null");
        }

    }

}
