package com.example.handle.XStream;

import com.example.model.PhoneNumber;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

public class PhoneNumberConverter implements Converter {

    @Override
    public boolean canConvert(Class clazz) {
        return PhoneNumber.class == clazz;
    }

    @Override
    public void marshal(Object object, HierarchicalStreamWriter hsw, MarshallingContext mc) {
        PhoneNumber phoneNumber = (PhoneNumber) object;
        hsw.addAttribute("type", phoneNumber.getType());
        hsw.setValue(phoneNumber.getNumber());
    }

    @Override
    public Object unmarshal(HierarchicalStreamReader hsr, UnmarshallingContext uc) {
        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.setType(hsr.getAttribute("type"));
        phoneNumber.setNumber(hsr.getValue());
        return phoneNumber;
    }

}
