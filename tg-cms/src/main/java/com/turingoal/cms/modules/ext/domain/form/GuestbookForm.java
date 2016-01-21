package com.turingoal.cms.modules.ext.domain.form;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import com.turingoal.common.bean.BaseFormBean;

/**
 * 留言板Form 
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class GuestbookForm extends BaseFormBean implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String typeId; // 留言类型
    private String createDataUsername; // 创建者
    private String replyerId; // 回复者
    private String title; // 留言标题
    private String gbContent; // 留言内容
    private String cretaeIp; // 留言IP
    private java.util.Date createDataTime; // 创建时间
    private String replyContent; // 回复内容
    private java.util.Date replyTime; // 回复日期
    private String replyIp; // 回复IP
    private Integer replyed; // 是否回复
    private Integer recommend; // 是否推荐
    private String username; // 用户名
    private Integer gender; // 性别
    private String telephoneNum; // 电话
    private String cellphoneNum; // 手机
    private String qq; // QQ号码
    private String email; // 电子邮箱
    private Integer state; // 状态(1:已审核,2:屏蔽,10:未审核)
    private Integer shield; // 是否屏蔽(1：是，2：否)
}