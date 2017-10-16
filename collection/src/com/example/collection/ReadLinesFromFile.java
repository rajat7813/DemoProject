package com.example.collection;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class ReadLinesFromFile {

	public static void main(String a[]){
		
		
		BufferedWriter bufferedWriter = null;
		try {
 			String strContent = "This example shows how to write string content to a file";
 			File file = new File("fileName.txt");
 			// check if file exist, otherwise create the file before writing
			if (!file.exists()) {
				file.createNewFile();
			}
 			Writer writer = new FileWriter(file);
			bufferedWriter = new BufferedWriter(writer);
			bufferedWriter.write(strContent);
 		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try{
				if(bufferedWriter != null) bufferedWriter.close();
			} catch(Exception ex){
				
			}
		}

		BufferedReader br = null;
		String strLine = "";
	     File file = new File("fileName.txt");
	     try {
			file.createNewFile();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			br = new BufferedReader( new FileReader("fileName.txt"));
			while( (strLine = br.readLine()) != null){
				System.out.println(strLine);
			}
		} catch (FileNotFoundException e) {
			System.err.println("Unable to find the file: fileName");
		} catch (IOException e) {
			System.err.println("Unable to read the file: fileName");
		}
	}
}