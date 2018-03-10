package math;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MathTest {

	public static final BigDecimal a1 = new BigDecimal(10);

	public static final BigDecimal a2 = new BigDecimal(10.2);

	public static void main(String[] args) {
		// BigDecimal decimal = new BigDecimal("1.123450");
		// System.out.println(decimal);
		// BigDecimal setScale = decimal.setScale(4,
		// BigDecimal.ROUND_HALF_DOWN);
		// System.out.println(setScale);
//		BigDecimal a = new BigDecimal("2800000.0000");
//		BigDecimal b = new BigDecimal("3000000.0000");
//		// System.out.println(a.divide(b,2,RoundingMode.HALF_UP));
//		System.out.println(a.subtract(b));
//
//		BigDecimal c = new BigDecimal(3).multiply(new BigDecimal(2)).add(new BigDecimal(1)).divide(new BigDecimal(3), 2,
//				RoundingMode.HALF_UP);
//		System.out.println(c);
//		System.out.println("ygd=");
		
		System.out.println(queryFloat(a1, a2,new BigDecimal("0.1")));

	}

	/**
	 * 判断涨幅是否大于百分之十
	 * @param before
	 * @param after
	 * @param compare
	 * @return
	 */
	public static boolean queryFloat(BigDecimal before, BigDecimal after,BigDecimal compare) {
		BigDecimal res=after.subtract(before).abs().divide(before,  2,
				RoundingMode.HALF_UP);
		if(res.compareTo(compare)>0){//大于0说明浮动大于10%
			return false;
		}
		return true;
	}
}
