package someTests;

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

public class DeviceProductDataImport {

    @Autowired
    DeviceProductTemp deviceProductTemp;

    @Autowired
    DeviceProductTempMapper deviceProductTempMapper;



    @Transactional(rollbackFor = Exception.class)
    public void importExcelInfo(InputStream in, MultipartFile file) throws Exception{
        List<List<Object>> listob = ExcelUtil.getBankListByExcel(in,file.getOriginalFilename());



        //数据校验
        for (int i = 0; i < listob.size(); i++) {
            List<Object> ob = listob.get(i);
            if((ob.get(0) == null || ob.get(0).equals("")) && (ob.get(1) == null || ob.get(1).equals(""))) throw new Exception();
        }

        for (int i = 0; i < listob.size(); i++) {
            List<Object> ob = listob.get(i);
            int id = (int) ob.get(4);
            deviceProductTemp = deviceProductTempMapper.selectByPrimaryKey(id);
            deviceProductTemp.setAnnualOutput((Double) ob.get(5));
            deviceProductTemp.setJanUseamount((Double) ob.get(6));
            deviceProductTemp.setFebUseamount((Double) ob.get(7));
            deviceProductTemp.setMarUseamount((Double) ob.get(8));
            deviceProductTemp.setAprUseamount((Double) ob.get(9));
            deviceProductTemp.setMayUseamount((Double) ob.get(10));
            deviceProductTemp.setJuneUseamount((Double) ob.get(11));
            deviceProductTemp.setJulyUseamount((Double) ob.get(12));
            deviceProductTemp.setAugUseamount((Double) ob.get(13));
            deviceProductTemp.setSeptUseamount((Double) ob.get(14));
            deviceProductTemp.setOctUseAmount((Double) ob.get(15));
            deviceProductTemp.setNovUseamount((Double) ob.get(16));
            deviceProductTemp.setDecUseamount((Double) ob.get(17));
            deviceProductTemp.setCo((Double) ob.get(18));
            deviceProductTemp.setNox((Double) ob.get(19));
            deviceProductTemp.setSo2((Double) ob.get(20));
            deviceProductTemp.setNh3((Double) ob.get(21));
            deviceProductTemp.setVoc((Double) ob.get(22));
            deviceProductTemp.setPm25((Double) ob.get(23));
            deviceProductTemp.setPm10((Double) ob.get(24));
            deviceProductTemp.setBc((Double) ob.get(25));
            deviceProductTemp.setOc((Double) ob.get(26));
            }

        }

}
