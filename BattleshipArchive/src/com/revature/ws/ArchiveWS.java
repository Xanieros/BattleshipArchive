package com.revature.ws;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class ArchiveWS {
	ArrayList<Integer> winners = new ArrayList<Integer>();
	
	@WebMethod
	public void archive(int winnerID)
	{
		winners.add(winnerID);
		backup(winners);
	}
	
	public static void backup(ArrayList<Integer> al)
	{
		try
		{
			File myFile = new File("archiveBackup.log");
			FileOutputStream fos = new FileOutputStream(myFile);
			for (Integer integer : al) {
				fos.write(integer);
			}
			
			fos.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
