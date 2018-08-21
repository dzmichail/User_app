package newapp;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final ObjectMapper objectMapper;

    @Autowired
    public Controller(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public void indexSave(@RequestParam(required = true ) String name, @RequestParam(required = true) String dateofbird,  String sex){
//        User myuser = new User(name, dateofbird, sex);
//        myuser.createLog();
//        return myuser;

        User user = new User(name, dateofbird, sex);

        IUserServiceJson service = new UserServiseJson();
        service.save(user);
    }

    @RequestMapping(value="/get", method=RequestMethod.POST)
    public User indexGet(@RequestParam(required = true) String name){
        IUserServiceJson service = new UserServiseJson();
        User user =  service.get(name);
        return user;
    }
}
