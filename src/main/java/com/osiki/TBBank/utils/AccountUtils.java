package com.osiki.TBBank.utils;

import java.time.Year;

public class AccountUtils {

    public static final String ACCOUNT_EXISTS_CODE = "001";
    public static final String ACCOUNT_EXISTS_MESSAGE = "This user already has an account created!";

    public static final String ACCOUNT_CREATION_SUCCESS_CODE = "002";
    public static final String ACCOUNT_CREATION_SUCCESS_MESSAGE = "Account has been created Successfully!";

    public static final String ACCOUNT_NUMBER_NON_EXISTS_CODE = "003";

    public static final String ACCOUNT_NUMBER_NON_EXISTS_MESSAGE = "Provided account number does not exists";

    public static final String ACCOUNT_NUMBER_FOUND_CODE = "004";
    public static final String ACCOUNT_NUMBER_FOUND_MESSAGE = "Account number found";




    public static String generateAccountNumber(){

        /**
         * for generating account number
         * concantenate current year + any six random digits
         */

        // to get current year
        Year currentYear = Year.now();

        int min = 100000;
        int max = 999999;

        // generate a random number between min and max

        int randomNumber = (int)Math.floor(Math.random() * (max - min + 1) + min);

        // convert current year and random number to string and then concatenate them

        String year = String.valueOf(currentYear);
        String randomNum = String.valueOf(randomNumber);

        StringBuilder accountNumber = new StringBuilder();

        return accountNumber.append(year).append(randomNum).toString();

    }


}
