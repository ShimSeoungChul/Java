package nio2.privacyNotice;

import static java.io.File.*;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Demo {
	static final String encoder = "UTF-8";

	public static void main(String[] args) throws Exception {
		emailParse();
		String intpusFile = separator + "Users" + separator + "ted.sc" + separator + "Desktop" + separator + "알림톡결과2021_12_13.txt";//"2021알림톡개인정보통지대상자.csv";
		 List<String> phones = phoneParse();
		var results = new ArrayList<String>();

		results.add("id,serialNum,phone,요청시간,요청내용");
		int id = 1;
		//AtalkClient atalkClient = new AtalkClient();

		for (int i = 0; i < phones.size(); i++) {
			String phone = phones.get(i);
			StringBuilder result = new StringBuilder();
			result.append(id).append(",");
			results.add(result.toString());
			id++;
		}

		/*
				int full = phones.size();
		System.out.println("full:"+full);
		int unit = full/10;
		for (int i = 1; i <= 11; i++) {
			int finalI = i;
			new Thread(()->{
				for (int j = (finalI -1) * unit; j <= finalI * unit; j++ ) {
					String phone = phones.get(j);
					StringBuilder result = new StringBuilder();
					result.append(phone);
					results.add(result.toString());

					if(j == full -1) {
						break;
					}
				}
			}).start();
		}
		 */

		writeFile(Path.of(intpusFile), results);

		//String result = atalkClient.getResponseAll();
	}

	public static List<String> phoneParse() throws Exception {
		String intpusFile = separator + "Users" + separator + "ted.sc" + separator + "Desktop" + separator + "2021알림톡개인정보통지대상자.csv";//"2021알림톡개인정보통지대상자.csv";
		List<String> phones = readFile(Paths.get(intpusFile), new CustomerPhoneParser());
		return phones;
	}

	public static void emailParse() throws Exception {
		String intputFile = separator + "Users" + separator + "ted.sc" + separator + "Desktop" + separator + "2021ems개인정보통지대상자.txt";
		List<String> emails = readFile(Paths.get(intputFile), new CustomerEmailParser());

		var contents = new ArrayList<String>();
		for (String email : emails){
			contents.add(email);
		}

		String outputFile = separator + "Users" + separator + "ted.sc" + separator + "Desktop" + separator + "2021emsPetmeup.txt";
		writeFile(Paths.get(outputFile), contents);
	}

	public static Path writeFile(Path path, List<String> contents) throws Exception{
		Charset charset = Charset.forName(encoder);
		StandardOpenOption openOption = StandardOpenOption.CREATE;
		return Files.write(path, contents, charset, openOption);
	}

	public static List<String> readFile(Path path, ContentParser contentParser) throws Exception{
		Charset charset=Charset.forName(encoder);
		System.out.println("Path="+path);
		List<String> rawFileContents = Files.readAllLines(path, charset);
		List<String> parsedFileContents = new ArrayList<>();

		int count = 0;
		for(String rawFileContent : rawFileContents) {
			count++;
			String parsedFileContent = contentParser.contentParse(rawFileContent);
			parsedFileContents.add(parsedFileContent);
		}

		System.out.println("처리 개수:"+count);
		return parsedFileContents;
	}
}
