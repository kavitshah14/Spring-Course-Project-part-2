package com.upgrad.HireWheels.dto;

import lombok.Data;

@Data
public class UserDTO {
    String firstName;
    String lastName;
    String email;
    String password;
    String mobileNo;
    int walletMoney;
}
