package Practice_number_repository.Practice_number_repository.dto;



public class Join_member {

    private Long join_id;

    public Join_member(Long join_id) {
        this.join_id = join_id;
    }

    public String add_number( ){

        Integration_member New_member = new Integration_member();
        New_member.add_member(join_id);
        System.out.println("add is okay");
        return New_member.test();
    }




}
