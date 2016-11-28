package com.paypal.risk.addresschecker.internal;

import com.paypal.risk.addresschecker.api.AddressChecker;
import com.paypal.risk.api.ZipCodeValidatorFactory;



/**
 * Created by ftr on 06/11/15.
 */
public class AddressCheckerImpl implements AddressChecker {
    @Override
    public boolean checkZipCode(String zipCode) {
        return ZipCodeValidatorFactory.getInstance().zipCodeIsValid(zipCode);
    }
}
