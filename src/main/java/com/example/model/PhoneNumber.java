package com.example.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

@Data
@XStreamAlias("PhoneNumber")
@XmlAccessorType(XmlAccessType.FIELD)
public class PhoneNumber {

    //对应到map中
    @XmlAttribute
    private String type;
    @XmlValue
    private String number;
}