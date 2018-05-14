package toolbean;

public class MyTools {

	/**
	 * 把int转换为字符
	 * 
	 * @param num
	 * @return
	 */
	public static String intToStr(int num) {
	
		return String.valueOf(num);
	}

	/**
	 * 把字符转换为int
	 * 
	 * @param str
	 * @return
	 */
	public static int strToint(String str) {
		if (str == null || str.equals(""))
			str = "0";
		int i = 0;
		try {
			i = Integer.parseInt(str);
		} catch (Exception e) {
			i = 0;
			e.printStackTrace();
		}
		return i;
	}

	/**
	 * 
	 * @param str
	 *            被截取的字符串
	 * @param i
	 *            截取后面倒数 多少位
	 * @return 返回 后面i位字符串
	 */
	public static String subStrAfter(String str, int i) {

		return str.substring(str.length() - i);
	}

	/**
	 * 截取字符串(i,j)
	 * 
	 * @param str
	 * @param i
	 * @param j
	 * @return
	 */
	public static String subStr(String str, int i, int j) {

		return str.substring(i, j);
	}

	public static void main(String[] agrs) {

		System.out.println(subStr("4507211991", 2, 6));

	}
}
