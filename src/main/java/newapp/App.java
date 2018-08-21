package newapp;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
class App{
    public static void main(String[] args){

//        ObjectMapper objectMapper = new ObjectMapper();
//        Car car = new Car("green", "elephant");
//        try{
//            objectMapper.writeValue(new File("./" + car.getColor()+".json" ), car );
//        }catch (IOException ex){
//            ex.printStackTrace();
//        }



        SpringApplication.run(App.class, args);

        SimpleDateFormat myDateFormat =  new SimpleDateFormat("DD/MM/YYYY:hh:mm");
        Date mydate ;

//        try{
//            mydate = myDateFormat.parse("22/03/2017:12:34");
//            System.out.printf("day is %d  ",mydate.getMonth());
//
//            System.out.println(mydate.toString());
//
//        }catch (ParseException ex){
//            ex.printStackTrace();
//            System.exit(123);
//        }



    }
}


