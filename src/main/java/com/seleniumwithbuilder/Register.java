package com.seleniumwithbuilder;

public class Register {

    private String firstname;
    private String surname;
    private String email;
    private String telephone;
    private String password;
    private String confirmPassword;

    private Register(RegisterBuilder registerBuilder){
        this.firstname=registerBuilder.firstname;
        this.surname=registerBuilder.surname;
        this.email=registerBuilder.email;
        this.telephone=registerBuilder.telephone;
        this.password=registerBuilder.password;
        this.confirmPassword=registerBuilder.confirmPassword;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public static class RegisterBuilder{
        private String firstname;
        private String surname;
        private String email;
        private String telephone;
        private String password;
        private String confirmPassword;

        public RegisterBuilder setFirstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public RegisterBuilder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public RegisterBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public RegisterBuilder setTelephone(String telephone) {
            this.telephone = telephone;
            return this;
        }

        public RegisterBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public RegisterBuilder setConfirmPassword(String confirmPassword) {
            this.confirmPassword = confirmPassword;
            return this;
        }

        public Register build(){
            Register register = new Register(this);
            register.firstname = this.firstname;
            register.surname = this.surname;
            register.email = this.email;
            register.telephone = this.telephone;
            register.password = this.password;
            register.confirmPassword = this.confirmPassword;
            return register;
        }
    }


}
