package com.itheima.pojo;

/**
 * @PackageName: com.itheima.pojo
 * @ClassName: Province
 * @Author: renpengzhi
 * @Date: 2019/11/21 0021 上午 10:48
 * @Description: //TODO
 */
public class Province {
    private int id;
    private String code;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Province{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
