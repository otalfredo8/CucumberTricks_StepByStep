package c06_datatabletype;

public class Component {
    public String electronic;
    public String organic;

    public Component(String ele, String org){
        this.electronic = ele;
        this.organic = org;
    }
    @Override
    public String toString() {
        return "electronic :" + electronic +
                "organic" + organic;
    }
}
