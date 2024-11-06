package ie.atu.labexam;


import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Info {
    @Pattern(regexp = "RENT-", message= "incorrect format")
    private String rentalCode;

    @Max(value = 50, message = "max value is 50")
    private String carModel;

    @Max(value = 100, message = "max value is 100")
    private String renterName;

    @Email(message = "enter correct email")
    private String renterEmail;

    @FutureOrPresent(message = "enter correct date")
    private Data rentalStartDate;

    @FutureOrPresent(message = "enter correct date")
    private Data rentalEndDate;

    @Positive(message = "must be positive")
    private double dailyRate;
}
