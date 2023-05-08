package collection_method;

import java.util.ArrayList;
import java.util.Collections;

public class mobile {
  int price;
  int gb;
  boolean touch;
  boolean videocall;
  String color;
     
  public String toString() {
	return ""+this.price +"-"+this.gb +"-"+this .touch+"-"+this.videocall+"-"+this.color;
	  
  }
     mobile(int p,int gb,boolean t,boolean vc,String c){
    	 this.price=p;
    	 this.gb=gb;
    	 this.touch=t;
    	 this.videocall=vc;
     	 this.color=c;
    	 
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   mobile redmi=new mobile(20000,8,true,true,"blue");
   mobile oppo=new mobile(12000,10,false,true,"red");
   mobile realme=new mobile(25000,56,false,false,"black");
   mobile samsung=new mobile(26000,10,false,true,"orange");
   mobile jio=new mobile(15000,10,true,true,"yellow");
   
    ArrayList<mobile> MobileList=new ArrayList<mobile>();
    MobileList.add(redmi);
    MobileList.add(oppo);
    MobileList.add(realme);
    MobileList.add(samsung);
    MobileList.add(jio);
    
     
    System.out.println("before sorting"+MobileList);
    for(mobile m:MobileList) {
   	 System.out.println(m);
    }
    Comparatordemo cd=new Comparatordemo();
    Collections.sort(MobileList,cd);
    System.out.println("After sorting"+MobileList);
    for(mobile m:MobileList) {
   	 System.out.println(m);
    }
    Collections.reverse(MobileList);
    System.out.println("After reversting"+MobileList);
    for(mobile m:MobileList) {
   	 System.out.println(m);
    }
   
	}

}
