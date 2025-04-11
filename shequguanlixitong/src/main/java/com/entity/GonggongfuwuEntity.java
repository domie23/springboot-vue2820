package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 公共服务
 *
 * @author 
 * @email
 */
@TableName("gonggongfuwu")
public class GonggongfuwuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GonggongfuwuEntity() {

	}

	public GonggongfuwuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 名称
     */
    @TableField(value = "gonggongfuwu_name")

    private String gonggongfuwuName;


    /**
     * 地点
     */
    @TableField(value = "gonggongfuwu_address")

    private String gonggongfuwuAddress;


    /**
     * 封面
     */
    @TableField(value = "gonggongfuwu_photo")

    private String gonggongfuwuPhoto;


    /**
     * 公共服务类型
     */
    @TableField(value = "gonggongfuwu_types")

    private Integer gonggongfuwuTypes;


    /**
     * 用途
     */
    @TableField(value = "yongtu_text")

    private String yongtuText;


    /**
     * 负责人
     */
    @TableField(value = "fuzeren")

    private String fuzeren;


    /**
     * 联系电话
     */
    @TableField(value = "lianxidianhua")

    private String lianxidianhua;


    /**
     * 开放时间
     */
    @TableField(value = "kaifangshijian")

    private String kaifangshijian;


    /**
     * 详情
     */
    @TableField(value = "gonggongfuwu_content")

    private String gonggongfuwuContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：名称
	 */
    public String getGonggongfuwuName() {
        return gonggongfuwuName;
    }


    /**
	 * 获取：名称
	 */

    public void setGonggongfuwuName(String gonggongfuwuName) {
        this.gonggongfuwuName = gonggongfuwuName;
    }
    /**
	 * 设置：地点
	 */
    public String getGonggongfuwuAddress() {
        return gonggongfuwuAddress;
    }


    /**
	 * 获取：地点
	 */

    public void setGonggongfuwuAddress(String gonggongfuwuAddress) {
        this.gonggongfuwuAddress = gonggongfuwuAddress;
    }
    /**
	 * 设置：封面
	 */
    public String getGonggongfuwuPhoto() {
        return gonggongfuwuPhoto;
    }


    /**
	 * 获取：封面
	 */

    public void setGonggongfuwuPhoto(String gonggongfuwuPhoto) {
        this.gonggongfuwuPhoto = gonggongfuwuPhoto;
    }
    /**
	 * 设置：公共服务类型
	 */
    public Integer getGonggongfuwuTypes() {
        return gonggongfuwuTypes;
    }


    /**
	 * 获取：公共服务类型
	 */

    public void setGonggongfuwuTypes(Integer gonggongfuwuTypes) {
        this.gonggongfuwuTypes = gonggongfuwuTypes;
    }
    /**
	 * 设置：用途
	 */
    public String getYongtuText() {
        return yongtuText;
    }


    /**
	 * 获取：用途
	 */

    public void setYongtuText(String yongtuText) {
        this.yongtuText = yongtuText;
    }
    /**
	 * 设置：负责人
	 */
    public String getFuzeren() {
        return fuzeren;
    }


    /**
	 * 获取：负责人
	 */

    public void setFuzeren(String fuzeren) {
        this.fuzeren = fuzeren;
    }
    /**
	 * 设置：联系电话
	 */
    public String getLianxidianhua() {
        return lianxidianhua;
    }


    /**
	 * 获取：联系电话
	 */

    public void setLianxidianhua(String lianxidianhua) {
        this.lianxidianhua = lianxidianhua;
    }
    /**
	 * 设置：开放时间
	 */
    public String getKaifangshijian() {
        return kaifangshijian;
    }


    /**
	 * 获取：开放时间
	 */

    public void setKaifangshijian(String kaifangshijian) {
        this.kaifangshijian = kaifangshijian;
    }
    /**
	 * 设置：详情
	 */
    public String getGonggongfuwuContent() {
        return gonggongfuwuContent;
    }


    /**
	 * 获取：详情
	 */

    public void setGonggongfuwuContent(String gonggongfuwuContent) {
        this.gonggongfuwuContent = gonggongfuwuContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Gonggongfuwu{" +
            "id=" + id +
            ", gonggongfuwuName=" + gonggongfuwuName +
            ", gonggongfuwuAddress=" + gonggongfuwuAddress +
            ", gonggongfuwuPhoto=" + gonggongfuwuPhoto +
            ", gonggongfuwuTypes=" + gonggongfuwuTypes +
            ", yongtuText=" + yongtuText +
            ", fuzeren=" + fuzeren +
            ", lianxidianhua=" + lianxidianhua +
            ", kaifangshijian=" + kaifangshijian +
            ", gonggongfuwuContent=" + gonggongfuwuContent +
            ", createTime=" + createTime +
        "}";
    }
}
