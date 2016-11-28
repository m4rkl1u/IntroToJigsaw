package com.paypal.zipvalidator.api;

import com.paypal.zipvalidator.internal.ZipCodeValidatorImpl;

/**
 * Created by ftr on 06/11/15.
 */
public class ZipCodeValidatorFactory {

    public static ZipCodeValidator getInstance(){

        return new ZipCodeValidatorImpl();
    }
}
