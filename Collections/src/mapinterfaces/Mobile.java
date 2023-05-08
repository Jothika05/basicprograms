package mapinterfaces;

public class Mobile {
    String name;
    int gb;
    int price;
    
    Mobile(String n,int gb,int p){
    	this.name=n;
    	this.gb=gb;
    	this.price=p;
    }
    public String toString() {
    	return " "+this.name + "-"+this.gb +"-"+this.price;
    }
}
