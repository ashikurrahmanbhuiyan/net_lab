import java.io.*;
import java.net.*;

class geek_client{
    public static void main(String args[]) throws IOException{
        Socket s = new Socket("192.168.0.195",8888);

        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        String str;

        while(!(str = kb.readLine()).equals("exit")){
            dos.writeBytes(str + "\n");
            System.out.println(br.readLine());
        }
        dos.close();
        br.close();
        kb.close();
        s.close();
    }
}
