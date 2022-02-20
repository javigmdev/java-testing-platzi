package com.example.test.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void repeat_string_once(){
        Assert.assertEquals("hellohellohello", StringUtil.repeat("hello",3));
    }

    @Test
    public void repeat_string_multiple_times(){
        Assert.assertEquals("hello", StringUtil.repeat("hello",1));
    }

    @Test
    public void repeat_string_zero_times(){
        Assert.assertEquals("", StringUtil.repeat("hello",0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeat_string_negative_times(){
        StringUtil.repeat("hello",-1);
    }

    @Test
    public void string_is_not_empty() {
        Assert.assertFalse(StringUtil.isEmpty("hello"));
    }

    @Test
    public void string_is_empty() {
        Assert.assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    public void string_null_is_empty() {
        Assert.assertTrue(StringUtil.isEmpty(null));
    }

    @Test
    public void string_space_is_empty() {
        Assert.assertTrue(StringUtil.isEmpty(" "));
    }
    
}