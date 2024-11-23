package techCheck;

public class sing {
    private static sing variable=new sing();
    private sing(){}
    public static sing getSing(){
        if(variable==null){
            synchronized (sing.class) {
                if (variable == null) {
                    variable=new sing();
                }
            }

        }
        return variable;
    }
    public void a(){
        System.out.println("Hi ");
    }

    public static void main(String[] args) {
        sing obj=sing.getSing();
        obj.a();
    }
}
