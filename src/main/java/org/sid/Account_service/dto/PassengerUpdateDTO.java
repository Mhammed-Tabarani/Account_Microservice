package org.sid.Account_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor @NoArgsConstructor
public class PassengerUpdateDTO {
    private String firstName;
    private String lastName;
    private String profilePicture;
    private Date birthday;
    private String email;
    private String phoneNumber;
}
