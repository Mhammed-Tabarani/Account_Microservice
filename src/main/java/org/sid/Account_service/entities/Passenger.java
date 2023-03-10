package org.sid.Account_service.entities;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Passenger {
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
    @JsonFormat(pattern="yyyy-MM-dd")
    private String password;
}
