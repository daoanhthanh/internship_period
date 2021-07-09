package test;

import jdk.jfr.Name;
import org.junit.jupiter.api.Test;
import rootPackage.Person;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @Test
    @Name("Given an object, when gets filed names at run time should correct.")
    public void givenObject_whenGetsFieldNamesAtRuntime_thenCorrect() {
        Object person = new Person();
        Field[] fields = person.getClass().getDeclaredFields();

        List<String> actualFieldNames = getFieldNames(fields);

        assertTrue(Arrays.asList("name", "age")
                .containsAll(actualFieldNames));
    }

    private static List<String> getFieldNames(Field[] fields) {
        List<String> fieldNames = new ArrayList<>();
        for (Field field : fields)
            fieldNames.add(field.getName());
        return fieldNames;
    }
}