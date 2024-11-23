package Structural.Decorator;
//base
interface assets{
    String getDesc();
    double getVal();
}
// concrete components
class StudentAssets implements assets{
    public String desc;
    public double price;
    public StudentAssets(String desc,double price){
        this.desc=desc;
        this.price=price;
    }

    public String getDesc(){
        return  desc;
    }
    public double getVal(){
        return  price;
    }
}
//Decorator
class AssertDecorator implements assets{
    public  assets Assert;
    public AssertDecorator (assets Assert){
        this.Assert=Assert;
    }
    public String getDesc(){
        return Assert.getDesc();
    }
    public double getVal(){
        return Assert.getVal();
    }
}
//concreate decorator
class HR extends AssertDecorator{
    public HR(assets Assert){
        super(Assert);
    }
    public  String getDesc(){
        return super.getDesc()+", Bag from HR";
    }
    public double getVal(){
        return super.getVal()+1000;
    }
}
class IT extends AssertDecorator{
    public IT (assets Assert){
        super(Assert);
    }
    public String getDesc(){
        return super.getDesc()+",laptop from IT";
    }
    public double getVal(){
        return super.getVal()+150000;
    }
}
class Policy extends AssertDecorator{
    public Policy (assets Assert){
        super(Assert);
    }
    public String getDesc(){
        return super.getDesc()+",laptop from IT";
    }
    public double getVal(){
        return super.getVal()+150000;
    }
}
public class decorator {
    public static void main(String[] args) {
        assets obj=new StudentAssets("Earbuds",1000);
        obj=new AssertDecorator(obj);
        obj=new HR(obj);
        obj=new IT(obj);
        obj=new Policy(obj);
        System.out.println("Assets which i have "+obj.getDesc());
        System.out.println("Total Price " +obj.getVal());
    }
}
