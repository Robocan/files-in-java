
package files;
import java.io.*;

public class randomFiles {
    private RandomAccessFile x;
   
    public void openFile(){
        try {
            x=new RandomAccessFile("D:\\rd.rnd","rw");
        } catch (FileNotFoundException ex) {
            System.out.println("file couldnt be created");
        }
    
    }
    public void writeFile(){
        try {
            x.writeUTF("mom dad where are you?");
        } catch (IOException ex) {
            System.out.println("couldnt write");
        }
    
    
    }
    public void readFile(){
        try {x.seek(0);
        String a=x.readLine();
        
            
            System.out.println(a );
        } catch (IOException ex) {
             System.out.println("couldnt read");
        }
    
    
    }
    public void closeFile (){
        try {
            x.close();
        } catch (IOException ex) {
             System.out.println("couldnt close");
        }
    
    }
    
    
}
