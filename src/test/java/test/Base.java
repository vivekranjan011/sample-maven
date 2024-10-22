package test;

import org.testng.Assert;
import org.testng.SkipException;

class Base {

    protected void run() {
        double r = Math.random();
        if (r < 0.1) {
            Assert.fail("oops");
        } else if (r < 0.2) {
            throw new SkipException("skipping");
        }
    }
}
