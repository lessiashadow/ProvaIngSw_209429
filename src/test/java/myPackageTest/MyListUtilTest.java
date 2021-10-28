package myPackageTest;

import myPackage.MyListUtil;
import org.joda.time.LocalDateTime;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class MyListUtilTest {
    private static MyListUtil myObject;
    private List<Integer> listExpected;
    private List<Integer> listValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        //Ascending test
        /*List<Integer> l1valueAscending = Arrays.asList(3, 5, 1, 4, 9);
        List<Integer> l1expectedAscending = Arrays.asList(1, 3, 4, 5, 9);
        List<Integer> l2valueAscending = Arrays.asList(8, 2, 0, 10, 3, 4);
        List<Integer> l2expectedAscending = Arrays.asList(0, 2, 3, 4, 8, 10);*/
        //Descending test
        List<Integer> l1valueDescending = Arrays.asList(3, 5, 1, 4, 9);
        List<Integer> l1expectedDescending = Arrays.asList(9, 5, 4, 3, 1);
        List<Integer> l2valueDescending = Arrays.asList(8, 2, 0, 10, 3, 4);
        List<Integer> l2expectedDescending = Arrays.asList(10, 8, 4, 3, 2, 0);
        return Arrays.asList(new Object[][]{{l1expectedDescending, l1valueDescending}, {l2expectedDescending, l2valueDescending}});
    }

    public MyListUtilTest(List<Integer> listExpected, List<Integer> listValue) {
        this.listExpected = listExpected;
        this.listValue = listValue;
    }

    @BeforeClass
    public static void prepareAll() {
        myObject = new MyListUtil();
    }

    @Test
    public void testSortFunctionAscending() {
        assertEquals(listExpected, myObject.sort(listValue, 0));
    }

    @Test
    public void testSortFunctionDescending() {
        assertEquals(listExpected, myObject.sort(listValue, 1));
    }

    @Before
    public void beforeAnyTests() {
        System.out.println(LocalDateTime.now());
        System.out.println("------------------------");
    }

    @After
    public void afterAnyTest() {
        System.out.println(LocalDateTime.now());
        System.out.println("------------------------");
    }
}
