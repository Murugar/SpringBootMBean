package com.iqmsoft.boot.mbeans;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;


import java.util.LinkedList;
import java.util.List;


@ManagedResource(objectName = "Folder:type=Subfolder,name=Resource")
public class Resource {
	
    private LinkedList<String> items = new LinkedList<>();

    @ManagedAttribute
    public String getLastItem() {
        return items.getLast();
    }
    
    @ManagedAttribute
    public String geFirstItem() {
        return items.getFirst();
    }

    @ManagedAttribute
    public int getSize() {
        return items.size();
    }

    @ManagedOperation
    public void addItem(String item) {
        items.add(item);
    }
    
    
    @ManagedOperation
    public void removeFirst() {
    	
    	if(!items.isEmpty())
          items.removeFirst();
    }
    
    @ManagedOperation
    public void removeLast() {
    	
    	if(!items.isEmpty())
           items.removeLast();
    }
    
    @ManagedOperation
    public void removeItem(String item) {
    	
    	if(items.contains(item))
                 items.remove(item);
    }

    @ManagedOperation
    public String getItem(int pos) {
    	
        return items.get(pos);
    }

    @ManagedOperation
    public List<String> getAll() {
        return items;
    }
}