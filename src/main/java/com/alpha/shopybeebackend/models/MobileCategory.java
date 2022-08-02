package com.alpha.shopybeebackend.models;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@Data
@Entity
public class MobileCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // auto generates id
    private int id;
    private int categoryId;
    private String name;
    private String logo;

    public MobileCategory(int categoryId, String name,String logo) {
        this.categoryId = categoryId;
        this.name = name;
        this.logo = logo;
    }
}
