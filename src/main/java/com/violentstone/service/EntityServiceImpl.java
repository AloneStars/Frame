package com.violentstone.service;

import com.violentstone.dao.EntityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**********************************************************
 * +茫茫人海与你相遇即是一种缘分,这让我不得不好好自我介绍一下
 * +吾名 "暴力的小石头/ViolentStone",吾乃一Java程序猿
 * +吾信 "猿" 乃一世变者
 * +你见到的这个玩意儿,就是吾在 2016/10/24 创造的作品
 * ********************************************************
 * +描述:
 *********************************************************/
@Service
public class EntityServiceImpl implements IEntityService{

    @Autowired
    private EntityDao entityDao;
}
