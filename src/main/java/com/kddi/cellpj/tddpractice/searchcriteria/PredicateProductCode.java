package com.kddi.cellpj.tddpractice.searchcriteria;

public class PredicateProductCode extends Predicate {

    public PredicateProductCode(String productCode) {
        //To change body of implemented methods use File | Settings | File Templates.
        if(!productCode.equals("")){
            this.predicate = "product_code like '%" + productCode +"%'";
        }else{
            this.predicate = "";
        }
    }
}
