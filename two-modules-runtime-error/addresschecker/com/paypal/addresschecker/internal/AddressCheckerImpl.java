package com.paypal.addresschecker.internal;

import com.paypal.addresschecker.api.AddressChecker;
import com.paypal.zipvalidator.api.ZipCodeValidator;


/**
 * Created by ftr on 06/11/15.
 */
public class AddressCheckerImpl implements AddressChecker {
    @Override
    public boolean checkZipCode(String zipCode) {
        ClassLoader classLoader = AddressCheckerImpl.class.getClassLoader();
        try {
            Class aClass = classLoader.loadClass("com.paypal.zipvalidator.internal.ZipCodeValidatorImpl");
            return ((ZipCodeValidator)aClass.newInstance()).zipCodeIsValid(zipCode);
        } catch (Exception e) {
            throw new  RuntimeException(e);
        }
    }
}
