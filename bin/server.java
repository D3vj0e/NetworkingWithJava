package bin;
import java.net.*;
import java.io.*;
public class server{
    private static int port = 8800;
    private static Socket ClienSocket;
    public static void main(String[] argv){
        try{
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("server activated...");
            ClienSocket = serverSocket.accept();
            ObjectInputStream getArrayData = new ObjectInputStream(ClienSocket.getInputStream());
            DataOutputStream sendResponse = new DataOutputStream(ClienSocket.getOutputStream());
            String [] showData = (String[]) getArrayData.readObject();
            if(showData[0].contains("checkLogin")){
                if(showData[1].contains("admin") && showData[2].contains("admin")){
                    sendResponse.writeBoolean(true);
                    sendResponse.flush();
                }
            }
        }catch(Exception error){System.out.println(error);}
    }

}