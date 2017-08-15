package com.revature.ws;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class ArchiveWS {
	
	@WebMethod
	public void archive(int winnerID)
	{
		try
		{
			File myFile = new File("archiveBackup.log");
			FileOutputStream fos = new FileOutputStream(myFile, true);
			fos.write(winnerID);
			fos.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
