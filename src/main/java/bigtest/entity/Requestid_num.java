package bigtest.entity;

import javax.persistence.*;

//表里面的
@Entity
@Table(name = "requestid_num")
public class Requestid_num {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String requestid;
    @Column
    private Integer number;
    @Column
    private Integer pmnumber;
    @Column
    private Integer cmnumber;
    @Column
    private Integer xmnumber;

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
        this.requestid = requestid;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getPmnumber() {
        return pmnumber;
    }

    public void setPmnumber(Integer pmnumber) {
        this.pmnumber = pmnumber;
    }

    public Integer getCmnumber() {
        return cmnumber;
    }

    public void setCmnumber(Integer cmnumber) {
        this.cmnumber = cmnumber;
    }

    public Integer getXmnumber() {
        return xmnumber;
    }

    public void setXmnumber(Integer xmnumber) {
        this.xmnumber = xmnumber;
    }

}


