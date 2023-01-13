package org.sid.Account_service.service;

import org.sid.Account_service.dto.*;
import org.sid.Account_service.entities.Passenger;

import java.util.List;

public interface PassengerService {

    PassengerResponseDTO addPassenger(PassengerRequestDTO passengerRequestDTO);
    PassengerResponseDTO getPassengerById(String id);
    PassengerResponseDTO getPassengerByPublicId(String publicId);
    PassengerResponseDTO getPassengerByEmail(String Email);
    PassengerResponseDTO updatePassenger(String publicId, PassengerUpdateDTO passengerUpdateDTO);
    List<PassengerResponseDTO> getAllPassengers();
}
