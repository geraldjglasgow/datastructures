package com.gglasgow;

public class FirstCapitalLetter {
    public static void main(String[] args) {
        // Input : thequickbrownfOx
        // Output : K
        // Given a string find its first uppercase letter 
        String str = "thequickbrownFox";
        char res = first(str,0);
        if (res == 0)
            System.out.println("No uppercase letter");
        else
            System.out.println (res);
    }

    private static char first(String str, int index) {
        if (index >= str.length()) {
            return 0;
        }
        if (Character.isUpperCase(str.charAt(index))) {
            return str.charAt(index);
        }
        index++;
        return first(str, index);
    }
}
