package day48_constructors_static;

import java.util.ArrayList;
import java.util.Arrays;

public class CybertekGroups {
    public static void main(String[] args) {

        Group group1 = new Group("Love, Death and Robots");

        System.out.println(group1.getGroupList().size());
        group1.addMember("Aigerim");
        group1.addMember("Hafize");
        group1.addMember("Suleyman");
        group1.addMember("Anton");
        group1.addMember("Sabina");
        group1.addMember("Busra");
        group1.addMember("Eldar");
        group1.addMember("Angela");
        group1.addMember("Sarah");
        group1.addMember("Kirill");
        group1.addMember("Andrei");
        group1.addMember("Nuriddin");

        System.out.println(group1.getGroupList().size());
        System.out.println(group1.toString());

        Group group2 = new Group("CyberAvengers");
        group2.setGroupList(Arrays.asList("Captain America", "Falcon", "Winter Soldier", "IronMan", "Black Widow", "HawkEye", "Vision"));
        System.out.println(group2.getGroupList());

        if(group2.getGroupList().contains("Falcon")){
            System.out.println("Falcon is a team member");
        }else{
            System.out.println("Falcon is down");
        }


    }
}
