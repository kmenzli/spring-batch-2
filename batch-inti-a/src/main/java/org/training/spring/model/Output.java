package org.training.spring.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;
import java.util.Date;

public class Output {
    private int id;
    private BigDecimal sales;
    private int qty;
    private String fake;
    private String staffName;
    private Date date;

    @XmlAttribute(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlElement(name = "sales")
    public BigDecimal getSales() {
        return sales;
    }

    public void setSales(BigDecimal sales) {
        this.sales = sales;
    }

    @XmlElement(name = "qty")
    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @XmlElement(name = "staffName")
    public String getStaffName() {
        return staffName;
    }

    @XmlElement(name = "fake")
    public String getFake() {
        return fake;
    }

    public void setFake(String fake) {
        this.fake = fake;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Report [id=" + id + ", sales=" + sales
                + ", qty=" + qty + ", staffName=" + staffName + ", Fake + "+ fake + " ]";
    }
}
