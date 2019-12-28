package tacos;

import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class Order {

    @NotBlank(message = "person name should be there")
    private String name;
    @NotBlank(message = "its a required field")
    private String street;
    @NotBlank(message = "required")
    private String city;
    @NotBlank(message = "required")
    private String state;
    @NotBlank(message = "required")
    private String zip;
    @CreditCardNumber(message = "must be a valid credit carad")
    private String ccNumber;
    @Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$", message="Must be formatted MM/YY")
    private String ccExpiration;
    @Digits(integer=3, fraction=0, message="Invalid CVV")
    private String ccCVV;

}
