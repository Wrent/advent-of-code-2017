package com.akucera.codeadvent.advent09;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private Group parent = null;
    private List<Group> children =  new ArrayList();

    public int calculateScore(int prev) {
        int sum = prev + 1;

        for (Group child : children) {
            sum += child.calculateScore(prev + 1);
        }
        return sum;
    }

    public Group(Group parent) {
        this.parent = parent;
    }

    public Group getParent() {
        return parent;
    }

    public void setParent(Group parent) {
        this.parent = parent;
    }

    public List<Group> getChildren() {
        return children;
    }

    public void setChildren(List<Group> children) {
        this.children = children;
    }

    public void add(Group group) {
        children.add(group);
    }
}
