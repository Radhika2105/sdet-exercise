package VerifyEnglishWord;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(DictionaryEnglishWordTest.class);

        // Print failed test message
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        // Print success test message
        System.out.println("Successful: " + result.wasSuccessful());
        System.out.println("Ran " + result.getRunCount() + " tests");
    }
}  