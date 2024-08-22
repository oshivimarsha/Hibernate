package lk.ijse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lk.ijse.embed.FullName;

/*@Entity (name = "Students")*/
/*@Table(name = "Students")*/
@Entity
public class Student {
    @Id
    private int id;
    private FullName name;
    private String address;

    public Student(int id, FullName name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Student() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFullName(FullName name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name=" + name +
                ", address='" + address + '\'' +
                '}';
    }

    public FullName getFullName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
