package com.entity.view;

import com.entity.HuodongbaomingEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 活动报名
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("huodongbaoming")
public class HuodongbaomingView extends HuodongbaomingEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 huodong
			/**
			* 活动编号
			*/
			private String huodongUuidNumber;
			/**
			* 活动名称
			*/
			private String huodongName;
			/**
			* 活动图片
			*/
			private String huodongPhoto;
			/**
			* 活动类型
			*/
			private Integer huodongTypes;
				/**
				* 活动类型的值
				*/
				private String huodongValue;
			/**
			* 举办方
			*/
			private String huodongJubanfang;
			/**
			* 活动地点
			*/
			private String huodongdidian;
			/**
			* 联系电话
			*/
			private String huodongPhone;
			/**
			* 报名条件
			*/
			private String baomingtiaojian;
			/**
			* 开始时间
			*/
			private String huodongKaishi;
			/**
			* 结束时间
			*/
			private String huodongJieshu;
			/**
			* 详情
			*/
			private String huodongContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public HuodongbaomingView() {

	}

	public HuodongbaomingView(HuodongbaomingEntity huodongbaomingEntity) {
		try {
			BeanUtils.copyProperties(this, huodongbaomingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
















				//级联表的get和set huodong
					/**
					* 获取： 活动编号
					*/
					public String getHuodongUuidNumber() {
						return huodongUuidNumber;
					}
					/**
					* 设置： 活动编号
					*/
					public void setHuodongUuidNumber(String huodongUuidNumber) {
						this.huodongUuidNumber = huodongUuidNumber;
					}
					/**
					* 获取： 活动名称
					*/
					public String getHuodongName() {
						return huodongName;
					}
					/**
					* 设置： 活动名称
					*/
					public void setHuodongName(String huodongName) {
						this.huodongName = huodongName;
					}
					/**
					* 获取： 活动图片
					*/
					public String getHuodongPhoto() {
						return huodongPhoto;
					}
					/**
					* 设置： 活动图片
					*/
					public void setHuodongPhoto(String huodongPhoto) {
						this.huodongPhoto = huodongPhoto;
					}
					/**
					* 获取： 活动类型
					*/
					public Integer getHuodongTypes() {
						return huodongTypes;
					}
					/**
					* 设置： 活动类型
					*/
					public void setHuodongTypes(Integer huodongTypes) {
						this.huodongTypes = huodongTypes;
					}


						/**
						* 获取： 活动类型的值
						*/
						public String getHuodongValue() {
							return huodongValue;
						}
						/**
						* 设置： 活动类型的值
						*/
						public void setHuodongValue(String huodongValue) {
							this.huodongValue = huodongValue;
						}
					/**
					* 获取： 举办方
					*/
					public String getHuodongJubanfang() {
						return huodongJubanfang;
					}
					/**
					* 设置： 举办方
					*/
					public void setHuodongJubanfang(String huodongJubanfang) {
						this.huodongJubanfang = huodongJubanfang;
					}
					/**
					* 获取： 活动地点
					*/
					public String getHuodongdidian() {
						return huodongdidian;
					}
					/**
					* 设置： 活动地点
					*/
					public void setHuodongdidian(String huodongdidian) {
						this.huodongdidian = huodongdidian;
					}
					/**
					* 获取： 联系电话
					*/
					public String getHuodongPhone() {
						return huodongPhone;
					}
					/**
					* 设置： 联系电话
					*/
					public void setHuodongPhone(String huodongPhone) {
						this.huodongPhone = huodongPhone;
					}
					/**
					* 获取： 报名条件
					*/
					public String getBaomingtiaojian() {
						return baomingtiaojian;
					}
					/**
					* 设置： 报名条件
					*/
					public void setBaomingtiaojian(String baomingtiaojian) {
						this.baomingtiaojian = baomingtiaojian;
					}
					/**
					* 获取： 开始时间
					*/
					public String getHuodongKaishi() {
						return huodongKaishi;
					}
					/**
					* 设置： 开始时间
					*/
					public void setHuodongKaishi(String huodongKaishi) {
						this.huodongKaishi = huodongKaishi;
					}
					/**
					* 获取： 结束时间
					*/
					public String getHuodongJieshu() {
						return huodongJieshu;
					}
					/**
					* 设置： 结束时间
					*/
					public void setHuodongJieshu(String huodongJieshu) {
						this.huodongJieshu = huodongJieshu;
					}
					/**
					* 获取： 详情
					*/
					public String getHuodongContent() {
						return huodongContent;
					}
					/**
					* 设置： 详情
					*/
					public void setHuodongContent(String huodongContent) {
						this.huodongContent = huodongContent;
					}










				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}



}
