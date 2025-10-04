import java.io.BufferedReader;
import java.net.InetAddress;
import java.net.Socket;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.UnknownHostException;




/**
 * A simple single-threaded TCP client that connects to a server,
 * sends a message, and prints the server's response.
 */
public class Client {

  /**
   * Connects to the server, sends a message, and prints the response.
   * @throws UnknownHostException if the IP address of the host cannot be determined
   * @throws IOException if an I/O error occurs when creating the socket or streams
   */
  public void run() throws UnknownHostException, IOException {
    int port = 8010; // Port number to connect to
    InetAddress address = InetAddress.getByName("localhost"); // Server address

    // Use try-with-resources to automatically close resources

      Socket socket = new Socket(address, port); // Create a socket to connect to the server
      PrintWriter toSocket = new PrintWriter(socket.getOutputStream(), true); // Writer to send data to server
      BufferedReader fromSocket = new BufferedReader(new InputStreamReader(socket.getInputStream())) ;


      
   
      // Send a message to the server
      toSocket.println("hello from the client");

      // Read the response from the server
      String line = fromSocket.readLine();

      // Print the server's response
      System.out.println("Response from the socket is :" + line);
      toSocket.close();
      fromSocket.close();

      socket.close(); // Close the socket
  }
  /**
   * Main method to start the client.
   * @param args command-line arguments (not used)
   */
  public static void main(String[] args) {
    try {
      Client client = new Client();
      client.run();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}

