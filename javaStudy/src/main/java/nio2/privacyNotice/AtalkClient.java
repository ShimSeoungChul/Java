package nio2.privacyNotice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.databind.ObjectMapper;
// 카카오 알림톡 api
public class AtalkClient {
	private final String URL = "https://bzm-api.kakao.com/v3/";
	private final String MESSAGE_SEND = URL + "alimtalk/send";
	private final String RESPONSE_All = URL + "responseAll";
	private final String messageType = "at";
	private String serialNumber = "20211213-";
	private int unique = 100;
	private final String senderKey = "";
	private final String templateCode = "";
	private String phoneNumber = "";

	private final String message =
		"항상 카카오모빌리티 서비스를 이용해주셔서 감사합니다. \n"
			+ "카카오모빌리티에서는 개인정보 보호법에 따라 연 1회 회원님의 개인정보 이용내역을 안내해드리고 있습니다.\n"
			+ "자세한 내용은 아래 내용을 확인해주세요.\n"
			+ "[펫미업 서비스 개인정보 이용내역]\n"
			+ "- 수집 개인정보 항목 : 이름, 이메일, 휴대전화번호, 위치정보, 예약정보\n"
			+ "- 수집 및 이용 목적 : 운송서비스 제공자(펫택시), 모빌리티서비스 제공자와 회원을 연결해주는 서비스 제공(예약서비스 포함), 이용자 보호를 위한 기능(안심번호 서비스, 메세지 공유 등) 제공, 본인인증 서비스 제공";

	private final String responseMethod = "polling";

	public String sendMessage(String phoneNumber) throws IOException {
		this.phoneNumber = phoneNumber;

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-");
		String formattedString = LocalDateTime.now().format(formatter);
		this.serialNumber = formattedString + unique;

		AtalkRequestDto dto = new AtalkRequestDto(messageType, serialNumber, senderKey, phoneNumber,
			templateCode, message, responseMethod);
		unique++;
		String body = new ObjectMapper().writeValueAsString(dto);
		return request(MESSAGE_SEND, body);
	}

	public String getResponseAll() throws IOException {
		return request(RESPONSE_All, "{\"channel_key\":\"petmeup\"}");
	}

	public String request(String urlString, String body) throws IOException {
		HttpURLConnection conn = makeHttpURLConnection(new URL(urlString));

		// Request Body에 데이터 담기
		OutputStream os = conn.getOutputStream();
		os.write(body.getBytes(StandardCharsets.UTF_8));

		// 요청
		System.out.println("Response code: " + conn.getResponseCode() + conn.getResponseMessage());
		// 받아온 데이터 읽기
		BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));

		// Stream to String
		StringBuilder sb = new StringBuilder();
		String line;
		while ((line = rd.readLine()) != null) {
			sb.append(line);
		}

		// 요청 닫기
		rd.close();
		conn.disconnect();

		System.out.println(sb);

		String result = serialNumber + "," + phoneNumber + "," + LocalDateTime.now() + "," + sb;
		return result;
	}

	private HttpURLConnection makeHttpURLConnection(URL url) throws IOException {
		HttpURLConnection conn =  (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Content-type", "application/json");
		conn.setDoOutput(true);
		conn.setDoInput(true);
		return conn;
	}
}
