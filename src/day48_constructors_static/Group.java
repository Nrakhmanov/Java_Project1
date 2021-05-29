package day48_constructors_static;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private List<String> groupList = new ArrayList<>();

    public Group(String name) {
        this.name = name;

    }
    public void addMember(String newMember) {
        groupList.add(newMember);
    }

    public void removeMember(String memberName) {
        groupList.remove(memberName);
    }





    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", groupList=" + groupList +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<String> groupList) {
        this.groupList = groupList;
    }
}
