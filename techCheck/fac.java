package techCheck;
interface epam{
    void desc();
}
class HR implements epam{
    public void desc(){
        System.out.println("I am HR departement");
    }
}
class IT implements epam{
    public void desc(){
        System.out.println("I am IT departement");
    }
}
class Marketing implements epam{
    public void desc(){
        System.out.println("I am Marketing departement");
    }
}
class CEO {
    public epam getcall(String str){
        if(str=="IT"){
            return new IT();
        }
        else if(str.equalsIgnoreCase("HR")){
            return  new HR();
        }
        else {
            return new Marketing();
        }
    }
}
public class fac {
    public static void main(String[] args) {


        CEO obj = new CEO();
        epam obj1 = obj.getcall("hr");
        obj1.desc();
    }
}
