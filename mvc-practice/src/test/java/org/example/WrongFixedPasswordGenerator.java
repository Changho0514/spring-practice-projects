package org.example;

import org.example.PasswordGenerator.PasswordGenerator;

public class WrongFixedPasswordGenerator implements PasswordGenerator {

    @Override
    public String generatePassword() {
        return "ab"; //2글자
    }


}
