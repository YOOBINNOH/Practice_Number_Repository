package Practice_number_repository.Practice_number_repository.dto;

public class login_member {

    private Long login_id;

    public login_member(Long login_id) {
        this.login_id = login_id;
    }

    @Override
    public String toString() {
        return "login_member{" +
                "id=" + login_id +
                '}';
    }

}
