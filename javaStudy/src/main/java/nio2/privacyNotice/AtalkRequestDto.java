package nio2.privacyNotice;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;


@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public record AtalkRequestDto(String messageType, String serialNumber, String senderKey,
							  String phoneNumber, String templateCode, String message,
							  String responseMethod) {
}
