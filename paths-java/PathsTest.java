import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PathsTest {

	protected Paths solution;

	@Before
	public void setUp() {
		solution = new Paths();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		String[] graph = new String[] { "01111", "10111", "11011", "11101", "11110" };
		int from = 0;
		int to = 0;

		int expected = 2;
		int actual = solution.secondBest(graph, from, to);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		String[] graph = new String[] { "1" };
		int from = 0;
		int to = 0;

		int expected = 1;
		int actual = solution.secondBest(graph, from, to);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		String[] graph = new String[] { "X1119", "1X119", "11X19", "111X1", "9111X" };
		int from = 0;
		int to = 4;

		int expected = 3;
		int actual = solution.secondBest(graph, from, to);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		String[] graph = new String[] { "X1110", "1X111", "11111", "111X1", "0111X" };
		int from = 0;
		int to = 4;

		int expected = 2;
		int actual = solution.secondBest(graph, from, to);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		String[] graph = new String[] { "X9XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XX9XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
				"X9X9XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "X99X9XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "X999X9XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
				"X9999X9XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "X99999X9XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "X999999X9XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
				"X9999999X9XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "X99999999X9XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "X999999999X9XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
				"X9999999999X9XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "X99999999999X9XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "X999999999999X9XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
				"X9999999999999X9XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "X99999999999999X9XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "X999999999999999X9XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
				"X9999999999999999X9XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "X99999999999999999X9XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "X999999999999999999X9XXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
				"X9999999999999999999X9XXXXXXXXXXXXXXXXXXXXXXXXXXXX", "X99999999999999999999X9XXXXXXXXXXXXXXXXXXXXXXXXXXX", "X999999999999999999999X9XXXXXXXXXXXXXXXXXXXXXXXXXX",
				"X9999999999999999999999X9XXXXXXXXXXXXXXXXXXXXXXXXX", "X99999999999999999999999X9XXXXXXXXXXXXXXXXXXXXXXXX", "X999999999999999999999999X9XXXXXXXXXXXXXXXXXXXXXXX",
				"X9999999999999999999999999X9XXXXXXXXXXXXXXXXXXXXXX", "X99999999999999999999999999X9XXXXXXXXXXXXXXXXXXXXX", "X999999999999999999999999999X9XXXXXXXXXXXXXXXXXXXX",
				"X9999999999999999999999999999X9XXXXXXXXXXXXXXXXXXX", "X99999999999999999999999999999X9XXXXXXXXXXXXXXXXXX", "X999999999999999999999999999999X9XXXXXXXXXXXXXXXXX",
				"X9999999999999999999999999999999X9XXXXXXXXXXXXXXXX", "X99999999999999999999999999999999X9XXXXXXXXXXXXXXX", "X999999999999999999999999999999999X9XXXXXXXXXXXXXX",
				"X9999999999999999999999999999999999X9XXXXXXXXXXXXX", "X99999999999999999999999999999999999X9XXXXXXXXXXXX", "X999999999999999999999999999999999999X9XXXXXXXXXXX",
				"X9999999999999999999999999999999999999X9XXXXXXXXXX", "X99999999999999999999999999999999999999X9XXXXXXXXX", "X999999999999999999999999999999999999999X9XXXXXXXX",
				"X9999999999999999999999999999999999999999X9XXXXXXX", "X99999999999999999999999999999999999999999X9XXXXXX", "X999999999999999999999999999999999999999999X9XXXXX",
				"X9999999999999999999999999999999999999999999X9XXXX", "X99999999999999999999999999999999999999999999X9XXX", "X999999999999999999999999999999999999999999999X9XX",
				"X9999999999999999999999999999999999999999999999X9X", "X99999999999999999999999999999999999999999999999X9", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
		int from = 0;
		int to = 49;

		int expected = 459;
		int actual = solution.secondBest(graph, from, to);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase5() {
		String[] graph = new String[] { "X" };
		int from = 0;
		int to = 0;

		int expected = -1;
		int actual = solution.secondBest(graph, from, to);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase6() {
		String[] graph = new String[] { "6X4XX50392", "95979050X4", "703X7X4218", "6602806624", "9828648374", "259507367X", "8810887807", "002378X847", "446X754724", "1128726659" };
		int from = 3;
		int to = 3;

		int expected = 1;
		int actual = solution.secondBest(graph, from, to);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase7() {
		String[] graph = new String[] { "00000000000000000000000000000000000000000000000000", "00000000000000000000000000000000000000000000000000",
				"00000000000000000000000000000000000000000000000000", "00000000000000000000000000000000000000000000000000", "00000000000000000000000000000000000000000000000000",
				"00000000000000000000000000000000000000000000000000", "00000000000000000000000000000000000000000000000000", "00000000000000000000000000000000000000000000000000",
				"00000000000000000000000000000000000000000000000000", "00000000000000000000000000000000000000000000000000", "00000000000000000000000000000000000000000000000000",
				"00000000000000000000000000000000000000000000000000", "00000000000000000000000000000000000000000000000000", "00000000000000000000000000000000000000000000000000",
				"00000000000000000000000000000000000000000000000000", "00000000000000000000000000000000000000000000000000", "00000000000000000000000000000000000000000000000000",
				"00000000000000000000000000000000000000000000000000", "00000000000000000000000000000000000000000000000000", "00000000000000000000000000000000000000000000000000",
				"00000000000000000000000000000000000000000000000000", "00000000000000000000000000000000000000000000000000", "00000000000000000000000000000000000000000000000000",
				"00000000000000000000000000000000000000000000000000", "00000000000000000000000000000000000000000000000000", "00000000000000000000000000000000000000000000000000",
				"00000000000000000000000000000000000000000000000000", "00000000000000000000000000000000000000000000000000", "00000000000000000000000000000000000000000000000000",
				"00000000000000000000000000000000000000000000000000", "00000000000000000000000000000000000000000000000000", "00000000000000000000000000000000000000000000000000",
				"00000000000000000000000000000000000000000000000000", "00000000000000000000000000000000000000000000000000", "00000000000000000000000000000000000000000000000000",
				"00000000000000000000000000000000000000000000000000", "00000000000000000000000000000000000000000000000000", "00000000000000000000000000000000000000000000000000",
				"00000000000000000000000000000000000000000000000000", "00000000000000000000000000000000000000000000000000", "00000000000000000000000000000000000000000000000000",
				"00000000000000000000000000000000000000000000000000", "00000000000000000000000000000000000000000000000000", "00000000000000000000000000000000000000000000000000",
				"00000000000000000000000000000000000000000000000000", "00000000000000000000000000000000000000000000000000", "00000000000000000000000000000000000000000000000000",
				"00000000000000000000000000000000000000000000000000", "00000000000000000000000000000000000000000000000000", "00000000000000000000000000000000000000000000000001" };
		int from = 0;
		int to = 0;

		int expected = 1;
		int actual = solution.secondBest(graph, from, to);

		Assert.assertEquals(expected, actual);
	}
}