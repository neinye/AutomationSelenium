package junitpack;

import org.junit.*;

import java.util.concurrent.ExecutionException;

import static org.junit.Assert.*;

public class JUnitIntroduction {

    @BeforeClass
        public static void setUpBeforeClass() throws Exception {
        System.out.println("Executed before class");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception{
        System.out.println("Executed after class");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Executed before");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Executed after");
    }
    @Test
    public void test1(){
        System.out.println(" Test1 not yet implemented");
    }
    @Test
    public void test2(){
        System.out.println(" Test2 not yet implemented");
    }
}