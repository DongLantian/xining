package com.nankai.xining.utils;

import com.nankai.xining.bean.DeviceProductTemp;
import com.nankai.xining.repository.DeviceProductTempMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.List;

/**
 * @Description: **
 * @Author: 董兰天
 * @Date: 2019-12-09 14:05
 */
@Service
public class DeviceProductDataImport {


    @Autowired
    DeviceProductTempMapper deviceProductTempMapper;



    @Transactional(rollbackFor = Exception.class)
    public void importExcelInfo(InputStream in, MultipartFile file) throws Exception{
        List<List<Object>> listob = ExcelUtil.getBankListByExcel(in,file.getOriginalFilename());
        DeviceProductTemp deviceProductTemp;



        for (int i = 0; i < listob.size(); i++) {
            List<Object> ob = listob.get(i);
            int id = Integer.parseInt(ob.get(4).toString());
            deviceProductTemp = deviceProductTempMapper.selectByPrimaryKey(id);
            deviceProductTemp.setAnnualOutput(Double.parseDouble(ob.get(5).toString()));
            deviceProductTemp.setJanUseamount(Double.parseDouble(ob.get(6).toString()));
            deviceProductTemp.setFebUseamount(Double.parseDouble(ob.get(7).toString()));
            deviceProductTemp.setMarUseamount(Double.parseDouble(ob.get(8).toString()));
            deviceProductTemp.setAprUseamount(Double.parseDouble(ob.get(9).toString()));
            deviceProductTemp.setMayUseamount(Double.parseDouble(ob.get(10).toString()));
            deviceProductTemp.setJuneUseamount(Double.parseDouble(ob.get(11).toString()));
            deviceProductTemp.setJulyUseamount(Double.parseDouble(ob.get(12).toString()));
            deviceProductTemp.setAugUseamount(Double.parseDouble(ob.get(13).toString()));
            deviceProductTemp.setSeptUseamount(Double.parseDouble(ob.get(14).toString()));
            deviceProductTemp.setOctUseAmount(Double.parseDouble(ob.get(15).toString()));
            deviceProductTemp.setNovUseamount(Double.parseDouble(ob.get(16).toString()));
            deviceProductTemp.setDecUseamount(Double.parseDouble(ob.get(17).toString()));
            deviceProductTemp.setCo(Double.parseDouble(ob.get(18).toString()));
            deviceProductTemp.setNox(Double.parseDouble(ob.get(19).toString()));
            deviceProductTemp.setSo2(Double.parseDouble(ob.get(20).toString()));
            deviceProductTemp.setNh3(Double.parseDouble(ob.get(21).toString()));
            deviceProductTemp.setVoc(Double.parseDouble(ob.get(22).toString()));
            deviceProductTemp.setPm25(Double.parseDouble(ob.get(23).toString()));
            deviceProductTemp.setPm10(Double.parseDouble(ob.get(24).toString()));
            deviceProductTemp.setBc(Double.parseDouble(ob.get(25).toString()));
            deviceProductTemp.setOc(Double.parseDouble(ob.get(26).toString()));

            deviceProductTempMapper.updateByPrimaryKeySelective(deviceProductTemp);

            }

        }

}
