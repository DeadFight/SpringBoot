package com.springboot.xishuimiao.service;

import com.springboot.xishuimiao.entity.User;

import java.util.List;

public interface IUserService {
    /**
     * <B>方法名称：</B>add<BR>
     * <B>概要说明：</B>添加记录 <BR> 
     * @param   record 
     * @return  User
     * @author  kangzd 18734832832@163.com
     * @create  2020-11-12 12:21:38
     */
    User add(User record);

    /**
     * <B>方法名称：</B>addList<BR>
     * <B>概要说明：</B>添加记录列表 <BR> 
     * @param   recordList 
     * @return  Integer
     * @author  kangzd 18734832832@163.com
     * @create  2020-11-12 12:21:38
     */
    Integer addList(List<User> recordList);

    /**
     * <B>方法名称：</B>modify<BR>
     * <B>概要说明：</B>根据主键修改记录 <BR> 
     * @param   record 
     * @return  Boolean
     * @author  kangzd 18734832832@163.com
     * @create  2020-11-12 12:21:38
     */
    Boolean modify(User record);

    /**
     * <B>方法名称：</B>remove<BR>
     * <B>概要说明：</B>根据主键删除记录 <BR> 
     * @param   id 
     * @return  Boolean
     * @author  kangzd 18734832832@163.com
     * @create  2020-11-12 12:21:38
     */
    Boolean remove(String id);

    /**
     * <B>方法名称：</B>batchRemove<BR>
     * <B>概要说明：</B>根据主键列表批量删除记录 <BR> 
     * @param   ids 
     * @return  Boolean
     * @author  kangzd 18734832832@163.com
     * @create  2020-11-12 12:21:38
     */
    Boolean batchRemove(String[] ids);

    /**
     * <B>方法名称：</B>getById<BR>
     * <B>概要说明：</B>根据主键获取记录 <BR> 
     * @param   id 
     * @return  User
     * @author  kangzd 18734832832@163.com
     * @create  2020-11-12 12:21:38
     */
    User getById(String id);

    /**
     * <B>方法名称：</B>getAll<BR>
     * <B>概要说明：</B>查询所有的记录列表 <BR> 
     * @return  List<User>
     * @author  kangzd 18734832832@163.com
     * @create  2020-11-12 12:21:38
     */
    List<User> getAll();

    /**
     * <B>方法名称：</B>query<BR>
     * <B>概要说明：</B>根据参数对象查询记录 <BR> 
     * @param   queryBean 
     * @return  List<User>
     * @author  kangzd 18734832832@163.com
     * @create  2020-11-12 12:21:38
     */
    List<User> query(User queryBean);

}