import java.io.*;
import java.net.*;

class geek_server{
    public static void main(String[] args) throws IOException{
        ServerSocket ss = new ServerSocket(8888);
        Socket s = ss.accept();
        System.out.println("Connection established");

        PrintStream ps = new PrintStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        String str;

        
        while((str = br.readLine()) != null){
            System.out.println(str);
            ps.println(kb.readLine());
        }  

        ps.close();
        br.close();
        kb.close();
        ss.close();
        s.close();
        System.exit(0);
        
    }
}