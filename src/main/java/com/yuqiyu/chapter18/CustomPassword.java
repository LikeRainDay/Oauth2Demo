package com.yuqiyu.chapter18;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * @author ：     侯帅
 * @time ：       2018/5/7/16:57
 * 描述 :
 */
@Component
public class CustomPassword implements PasswordEncoder {
    @Override
    public String encode(CharSequence arg0) {
        return arg0.toString();
    }

    @Override
    public boolean matches(CharSequence arg0, String arg1) {
        return arg1.equals(arg0.toString());
    }
}
