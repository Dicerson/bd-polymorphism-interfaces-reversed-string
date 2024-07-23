package com.amazon.ata.interfaces;

/**
 * Reverse a String and act like a <code>CharSequence</code>.
 * <p>
 * Change this class definition to implement CharSequence.
 */
public class ReversedString implements CharSequence{
    private String string;

    /**
     * Implement this constructor during the interfaces prework.
     *
     * @param chars The String of chars to be reversed
     */
    public ReversedString(final String chars) {
        char letter;
        String reversed = "";
        for (int i = 0; i < chars.length(); i++) {
            letter = chars.charAt(i);
            reversed = letter + reversed;
        }
        this.string = reversed;
    }

    @Override
    public int length() {
        return string.length();
    }

    @Override
    public char charAt(int index) {
        return string.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        String substring = "";
        char letter;
        for (int i = start; i < end; i++) {
            letter = this.string.charAt(i);
            substring += letter;
        }
        return substring;
    }

    @Override
    public String toString() {
        return string;
    }
}
