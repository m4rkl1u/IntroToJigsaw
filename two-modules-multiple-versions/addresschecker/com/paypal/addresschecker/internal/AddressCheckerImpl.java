package com.paypal.addresschecker.internal;

import com.paypal.addresschecker.api.AddressChecker;
import com.paypal.zipvalidator.api.ZipCodeValidatorFactory;

/**
 * Created by ftr on 06/11/15.
 */
public class AddressCheckerImpl implements AddressChecker {
    @Override
    public boolean checkZipCode(String zipCode) {


        return ZipCodeValidatorFactory.getInstance().zipCodeIsValid(zipCode);


    }
}
