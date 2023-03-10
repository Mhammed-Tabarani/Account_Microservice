package org.sid.Account_service.web;

import org.sid.Account_service.dto.PassengerRequestDTO;
import org.sid.Account_service.dto.PassengerResponseDTO;
import org.sid.Account_service.dto.PassengerUpdateDTO;
import org.sid.Account_service.entities.Passenger;
import org.sid.Account_service.repositories.PassengerRepository;
import org.sid.Account_service.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController

public class PassengerRestController {
    @Autowired
    private PassengerRepository passengerRepository;
    private PassengerService passengerService;

    public PassengerRestController(PassengerService passengerService) {
        this.passengerService = passengerService;
    }

    @GetMapping("/passengers")
    public List<PassengerResponseDTO> passengers(){return passengerService.getAllPassengers();}
   // public List<Passenger> drivers(){return passengerRepository.findAll();}


    @PostMapping("/register/passengers")
    public PassengerResponseDTO save(@RequestBody PassengerRequestDTO passengerRequestDTO){
        return passengerService.addPassenger(passengerRequestDTO);
    }

    @PutMapping("/passengers/update/{email}")
    public PassengerResponseDTO update(@PathVariable String email , @RequestBody PassengerUpdateDTO passengerUpdateDTO){
        return passengerService.updatePassenger(email,passengerUpdateDTO);
    }
    @DeleteMapping("/passengers/delete/{id}")
    public void delete(@PathVariable String id){passengerRepository.deleteById(id);}
    @GetMapping("/passengers/getbyemail/{email}")
    public PassengerResponseDTO getbyEmail(@PathVariable String email){

        return passengerService.getPassengerByEmail(email);
    }
    @GetMapping("/passengers/getbypublicid/{publicId}")
    public PassengerResponseDTO getbyPublicId(@PathVariable String publicId){

        return passengerService.getPassengerByPublicId(publicId);
    }

}
