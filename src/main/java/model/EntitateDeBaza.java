package model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class EntitateDeBaza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public EntitateDeBaza() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
