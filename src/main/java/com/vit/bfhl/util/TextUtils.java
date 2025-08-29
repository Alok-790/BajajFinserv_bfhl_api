package com.vit.bfhl.util;

public class TextUtils {

    public static boolean isNumericString(String s) {
        if (s == null || s.isEmpty()) return false;
        return s.matches("[+-]?\\d+");
    }

    public static boolean isAlphabeticString(String s) {
        if (s == null || s.isEmpty()) return false;
        return s.matches("[A-Za-z]+");
    }

    public static boolean isSpecialString(String s) {
        if (s == null || s.isEmpty()) return false;
        return s.matches("[^A-Za-z0-9]+");
    }

    public static String collectLettersInOrder(java.util.List<String> data) {
        StringBuilder sb = new StringBuilder();
        for (String token : data) {
            if (token == null) continue;
            for (int i = 0; i < token.length(); i++) {
                char c = token.charAt(i);
                if (Character.isLetter(c)) sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String reverseAlternateCaps(String s) {
        if (s == null) return "";
        StringBuilder out = new StringBuilder();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(n - 1 - i);
            if (Character.isLetter(c)) {
                out.append(i % 2 == 0 ? Character.toUpperCase(c) : Character.toLowerCase(c));
            } else {
                out.append(c);
            }
        }
        return out.toString();
    }
}