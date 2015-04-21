package networking;
import java.io.*;
import java.net.*;

public class Chat {
	/*
	public static void main(String[] args) throws IOException{
		Socket s=new Socket("192.168.29.13",2345);
		DataInputStream din=new DataInputStream(s.getInputStream());
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String strMe="abc",strSer="";
		while(!strMe.equals("Bye")){
			strMe=br.readLine();
			dout.writeUTF(strMe);
			dout.flush();
			strSer=din.readUTF();
			System.out.println("Says:"+strSer);
		}
		
		dout.close();
		s.close();
	}
	*/
	
}
