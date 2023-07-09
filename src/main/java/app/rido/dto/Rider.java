package app.rido.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Rider {
    @Id
    private String id;
    private String name;
    private Date accountCreationDate;
    private Date lastLoginTime;

}
