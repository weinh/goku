package com.yongle.goku.system.mapper;

import com.yongle.goku.model.system.SysRoleUser;
import com.yongle.goku.model.system.SysRoleUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_user
     *
     * @mbg.generated
     */
    long countByExample(SysRoleUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_user
     *
     * @mbg.generated
     */
    int deleteByExample(SysRoleUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_user
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("roleId") Long roleId, @Param("userId") Long userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_user
     *
     * @mbg.generated
     */
    int insert(SysRoleUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_user
     *
     * @mbg.generated
     */
    int insertSelective(SysRoleUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_user
     *
     * @mbg.generated
     */
    List<SysRoleUser> selectByExample(SysRoleUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_user
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SysRoleUser record, @Param("example") SysRoleUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_user
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") SysRoleUser record, @Param("example") SysRoleUserExample example);
}