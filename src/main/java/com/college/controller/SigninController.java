package com.college.controller;

import com.college.contants.AppCode;
import com.college.contants.Path;
import com.college.entity.Signin;
import com.college.service.SigninService;
import com.github.pagehelper.Page;
import com.google.common.collect.Maps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


/**
 * @author milo
 * @Title:
 * @Description
 */
@RestController
public class SigninController extends BaseController {

    private static Logger logger = LoggerFactory
            .getLogger(SigninController.class);

    @Autowired
    private SigninService signinService;

    /**
     * get list
     *
     * @param pageNum
     * @param pageSize
     * @param id
     * @param userId     用户 ID
     * @param status     0: 正常 1:删除
     * @param createTime 创建时间
     * @param updateTime 更新时间
     * @return
     */
    @RequestMapping(value = Path.SIGNIN_LIST)
    @ResponseBody
    public Map<String, Object> getList(@RequestParam(value = "pagenum", defaultValue = "1") int pageNum,
                                       @RequestParam(value = "pagesize", defaultValue = "10") int pageSize,
                                       @RequestParam(value = "id", required = false) Integer id,
                                       @RequestParam(value = "userId", required = false) Integer userId,
                                       @RequestParam(value = "status", required = false) boolean status,
                                       @RequestParam(value = "createTime", required = false) Integer createTime,
                                       @RequestParam(value = "updateTime", required = false) Integer updateTime
    ) {
        Map<String, Object> params = Maps.newHashMap();
        Page<Signin> page = signinService.searchPageList(pageNum, pageSize, params);
        Map<String, Object> resultMap = Maps.newHashMap();
        logger.info(" SigninController -->  pageResult :{}", page.getResult());
        resultMap.put("result", page.getResult());
        resultMap.put("pages", page.getPages());
        resultMap.put("startrow", page.getStartRow());
        resultMap.put("endrow", page.getEndRow());
        resultMap.put("pagesize", page.getPageSize());
        resultMap.put("pagenum", page.getPageNum());
        resultMap.put("total", page.getTotal());
        return resultMap;
    }

    /**
     * insert
     *
     * @param userId     用户 ID
     * @param status     0: 正常 1:删除
     * @param createTime 创建时间
     * @param updateTime 更新时间
     * @return
     */
    @RequestMapping(value = Path.SIGNIN_ADD)
    @ResponseBody
    public Map<String, Object> add(
            @RequestParam(value = "userId", required = false) Integer userId,
            @RequestParam(value = "status", required = false) boolean status,
            @RequestParam(value = "createTime", required = false) java.util.Date createTime,
            @RequestParam(value = "updateTime", required = false) java.util.Date updateTime) {
        Signin signin = new Signin();
        signin.setUserId(userId);
        signin.setStatus(status);
        signin.setCreateTime(createTime);
        signin.setUpdateTime(updateTime);
        Integer id = signinService.insert(signin);
        Map<String, Object> resultMap = Maps.newHashMap();
        resultMap.put("resultcode", AppCode._200);
        resultMap.put("resultd", id);
        return resultMap;
    }

    /**
     * update
     *
     * @param id
     * @param userId     用户 ID
     * @param status     0: 正常 1:删除
     * @param createTime 创建时间
     * @param updateTime 更新时间
     * @return
     */
    @RequestMapping(value = Path.SIGNIN_UPDATE)
    @ResponseBody
    public Map<String, Object> update(
            @RequestParam(value = "id", required = false) Integer id,
            @RequestParam(value = "userId", required = false) Integer userId,
            @RequestParam(value = "status", required = false) boolean status,
            @RequestParam(value = "createTime", required = false) java.util.Date createTime,
            @RequestParam(value = "updateTime", required = false) java.util.Date updateTime
    ) {
        Signin signin = new Signin();
        signin.setId(id);
        signin.setUserId(userId);
        signin.setStatus(status);
        signin.setCreateTime(createTime);
        signin.setUpdateTime(updateTime);
        signinService.update(signin);
        Map<String, Object> resultMap = Maps.newHashMap();
        resultMap.put("resultcode", AppCode._200);
        resultMap.put("resultd", id);
        return resultMap;
    }

}