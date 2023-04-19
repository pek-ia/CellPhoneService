package com.yearup;

public class CellPhoneApp {
    public static void main(String[] args) {

        CellPhone myPhones[] = new CellPhone[3];

        myPhones[0] = new CellPhone("12345",
                "Samsung",
                "Mint Mobile",
                "800-555-5555",
                "Paul Kimball");
        myPhones[1] = new CellPhone("123sdf45",
                "Google",
                "Mint Mobile",
                "800-555-5555",
                "Paul Kimball");
        myPhones[2] = new CellPhone("1234s5",
                "Palm",
                "AT&T",
                "800-555-5555",
                "Paul Kimball");

        for (CellPhone c: myPhones) {
            System.out.printf("%s belongs to %s\n", c.getSerialNumber(), c.getOwner());
        }
    }
}
