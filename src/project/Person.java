
package project;
import java.io.*;
public  class Person implements Serializable {
private String name;
private String phone;
private String gender;
public Person(String name,String phone,String gender)
{
    this.name=name;
    this.gender=gender;
    this.phone=phone;
}

    Person() {
    name="";
    phone="";
    gender="";
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
        public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getGender() {
        return gender;
    }
}
