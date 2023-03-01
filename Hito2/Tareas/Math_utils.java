public class Math_utils {
    private String nameAPP;
    private String version;
    private int year;
    private int limite;
    private int i;
    public Math_utils(){
         this.i = 1;
         this.limite = 10;
         this.nameAPP = "GOOapp";
         this.version = "0.1v";
         this.year =2022;
    }
    public void printApp(){
        System.out.println(nameAPP+" - "+version+" - "+year);
    }
    public void generateNaturaNumers(int limit){
        for (int i=1;i<=limit;i++){
            System.out.print(i+",");
        }
    }
    public void pairNumbers(int limit){
        for (int i=1;i<=limit;i++){
            if (i%2==0)
                System.out.print(i+",");
        }
    }
    public void getExtencionFromCI(String limit){

    }

}
