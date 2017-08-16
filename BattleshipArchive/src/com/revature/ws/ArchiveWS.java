package com.revature.ws;

import java.io.File;
import java.io.FileOutputStream;

import javax.jws.*;

@WebService(endpointInterface = "com.revature.ws.ArchiveWSInterface")
public class ArchiveWS implements ArchiveWSInterface {
	
	@Override
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
