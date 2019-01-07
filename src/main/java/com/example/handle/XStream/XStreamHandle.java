package com.example.handle.XStream;

import com.example.model.Address;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.reflection.FieldDictionary;
import com.thoughtworks.xstream.converters.reflection.SortableFieldKeySorter;
import com.thoughtworks.xstream.converters.reflection.Sun14ReflectionProvider;

import static com.example.data.Data.CUSTOMER;

public class XStreamHandle {

    public static void handle() {
        XStream xStream = new XStream();
        xStream.autodetectAnnotations(true);
        xStream.toXML(CUSTOMER, System.out);
    }


    //更改顺序Elements
    public static void handleTwo() {
        SortableFieldKeySorter sorter = new SortableFieldKeySorter();
        sorter.registerFieldOrder(Address.class, new String[] { "street", "city"});
        FieldDictionary fieldDictionary = new FieldDictionary(sorter);
        Sun14ReflectionProvider reflectionProvider = new Sun14ReflectionProvider(fieldDictionary);

        XStream xstream = new XStream(reflectionProvider);

        xstream.autodetectAnnotations(true);

        xstream.toXML(CUSTOMER, System.out);
    }

    public static void main(String[] args) {
        handleTwo();
    }
}