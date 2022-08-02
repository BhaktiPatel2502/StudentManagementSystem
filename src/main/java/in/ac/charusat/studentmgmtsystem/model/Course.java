package in.ac.charusat.studentmgmtsystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Course {

    @Id
    private Integer c_id;
    private String title;
    private String discription;

    public Course(Integer c_id, String title, String discription) {
        this.c_id = c_id;
        this.title = title;
        this.discription = discription;
    }

    public Course() {

    }
    public Integer getId() {return c_id;
    }


    public void setId(Integer id) {this.c_id = c_id;
    }

    public String getTitle() {return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }
}
