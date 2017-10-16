package com.example.collection;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class CopyFileReader {
 
   public static void main(String args[]) throws IOException {
      FileReader in = null;
      FileWriter out = null;
 
      File newFile = new File("Output3.txt"); 
      
  /*    try {
         in = new FileReader("D:\\input.txt");
         out = new FileWriter("output1.txt");
         
         File f =new File("FirstFile.txt");
         System.out.println(f.getAbsoluteFile());
         System.out.println(f.canRead());
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }*/
      /*finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }*/
      }
   }

