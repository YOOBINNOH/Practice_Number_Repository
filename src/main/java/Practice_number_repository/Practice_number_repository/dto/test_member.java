package Practice_number_repository.Practice_number_repository.dto;

public class test_member {

    private Long test_id;

    public test_member(Long test_id) {
        this.test_id = test_id;
    }

    @Override
    public String toString() {
        return "test_member{" +
                "id=" + test_id +
                '}';
    }

}
