/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package tarea3pds;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    App claseTest = new App();

    @Test public void testSuma() {
        //App classUnderTest = new App();
        assertEquals(3, claseTest.suma(1, 2));
    }

    @Test public void testSuma2() {
        //App classUnderTest = new App();
        assertEquals(2, claseTest.suma(1, 2));
    }
}