package com.kodewala.serializablityorignal;

import java.io.IOException;


public class Pilot {
	public static void main(String[] args) throws IOException {
		
		
		Account ac=new Account("kk00", "pk");
		Driver dr=new Driver();
		
		dr.serializeMsg(ac);
	}
}
