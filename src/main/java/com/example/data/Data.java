package com.example.data;

import com.example.model.Address;
import com.example.model.Customer;
import com.example.model.PhoneNumber;

public class Data {

    public static final Customer CUSTOMER = new Customer();

    static {
        CUSTOMER.setId(123);
        CUSTOMER.setName("Jane Doe");

        Address address = new Address();
        address.setStreet("1 A Street");
        address.setCity("Any Town");
        CUSTOMER.setAddress(address);

        PhoneNumber workPhoneNumber = new PhoneNumber();
        workPhoneNumber.setType("work");
        workPhoneNumber.setNumber("555-WORK");
        CUSTOMER.getPhoneNumbers().add(workPhoneNumber);

        PhoneNumber cellPhoneNumber = new PhoneNumber();
        cellPhoneNumber.setType("cell");
        cellPhoneNumber.setNumber("555-CELL");
        CUSTOMER.getPhoneNumbers().add(cellPhoneNumber);
    }

}
