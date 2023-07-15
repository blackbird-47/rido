package app.rido.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
@Entity
public class Rider {
    @Id
    private UUID id;
    private String name;
    private Date accountcreationdate;
    private Date lastlogin;
}
