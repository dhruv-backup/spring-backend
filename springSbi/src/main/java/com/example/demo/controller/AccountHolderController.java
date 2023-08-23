package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.AccountHolder;
import com.example.demo.repository.AccountHolderRepository;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class AccountHolderController {

    @Autowired
    private AccountHolderRepository userRepository;

    // get all customers

    @GetMapping("/users")
    public List<AccountHolder> getAllCustomers() {
        return userRepository.findAll();
    }

    @GetMapping("/user/{id}")
    public AccountHolder getACustomers(@PathVariable(value = "id") String userID) throws ResourceNotFoundException {
        return userRepository.findById(userID)
                .orElseThrow(() -> new ResourceNotFoundException("User is not Available:" + userID));
    }

    @GetMapping("/get/user/{cid}")
    public AccountHolder getACustomersbyCID(@PathVariable(value = "cid") String cid) throws ResourceNotFoundException {
        return userRepository.findByCustomerID(cid);
    }

    @GetMapping("/getbyaccno/{cid}")
    public AccountHolder getACustomerByAccNo(@PathVariable(value = "cid") String cid) throws ResourceNotFoundException {
        return userRepository.findByAccountNo(cid);
    }

    @PostMapping("/sendUser")
    public AccountHolder createCustomer(@Validated @RequestBody AccountHolder newUser) {
        return userRepository.save(newUser);
    }

    @PutMapping("/transfer/{ac1}/{ac2}/{amt}")
    public String transferAmount(@PathVariable(value = "ac1") String ac1, @PathVariable(value = "ac2") String ac2,
            @PathVariable(value = "amt") Double amt) {
        AccountHolder details1 = userRepository.findByAccountNo(ac1);
        AccountHolder details2 = userRepository.findByAccountNo(ac2);
        if (details1.getMinAccountBalance() < amt)
            return "Insufficient Balance";
        else {
            details1.setMinAccountBalance(details1.getMinAccountBalance() - amt);
            userRepository.save(details1);
            details2.setMinAccountBalance(details2.getMinAccountBalance() + amt);
            userRepository.save(details2);
            return "Transfer Successful";
        }
    }

    @PutMapping("/withdraw/{ac}/{amt}")
    public String transferAmount(@PathVariable(value = "ac") String ac,
            @PathVariable(value = "amt") Double amt) {
        AccountHolder details1 = userRepository.findByAccountNo(ac);
        if (details1.getMinAccountBalance() < amt)
            return "Insufficient Balance";
        else {
            details1.setMinAccountBalance(details1.getMinAccountBalance() - amt);
            userRepository.save(details1);
            return "Withdrawal Successful";
        }
    }

    @PutMapping("/updateUser/{id}")
    public ResponseEntity<AccountHolder> updateCustomer(@PathVariable(value = "id") String userID,
            @Validated @RequestBody AccountHolder newUser) throws ResourceNotFoundException {
        AccountHolder updatedCustomer = userRepository.findById(userID)
                .orElseThrow(() -> new ResourceNotFoundException("User is not avaiable:" + userID));
        updatedCustomer.setFirstName(newUser.getFirstName());
        updatedCustomer.setMiddleName(newUser.getMiddleName());
        updatedCustomer.setLastName(newUser.getLastName());
        updatedCustomer.setAccountNo(newUser.getAccountNo());
        updatedCustomer.setCurrentAddress(newUser.getCurrentAddress());
        updatedCustomer.setPermanentAddress(newUser.getPermanentAddress());
        updatedCustomer.setOccupation(newUser.getOccupation());
        updatedCustomer.setMinAccountBalance(newUser.getMinAccountBalance());
        updatedCustomer.setContactNo(newUser.getContactNo());
        updatedCustomer.setAadharNo(newUser.getAadharNo());
        updatedCustomer.setPanNo(newUser.getPanNo());
        updatedCustomer.setDOB(newUser.getDOB());
        userRepository.save(updatedCustomer);

        return ResponseEntity.ok(updatedCustomer);
    }

    @PutMapping("/makeActive/{id}")
    public ResponseEntity<AccountHolder> makeActiveUser(@PathVariable(value = "id") String userID)
            throws ResourceNotFoundException {
        AccountHolder updatedCustomer = userRepository.findById(userID)
                .orElseThrow(() -> new ResourceNotFoundException("User is not avaiable:" + userID));
        updatedCustomer.setIsActive(true);
        userRepository.save(updatedCustomer);

        return ResponseEntity.ok(updatedCustomer);
    }

    @DeleteMapping("/deleteUser/{id}")
    public Map<String, Boolean> deleteCustomer(@PathVariable(value = "id") String userID)
            throws ResourceNotFoundException {
        AccountHolder updatedCustomer = userRepository.findById(userID)
                .orElseThrow(() -> new ResourceNotFoundException("User is not Available:" + userID));
        userRepository.delete(updatedCustomer);
        Map<String, Boolean> response = new HashMap<>();
        response.put("Customer has been Deleted", Boolean.TRUE);
        return response;
    }

}
