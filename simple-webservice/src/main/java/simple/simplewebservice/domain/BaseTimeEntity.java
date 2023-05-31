package simple.simplewebservice.domain;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@MappedSuperclass // createDate, modifiedDate 필드를 칼럼으로 인식 + 모든 Entity class의 상위 클래스
@EntityListeners(AuditingEntityListener.class) //
public class BaseTimeEntity {

    @CreatedDate // Entity 생성시 자동 저장
    private LocalDateTime createdDate;

    @LastModifiedDate // Entity 값 변경시 자동 저장
    private LocalDateTime modifiedDate;


}
