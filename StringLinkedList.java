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
public class StringLinkedList {
    
    Node head;
    
    Boolean HasName(String name){
        Node cur = head;
        while(cur != null)
        {
            if(cur.data.equals(name)){
                //System.out.println("Name already exists");
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    
    int Insert(String name)
    {
        Node node = new Node(name);
        
        int count = 0;
        
        if(head == null)
        {
            head = node;
        }
        else{
            Node cur = head;
            Node prev = null;
            Boolean isFound = HasName(name);
            
            if(!isFound)
            {
                while(cur != null)
                {
                    if(cur.data.compareTo(name) > 0 )
                    {
                        break;
                    }
                    prev = cur;
                    cur=cur.next;
                    count++;
                }
                if(prev == null && cur != null){
                    node.next = head;
                    head = node;
                }
                else if(prev != null && cur == null){
                    prev.next = node;
                }
                else
                {
                    prev.next = node;
                    node.next = cur;
                }
                
            }
            else
                count = -1;
            
        }
        return count;
    }
    
    void InsertAtIndex(String val, int index ){
        Node node=new Node(val);
        
        if(head == null){
            head = node;
        }
        else{
            if(index == 0){
                node.next = head;
                head = node;
            }
            else
            {
                int x = 0;
                Node cur = head;
                Node prev = null;
                
                while(x < index)
                {
                    x++;
                    prev = cur;
                    cur = cur.next;
                }
                
                prev.next = node;
                
                if(cur != null)
                {
                    node.next=cur;
                }
                
            }
        }
    }
    
    int Delete(String text){
        Node cur = head;
        Node prev = null;
        int deletecount = 0;
        Boolean isDeleted = false;
        
        if(head == null)
            return -1;
        
        if(head.data.equals(text)){
            if(head.next == null){
                head=null;
            }
            else{
                head=head.next;
            }
        }
        else
        {
            while(cur != null){
                if(cur.data.equals(text)){
                    if(cur.next==null){
                        prev.next=null;
                        isDeleted = true;
                    }
                    else{
                        prev.next = cur.next;
                        isDeleted = true;
                    }
                    break;
                }
                deletecount++;
                prev = cur;
                cur = cur.next;
                
            }
        }
        if(isDeleted)
            return deletecount;
        else
            return -1;
    }
    
    Boolean DeleteAtIndex(int index){
        Boolean isDeleted = false; 
        if(index == 0){
            head = head.next;
            isDeleted = true;
        }
        else
        {
            Node cur = head;
            Node prev = null;
        
            int x = 0;
            while(x < index)
            {
                x++;
                prev = cur;
                cur = cur.next;
            }
            
            if(cur.next != null)
            {
                prev.next = cur.next;
                isDeleted = true;
            }
            else{
                prev.next=null;
                isDeleted = true;
            }
        }
        
        return isDeleted;
    }
    
    ArrayList<String> Search(String name){
        int inputlength=name.length();
        Node cur = head;
        ArrayList<String> list = new ArrayList<String>();
        while(cur != null){
            if(cur.data.length() >= inputlength){
               String temp = cur.data.substring(0,inputlength);
               if(temp.equals(name)){
                   list.add(cur.data);
               }
            }
            cur = cur.next;
        }
        
        return list;
    }
    int GetIndexByValue(String name){
        Node cur = head;
        int count = 0;
        while(cur!=null){
            if(cur.data.equals(name))
                return count;
            cur = cur.next;
            count++;
        }
        return -1;
    }
    
    int GetTotal(){
        Node cur = head;
        int count = 0;
        while(cur != null){
            count++;
            cur = cur.next;
        }
        return count;
    }
    String GetValue(int index){
        Node cur = head;
        int count = 0;
        while(cur!=null){
            if(count==index)
                return cur.data;
            count++;
            cur=cur.next;
        }
        return null;
    }
}
