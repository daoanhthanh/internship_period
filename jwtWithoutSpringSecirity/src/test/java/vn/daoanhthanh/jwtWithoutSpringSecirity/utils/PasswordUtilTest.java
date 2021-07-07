package vn.daoanhthanh.jwtWithoutSpringSecirity.utils;

import jdk.jfr.Name;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordUtilTest {

    private PasswordUtil passwordUtil;


    @BeforeEach
    void init(){
        passwordUtil = new PasswordUtil();
    }

    @Test
    @Disabled
    void getSalt() {
    }

    @Test
    @Disabled
    void hash() {
    }

    @Test
    @Disabled
    void generateSecurePassword() {
    }

    @Test
    @Name("When provide password and password hashed, should return true since it matched.")
    void verifyUserPassword() {
        String password = "thisisPassword";
        String salt = passwordUtil.getSalt(20);
        String hashed = passwordUtil.generateSecurePassword(password, salt);

        //then
        boolean reality = passwordUtil.verifyUserPassword(password, hashed, salt);
        assertTrue(reality);
    }
}