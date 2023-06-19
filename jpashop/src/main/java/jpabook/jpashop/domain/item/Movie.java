package jpabook.jpashop.domain.item;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@DiscriminatorValue("M")
@Entity
public class Movie extends Item {

    private String director;
    private String actor;
}
