import java.util.Map;
import java.util.TreeMap;

// Реализуйте структуру телефонной книги с помощью HashMap, 
// учитывая, что 1 человек может иметь несколько телефонов.

/**
 * program1
 */
public class program1 {

    public static void main(String[] args) {
    }

    program1 myDict = new program1();
    Map<String, String> PhoneBook = new TreeMap<>();

    void add(String phoneNumber, String name) {
        myDict.add(phoneNumber, name);
        myDict.add("123456", "Иванов");
        myDict.add("321456", "Васильев");
        myDict.add("234561", "Петрова");
        myDict.add("234432", "Иванов");
        myDict.add("654321", "Петрова");
        myDict.add("345678", "Иванов");
          
    
        

    }
     void  getContactByPhone(String phoneNumber, String name){
        if (addPhoneNumber(phoneNumber));
    }



}