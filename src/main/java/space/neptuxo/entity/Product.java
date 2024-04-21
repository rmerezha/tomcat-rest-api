package space.neptuxo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Product {

    private long id;
    private long userId;
    private String description;
    private Type type;
    private int count;
    private String imagePath;

}
