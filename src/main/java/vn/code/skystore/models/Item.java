package vn.code.skystore.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String code;
    private String name;
    private Double qty = 0D;
    private Double price = 0D;
    private String url = "";

    public Item(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public Item(Long id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

}
