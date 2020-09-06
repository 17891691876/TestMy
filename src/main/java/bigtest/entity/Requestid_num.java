package bigtest.entity;

import javax.persistence.*;
//表里面的
@Entity
@Table(name="requestid_num")
public class Requestid_num{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer id;
@Column
private String requestid;
@Column
private Integer number;
public Integer getId() {
        return id;
        }

public void setId(Integer id) {
        this.id = id;
        }

public String getRequestid() {
        return requestid;
        }

public void setRequestid(String requestid) {
        this.requestid = requestid; }

public Integer getNumber() {
        return number;
        }

public void setNumber(Integer number) {
        this.number = number;
        }


        }


