package com.medinDev.accounts.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AccountsDto {

    @NotEmpty(message = "Customer ID cannot be null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Customer ID should be 10 digits")
    private Long accountNumber;

    @NotEmpty(message = "Account number cannot be null or empty")
    private String accountType;

    @NotEmpty(message = "Branch address cannot be null or empty")
    private String branchAddress;
}
