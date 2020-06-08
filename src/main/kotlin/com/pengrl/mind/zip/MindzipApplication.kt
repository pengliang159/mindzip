package com.pengrl.mind.zip

import com.pengrl.mind.zip.mapper.BaseDataMapper
import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@MapperScan(basePackageClasses = [BaseDataMapper::class])
class MindzipApplication

fun main(args: Array<String>) {
    runApplication<MindzipApplication>(*args)
}
