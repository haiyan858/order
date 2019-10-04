package com.imooc.order.utils;

import com.imooc.order.VO.ResultVO;

/**
 * @Author cuihaiyan
 * @Create_Time 2019-10-04 20:21
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("success");
        resultVO.setData(object);
        return resultVO;
    }
}
