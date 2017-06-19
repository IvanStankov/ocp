package com.ivan.learning.ocp;

import com.ivan.learning.ocp.runner.CallbackRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(CallbackRunner.class)
public class JunitCallbackTest {

    // org.junit.runner.notification.RunListener.testRunStarted
    // org.junit.runner.notification.RunListener.testRunFinished
    // The callbacks above are not invoked from gradle, but works from Idea IDE

    @Test
    public void test1() {
        System.out.println("Test1 executed");
    }

}
