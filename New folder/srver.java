import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

public class srver {


  public void run() throws  IOException {
    int port = 8010;
    ServerSocket socket = new ServerSocket(port);
    socket.setSoTimeout(10000);
    while (true) {
      try {
        System.out.println("Server is listing on port"+port);

        Socket acceptedConnection = socket.accept();
        System.out.println("conection accepted from clint "+ acceptedConnection.getRemoteSocketAddress());
        PrintWriter toClient = new PrintWriter(acceptedConnection.getOutputStream());
        BufferedReader fromClient = new BufferedReader(new InputStreamReader(acceptedConnection.getInputStream()));
        toClient.close();
        fromClient.close();
        acceptedConnection.close();

        toClient.println("Hello from server");
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }



  public static void main(String[] args) {
    srver server = new srver();
    try {

      server.run();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
 

