package com.imooc.order.utils;

import java.util.Random;

/**
 * @Author cuihaiyan
 * @Create_Time 2019-10-04 19:55
 */
public class KeyUtil {
    /**
     * 生成唯一的主键
     * 格式：时间戳+随机数
     */
    public static synchronized String genUniqueKey(){
        Random random = new Random();
        Integer number = random.nextInt(900000) + 10000;
        return System.currentTimeMillis() + String.valueOf(number);
    }
}
