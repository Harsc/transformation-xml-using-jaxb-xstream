package com.example.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@Data
@XmlType(propOrder={"street", "city"}) //jabx change order
@XStreamAlias("Address")
@XmlAccessorType(XmlAccessType.FIELD)
public class Address {
    private String city;
    private String street;
}