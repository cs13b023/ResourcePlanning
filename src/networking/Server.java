package networking;

import java.io.*;
import java.net.*;

public class Server {

	/*
	public static void main(String[] args) throws Exception{
		int bytesRead,currentTot;
		String s1="",s2="";
		
		Socket s=new Socket("192.168.29.13",12345);
		byte[] bytearray=new byte[1023457];
		
		DataInputStream i=new DataInputStream(s.getInputStream());
		DataOutputStream o=new DataOutputStream(s.getOutputStream());
		
		FileOutputStream fos=new FileOutputStream("copy.doc");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		bytesRead=i.read(bytearray,0,bytearray.length);
		currentTot=bytesRead;
		
		do{
			bytesRead=i.read(bytearray,currentTot,(bytearray.length-currentTot));
			if(bytesRead>=0)currentTot+=bytesRead;
		}while(bytesRead>-1);
		
		bos.write(bytearray,0,currentTot);
		bos.flush();
		bos.close();
		s.close();
		
		}  
	*/	
		
	}
	

