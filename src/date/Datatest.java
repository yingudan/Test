package date;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author shadow
 */
public class Datatest {
	public static void main(String[] args) throws ParseException {
		System.out.println(new BigDecimal(23.00).compareTo(new BigDecimal(100)));
		// .divide(new BigDecimal(8888888),0, BigDecimal.ROUND_UP)
		// String key = "_";
		// String str = "_";
		// str=str.replace("_", "\\_");
		// System.out.println(str);
		// while (a != -1) {
		// sb.replace(a, a+1, "\\");
		//// System.out.print(a + "\t");
		//// a = str.indexOf(key, a + 1);//*从这个索引往后开始第一个出现的位置
		// }

		String a = "_";
		String b = "_";
		// StringBuilder strb = new StringBuilder(a);
		System.out.println(a.indexOf("_"));
		// if(a.indexOf("_")==1){
		// System.out.println("包含下划线");
		//
		//
		//// strb.replace(start, end, str);
		//
		// }

		// StringBuilder sb = new StringBuilder("abcd");
		// sb.replace(sb.length()-1, sb.length(), "二");
		// System.out.println(sb.toString());

		// System.out.println( new BigDecimal("20").divide(new
		// BigDecimal(3),2,BigDecimal.ROUND_HALF_DOWN));
		// List<String> a = new ArrayList<String>();
		// a.add(null);
		// System.out.println(a.get(0));
		// System.out.println(a.size());
		// Map<String, Object> map = new HashMap<String, Object>();
		// map.put("1", "value1");
		// map.put("2", "value2");
		// map.put("3", "value3");
		// System.out.println("通过Map.entrySet遍历key和value");
		// for (Map.Entry<String, Object> entry : map.entrySet()) {
		// System.out.println("key= " + entry.getKey() + " and value= " +
		// entry.getValue());
		// }
		//
		// new BigDecimal("20").divide(new BigDecimal("3"), 3,
		// RoundingMode.HALF_UP)

		// 122.9906585454554545615568628136
		// System.out.println(
		// new BigDecimal(-2).subtract(new BigDecimal(-3))
		// .divide(new BigDecimal(2)).setScale(0,
		// BigDecimal.ROUND_HALF_DOWN).toString()
		// );

		// SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd
		// HH:mm:ss");
		// Date curDate = new Date(System.currentTimeMillis());// 获取当前时间
		// Date parse = formatter.parse("20170506 11:30:18");
		// long yy = curDate.getTime() - parse.getTime();
		// long a=yy/1000;
		// System.out.println(yy / 1000 );// 相差多少分钟
		// yy/1000:相差多少秒

		// yy/1000/60:相差多少分钟

		// yy/1000/60/60:相差多少小时

		// yy/1000/60/60/24:相差多少天
		// Object obj = new Date();
		// System.out.println(obj.getClass());
		//

	}

	public static double div(double value1, double value2, int scale) throws IllegalAccessException {
		// 如果精确范围小于0，抛出异常信息
		if (scale < 0) {
			throw new IllegalAccessException("精确度不能小于0");
		}
		BigDecimal b1 = new BigDecimal(Double.valueOf(value1));
		BigDecimal b2 = new BigDecimal(Double.valueOf(value2));
		return b1.divide(b2, scale).doubleValue();
	}
}
