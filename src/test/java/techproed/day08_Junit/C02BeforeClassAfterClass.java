package techproed.day08_Junit;

import org.junit.*;

public class C02BeforeClassAfterClass {
    /*
    @BeforeClass class'da en once calisan methot dur.
    @AfterClass class ta en son calisan methot dur.

    @BeforeClass ve@AfterClass methot lari sadece static methodlar ile calisir.
     */


    @BeforeClass

    public static void beforeClass() throws Exception {
        System.out.println("Class'da en once calisan methoddur, bie kez calisir. ");
    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("Class'da en son calisan methoddur, bir kez calisir. ");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Her test methodundan once calisir");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Her test methodundan sonra calisir");
    }

    @Test
    public void test01() {
        System.out.println("Ilk test");
    }


    @Test
    public void test02() {
        System.out.println("Ikinci Test");
    }
}
