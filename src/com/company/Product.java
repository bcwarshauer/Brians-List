package com.company;

public class Product {
    String name;
    double weight;
    double startWeight;
    double percent;

    public Product(String name, double startWeight){
        this.name = name;
        weight = startWeight;
        this.startWeight = startWeight;
        percent = 100;

    }
    public String getProductName(){
        return name;
    }
    public void setProductName(String n){
        name = n;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double w){
        weight = w;
    }
    public double getStartWeight(){
        return startWeight;
    }
    public void setStartWeight(double w){
        startWeight = w;
    }
    public double getPercent(){
        double number = weight/startWeight;
        percent = number*100;
        return percent;
    }
    public String toString(){
        return ("Your "+name+" has " + getPercent() + "% left");
    }
}
