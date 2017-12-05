package com.lanou.product.domain;

/**
 * Created by dllo on 17/12/5.
 */
public class Product {

    private Integer id;
    private Integer cid;
    private String code;
    private String name;
    private String standard;
    private String unit;
    private String rate;
    private String info;

    public Product() {
    }

    public Product(Integer cid, String code, String name, String standard, String unit,
                   String rate, String info) {
        this.cid = cid;
        this.code = code;
        this.name = name;
        this.standard = standard;
        this.unit = unit;
        this.rate = rate;
        this.info = info;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", cid=" + cid +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", standard='" + standard + '\'' +
                ", unit='" + unit + '\'' +
                ", rate='" + rate + '\'' +
                ", info='" + info + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
