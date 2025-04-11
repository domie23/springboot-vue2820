package com.entity.vo;

import com.entity.GonggongfuwuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 公共服务
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("gonggongfuwu")
public class GonggongfuwuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
