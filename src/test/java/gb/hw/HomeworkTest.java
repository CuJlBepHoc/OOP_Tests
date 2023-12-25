package gb.hw;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import gb.sem005.Homework;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class HomeworkTest {

    @Test
    void testContains() {
        List<String> testList = Arrays.asList("apple", "banana", "orange", "apple", "grape");
        Assertions.assertTrue(Homework.contains(testList, "banana"));
        Assertions.assertFalse(Homework.contains(testList, "watermelon"));
    }

    @Test
    void testHasExactly() {
        List<String> testList = Arrays.asList("apple", "banana", "orange", "apple", "grape");
        Assertions.assertTrue(Homework.hasExactly(Collections.singletonList("orange"), "orange"));
        Assertions.assertFalse(Homework.hasExactly(testList, "apple"));
        Assertions.assertFalse(Homework.hasExactly(testList, "watermelon"));
        Assertions.assertFalse(Homework.hasExactly(Collections.emptyList(), "apple"));
    }


    @Test
    void testUnique() {
        List<String> testList = Arrays.asList("apple", "banana", "orange", "apple", "grape");
        List<String> uniqueList = Homework.unique(testList);

        Assertions.assertEquals(4, uniqueList.size());
        Assertions.assertTrue(uniqueList.contains("apple"));
        Assertions.assertTrue(uniqueList.contains("banana"));
        Assertions.assertTrue(uniqueList.contains("orange"));
        Assertions.assertTrue(uniqueList.contains("grape"));
    }
}