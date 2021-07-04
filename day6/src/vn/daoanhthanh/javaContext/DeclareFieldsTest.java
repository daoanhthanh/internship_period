package vn.daoanhthanh.javaContext;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DeclareFieldsTest {

    @org.junit.jupiter.api.Test
    void setId() {
    }

    @Test
    @DisplayName("This should declare all instances of the DeclareFields class")
    public void givenObject_thenReturnInstances(){
        var object = new DeclareFields();
        Field[] fields = object.getClass().getFields();
        List<String> instances = getInstanceVariables(fields);
        assertTrue(Arrays.asList("id","name", "address")
                .containsAll(instances));
    }

    //extract all class's field names
    private static List<String> getInstanceVariables(Field[] fields) {
        List<String> fieldNames = new ArrayList<String>();
        for (Field field : fields)
            fieldNames.add(field.getName());
        return fieldNames;
    }
}