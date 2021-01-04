package code;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class FileHandlingTask {

    void WriteToFile(StringLinkedList names, StringLinkedList numbers){
        int size = names.GetTotal();
        
        try {
            FileWriter file = new FileWriter(new File("C:\\Users\\Public\\Documents\\Info.txt"));
            
            for(int i = 0 ; i < size;i++)
            {
                file.write(names.GetValue(i) +":" + numbers.GetValue(i) + "\n");
            }

            file.close();
        } catch (IOException e) {

            System.err.println(e.getMessage());
        }
    }
    
    void ReadFromFile(ArrayList<String> names, ArrayList<String> numbers){
        try {
            File f = new File("C:\\Users\\Public\\Documents\\Info.txt");
            if(f.exists()) {
                Scanner scan = new Scanner(f);
                while(scan.hasNext())
                {
                    String tempStr = scan.nextLine();
                    String temp[] = tempStr.split(":");
                    names.add(temp[0]);
                    numbers.add(temp[1]);
                }
                
                scan.close();
            }
        } catch (Exception e) {
            
            System.err.println(e.getMessage());
        }
        
    }
    
    
    
}
