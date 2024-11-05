package reflection;

import reflection.data.Team;
import reflection.data.User;

public class FieldV3 {

    public static void main(String[] args) {
        User user = new User("id1", null, null);
        Team team = new Team("team1", null);
        System.out.println("user = " + user);
        System.out.println("team = " + team);

        if (user.getId() == null) {
            user.setId("");
        }
        if (team.getId() == null) {
            team.setId(user.getId());
        }


        System.out.println("========== after ===========");
        System.out.println("user = " + user);
        System.out.println("team = " + team);
    }
}
