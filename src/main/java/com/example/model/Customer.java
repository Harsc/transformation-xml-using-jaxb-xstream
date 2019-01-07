package com.example.model;

import com.example.handle.XStream.PhoneNumberConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@Data
/**
 * Renaming Element
 * @XStreamAlias("xml") with stream
 * @XmlRootElement(name = "xml") with jaxb
 *
 */
@XStreamAlias("xml")

@XmlRootElement(name = "xml")
@XmlAccessorType(XmlAccessType.FIELD)  //stream field access by default , jaxb using this
public class Customer {

    //定义为属性
    @XmlAttribute
    @XStreamAsAttribute
    private long id;
    private String name;
    private Address address;

    @XStreamImplicit(itemFieldName = "phones")
    @XmlElement(name = "phones-methad")
    @XStreamConverter(PhoneNumberConverter.class)
    private List<PhoneNumber> phoneNumbers;

    public Customer() {
        phoneNumbers = new ArrayList<PhoneNumber>();
    }

}

// http://blog.bdoughan.com/2010/10/how-does-jaxb-compare-to-xstream.html
