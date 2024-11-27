import java.io.IOException; //for handling input and output related exceptions
import java.io.DataInputStream; //reading primitive Java data types e.g. int , UTF from an input stream
import java.io.DataOutputStream; //writing primitive Java data types to an output stream
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class GreetingClient {
    public static void main(String[] args) {
        /*String serverName = args[0];
        int port = Integer.parseInt(args[1]);
        */

        String serverName = args.length > 0 ? args[0] : "localhost";
        int port = args.length > 1 ? Integer.parseInt(args[1]) : 5000;

        try {
            System.out.println("Connecting to "+ serverName + " on port " + port);
            Socket client = new Socket(serverName, port);

            System.out.println("Just connected to " + client.getRemoteSocketAddress());
            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);

            out.writeUTF("Hello from " + client.getLocalSocketAddress());
            InputStream inFromServer = client.getInputStream();
            DataInputStream in = new DataInputStream(inFromServer);

            System.out.println("Server says " + in.readUTF());
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/*A client program that connects to a server by using a socket and sends a greeting and then waits a response*/