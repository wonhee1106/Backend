import java.text.SimpleDateFormat;
import java.util.Date;

public class Exam03 {
	public static void main(String[] args)throws Exception {
		
		// String -> Timestamp
		
		String ctime = "2014-04-15";
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date result = sdf.parse(ctime);
		
		long parsedTime = result.getTime();
		System.out.println(parsedTime);
				
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd(E)");
		String result2 = sdf2.format(parsedTime);
		System.out.println(result2);
		
		
		
		
		
	}
}
