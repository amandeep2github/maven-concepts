package learn.mvn.parallel_exec;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestOne {
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
