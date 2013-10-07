package com.kddi.cellpj.tddpractice.searchcriteria;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class SearchCreteria {
    private List<Predicate> predicates = new ArrayList<Predicate>();

	public String createWhereClause() {
        if(predicates.isEmpty()){
            return "no";
        }else{
            return createWhereClauseFromPredicates(predicates);
        }
	}

    public void add(Predicate predicate){
        predicates.add(predicate);
    }

    private String createWhereClauseFromPredicates(List<Predicate> predicates) {
        StringBuffer whereClause = new StringBuffer();
        whereClause.append("where ");
        ListIterator<Predicate> predicatesItr = predicates.listIterator();
        while(predicatesItr.hasNext()){
            Predicate predicate = predicatesItr.next();
            whereClause.append(predicate.getPredicate());
            if(predicatesItr.hasNext()){
                whereClause.append(" and ");
            }
        }
        whereClause.append(";");
        return whereClause.toString();
    }
}
