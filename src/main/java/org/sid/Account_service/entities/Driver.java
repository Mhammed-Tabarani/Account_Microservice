package org.sid.Account_service.entities;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Driver {
    @Id
    @NonNull
    private String id;
    private String publicId;
    private String firstName;
    private String lastName;
    private String profilePicture;
    private Date birthday;
    private String email;
    private String phoneNumber;
    private String cin;
    private String licenseNumber;
    @JsonFormat(pattern="yyyy-MM-dd")
    private String password;
    private String car;
}
