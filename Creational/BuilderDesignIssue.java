package Creational;

class Laptop{
    private String os;
    private String processor;
    private double screensize;
    private int battery;
    private int camera;
    public Laptop(String os,String processor,double screensize,int battery,int camera){
        super();
        this.os=os;
        this.processor=processor;
    }
    @Override
     public String toString(){
        return "Creational.Laptop[os="+os+",processor="+processor+",screensize="+screensize+",battery="+battery+",camera="+camera+"]";
    }
}
public class BuilderDesignIssue {
    public static void main(String[] args) {
Laptop obj=new Laptop("hp","Intel Core",14,8000,14);
        System.out.println(obj);
    }
}
