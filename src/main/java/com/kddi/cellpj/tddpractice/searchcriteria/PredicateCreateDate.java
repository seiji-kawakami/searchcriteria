package com.kddi.cellpj.tddpractice.searchcriteria;

public class PredicateCreateDate extends Predicate {

    public PredicateCreateDate(String dateFrom,String dateTo) {
        //To change body of implemented methods use File | Settings | File Templates.
        if(!dateFrom.equals("") && !dateTo.equals("")){
            this.predicate =
                    "create_date between '" + dateFrom + "' and '" + dateTo+"'";
        }else if(!dateFrom.equals("") && dateTo.equals("")){
            this.predicate = "create_date > '" +dateFrom + "'" ;
        }else if(dateFrom.equals("") && !dateTo.equals("")){
            this.predicate = "create_date < '" + dateTo + "'";
        }else{
            this.predicate = "";
        }

    }
}
