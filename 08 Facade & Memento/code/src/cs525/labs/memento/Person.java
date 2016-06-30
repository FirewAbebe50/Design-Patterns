package cs525.labs.memento;

/**
 *
 * @author OWNER
 */
public class Person {

    String name;
    String address;
    String email;
    String contact;

    public Person(String name, String address, String email, String contact) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    
    @ Override
    public String toString(){
        return name +", " + address + "\n" +
                email + ", " + contact ;
    }

}
