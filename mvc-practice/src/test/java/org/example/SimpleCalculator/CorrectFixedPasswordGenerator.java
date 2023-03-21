package org.example.SimpleCalculator;

import org.example.PasswordGenerator.PasswordGenerator;

public class CorrectFixedPasswordGenerator implements PasswordGenerator {

    @Override
    public String generatePassword() {
        return "abcdefgh"; //8글자
    }
}
