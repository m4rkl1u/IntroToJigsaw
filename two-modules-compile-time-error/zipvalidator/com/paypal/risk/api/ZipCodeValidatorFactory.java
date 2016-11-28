package com.paypal.risk.api;

import com.paypal.risk.internal.ZipCodeValidatorImpl;

/**
 * Created by ftr on 06/11/15.
 */
public class ZipCodeValidatorFactory {

    public static ZipCodeValidator getInstance(){

        return new ZipCodeValidatorImpl();
    }
}
