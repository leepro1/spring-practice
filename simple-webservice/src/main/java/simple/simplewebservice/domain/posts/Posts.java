package simple.simplewebservice.domain.posts;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Entity(DB 테이블과 mapping할 class) - 카멜 네이밍 -> 언더스코어 네이밍
 * Entity class는 절대 Setter 만들지 않는다. -> Builder로 생성후 public 메소드 구현으로 수정
 * id, table, content, author
 */
@Getter
@NoArgsConstructor // 기본 생성자 자동
@Entity
public class Posts {

    @Id // DB의 Pk값
    @GeneratedValue(strategy = GenerationType.IDENTITY) // PK 규칙 : AI
    private Long id;

    @Column(length = 500, nullable = false)
    private String table;

    @Column(columnDefinition = "TEXT",  nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(Long id, String table, String content, String author) {
        this.id = id;
        this.table = table;
        this.content = content;
        this.author = author;
    }
}
