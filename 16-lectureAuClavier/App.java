import java.io.BufferedReader;
 import java.io.InputStreamReader;
import java.util.Scanner;
 
 public class App {
     /*
       BufferReader -> synchrone
                        thread-safe
                        lecture de chaine de caractères (String)


               -read(): lire un caractère
               -readline() : lire une chaine
               -skip(N) : ignore un caractère


        Scanner -> asynchrone
                    not thread-safe
                    lecture de donnée + parsing
       
      */
     public static void main(String[] args) throws Exception{
         InputStreamReader isr = new InputStreamReader(System.in);
         BufferedReader br = new BufferedReader(isr);
 
         System.out.println("What is your name ?: ");
         String name = br.readLine();

         System.out.println("Hello " + name + " !");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Acceder à quel niveau?");
        int game_level = sc.nextInt();
        System.out.println("Niveau : " + game_level);    

     }
 }