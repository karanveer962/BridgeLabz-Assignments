import java.util.*;


class Person {
    private String f_name, l_name, address, city, state, zip, phnum, email;

    public Person(String f_name, String l_name, String address, String city, String state, String zip, String phnum,
            String email) {
        this.f_name = f_name;
        this.l_name = l_name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phnum = phnum;
        this.email = email;
    }

    public void setLastName(String l_name) {
        this.l_name = l_name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setPhnum(String phnum) {
        this.phnum = phnum;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getFirstName() {
        return f_name;
    }

    public String getLastName() {
        return l_name;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getPhoneNumber() {
        return phnum;
    }

    public String getEmail() {
        return email;
    }
}

class ContactBook {
    private List<Person> contacts;
    private Map<String, Person> contactsByName;

    public ContactBook() {
        this.contacts = new ArrayList<>();
        this.contactsByName = new HashMap<>();
    }

    public void addContact(Person person) {
        contacts.add(person);
        contactsByName.put(person.getFirstName(), person);
    }

    public void editContact(String firstName) {
        if (!contactsByName.containsKey(firstName)) {
            System.out.println("Contact with the given first name not found.");
            return;
        }

        Person person = contactsByName.get(firstName);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter which field to update: ");
        String fieldToUpdate=sc.nextLine();
        System.out.println("Enter new value for " + fieldToUpdate + ":");
        String newValue = sc.nextLine();

        switch (fieldToUpdate.toLowerCase()) {
            case "lastname":
                person.setLastName(newValue);
                break;
            case "address":
                person.setAddress(newValue);
                break;
            case "email":
                person.setEmail(newValue);
                break;
            case "phonenumber":
                person.setPhnum(newValue);
                break;
            case "city":
                person.setCity(newValue);
                break;
            case "state":
                person.setState(newValue);
                break;
            case "zip":
                person.setZip(newValue);
                break;
            default:
                System.out.println("Invalid field name. No changes made.");
                return;
        }

        System.out.println("Contact edited successfully.");
    }
}


public class AddressBookMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Address Book program  in AddressBookMain class on Master Branch");
        Person person1 = new Person("Karanveer", "Singh", "address", "city", "state", "zip", "phnum", "email");
        ContactBook cb = new ContactBook();
        cb.addContact(person1);
        cb.editContact(person1.getFirstName());
    }
}
