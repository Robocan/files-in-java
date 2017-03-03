
package files;
import java.util.*;
import java.io.*;

public class TXTFile {
    private PrintWriter x;
    private Scanner y;
    
     public void openFile(){
     try{
         x=new PrintWriter(new FileWriter("D:\\TWT.txt",true));
         
        } 
      catch(Exception e){
            System.out.println("error couldnt create file");
        }
     }
     public void writeFile(){
         x.println("\n lol lol lol");
     
     
     
     }
     public void readFile(){
         try{
             y=new Scanner(new File("D:\\TWT.txt"));
             while (y.hasNext()) {
                 String a = y.next();
                 String b = y.next();
                 String c = y.next();
                 System.out.printf("%s %s %s \n",a,b,c);
                 
                 
             }
         
         }
         catch(Exception e){
             System.out.println("error file not found");
         }
              
         
         
         
         
         }
     
     
         
         public void closeFile(){
         
         y.close();
         x.close();
         }
     
     
     
     
     
     
}
