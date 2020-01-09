package com.nankai.xining.utils;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.*;
import java.util.List;

/**
 * @Description: **
 * @Author: 董兰天
 * @Date: 2019-12-26 16:02
 */
public class DataProcess {

    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\admin\\Desktop\\锅炉预测数据集.xlsx");
        InputStream in = new FileInputStream(file);

        List<List<Object>> listob = ExcelUtil.getBankListByExcel(in,file.getName());

        File writeName = new File("C:\\Users\\admin\\Desktop\\output.txt"); // 相对路径，如果没有则要建立一个新的output.txt文件
        writeName.createNewFile(); // 创建新文件,有同名的文件的话直接覆盖

        StringBuilder lines = new StringBuilder();

        for (int i = 0; i < listob.size(); i++) {
            List<Object> ob = listob.get(i);
            double feiqi = (double) ob.get(0);

            /*if ((double)ob.get(0)<=0) feiqi = 1;
            else if ((double)ob.get(0)<=1) feiqi = 2;
            else if ((double)ob.get(0)<=5) feiqi = 3;
            else if ((double)ob.get(0)<=20) feiqi = 4;
            else feiqi = 5;*/

            lines.append(feiqi+" 1:"+ob.get(1)+" 2:"+ob.get(2)+" 3:"+ob.get(3)+" 4:"+ob.get(4)+" 5:"+ob.get(5)+" 6:"+
                    ob.get(6)+" 7:"+ob.get(7)+" 8:"+ob.get(8)+" 9:"+ob.get(9)+" 10:"+ob.get(10)+" 11:"+ob.get(11)+" 12:"+ob.get(12)+ "\r\n");

            /*lines.append(feiqi+" 1:"+ob.get(1)+" 2:"+ob.get(2)+" 3:"+ob.get(3)+" 4:"+ob.get(4)+" 5:"+ob.get(5)+" 6:"+
                    ob.get(6)+" 7:"+ob.get(7)+" 8:"+ob.get(8)+" 9:"+ob.get(9)+" 10:"+ob.get(10)+" 11:"+ob.get(11)+" 12:"+ob.get(12)+
                    " 13:"+ob.get(13)+" 14:"+ob.get(14)+" 15:"+ob.get(15)+" 16:"+ob.get(16)+"\r\n");*/

            /*lines.append(feiqi+" 1:"+ ob.get(1)+" 2:"+ob.get(2)+" 3:"+ob.get(3)+" 4:"+ob.get(4)+"\r\n");*/


        }

        try {

            try (FileWriter writer = new FileWriter(writeName);
                 BufferedWriter out = new BufferedWriter(writer)
            ) {
                out.write(lines.toString()); // \r\n即为换行
                out.flush(); // 把缓存区内容压入文件
                System.out.println("完成。");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
