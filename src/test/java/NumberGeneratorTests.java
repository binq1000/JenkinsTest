import TestPackage.NumberGenerator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Nekkyou on 24-2-2017.
 */
public class NumberGeneratorTests {
	@Test
	public void TestNumberOne() {
		System.out.println("Error throwing test");
		NumberGenerator ng = new NumberGenerator();
		Assert.assertTrue(ng.GetOne() == 1);
	}

	@Test
	public void ErrorThrowing() {
		System.out.println("Error throwing test");
		Assert.assertTrue(false);
	}

	@Test
	public void anotherError() {
		System.out.println("Error throwing test");
		Assert.assertFalse(true);
	}

}
