package Chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Client {
   public static void main(String[] args) throws Exception {
      Client sev = new Client();
      sev.run();
   }
   
   public void run() throws Exception {
      Socket sock = new Socket("localhost",444);
      PrintStream ps = new PrintStream(sock.getOutputStream());
      ps.println("Hello to SERVER from CLIENT");
      
      InputStreamReader ir = new InputStreamReader(sock.getInputStream());
      BufferedReader br = new BufferedReader(ir);
      
      String msg = br.readLine();
      System.out.println(msg);
   }
}
