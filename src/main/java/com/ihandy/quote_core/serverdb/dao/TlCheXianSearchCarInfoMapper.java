package com.ihandy.quote_core.serverdb.dao;

import com.ihandy.quote_core.serverdb.model.TlCheXianSearchCarInfo;

public interface TlCheXianSearchCarInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QCYB.TL_CHEXIAN_SEARCH_CARINFO
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long numCarinfoid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QCYB.TL_CHEXIAN_SEARCH_CARINFO
     *
     * @mbggenerated
     */
    int insert(TlCheXianSearchCarInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QCYB.TL_CHEXIAN_SEARCH_CARINFO
     *
     * @mbggenerated
     */
    int insertSelective(TlCheXianSearchCarInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QCYB.TL_CHEXIAN_SEARCH_CARINFO
     *
     * @mbggenerated
     */
    TlCheXianSearchCarInfo selectByPrimaryKey(Long numCarinfoid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QCYB.TL_CHEXIAN_SEARCH_CARINFO
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TlCheXianSearchCarInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QCYB.TL_CHEXIAN_SEARCH_CARINFO
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TlCheXianSearchCarInfo record);
}