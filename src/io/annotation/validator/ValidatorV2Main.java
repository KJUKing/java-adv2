package io.annotation.validator;

public class ValidatorV2Main {
    public static void main(String[] args) {
        User user = new User("user1", 0);
        Team team = new Team("teamA", 0);

        try {
            Validator.validator(user);
        } catch (Exception e) {
            System.out.println("e = " + e);
        }
        try {
            Validator.validator(team);
        } catch (Exception e) {
            System.out.println("e = " + e);
        }



    }

}
