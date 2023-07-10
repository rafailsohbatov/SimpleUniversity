package model;

public abstract class AbstractClass {
    private Integer Id;
    private String Name;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public abstract void add() throws Exception;

    public abstract void update() throws Exception;

    public abstract void delete() throws Exception;

    public abstract void search() throws Exception;
}
