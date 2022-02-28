package bin;
import java.net.*;
import java.io.*;
public class server{
    private static int port = 8888;
    public static void main(String[] argv){
        try{
            ServerSocket createServerSocket = new ServerSocket(port);
            System.out.println("Server was creating....");
            Socket server = createServerSocket.accept();
            DataInputStream dataInput = new DataInputStream(server.getInputStream());
            DataOutputStream send = new DataOutputStream(server.getOutputStream());
            send.writeUTF("Hello from server");
            String showDataInput = (String)dataInput.readUTF();
            System.out.println("From client : "+showDataInput);
            server.close();
            createServerSocket.close();
            send.close();
            send.close();
        }catch(Exception error){System.out.println(error);}
    }

}