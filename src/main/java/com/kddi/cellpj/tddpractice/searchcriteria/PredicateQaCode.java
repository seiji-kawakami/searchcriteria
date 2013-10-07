package com.kddi.cellpj.tddpractice.searchcriteria;

public class PredicateQaCode extends Predicate {

    public PredicateQaCode(String qaCode) {
        //To change body of implemented methods use File | Settings | File Templates.
        if(!qaCode.equals("")){
            this.predicate = "qa_code = '" + qaCode +"'";
        }else{
            this.predicate = "";
        }

    }
}
