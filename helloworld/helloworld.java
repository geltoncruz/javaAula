public class HelloWorld{

     public static void main(String []args){
         
         Pessoa Gelton = new Pessoa();
         Pessoa Emmanuelle = new Pessoa();
         Pessoa Alex = new Pessoa();
         Gelton.nome = "Cruz";
         System.out.println(Gelton.nome);
         Emmanuelle.nome = "Sara";
         System.out.println(Emmanuelle.nome);
         Alex.nome = "Barbosa";
         System.out.println(Alex.nome);
         //Emmanuelle.peso = (float) 158.300;
         Emmanuelle.getPeso();
         System.out.println(Emmanuelle.getPeso());
         Alex.setPeso(18.7f);
         Emmanuelle.setPeso(158.300f);
         System.out.println("Alex pesa: "+Alex.getPeso());
         System.out.println("Sara Pesa: "+Emmanuelle.getPeso());
        
     }
}
