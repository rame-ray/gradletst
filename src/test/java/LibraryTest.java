import org.junit.Test;
import static org.junit.Assert.*;
import static java.lang.System.out;

/*
 * This Java source file was auto generated by running 'gradle init --type java-library'
 * by 'ramesh' at '25/5/17 10:57 AM' with Gradle 2.10
 *
 * @author ramesh, @date 25/5/17 10:57 AM
 */
public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
	out.println("Welcome to Dev + Ops");   
     assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
}
