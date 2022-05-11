public class Address {

    public static String getAddressString(){
    Address a1;
    a1 =new

    Address("2222 BTS Lane","Rockville","MD",44444);
        a1.display();
        return null;
    }
    private String street;
    private String city;
    private String state;
    private int zipcode;

    Address(String street, String city, String state, int zipcode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    Address() {
        street = "";
        city = "";
        state = "";
        zipcode = 5;
    }

    void display() {
        System.out.println("ADDRESS: ");
        System.out.println("STREET : " + this.street);
        System.out.println("CITY : " + this.city);
        System.out.println("STATE : " + this.state);
        System.out.println("ZIPCODE :" + this.zipcode);
    }

    public String toString() {
        return "STREET : " + this.street + "\nCITY : " + this.city
                + "\nSTATE : " + this.state + "\nZIPCODE :" + this.zipcode;
    }

}
