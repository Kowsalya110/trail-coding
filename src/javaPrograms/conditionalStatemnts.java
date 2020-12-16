package javaPrograms;

public class conditionalStatemnts {

	public static void main(String[] args) {

       int age=30;
        if (age<=18) {
        	System.out.println("child");
        }
        else if(age<=18){
        	System.out.println("student");
        }
        else if(age<=30){
        	System.out.println("family man");
        }
        else{
        	System.out.println("senior citizen");
        }
	}

}
