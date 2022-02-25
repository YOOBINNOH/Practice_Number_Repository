package Practice_number_repository.Practice_number_repository.dto;

public class Join_member {

    private Long join_id;

    public Join_member(Long join_id) {
        this.join_id = join_id;
    }

    @Override
    public String toString() {
        return "Join_member{" +
                "id=" + join_id +
                '}';
    }
}
