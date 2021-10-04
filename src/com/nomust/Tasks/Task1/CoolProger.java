package com.nomust.Tasks.Task1;

class CoolProger {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getBlogger() {
        return isBlogger;
    }

    public void setBlogger(Boolean blogger) {
        isBlogger = blogger;
    }

    public int getCoolness() {
        return coolness;
    }

    public void setCoolness(int coolness) {
        this.coolness = coolness;
    }

    public CoolProger(String name, Boolean isBlogger, int coolness) {
        this.name = name;
        this.isBlogger = isBlogger;
        this.coolness = coolness;
    }


    public String toString(){
        return "Proger " + name + ":\n" + "Is Blogger: " + isBlogger + "\n" + "Coolness: " + coolness + "\n";
    }

    private String name;
    private Boolean isBlogger;
    private int coolness;

}