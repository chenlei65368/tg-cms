package com.turingoal.cms.core.service;

import java.util.List;
import com.turingoal.cms.core.domain.User;
import com.turingoal.cms.core.domain.form.UserForm;
import com.turingoal.common.exception.BusinessException;

/**
 * 用户Service
 */
public interface UserService {
    /**
     * 检查密码
     */
    boolean checkUserPass(final String id, final String userPass);

    /**
     * 修改密码
     */
    int updateCurrentUserPass(final String userPass);

    /**
     * 重置用户密码
     */
    int resetUserPass(final String id);

    /**
     * 通过用户名得到用户的id及登录信息
     */
    User getLoginInfoByUsername(final String username);

    /**
     * 分页查询 User
     */
    List<User> findAll();

    /**
     * 通过id得到一个 User
     */
    User get(final String id);

    /**
     * 新增 User
     */
    void add(final UserForm form);

    /**
     * 修改 User
     */
    int update(final UserForm form) throws BusinessException;

    /**
     * 修改当前 User
     */
    int updateCurrentUser(final UserForm form) throws BusinessException;

    /**
     * 根据id删除一个 User
     */
    int delete(final String id) throws BusinessException;

    /**
     * 启用
     */
    int enable(final String id) throws BusinessException;

    /**
     * 停用
     */
    int disable(final String id) throws BusinessException;

}