import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import pom.Buy_Test;
import pom.Buy_Test_Prod;

@RunWith(Suite.class)
@SuiteClasses ({Buy_Test.class,Buy_Test_Prod.class})
public class AllTest {
	

}
