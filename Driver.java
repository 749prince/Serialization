package com.kodewala.serializablityorignal;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;



 

public class Driver {
	
	public static void serializeMsg(Account ac) throws IOException {
		
		FileOutputStream fos=new FileOutputStream("account.ser");
		
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(ac);
		oos.close();
		
	}

} 
