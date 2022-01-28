package nio2.privacyNotice;

public class CustomerPhoneParser implements ContentParser{
	@Override
	public String contentParse(String content) {
		String[] splitedContents = content.split("-");

		int num = splitedContents.length;
		StringBuilder sb = new StringBuilder();

		if (num == 1) {
			sb.append(splitedContents[0]);
		} else {
			for (String splitedContent : splitedContents){
				sb.append(splitedContent);
			}
		}

		sb.deleteCharAt(0);// 010 -> 10 형태로 변경
		sb.insert(0,"82"); // 국가 번호 추가

		return sb.toString();
	}
}
