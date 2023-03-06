import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner teclado = new Scanner(System.in)) {
            String abc="abcdefghijklmnopqrstuvwxyz";
            String palabra;
            char opcion;
            int i,j;
            char letra[]=new char[abc.length()];
                         for (i=0;i<abc.length();i++){
                               letra[i]=abc.charAt(i);
                                                     }
            System.out.println("hola mundo");                                        
            System.out.println("ingre una opcionn. a) para codificar, b)para decodificar");
            opcion= teclado.next().charAt(0);
            switch(opcion){
                case 'a': 
                    System.out.println("ingrese una palabra ");
                    palabra=teclado.next();
                    System.out.println(palabra);
                    char[] codigo1 =new char[palabra.length()];
                    char [] codigo =new char[palabra.length()];
                          for (i=0;i<palabra.length();i++){
                             codigo[i]=palabra.charAt(i);
    }
                         for (i=0;i<palabra.length();i++){
                         for (j=0;j<abc.length();j++){
                             if (codigo[i]==letra[j]){
                                codigo1[i]=letra[j+1];
                 
             }
    }
    }
                    String palabra1 = String.valueOf(codigo1);
    
                    System.out.println(palabra1);
                    break;
                case 'b':
                      System.out.println("ingrese una palabra ");
                      palabra=teclado.next();
                      System.out.println(palabra);
                                                   
                      char[] codigo2 =new char[palabra.length()];
                      char [] codigo3 =new char[palabra.length()];
                      for (i=0;i<palabra.length();i++){
                           codigo2[i]=palabra.charAt(i);
                                                      }
                      for (i=0;i<palabra.length();i++){
                         for (j=0;j<abc.length();j++){
                            if (codigo2[i]==letra[j]){
                                codigo3[i]=letra[j-1];
                 
                                                     }
                                                     }
                                                      }
    String palabra2 = String.valueOf(codigo3);
    
    System.out.println(palabra2);
    break;
            }
        }
    
     
    }
}