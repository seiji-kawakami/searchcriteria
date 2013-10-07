package com.kddi.cellpj.tddpractice.searchcriteria;

public class PredicateQaBody extends Predicate {

    public PredicateQaBody(String qaBody){
        if (!qaBody.equals("")){
            this.predicate = "qa_body like '%" + qaBody +"%'";
        }else{
            this.predicate = "";
        }
    }
}
