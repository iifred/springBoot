package com.fred.sboot.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "person")
public class Person implements Serializable {

    private static final long serialVersionUID = 2567461532269438266L;
    private String username;
    private Integer age;

    private Map<String,Object> map;
    private Dog dog;

    private List<String> list;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
