package learn.mvn.parallel_exec;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestTwo {
    @Test
    public void testCase1() throws InterruptedException {
        Thread.sleep(3000);
        assertTrue(true);
    }
    @Test
    public void testCase2() throws InterruptedException {
        Thread.sleep(3000);
        assertTrue(true);
    }
    @Test
    public void testCase3() throws InterruptedException {
        Thread.sleep(3000);
        assertTrue(true);
    }
}
