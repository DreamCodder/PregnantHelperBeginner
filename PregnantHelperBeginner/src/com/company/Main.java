package com.company;

public class Main {

    public static void main(String[] args) {
	ProblemManager problemManager=new ProblemManager();  //DEMO
	PregnantManager pregnantManager=new PregnantManager();
	pregnantManager.add();
	MysqlDataManager mysqlDataManager =new MysqlDataManager();
	mysqlDataManager.add(new PregnantManager());
	 problemManager.Problems();
    }
}
