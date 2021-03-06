package com.college.contants;

/**
 * Created by milo on 2016/10/31.
 */
public class Path {

    // ===================================== 公共:ERP COMMONS START ======================================== //
    // 上传图片
    public static final String FILE_UPLOAD = "/api/file/upload.json";
    public static final String FILE_UPLOAD_FILE1 = "/api/file/uploadfile1.json";
    public static final String FILE_UPLOAD_FILE2 = "/api/file/uploadfile2.json";
    public static final String FILE_DOWN_FILE = "/api/file/download.json";

    public static final String JS = "/js";
    public static final String CSS = "/css";
    public static final String IMG = "/img";
    // ===================================== 用户: USER  ============================================ //
    //首页
    public static final String INDEX = "/api/user/index";//用户登录

    // 用户相关接口
    public static final String USER_LOGIN = "/api/user/login.json";//用户登录
    public static final String USER_ADD = "/api/user/add.json";//添加用户
    public static final String USER_FIND = "/api/user/find.json";
    public static final String USER_GET = "/api/user/get.json";
    public static final String USER_UPDATE = "/api/user/update.json";//修改用户
    public static final String USER_ROLE_UPDATE = "/api/user/role/update.json";
    public static final String USER_PASSWORD_UPDATE = "/api/user/password/update.json";
    public static final String USER_ROLE_GET = "/api/user/role/get.json";
    public static final String USER_PERMISSION = "/api/user/permission.json";
    public static final String USER_LIST = "/api/user/userList.json";
    public static final String STUDENT_LIST = "/api/user/studentList.json";
    public static final String STUDENT_ADD = "/api/user/studentAdd.json";
    public static final String STUDENT_UPDATE = "/api/user/studentUpdate.json";

    // 角色相关接口
    public static final String ROLE_ADD = "/api/role/add.json";
    public static final String ROLE_GET = "/api/role/get.json";
    public static final String ROLE_UPDATE = "/api/role/update.json";
    public static final String ROLE_LIST = "/api/role/list.json";
    public static final String ROLE_ALL = "/api/role/all.json";
    public static final String ROLE_PERMISSION_ADD = "/api/role/permission/add.json";
    public static final String ROLE_PERMISSION_UPDATE = "/api/role/permission/update.json";
    public static final String ROLE_PERMISSION_LIST = "/api/role/permission/list.json";

    // 权限相关接口
    public static final String PERMISSION_ADD = "/api/permission/add.json";
    public static final String PERMISSION_UPDATE = "/api/permission/update.json";
    public static final String PERMISSION_GET = "/api/permission/get.json";
    public static final String PERMISSION_ALL = "/api/permission/all.json";
    public static final String PERMISSION_TREE = "/api/permission/tree.json";
    public static final String PERMISSION_SEARCH = "/api/permission/search.json";
    public static final String PERMISSION_DELETE = "/api/permission/delete.json";

    //RESOURCE  资源
    public static final String RESOURCE_ADD = "/api/resource/add.json";
    public static final String RESOURCE_GET = "/api/resource/get.json";
    public static final String RESOURCE_GETS = "/api/resource/gets.json";
    public static final String RESOURCE_UPDATE = "/api/resource/update.json";
    public static final String RESOURCE_LIST = "/api/resource/list.json";
    public static final String RESOURCE_LISTS = "/api/resource/lists.json";
    public static final String RESOURCE_ALL = "/api/resource/all.json";


    //TEACHER 教师
    public static final String TEACHER_ADD = "/api/teacher/add.json";
    public static final String TEACHER_GET = "/api/teacher/get.json";
    public static final String TEACHER_UPDATE = "/api/teacher/update.json";
    public static final String TEACHER_LIST = "/api/teacher/list.json";
    public static final String TEACHER_ALL = "/api/teacher/all.json";


    //ACHIEVEMENT 成果
    public static final String ACHIEVEMENT_ADD = "/api/achievement/add.json";
    public static final String ACHIEVEMENT_GET = "/api/achievement/get.json";
    public static final String ACHIEVEMENT_UPDATE = "/api/achievement/update.json";
    public static final String ACHIEVEMENT_LIST = "/api/achievement/list.json";
    public static final String ACHIEVEMENT_ALL = "/api/achievement/all.json";

    //NOTICE 公告
    public static final String NOTICE_ADD = "/api/notice/add.json";
    public static final String NOTICE_GET = "/api/notice/get.json";
    public static final String NOTICE_UPDATE = "/api/notice/update.json";
    public static final String NOTICE_LIST = "/api/notice/list.json";
    public static final String NOTICE_ALL = "/api/notice/all.json";

    //signin 签到
    public static final String SIGNIN_ADD = "/api/signin/add.json";
    public static final String SIGNIN_GET = "/api/signin/get.json";
    public static final String SIGNIN_UPDATE = "/api/signin/update.json";
    public static final String SIGNIN_LIST = "/api/signin/list.json";
    public static final String SIGNIN_ALL = "/api/signin/all.json";
    public static final String CONDITIONAL_QUERY = "/api/signin/conditionalQuery.json";


    //baseInfo 静态页面 基本信息
    public static final String BASEINFO_ADD = "/api/baseInfo/add.json";
    public static final String BASEINFO_GET = "/api/baseInfo/get.json";
    public static final String BASEINFO_UPDATE = "/api/baseInfo/update.json";
    public static final String BASEINFO_LIST = "/api/baseInfo/list.json";
    public static final String BASEINFO_ALL = "/api/baseInfo/all.json";
    public static final String BASEINFO_SEARCHONE = "/api/baseInfo/searchOne.json";
}
