package com.automationanywhere.botcommand.demo;

import com.automationanywhere.botcommand.data.Value;
import com.automationanywhere.botcommand.demo.GenerateGUID;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.automationanywhere.botcommand.data.Value;
import org.testng.annotations.DataProvider;


import static org.testng.Assert.assertEquals;

public class GenerateGUIDTest {
    GenerateGUID command = new GenerateGUID();

    @Test
    public void guidTests(){
        Value<String> d = command.action();
        String output = (String)d.get();
       // System.out.println("Debug:"+output);

    }
}
