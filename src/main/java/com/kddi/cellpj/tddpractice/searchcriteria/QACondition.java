package com.kddi.cellpj.tddpractice.searchcriteria;

public class QACondition {

	private String qaCode;
	private String productCode;
	private String dateFrom;
	private String dateTo;
	private String qaBody;

    public String getQaCode() {
        return qaCode;
    }

    public void setQaCode(String qaCode) {
        this.qaCode = qaCode;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    public String getDateTo() {
        return dateTo;
    }

    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }

    public String getQaBody() {
        return qaBody;
    }

    public void setQaBody(String qaBody) {
        this.qaBody = qaBody;
    }
    public QACondition(){
        qaBody = "";
        qaCode = "";
        dateFrom = "";
        dateTo = "";
        productCode = "";
    }

    public SearchCreteria createPredicates(){
        SearchCreteria searchCreteria = new SearchCreteria();
        if(!qaCode.equals("")){
            searchCreteria.add(new PredicateQaCode(qaCode));
        }else{
            if(!productCode.equals("")){
                searchCreteria.add(new PredicateProductCode(productCode));
            }
            if(!dateFrom.equals("") || !dateTo.equals("")){
                searchCreteria.add(new PredicateCreateDate(dateFrom,dateTo));
            }
            if(!qaBody.equals("")){
                searchCreteria.add(new PredicateQaBody(qaBody));
            }
        }
        return searchCreteria;
    }
}
