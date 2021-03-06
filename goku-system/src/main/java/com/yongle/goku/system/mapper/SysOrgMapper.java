package com.yongle.goku.system.mapper;

import com.yongle.goku.model.system.SysOrg;
import com.yongle.goku.model.system.SysOrgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysOrgMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_org
     *
     * @mbg.generated
     */
    long countByExample(SysOrgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_org
     *
     * @mbg.generated
     */
    int deleteByExample(SysOrgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_org
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_org
     *
     * @mbg.generated
     */
    int insert(SysOrg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_org
     *
     * @mbg.generated
     */
    int insertSelective(SysOrg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_org
     *
     * @mbg.generated
     */
    List<SysOrg> selectByExample(SysOrgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_org
     *
     * @mbg.generated
     */
    SysOrg selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_org
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SysOrg record, @Param("example") SysOrgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_org
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") SysOrg record, @Param("example") SysOrgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_org
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SysOrg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_org
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SysOrg record);
}