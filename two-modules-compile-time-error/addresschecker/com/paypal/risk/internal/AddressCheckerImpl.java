package com.paypal.risk.api.internal;

import com.paypal.risk.api.AddressChecker;
import com.paypal.risk.internal.ZipCodeValidatorImpl;

/**
 * Created by ftr on 06/11/15.
 */
public class AddressCheckerImpl implements AddressChecker {

    @Override
    public boolean checkZipCode(String zipCode) {
        return new ZipCodeValidatorImpl().zipCodeIsValid(zipCode);
    }
}
