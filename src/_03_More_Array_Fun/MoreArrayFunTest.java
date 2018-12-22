package _03_More_Array_Fun;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MoreArrayFunTest {

	@Test
	void testPrintAll() {
		String[] names = {"Esme"," Isis"," Michiyo"};
		String all = MoreArrayFun.printAll(names);
		Assert.assertEquals("Esme, Isis, Michiyo", all);
	}

	@Test
	void testPrintEven() {
		String[] fruit = {"Banana", "Strawberry", "Apple", "Kiwi", "Persimmon", "Orange"};
		String even = MoreArrayFun.printEven(fruit);
		Assert.assertEquals("Strawberry, Kiwi, Orange", even);
	}

}
