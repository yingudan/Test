package date;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * @author shadow
 */
public class DateChange {
	public static void main(String[] args) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String a = fmt.format(date) + " 00:00:00";
		System.out.println(sdf.format(sdf.parse(a)));

	}
}
