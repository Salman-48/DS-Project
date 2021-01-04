package code;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 *
 * @author Farzand
 */
public class PhoneBook {
    
    StringLinkedList NameList;
    StringLinkedList PhoneList;
    FileHandlingTask fTask = new FileHandlingTask();
    
    PhoneBook(){
        Initialize();
    }
    
    private void Initialize(){
    
        NameList = new StringLinkedList();
        PhoneList = new StringLinkedList();
        ArrayList<String> tempNames = new ArrayList<String>();
        ArrayList<String> tempNumbers = new ArrayList<String>();
        fTask.ReadFromFile(tempNames,tempNumbers);
        for (int i = 0; i < tempNames.size(); i++) {
            CreatePhoneEntry(tempNames.get(i),tempNumbers.get(i));
       // System.out.println(NameList.get(i)+PhoneList.get(i));
        }
        
        
    }
    void method(){
        ArrayList<String> tempNames = new ArrayList<String>();
        ArrayList<String> tempNumbers = new ArrayList<String>();
        fTask.ReadFromFile(tempNames,tempNumbers);
        for (int i = 0; i < tempNames.size(); i++) {
            // CreatePhoneEntry(tempNames.get(i),tempNumbers.get(i));
            System.out.println(tempNames.get(i)+tempNumbers.get(i));
        }
        
    }
    int getrows(){
         ArrayList<String> tempNames = new ArrayList<String>();
        ArrayList<String> tempNumbers = new ArrayList<String>();
        fTask.ReadFromFile(tempNames,tempNumbers);
        return tempNames.size();
    }
    Boolean AddPhoneEntry(String name, String number)
    {
        if(CreatePhoneEntry(name,number))
        {
            fTask.WriteToFile(NameList,PhoneList);
            return true;
        }
        return false;
    }
    
    String getRowname(int i){
        ArrayList<String> tempNames = new ArrayList<String>();
        ArrayList<String> tempNumbers = new ArrayList<String>();
        fTask.ReadFromFile(tempNames,tempNumbers);
        return tempNames.get(i);
    }
    
    String getRowNumber(int i){
        
        ArrayList<String> tempNames = new ArrayList<String>();
        ArrayList<String> tempNumbers = new ArrayList<String>();
        fTask.ReadFromFile(tempNames,tempNumbers);
        return tempNumbers.get(i);
    }

    
    private Boolean CreatePhoneEntry(String name, String number){
        int index = NameList.Insert(Capitalize(name));
        if(index >= 0){
            PhoneList.InsertAtIndex(number,index);
            return true;
        }
        return false;
    }
    
    
    Boolean DeletePhoneEntry(String name)
    {
        int index = NameList.Delete(Capitalize(name));
        if(index >= 0){
            PhoneList.DeleteAtIndex(index);
            fTask.WriteToFile(NameList,PhoneList);
        return true;
        }
       return false;
    }
    
    ArrayList<String> SearchDirectory(String name){
        name = Capitalize(name);
        return NameList.Search(name);
    }
    String Search(String name){
        name = Capitalize(name);
        int val = NameList.GetIndexByValue(name);
        if(val < 0)
            return null;
        else{
             return PhoneList.GetValue(val);
        }
    
    }
    
    ArrayList<String> SearchName(String name){
    name = Capitalize(name);
        return   NameList.Search(name);
    }
    private String Capitalize(String title){
        String[] words = title.split(" ");
        
        // capitalize each word
        for (int i = 0; i < words.length; i++)
        {
            words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
        }
        
        // rejoin back into a sentence
        title = String.join(" ", words);
        
        return title;
    }
    
    
}
