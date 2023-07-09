package app.rido.dto;

import jakarta.persistence.Entity;
import lombok.Data;
import org.springframework.data.annotation.Id;

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
