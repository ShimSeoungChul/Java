package nio2.privacyNotice;
import  nio2.privacyNotice.ContentParser;

public class CustomerPhoneParser implements ContentParser{
	@Override
	public String contentParse(String content) {
		String[] splitedContents = content.split("-");

		int num = splitedContents.length;
		StringBuilder sb = new StringBuilder();
		sb.append("82"); // 국가 번호 추가

		if (num == 1) {
			sb.append(splitedContents[0]);
		} else {
			for (String splitedContent : splitedContents){
				sb.append(splitedContent);
			}
		}

		return sb.toString();
	}
}
