package com.entity.vo;

import com.entity.HuodongEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 社区活动
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("huodong")
public class HuodongVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 活动编号
     */

    @TableField(value = "huodong_uuid_number")
    private String huodongUuidNumber;


    /**
     * 活动名称
     */

    @TableField(value = "huodong_name")
    private String huodongName;


    /**
     * 活动图片
     */

    @TableField(value = "huodong_photo")
    private String huodongPhoto;


    /**
     * 活动类型
     */

    @TableField(value = "huodong_types")
    private Integer huodongTypes;


    /**
     * 举办方
     */

    @TableField(value = "huodong_jubanfang")
    private String huodongJubanfang;


    /**
     * 活动地点
     */

    @TableField(value = "huodongdidian")
    private String huodongdidian;


    /**
     * 联系电话
     */

    @TableField(value = "huodong_phone")
    private String huodongPhone;


    /**
     * 报名条件
     */

    @TableField(value = "baomingtiaojian")
    private String baomingtiaojian;


    /**
     * 开始时间
     */

    @TableField(value = "huodong_kaishi")
    private String huodongKaishi;


    /**
     * 结束时间
     */

    @TableField(value = "huodong_jieshu")
    private String huodongJieshu;


    /**
     * 详情
     */

    @TableField(value = "huodong_content")
    private String huodongContent;


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
	 * 设置：活动编号
	 */
    public String getHuodongUuidNumber() {
        return huodongUuidNumber;
    }


    /**
	 * 获取：活动编号
	 */

    public void setHuodongUuidNumber(String huodongUuidNumber) {
        this.huodongUuidNumber = huodongUuidNumber;
    }
    /**
	 * 设置：活动名称
	 */
    public String getHuodongName() {
        return huodongName;
    }


    /**
	 * 获取：活动名称
	 */

    public void setHuodongName(String huodongName) {
        this.huodongName = huodongName;
    }
    /**
	 * 设置：活动图片
	 */
    public String getHuodongPhoto() {
        return huodongPhoto;
    }


    /**
	 * 获取：活动图片
	 */

    public void setHuodongPhoto(String huodongPhoto) {
        this.huodongPhoto = huodongPhoto;
    }
    /**
	 * 设置：活动类型
	 */
    public Integer getHuodongTypes() {
        return huodongTypes;
    }


    /**
	 * 获取：活动类型
	 */

    public void setHuodongTypes(Integer huodongTypes) {
        this.huodongTypes = huodongTypes;
    }
    /**
	 * 设置：举办方
	 */
    public String getHuodongJubanfang() {
        return huodongJubanfang;
    }


    /**
	 * 获取：举办方
	 */

    public void setHuodongJubanfang(String huodongJubanfang) {
        this.huodongJubanfang = huodongJubanfang;
    }
    /**
	 * 设置：活动地点
	 */
    public String getHuodongdidian() {
        return huodongdidian;
    }


    /**
	 * 获取：活动地点
	 */

    public void setHuodongdidian(String huodongdidian) {
        this.huodongdidian = huodongdidian;
    }
    /**
	 * 设置：联系电话
	 */
    public String getHuodongPhone() {
        return huodongPhone;
    }


    /**
	 * 获取：联系电话
	 */

    public void setHuodongPhone(String huodongPhone) {
        this.huodongPhone = huodongPhone;
    }
    /**
	 * 设置：报名条件
	 */
    public String getBaomingtiaojian() {
        return baomingtiaojian;
    }


    /**
	 * 获取：报名条件
	 */

    public void setBaomingtiaojian(String baomingtiaojian) {
        this.baomingtiaojian = baomingtiaojian;
    }
    /**
	 * 设置：开始时间
	 */
    public String getHuodongKaishi() {
        return huodongKaishi;
    }


    /**
	 * 获取：开始时间
	 */

    public void setHuodongKaishi(String huodongKaishi) {
        this.huodongKaishi = huodongKaishi;
    }
    /**
	 * 设置：结束时间
	 */
    public String getHuodongJieshu() {
        return huodongJieshu;
    }


    /**
	 * 获取：结束时间
	 */

    public void setHuodongJieshu(String huodongJieshu) {
        this.huodongJieshu = huodongJieshu;
    }
    /**
	 * 设置：详情
	 */
    public String getHuodongContent() {
        return huodongContent;
    }


    /**
	 * 获取：详情
	 */

    public void setHuodongContent(String huodongContent) {
        this.huodongContent = huodongContent;
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
