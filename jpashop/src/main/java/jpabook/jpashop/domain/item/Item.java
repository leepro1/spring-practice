package jpabook.jpashop.domain.item;


import jakarta.persistence.*;
import jpabook.jpashop.domain.category.Category;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) //상속 관계에 있는 엔티티 클래스들을 한 개의 테이블에 저장
@DiscriminatorColumn(name = "DTYPE") //Entity 구분 열의 이름을 "DTYPE"로 지정
@Entity
public abstract class Item {

    @Id
    @GeneratedValue
    @Column(name = "item_id")
    private Long id;

    private String name;
    private int price;
    private int stockQuantity;

    @ManyToMany(mappedBy = "items") //ManyToMany는 잘사용하지 않는다.
    private List<Category> categories = new ArrayList<>();

}
