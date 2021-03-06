import java.io.IOException;
import java.io.FileInputStream;

public class LoopTest{
   public static void main(String[] args) throws IOException {
      
      FileInputStream fis = null;
      int available = 0;
      int i=0;
      
      try{
         // create new file input stream
         fis = new FileInputStream("test.txt");
         Report.start();
 
         // read till the end of the stream
         while((i=fis.read())!=-1)
         {
            // available bytes
  //          available = fis.available();
            
            // convert integer to character
//            char c = (char)i;
            
            // prints
 //           System.out.print("Available: "+available);
 //            System.out.println("; Read: "+c);
          }
		Report.end();
		Report.report("Loop-IO");
         Report.start();
        int j=0;
        for(int k=0;k<10000000;++k)
	{
          j=k;
	}
		Report.end();
		Report.report("Loop-Dummy");


      }catch(Exception ex){
         // if an I/O error occurs
         ex.printStackTrace();
      }finally{
         
         // releases all system resources from the streams
         if(fis!=null)
         {
            fis.close();
         }
      }
   }
}
