package com.example.admin_me.lab3.Tests;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;
import com.example.admin_me.lab3.MainActivity;
import com.example.admin_me.lab3.R;

/**
 * Created by admin_me on 4/13/16.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity>{
    MainActivity mainActivity;
    public JUnit_test(){
        super(MainActivity.class);
    }
    public void test_first(){
        int result;
        mainActivity = getActivity();
        result = mainActivity.sum2Number(0,0);
        assertEquals(0, result);
    }
    public void test_second(){
        int result;
        mainActivity = getActivity();
        result = mainActivity.sum2Number(10, -1);
        assertEquals(9, result);
    }
    public void test_third(){
        int result;
        mainActivity = getActivity();
        result = mainActivity.sum2Number(-10, 19);
        assertEquals(9, result);
    }
    public void test_fourth(){
        int result;
        mainActivity = getActivity();
        result = mainActivity.sum2Number(-10, -19);
        assertEquals(-29, result);
    }
    public void test_sixth(){
        int result;
        mainActivity = getActivity();
        result = mainActivity.sum2Number(Integer.MAX_VALUE, -1);
        assertEquals(2147483646, result);
    }
    public void test_seventh(){
        int result;
        mainActivity = getActivity();
        result = mainActivity.sum2Number(Integer.MIN_VALUE, 1);
        assertEquals(-2147483647, result);
    }
}
