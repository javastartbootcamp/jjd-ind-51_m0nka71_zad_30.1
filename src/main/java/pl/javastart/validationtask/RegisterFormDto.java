package pl.javastart.validationtask;


import jakarta.validation.constraints.*;

public class RegisterFormDto {
    @NotBlank(message = "Pole nie może być puste")
    @Size(min = 3, message = "Pole musi mieć co najmniej 3 znaki")
    private String firstName;
    @NotBlank(message = "Pole nie może być puste")
    @Size(min = 3, message = "Pole musi mieć co najmniej 3 znaki")
    private String surname;
    @NotBlank(message = "Pole nie może być puste")
    private String address;
    @NotBlank(message = "Pole nie może być puste")
    @Pattern(regexp = "^[0-9]{2}-[0-9]{3}", message = "Wpisz poprawny kod pocztowy")
    private String postalCode;
    @NotBlank(message = "Pole nie może być puste")
    private String city;
    @NotBlank(message = "Pole nie może być puste")
    @Email(message = "Musi być poprawnie sformatowanym adresem e-mail")
    private String email;

    @NotBlank(message = "Pole nie może być puste")
    @Size(min = 8, message = "Hasło musi mieć co najmniej 8 znaków")
    @Pattern(regexp = "(?=.*[a-z])(?=.*[A-Z])(?=.*[@#!$%^&+=]).{8,}", message = "Hasło musi zawierać min. 1 znak mały, duży i znak specjalny")
    private String password;

    @AssertTrue(message = "Akceptacja regulaminu jest wymagana")
    private boolean termsAgreement;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isTermsAgreement() {
        return termsAgreement;
    }

    public void setTermsAgreement(boolean termsAgreement) {
        this.termsAgreement = termsAgreement;
    }
}
