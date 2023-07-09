package app.rido.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
public class Rider {
    @Id
    private String id;
    private String name;
    private Date accountCreationDate;
    private Date lastLoginTime;
}
