package nio2.privacyNotice;

public class CustomerEmailParser implements ContentParser {
	@Override
	public String contentParse(String content) {
		String[] splitedContents = content.split("\\(");
		String email = splitedContents[0];
		if (!email.contains("@")){
			email = email + "@kakao.com";
		}
		return email;
	}
}
