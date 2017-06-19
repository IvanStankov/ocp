package com.ivan.learning.ocp.runner;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.RunListener;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

public class CallbackRunner extends BlockJUnit4ClassRunner {

    public CallbackRunner(Class<?> klass) throws InitializationError {
        super(klass);
    }

    @Override
    public void run(RunNotifier notifier) {
        notifier.addListener(new RunListener() {

            @Override
            public void testRunStarted(Description description) throws Exception {
                System.out.println("Test run started");
                if (true) {
                    throw new IllegalAccessException("Test run started");
                }
            }

            @Override
            public void testRunFinished(Result result) throws Exception {
                if (true) {
                    throw new IllegalAccessException("Test run finished");
                }
            }
        });

        super.run(notifier);
    }
}
