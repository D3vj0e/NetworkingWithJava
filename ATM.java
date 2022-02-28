import java.io.*;
import java.net.*;
public class ATM {
    private static String ip = "localhost";
    private static Integer port = 8888;
    public static void main(String[] argv) {
        try{
            Socket connectServer = new Socket(ip,port);
            DataOutputStream dout=new DataOutputStream(connectServer.getOutputStream()); 
            DataInputStream dataInput = new DataInputStream(connectServer.getInputStream());
            String showMessage = (String)dataInput.readUTF();
            System.out.println("frome server : "+showMessage); 
            dout.writeUTF("hello from user");
            dout.flush();
            dout.close();
            connectServer.close();

        }catch(Exception error){System.out.println(error);}
        
    }
}
