package app.rido.dto;

import jakarta.persistence.Column;
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
    @Column(name= "name")
    private String name;
    @Column(name= "accountcreationdate")
    private Date accountCreationDate;
    @Column(name= "lastlogin")
    private Date lastLogin;
}
