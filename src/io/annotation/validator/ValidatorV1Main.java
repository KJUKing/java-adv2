package io.annotation.validator;

public class ValidatorV1Main {
    public static void main(String[] args) {
        User user = new User("user1", 0);
        Team team = new Team("", 0);

        try {
            validatorUser(user);
        } catch (Exception e) {
            System.out.println("e = " + e);
        }
        try {
            validatorTeam(team);
        } catch (Exception e) {
            System.out.println("e = " + e);
        }



    }

    private static void validatorUser(User user) {
        if (user.getName() == null || user.getName().isEmpty()) {
            throw new RuntimeException("이름이 비었습니다.");
        }
        if (user.getAge() < 1 || user.getAge() > 100) {
            throw new RuntimeException("알맞지않은 숫자입니다.");
        }
    }
    private static void validatorTeam(Team team) {
        if (team.getName() == null || team.getName().isEmpty()) {
            throw new RuntimeException("이름이 비었습니다.");
        }
        if (team.getMemberCount() < 1 || team.getMemberCount() > 100) {
            throw new RuntimeException("알맞지않은 숫자입니다.");
        }
    }
}
