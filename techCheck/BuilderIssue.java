package techCheck;

public class BuilderIssue
{
    int age;
    int accountNo;
    String name;
    String address;
    public BuilderIssue(int age,int accountNo,String name,String address){
        this.age=age;
        this.accountNo=accountNo;
        this.name=name;
        this.address=address;
    }
    public String toString(){
        return "My name is "+name+" and i am from "+address+" and i have age "+age+" i have one bank account No of SBI "+accountNo;
    }
    public static void main(String[] args) {
        BuilderIssue obj=new BuilderIssue(10,290808,"Shiv kant","Patna");
        System.out.println(obj);
    }
}
