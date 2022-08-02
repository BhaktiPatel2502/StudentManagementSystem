package in.ac.charusat.studentmgmtsystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Result {
    @Id
    private Integer id;
    private Integer c_id;
    private String Marks;

    public Result(Integer id, Integer c_id, String Marks) {
        this.id = id;
        this.c_id = c_id;
        this.Marks = Marks;
    }

    public Result() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }

    public String getMarks() {
        return Marks;
    }

    public void setMarks(String Marks) {
        this.Marks = Marks;
    }
}
