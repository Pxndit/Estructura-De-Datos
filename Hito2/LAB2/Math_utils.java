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
        System.out.println("");
    }
    public void getExtencionFromCI(String ci){
        System.out.println("MUESTRA EXTENCION DE CELULA");
        String ext = " " ;
        //68856338lp
        ext = ci.substring(8);
        //mostrando la extecion
        System.out.println("Extencion = " + ext);
    }

}
