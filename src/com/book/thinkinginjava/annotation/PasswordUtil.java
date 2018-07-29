package com.book.thinkinginjava.annotation;

import java.util.List;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/7/28
 */
public class PasswordUtil {
    @UseCase(id = 47, description = "Password must contain at least one numeric")
    public boolean validatePassword(String password) {
        return password.matches("\\w*\\d\\w*");
    }
    @UseCase(id = 48)
    public String encryptPassword(String password) {
        return new StringBuilder(password).reverse().toString();
    }
    @UseCase(id = 49, description = "New passwords can't equal previously used ones")
    public boolean checkNewPassword(List<String> passwordList, String password) {
        return !passwordList.contains(password);
    }
}
