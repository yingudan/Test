package List;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap();

		map.put("郑州", "河南");
		map.put("长沙", "湖南");

		// 第一種
		Set<String> set = map.keySet(); // 取出所有的key值
		for (String key : set) {
			System.out.println("第一种：" + map.get(key));
		}

		// 第二种
		Set<Map.Entry<String, String>> entryseSet = map.entrySet();
		for (Map.Entry<String, String> entry : entryseSet) {
			System.out.println("第二种：" + entry.getKey() + ":" + entry.getValue());
		}

		// 第三种
		Iterator it = map.keySet().iterator();
		while (it.hasNext()) {
			 String key = (String) it.next();
//			String value = map.get(it.next());
			System.out.println("第三种：" + key);
		}
	}

}
