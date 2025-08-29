package com.vit.bfhl.service;

import com.vit.bfhl.model.DataRequest;
import com.vit.bfhl.model.DataResponse;
import com.vit.bfhl.util.TextUtils;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class BfhlService {

    public DataResponse process(DataRequest request, String fullNameLowerUnderscore, String dobDDMMYYYY,
                                String email, String rollNumber) {
        DataResponse res = new DataResponse();
        List<String> odd = new ArrayList<>();
        List<String> even = new ArrayList<>();
        List<String> alphabets = new ArrayList<>();
        List<String> specials = new ArrayList<>();

        BigInteger sum = BigInteger.ZERO;

        if (request != null && request.getData() != null) {
            for (String token : request.getData()) {
                if (token == null) continue;
                if (TextUtils.isNumericString(token)) {
                    try {
                        BigInteger val = new BigInteger(token);
                        sum = sum.add(val);
                        if (val.abs().mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
                            even.add(token);
                        } else {
                            odd.add(token);
                        }
                    } catch (NumberFormatException ex) {
                        // ignore malformed numeric; don't add to lists
                    }
                } else if (TextUtils.isAlphabeticString(token)) {
                    alphabets.add(token.toUpperCase());
                } else if (TextUtils.isSpecialString(token)) {
                    specials.add(token);
                } else {
                    // comment - mixed strings are ignored for category arrays but their letters still count for concat_string
                }
            }
        }

        String letters = TextUtils.collectLettersInOrder(request != null ? request.getData() : List.of());
        String alt = TextUtils.reverseAlternateCaps(letters);

        res.setSuccess(true);
        res.setUserId(fullNameLowerUnderscore + "_" + dobDDMMYYYY);
        res.setEmail(email);
        res.setRollNumber(rollNumber);
        res.setOddNumbers(odd);
        res.setEvenNumbers(even);
        res.setAlphabets(alphabets);
        res.setSpecialCharacters(specials);
        res.setSum(sum.toString());
        res.setConcatString(alt);

        return res;
    }
}