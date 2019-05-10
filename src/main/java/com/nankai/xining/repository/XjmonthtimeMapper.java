package com.nankai.xining.repository;

import com.nankai.xining.bean.Xjmonthtime;
import com.nankai.xining.bean.XjmonthtimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XjmonthtimeMapper {
    long countByExample(XjmonthtimeExample example);

    int deleteByExample(XjmonthtimeExample example);

    int deleteByPrimaryKey(Integer monthId);

    int insert(Xjmonthtime record);

    int insertSelective(Xjmonthtime record);

    List<Xjmonthtime> selectByExample(XjmonthtimeExample example);

    Xjmonthtime selectByPrimaryKey(Integer monthId);

    int updateByExampleSelective(@Param("record") Xjmonthtime record, @Param("example") XjmonthtimeExample example);

    int updateByExample(@Param("record") Xjmonthtime record, @Param("example") XjmonthtimeExample example);

    int updateByPrimaryKeySelective(Xjmonthtime record);

    int updateByPrimaryKey(Xjmonthtime record);
}