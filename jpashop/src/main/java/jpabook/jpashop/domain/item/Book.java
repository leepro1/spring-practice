package jpabook.jpashop.domain.item;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@DiscriminatorValue("B")
@Entity
public class Book extends Item {

    private String title;
    private String author;
}
