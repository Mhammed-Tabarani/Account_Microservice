package org.sid.Account_service.web;

import org.sid.Account_service.dto.DriverRequestDTO;
import org.sid.Account_service.dto.DriverResponseDTO;
import org.sid.Account_service.dto.DriverUpdateDTO;
import org.sid.Account_service.entities.Driver;
import org.sid.Account_service.repositories.DriverRepository;
import org.sid.Account_service.service.DriverService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DriverRestController {
    private DriverRepository driverRepository;
    private DriverService driverService;

    public DriverRestController(DriverRepository driverRepository, DriverService driverService) {
        this.driverRepository = driverRepository;
        this.driverService = driverService;
    }

    @GetMapping("/drivers")
    public List<DriverResponseDTO> drivers(){return driverService.getAllDrivers();}


    @PostMapping("/register/drivers")
    public DriverResponseDTO save(@RequestBody DriverRequestDTO driverRequestDTO){

        return driverService.addDriver(driverRequestDTO);
    }

    @PutMapping("/drivers/update/{email}")
    public DriverResponseDTO update(@PathVariable String email , @RequestBody DriverUpdateDTO driverUpdateDTO){

        return driverService.updateDriver(email,driverUpdateDTO);
    }
    @DeleteMapping("/drivers/delete/{id}")
    public void delete(@PathVariable String id){driverRepository.deleteById(id);}

    @GetMapping("/drivers/getbyemail/{email}")
    public DriverResponseDTO getbyEmail(@PathVariable String email){

        return driverService.getDriverByEmail(email);
    }

    @GetMapping("/drivers/getbypublicid/{publicId}")
    public DriverResponseDTO getByPublicId(@PathVariable String publicId){

        return driverService.getDriverByPublicId(publicId);
    }


}
