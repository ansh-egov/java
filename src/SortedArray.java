import java.util.ArrayList;

public class SortedArray {
    private  String myNumber;
    private ArrayList<Contact> myContacts = new ArrayList<>();

    public SortedArray(String myNumber, ArrayList<Contact> myContacts) {
        this.myNumber = myNumber;
        this.myContacts = myContacts;
    }

    private int findContact(Contact contact){
        int n = myContacts.size();
        for(int i = 0;i<n;i++){
            if(contact.getName() == myContacts.get(i).getName()){
                return i;
            }
        }
        return -1;
    }
    private int findContact(String name){
        int n = myContacts.size();
        for(int i = 0;i<n;i++){
            if(name == myContacts.get(i).getName()){
                return i;
            }
        }
        return -1;
    }
    public boolean addNewContact(Contact contact){
        if(findContact(contact) != -1){
            return false;
        }
        myContacts.add(contact);
        return true;
    }
    public boolean updateContact(Contact old,Contact newer){
        if(findContact(old) == -1){
            return false;
        }
        int x = findContact(old);
        myContacts.set(x,newer);
        return true;
    }

    public boolean removeContact(Contact contact){
        int x = findContact(contact);
        if(x == -1){
            return false;
        }
        myContacts.remove(x);
        return true;
    }

    public Contact queryContact(String name){
        for(Contact it:myContacts){
            if(it.getName() == name){
                return it;
            }
        }
        return null;
    }

    public void printContacts(){
        for(int i = 0;i < myContacts.size();i++){
            System.out.println(Integer.toString(i + 1) + ". " + myContacts.get(i).getName() + " -> "+myContacts.get(i).getPhoneNumber());
        }
    }
}
