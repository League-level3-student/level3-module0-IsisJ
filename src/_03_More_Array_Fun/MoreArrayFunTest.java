package _03_More_Array_Fun;



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
		
		String[] fruit2 = {"Banana", "Strawberry", "Apple", "Kiwi", "Persimmon"};
		even = MoreArrayFun.printEven(fruit2);
		Assert.assertEquals("Strawberry, Kiwi", even);
	}

	@Test
	void testPrintOdd() {
		String[] fruit = {"Banana", "Strawberry", "Apple", "Kiwi", "Persimmon", "Orange"};
		String odd = MoreArrayFun.printOdd(fruit);
		Assert.assertEquals("Banana, Apple, Persimmon", odd);
		
		
		String[] fruit2 = {"Banana", "Strawberry", "Apple", "Kiwi", "Persimmon"};
		odd = MoreArrayFun.printOdd(fruit2);
		Assert.assertEquals("Banana, Apple, Persimmon", odd);
	}
	
	@Test
	void testPrintMiddle() {
		String[] patterns = {"Stripes", "Polka dots", "Cheveron"};
		String middle = MoreArrayFun.printMiddle(patterns);
		Assert.assertEquals("Polka dots", middle);
		
		String[] patterns2 = {"Stripes", "Polka dots", "Cheveron", "Geometric"};
		middle = MoreArrayFun.printMiddle(patterns2);
		Assert.assertEquals("This array has an even amount of values. I can't provide a middle", middle);
	}
	
}
