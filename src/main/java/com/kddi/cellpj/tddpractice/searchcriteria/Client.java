package com.kddi.cellpj.tddpractice.searchcriteria;

public class Client {
    public static void main(String args[]){
        QACondition qaCondition = new QACondition();
        qaCondition.setDateFrom("2013/10/01");
        SearchCreteria searchCreteria = qaCondition.createPredicates();
        System.out.println(searchCreteria.createWhereClause());

        qaCondition.setQaCode("AA0111");
        System.out.println(searchCreteria.createWhereClause());




    }
}
