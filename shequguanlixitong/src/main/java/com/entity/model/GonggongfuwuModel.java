package com.entity.model;

import com.entity.GonggongfuwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 公共服务
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GonggongfuwuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 名称
     */
    private String gonggongfuwuName;


    /**
     * 地点
     */
    private String gonggongfuwuAddress;


    /**
     * 封面
     */
    private String gonggongfuwuPhoto;


    /**
     * 公共服务类型
     */
    private Integer gonggongfuwuTypes;


    /**
     * 用途
     */
    private String yongtuText;


    /**
     * 负责人
     */
    private String fuzeren;


    /**
     * 联系电话
     */
    private String lianxidianhua;


    /**
     * 开放时间
     */
    private String kaifangshijian;


    /**
     * 详情
     */
    private String gonggongfuwuContent;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：名称
	 */
    public String getGonggongfuwuName() {
        return gonggongfuwuName;
    }


    /**
	 * 设置：名称
	 */
    public void setGonggongfuwuName(String gonggongfuwuName) {
        this.gonggongfuwuName = gonggongfuwuName;
    }
    /**
	 * 获取：地点
	 */
    public String getGonggongfuwuAddress() {
        return gonggongfuwuAddress;
    }


    /**
	 * 设置：地点
	 */
    public void setGonggongfuwuAddress(String gonggongfuwuAddress) {
        this.gonggongfuwuAddress = gonggongfuwuAddress;
    }
    /**
	 * 获取：封面
	 */
    public String getGonggongfuwuPhoto() {
        return gonggongfuwuPhoto;
    }


    /**
	 * 设置：封面
	 */
    public void setGonggongfuwuPhoto(String gonggongfuwuPhoto) {
        this.gonggongfuwuPhoto = gonggongfuwuPhoto;
    }
    /**
	 * 获取：公共服务类型
	 */
    public Integer getGonggongfuwuTypes() {
        return gonggongfuwuTypes;
    }


    /**
	 * 设置：公共服务类型
	 */
    public void setGonggongfuwuTypes(Integer gonggongfuwuTypes) {
        this.gonggongfuwuTypes = gonggongfuwuTypes;
    }
    /**
	 * 获取：用途
	 */
    public String getYongtuText() {
        return yongtuText;
    }


    /**
	 * 设置：用途
	 */
    public void setYongtuText(String yongtuText) {
        this.yongtuText = yongtuText;
    }
    /**
	 * 获取：负责人
	 */
    public String getFuzeren() {
        return fuzeren;
    }


    /**
	 * 设置：负责人
	 */
    public void setFuzeren(String fuzeren) {
        this.fuzeren = fuzeren;
    }
    /**
	 * 获取：联系电话
	 */
    public String getLianxidianhua() {
        return lianxidianhua;
    }


    /**
	 * 设置：联系电话
	 */
    public void setLianxidianhua(String lianxidianhua) {
        this.lianxidianhua = lianxidianhua;
    }
    /**
	 * 获取：开放时间
	 */
    public String getKaifangshijian() {
        return kaifangshijian;
    }


    /**
	 * 设置：开放时间
	 */
    public void setKaifangshijian(String kaifangshijian) {
        this.kaifangshijian = kaifangshijian;
    }
    /**
	 * 获取：详情
	 */
    public String getGonggongfuwuContent() {
        return gonggongfuwuContent;
    }


    /**
	 * 设置：详情
	 */
    public void setGonggongfuwuContent(String gonggongfuwuContent) {
        this.gonggongfuwuContent = gonggongfuwuContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
