package Chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
   public static void main(String[] args) throws Exception {
      Server sev = new Server();
      sev.run();
   }
   
   public void run()  throws Exception {
      ServerSocket sev_sock = new ServerSocket(444);
      Socket sock = sev_sock.accept();
      InputStreamReader ir = new InputStreamReader(sock.getInputStream());
      BufferedReader br = new BufferedReader(ir);
      
      String msg = br.readLine();
      System.out.println(msg);
      
      if (msg != null) {
         PrintStream ps = new PrintStream(sock.getOutputStream());
         ps.println("MESSAGE received!");
      }
   }
}
