package com.json.web.entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class TelephoneNumberExample  {
    /**
     * telephone_number
     */
    protected String orderByClause;

    /**
     * telephone_number
     */
    protected boolean distinct;

    /**
     * telephone_number
     */
    protected List<Criteria> oredCriteria;

    /**
     * TelephoneNumberExample
     */
    public TelephoneNumberExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * setOrderByClause
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * getOrderByClause
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * setDistinct
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * isDistinct
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * getOredCriteria
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * or
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * or
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * createCriteria
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * createCriteriaInternal
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * clear
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 内部类
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                return;
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                return;
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                return;
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTelephoneIdIsNull() {
            addCriterion("telephone_id is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIdIsNotNull() {
            addCriterion("telephone_id is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIdEqualTo(Integer value) {
            addCriterion("telephone_id =", value, "telephoneId");
            return (Criteria) this;
        }

        public Criteria andTelephoneIdNotEqualTo(Integer value) {
            addCriterion("telephone_id <>", value, "telephoneId");
            return (Criteria) this;
        }

        public Criteria andTelephoneIdGreaterThan(Integer value) {
            addCriterion("telephone_id >", value, "telephoneId");
            return (Criteria) this;
        }

        public Criteria andTelephoneIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("telephone_id >=", value, "telephoneId");
            return (Criteria) this;
        }

        public Criteria andTelephoneIdLessThan(Integer value) {
            addCriterion("telephone_id <", value, "telephoneId");
            return (Criteria) this;
        }

        public Criteria andTelephoneIdLessThanOrEqualTo(Integer value) {
            addCriterion("telephone_id <=", value, "telephoneId");
            return (Criteria) this;
        }

        public Criteria andTelephoneIdIn(List<Integer> values) {
            addCriterion("telephone_id in", values, "telephoneId");
            return (Criteria) this;
        }

        public Criteria andTelephoneIdNotIn(List<Integer> values) {
            addCriterion("telephone_id not in", values, "telephoneId");
            return (Criteria) this;
        }

        public Criteria andTelephoneIdBetween(Integer value1, Integer value2) {
            addCriterion("telephone_id between", value1, value2, "telephoneId");
            return (Criteria) this;
        }

        public Criteria andTelephoneIdNotBetween(Integer value1, Integer value2) {
            addCriterion("telephone_id not between", value1, value2, "telephoneId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTeldescIsNull() {
            addCriterion("teldesc is null");
            return (Criteria) this;
        }

        public Criteria andTeldescIsNotNull() {
            addCriterion("teldesc is not null");
            return (Criteria) this;
        }

        public Criteria andTeldescEqualTo(String value) {
            addCriterion("teldesc =", value, "teldesc");
            return (Criteria) this;
        }

        public Criteria andTeldescNotEqualTo(String value) {
            addCriterion("teldesc <>", value, "teldesc");
            return (Criteria) this;
        }

        public Criteria andTeldescGreaterThan(String value) {
            addCriterion("teldesc >", value, "teldesc");
            return (Criteria) this;
        }

        public Criteria andTeldescGreaterThanOrEqualTo(String value) {
            addCriterion("teldesc >=", value, "teldesc");
            return (Criteria) this;
        }

        public Criteria andTeldescLessThan(String value) {
            addCriterion("teldesc <", value, "teldesc");
            return (Criteria) this;
        }

        public Criteria andTeldescLessThanOrEqualTo(String value) {
            addCriterion("teldesc <=", value, "teldesc");
            return (Criteria) this;
        }

        public Criteria andTeldescLike(String value) {
            addCriterion("teldesc like", value, "teldesc");
            return (Criteria) this;
        }

        public Criteria andTeldescNotLike(String value) {
            addCriterion("teldesc not like", value, "teldesc");
            return (Criteria) this;
        }

        public Criteria andTeldescIn(List<String> values) {
            addCriterion("teldesc in", values, "teldesc");
            return (Criteria) this;
        }

        public Criteria andTeldescNotIn(List<String> values) {
            addCriterion("teldesc not in", values, "teldesc");
            return (Criteria) this;
        }

        public Criteria andTeldescBetween(String value1, String value2) {
            addCriterion("teldesc between", value1, value2, "teldesc");
            return (Criteria) this;
        }

        public Criteria andTeldescNotBetween(String value1, String value2) {
            addCriterion("teldesc not between", value1, value2, "teldesc");
            return (Criteria) this;
        }

        public Criteria andTelnumIsNull() {
            addCriterion("telnum is null");
            return (Criteria) this;
        }

        public Criteria andTelnumIsNotNull() {
            addCriterion("telnum is not null");
            return (Criteria) this;
        }

        public Criteria andTelnumEqualTo(String value) {
            addCriterion("telnum =", value, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumNotEqualTo(String value) {
            addCriterion("telnum <>", value, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumGreaterThan(String value) {
            addCriterion("telnum >", value, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumGreaterThanOrEqualTo(String value) {
            addCriterion("telnum >=", value, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumLessThan(String value) {
            addCriterion("telnum <", value, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumLessThanOrEqualTo(String value) {
            addCriterion("telnum <=", value, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumLike(String value) {
            addCriterion("telnum like", value, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumNotLike(String value) {
            addCriterion("telnum not like", value, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumIn(List<String> values) {
            addCriterion("telnum in", values, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumNotIn(List<String> values) {
            addCriterion("telnum not in", values, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumBetween(String value1, String value2) {
            addCriterion("telnum between", value1, value2, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumNotBetween(String value1, String value2) {
            addCriterion("telnum not between", value1, value2, "telnum");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andFinancialInformationIsNull() {
            addCriterion("financial_information is null");
            return (Criteria) this;
        }

        public Criteria andFinancialInformationIsNotNull() {
            addCriterion("financial_information is not null");
            return (Criteria) this;
        }

        public Criteria andFinancialInformationEqualTo(String value) {
            addCriterion("financial_information =", value, "financialInformation");
            return (Criteria) this;
        }

        public Criteria andFinancialInformationNotEqualTo(String value) {
            addCriterion("financial_information <>", value, "financialInformation");
            return (Criteria) this;
        }

        public Criteria andFinancialInformationGreaterThan(String value) {
            addCriterion("financial_information >", value, "financialInformation");
            return (Criteria) this;
        }

        public Criteria andFinancialInformationGreaterThanOrEqualTo(String value) {
            addCriterion("financial_information >=", value, "financialInformation");
            return (Criteria) this;
        }

        public Criteria andFinancialInformationLessThan(String value) {
            addCriterion("financial_information <", value, "financialInformation");
            return (Criteria) this;
        }

        public Criteria andFinancialInformationLessThanOrEqualTo(String value) {
            addCriterion("financial_information <=", value, "financialInformation");
            return (Criteria) this;
        }

        public Criteria andFinancialInformationLike(String value) {
            addCriterion("financial_information like", value, "financialInformation");
            return (Criteria) this;
        }

        public Criteria andFinancialInformationNotLike(String value) {
            addCriterion("financial_information not like", value, "financialInformation");
            return (Criteria) this;
        }

        public Criteria andFinancialInformationIn(List<String> values) {
            addCriterion("financial_information in", values, "financialInformation");
            return (Criteria) this;
        }

        public Criteria andFinancialInformationNotIn(List<String> values) {
            addCriterion("financial_information not in", values, "financialInformation");
            return (Criteria) this;
        }

        public Criteria andFinancialInformationBetween(String value1, String value2) {
            addCriterion("financial_information between", value1, value2, "financialInformation");
            return (Criteria) this;
        }

        public Criteria andFinancialInformationNotBetween(String value1, String value2) {
            addCriterion("financial_information not between", value1, value2, "financialInformation");
            return (Criteria) this;
        }

        public Criteria andThirdPartyIsNull() {
            addCriterion("third_party is null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyIsNotNull() {
            addCriterion("third_party is not null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyEqualTo(String value) {
            addCriterion("third_party =", value, "thirdParty");
            return (Criteria) this;
        }

        public Criteria andThirdPartyNotEqualTo(String value) {
            addCriterion("third_party <>", value, "thirdParty");
            return (Criteria) this;
        }

        public Criteria andThirdPartyGreaterThan(String value) {
            addCriterion("third_party >", value, "thirdParty");
            return (Criteria) this;
        }

        public Criteria andThirdPartyGreaterThanOrEqualTo(String value) {
            addCriterion("third_party >=", value, "thirdParty");
            return (Criteria) this;
        }

        public Criteria andThirdPartyLessThan(String value) {
            addCriterion("third_party <", value, "thirdParty");
            return (Criteria) this;
        }

        public Criteria andThirdPartyLessThanOrEqualTo(String value) {
            addCriterion("third_party <=", value, "thirdParty");
            return (Criteria) this;
        }

        public Criteria andThirdPartyLike(String value) {
            addCriterion("third_party like", value, "thirdParty");
            return (Criteria) this;
        }

        public Criteria andThirdPartyNotLike(String value) {
            addCriterion("third_party not like", value, "thirdParty");
            return (Criteria) this;
        }

        public Criteria andThirdPartyIn(List<String> values) {
            addCriterion("third_party in", values, "thirdParty");
            return (Criteria) this;
        }

        public Criteria andThirdPartyNotIn(List<String> values) {
            addCriterion("third_party not in", values, "thirdParty");
            return (Criteria) this;
        }

        public Criteria andThirdPartyBetween(String value1, String value2) {
            addCriterion("third_party between", value1, value2, "thirdParty");
            return (Criteria) this;
        }

        public Criteria andThirdPartyNotBetween(String value1, String value2) {
            addCriterion("third_party not between", value1, value2, "thirdParty");
            return (Criteria) this;
        }

        public Criteria andNetworkCreditIsNull() {
            addCriterion("network_credit is null");
            return (Criteria) this;
        }

        public Criteria andNetworkCreditIsNotNull() {
            addCriterion("network_credit is not null");
            return (Criteria) this;
        }

        public Criteria andNetworkCreditEqualTo(String value) {
            addCriterion("network_credit =", value, "networkCredit");
            return (Criteria) this;
        }

        public Criteria andNetworkCreditNotEqualTo(String value) {
            addCriterion("network_credit <>", value, "networkCredit");
            return (Criteria) this;
        }

        public Criteria andNetworkCreditGreaterThan(String value) {
            addCriterion("network_credit >", value, "networkCredit");
            return (Criteria) this;
        }

        public Criteria andNetworkCreditGreaterThanOrEqualTo(String value) {
            addCriterion("network_credit >=", value, "networkCredit");
            return (Criteria) this;
        }

        public Criteria andNetworkCreditLessThan(String value) {
            addCriterion("network_credit <", value, "networkCredit");
            return (Criteria) this;
        }

        public Criteria andNetworkCreditLessThanOrEqualTo(String value) {
            addCriterion("network_credit <=", value, "networkCredit");
            return (Criteria) this;
        }

        public Criteria andNetworkCreditLike(String value) {
            addCriterion("network_credit like", value, "networkCredit");
            return (Criteria) this;
        }

        public Criteria andNetworkCreditNotLike(String value) {
            addCriterion("network_credit not like", value, "networkCredit");
            return (Criteria) this;
        }

        public Criteria andNetworkCreditIn(List<String> values) {
            addCriterion("network_credit in", values, "networkCredit");
            return (Criteria) this;
        }

        public Criteria andNetworkCreditNotIn(List<String> values) {
            addCriterion("network_credit not in", values, "networkCredit");
            return (Criteria) this;
        }

        public Criteria andNetworkCreditBetween(String value1, String value2) {
            addCriterion("network_credit between", value1, value2, "networkCredit");
            return (Criteria) this;
        }

        public Criteria andNetworkCreditNotBetween(String value1, String value2) {
            addCriterion("network_credit not between", value1, value2, "networkCredit");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Timestamp value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Timestamp value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Timestamp value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Timestamp value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Timestamp> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Timestamp> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Timestamp value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Timestamp value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Timestamp value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Timestamp value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Timestamp> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Timestamp> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     * 
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 内部类
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}