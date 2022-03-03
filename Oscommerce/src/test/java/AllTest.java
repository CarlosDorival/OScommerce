import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import pom.Buy_Test;
import pom.BuyTestProd;

@RunWith(Suite.class)
@SuiteClasses ({Buy_Test.class,BuyTestProd.class})
public class AllTest {
	

}
