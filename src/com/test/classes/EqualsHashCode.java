package com.test.classes;

public class EqualsHashCode
{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;
    private  int id;

    public boolean equals(Object obj) {
        boolean isEqual = false;
        if(obj == null) {
            return false;
        }

        if(obj.getClass() != this.getClass()) {
            return false;
        }
        
        EqualsHashCode eq = (EqualsHashCode)obj;

        if(eq.getId()== this.getId() && eq.getName().equals(this.getName())) {
              isEqual = true;
        }
        return isEqual;
    }
    
    
    public int hashCode() {
    	return 32*this.id;
    }
}
