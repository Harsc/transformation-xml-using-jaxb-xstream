package com.example.handle.JAXB;

import com.example.model.Customer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

import static com.example.data.Data.CUSTOMER;

public class JAXBHandle {

    public static void handle() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        JAXBElement<Customer> jaxbElement = new JAXBElement<Customer>(new QName("xml"), Customer.class, CUSTOMER);
        //    new QName("xml")  as  @XmlRootElement(name = "xml")
        marshaller.marshal(jaxbElement, System.out);
    }


    //this is binding  @XmlRootElement
    public static void handleTwo() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(CUSTOMER, System.out);
    }


    public static void main(String[] args) throws JAXBException {
        handleTwo();
    }
}
