// Write a java program that implements a simple client server application. The client sends data to server. The server receives the data uses it to produce a result and then sends the result back to the client then the client displays the result on the console. 
import java.io.*;
import java.net.*;
class Server{
    public static void main(String args[]){
        try{
            ServerSocket ss=new ServerSocket(1064);
            System.out.println("Waiting for Client Request");
            Socket s=ss.accept();
            BufferedReader br;
            PrintStream ps;
            String str;
            br=new BufferedReader(new InputStreamReader(s.getInputStream()));
            str=br.readLine();
            System.out.println("Received radius");
            double r=Double.parseDouble(str);
            double area=3.14*r*r;
            ps=new PrintStream(s.getOutputStream());
            ps.println(String.valueOf(area));
            br.close();
            ps.close();
            s.close();
            ss.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
