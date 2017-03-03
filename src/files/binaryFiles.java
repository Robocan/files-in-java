
package files;
import java.util.*;
import java.io.*;

public class binaryFiles {
    private DataOutputStream x;
    private Scanner y;
    public void openFile(){
      try{  x=new DataOutputStream(new FileOutputStream("D:\\zee.doc", true));
      }
      catch(Exception e){
          System.out.println("error couldnt create file ");
      
      
      
      }
      }
    public void writeFile(){
        try {
            x.writeBytes("\n you suck at cooking oh my god");
        } catch (Exception ex) {
            System.out.println("couldnt write shit");
        }
    
    
    
    }
    public void readFile(){
       try{
           y=new Scanner(new File("D:\\zee.doc"));
           while(y.hasNext()){
           
               System.out.println(" "+y.nextLine());
           
           }
           
           
                   }
       catch(Exception e){
           System.out.println("couldnt read file");
       }
       
               }
    public void closeFile(){
        try {
            x.close();
            y.close();
        } catch (Exception ex) {
            System.out.println("couldnt close");
        }
 
    }
    
    
    
    }
    

