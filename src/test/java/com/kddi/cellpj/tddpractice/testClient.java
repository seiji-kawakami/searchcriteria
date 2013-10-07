package com.kddi.cellpj.tddpractice;

import com.kddi.cellpj.tddpractice.searchcriteria.QACondition;
import com.kddi.cellpj.tddpractice.searchcriteria.SearchCreteria;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static junit.framework.TestCase.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: seiji-k
 * Date: 2013/10/07
 * Time: 11:23
 * To change this template use File | Settings | File Templates.
 */
@RunWith(JUnit4.class)
public class testClient {
    @Test
    public void test1(){
        QACondition qaCondition = new QACondition();
        qaCondition.setDateFrom("2013/10/01");
        SearchCreteria searchCreteria = qaCondition.createPredicates();
        assertEquals("where create_date > '2013/10/01';",searchCreteria.createWhereClause());
    }
}
