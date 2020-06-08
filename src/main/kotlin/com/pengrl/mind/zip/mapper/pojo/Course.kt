package com.pengrl.mind.zip.mapper.pojo

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableId

/**
 * Created by pengrl on 2020/6/3 17:50.
 */
data class Course(@TableId(type = IdType.AUTO) var id: Int ?= null, var name: String ?= null);