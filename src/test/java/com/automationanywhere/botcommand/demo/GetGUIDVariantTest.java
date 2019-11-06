package com.automationanywhere.botcommand.demo;

import com.automationanywhere.botcommand.data.Value;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Test(enabled=true)
public class GetGUIDVariantTest {

    GetGUIDVariant command = new GetGUIDVariant();

    @DataProvider(name = "data")
    public Object[][] dataTobeTested(){

        return new Object[][]{
                {"b4aed071-9ec6-42e7-b724-76fa0d33c71e","2"}

        };
    }

    @Test(dataProvider = "data")
    public void aTests(String guid, String result){
        Value<String> d = command.action(guid);
        String output = (String)d.get();
        //System.out.println("Debug:"+output);
        assertEquals(output,result);
    }
}
