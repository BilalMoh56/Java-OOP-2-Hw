
public class Main {
    public static void main(String[] args) {
       
        MobilePhone myPhone = new MobilePhone("Samsung", "Galaxy S21", "123-456-7890", 128);

        
        myPhone.makeCall("987-654-3210");

       
        myPhone.installApp("Messaging App");

        myPhone.displayInfo();
    }
}

