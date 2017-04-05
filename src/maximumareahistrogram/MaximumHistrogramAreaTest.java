package maximumareahistrogram;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaximumHistrogramAreaTest {

	@Test
	public void test() {
		MaximumHistrogramArea obj=new MaximumHistrogramArea();
		int input[]={1,2,4};
		int maxArea=obj.maximumHistaArea(input);
		assertEquals(4,maxArea);
	}

}
