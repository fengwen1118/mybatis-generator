package com.ihandy.quote_core.serverdb.dao;

import com.ihandy.quote_core.serverdb.model.TlCheXianSearchQuoteInfo;

public interface TlCheXianSearchQuoteInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QCYB.TL_CHEXIAN_SEARCH_QUOTEINFO
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long numQuoteid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QCYB.TL_CHEXIAN_SEARCH_QUOTEINFO
     *
     * @mbggenerated
     */
    int insert(TlCheXianSearchQuoteInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QCYB.TL_CHEXIAN_SEARCH_QUOTEINFO
     *
     * @mbggenerated
     */
    int insertSelective(TlCheXianSearchQuoteInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QCYB.TL_CHEXIAN_SEARCH_QUOTEINFO
     *
     * @mbggenerated
     */
    TlCheXianSearchQuoteInfo selectByPrimaryKey(Long numQuoteid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QCYB.TL_CHEXIAN_SEARCH_QUOTEINFO
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TlCheXianSearchQuoteInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QCYB.TL_CHEXIAN_SEARCH_QUOTEINFO
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TlCheXianSearchQuoteInfo record);
}