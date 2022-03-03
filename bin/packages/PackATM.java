package bin.packages;
import java.io.DataInputStream;
import java.net.Socket;
import java.io.ObjectOutputStream;
public class PackATM {
    protected int portToConnect = 8800;
    protected String hostConnect = "localhost";
    protected boolean SocketConnecting(String [] dataInput){
        try{
            Socket atmConnecting = new Socket(hostConnect,portToConnect);
            ObjectOutputStream sendDataWithARYString = new ObjectOutputStream(atmConnecting.getOutputStream());
            sendDataWithARYString.writeObject(dataInput);
            DataInputStream responseFromServer = new DataInputStream(atmConnecting.getInputStream());
            return responseFromServer.readBoolean();

        }catch (Exception errorConnecting){
            System.out.println(errorConnecting);
        }

        return false;
    }
    public boolean SendLogin(String userNameInput , String userPasswordInput){
        String [] packData = {"checkLogin",userNameInput,userPasswordInput};
        boolean checkLogin = SocketConnecting(packData);
        if(checkLogin){
            System.out.println("pass");
            return true;
        }else{
            System.out.println("false");
            return false;
        }
    }
}
