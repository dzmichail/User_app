package newapp;

public class Car {
    private String color;
    private String type;

    public Car (String color, String type){
        this.type=type;
        this.color=color;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color){
        this.color=color;
    }

    public String getType(){
        return this.type;
    }

    public void setType(String type){
        this.type=type;
    }
}
