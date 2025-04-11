package com.entity.view;

import com.entity.GonggongfuwuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 公共服务
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("gonggongfuwu")
public class GonggongfuwuView extends GonggongfuwuEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 公共服务类型的值
		*/
		private String gonggongfuwuValue;



	public GonggongfuwuView() {

	}

	public GonggongfuwuView(GonggongfuwuEntity gonggongfuwuEntity) {
		try {
			BeanUtils.copyProperties(this, gonggongfuwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 公共服务类型的值
			*/
			public String getGonggongfuwuValue() {
				return gonggongfuwuValue;
			}
			/**
			* 设置： 公共服务类型的值
			*/
			public void setGonggongfuwuValue(String gonggongfuwuValue) {
				this.gonggongfuwuValue = gonggongfuwuValue;
			}










}
