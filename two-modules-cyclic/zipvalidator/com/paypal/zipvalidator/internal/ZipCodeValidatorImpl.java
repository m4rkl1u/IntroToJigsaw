package com.paypal.zipvalidator.internal;

import com.paypal.zipvalidator.api.ZipCodeValidator;

/**
 * Created by ftr on 06/11/15.
 */
public class ZipCodeValidatorImpl implements ZipCodeValidator{
    @Override
    public boolean zipCodeIsValid(String zipCode) {
        return zipCode != null && zipCode.length() == 5;
    }
}
