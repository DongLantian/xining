package com.nankai.xining.service;

import com.nankai.xining.bean.*;
import com.nankai.xining.repository.DustremoveMapper;
import com.nankai.xining.repository.NitreremoveMapper;
import com.nankai.xining.repository.SulphurremoveMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: **
 * @Author: 董兰天
 * @Date: 2019-05-17 16:57
 */

@Service
public class CommonSelectLoadService {

    @Autowired
    DustremoveMapper dustremoveMapper;

    @Autowired
    SulphurremoveMapper sulphurremoveMapper;

    @Autowired
    NitreremoveMapper nitreremoveMapper;

    public List<Dustremove> selectDustremoveList(){
        DustremoveExample dustremoveExample = new DustremoveExample();
        return dustremoveMapper.selectByExample(dustremoveExample);
    }

    public List<Sulphurremove> selectSulphurremoveList(){
        SulphurremoveExample sulphurremoveExample = new SulphurremoveExample();
        return sulphurremoveMapper.selectByExample(sulphurremoveExample);
    }

    public List<Nitreremove> selectNitreremoveList(){
        NitreremoveExample nitreremoveExample = new NitreremoveExample();
        return nitreremoveMapper.selectByExample(nitreremoveExample);
    }
}
