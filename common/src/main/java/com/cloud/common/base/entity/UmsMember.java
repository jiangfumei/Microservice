package com.cloud.common.base.entity;

import com.cloud.common.base.base.BaseEntity;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.social.security.SocialUserDetails;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

/**
 * <p>
 * 会员表
 * </p>
 *
 * @author zscat
 * @since 2019-04-19
 */
@Data
@Table(name = "ums_member")
public class UmsMember extends BaseEntity implements SocialUserDetails {


    private Long memberLevelId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 帐号启用状态:0->禁用；1->启用
     */
    private Integer status;

    private Long areaId;
    private String areaName;
    private String schoolName;
    /**
     * 注册时间
     */
    private Date createTime;

    /**
     * 头像
     */
    private String icon;

    /**
     * 性别：0->未知；1->男；2->女
     */
    private Integer gender;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 所做城市
     */
    private String city;

    /**
     * 职业
     */
    private String job;

    /**
     * 个性签名
     */
    private String personalizedSignature;

    /**
     * 用户来源 1 小程序 2 公众号 3 页面
     */
    private Integer sourceType;

    /**
     * 积分
     */
    private Integer integration;

    /**
     * 成长值
     */
    private Integer growth;

    /**
     * 剩余抽奖次数
     */
    private Integer luckeyCount;

    /**
     * 历史积分数量
     */
    private Integer historyIntegration;

    private String avatar;

    private String weixinOpenid;

    private Long invitecode;
    private Integer buyCount;
    private BigDecimal buyMoney;
    /**
     * 余额
     */
    private BigDecimal blance;
    private String confimpassword;

    private String phonecode;
    private Long schoolId;


    private String code;

    @Override
    public String getUserId() {
        return this.getWeixinOpenid();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> collection = new HashSet<>();

        return collection;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
