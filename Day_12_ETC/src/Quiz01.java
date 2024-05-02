import java.text.SimpleDateFormat;
import java.util.Date;

public class Quiz01 {
	public static void main(String[] args)throws Exception {
		
		String ctime = "1919-03-01";
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date result = sdf.parse(ctime);
		
		long parsedTime = result.getTime();
		System.out.println(parsedTime);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일(E)");
		String result2 = sdf2.format(parsedTime);
		System.out.println(result2);
	}
}
