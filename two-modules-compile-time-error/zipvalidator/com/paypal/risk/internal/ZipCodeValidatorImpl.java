package com.paypal.risk.internal;

import com.paypal.risk.api.ZipCodeValidator;

/**
 * Created by ftr on 06/11/15.
 */
public class ZipCodeValidatorImpl implements ZipCodeValidator {
    @Override
    public boolean zipCodeIsValid(String zipCode) {
        return zipCode != null && zipCode.length() == 5;
    }
}
