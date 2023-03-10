package org.sid.Account_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class DriverResponseDTO {
    private String publicId;
    private String firstName;
    private String lastName;
    private String profilePicture;
    private Date birthday;
    private String email;
    private String phoneNumber;
    private String cin;
    private String car;

}
