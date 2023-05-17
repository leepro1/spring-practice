package simple.simplewebservice.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor //final 필드만 생성자만들어준다.
public class HelloResponseDto {

    private final String name;
    private final int amount;
}
