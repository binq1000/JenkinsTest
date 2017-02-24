import TestPackage.NumberGenerator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Nekkyou on 24-2-2017.
 */
public class NumberGeneratorTests {
	@Test
	public void TestNumberOne() {
		NumberGenerator ng = new NumberGenerator();
		Assert.assertTrue(ng.GetOne() == 1);
	}

	@Test
	public void ErrorThrowing() {
		Assert.assertTrue(false);
	}

}
