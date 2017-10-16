package com.example.collection;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class CreateNewFileExample
{
    public static void main( String[] args )
    {
    	try {

	      File file = new File("fileName.txt");
	      File file1 =new File("MyEmpFile.txt");
	      
	      System.out.println(FileUtils.contentEquals(file, file1));
	      String s= FileUtils.readFileToString(file1);
	      System.out.println(s);
	      
	      System.out.println(FileUtils.sizeOfAsBigInteger(file1));

	      if (file.createNewFile()){
	        System.out.println("File is created!");
	      }else{
	        System.out.println("File already exists.");
	      }

    	} catch (IOException e) {
	      e.printStackTrace();
	}
    }
}