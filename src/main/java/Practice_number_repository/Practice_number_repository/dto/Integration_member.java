package Practice_number_repository.Practice_number_repository.dto;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Integration_member {

    List<String> member = new ArrayList<String>();


    public void add_member(Long join_number) {
        member.add(String.valueOf(join_number));

    }

    public String test(){

        System.out.print("Test is okay too!");

        return "   Look at the member!" ;
    }






}

