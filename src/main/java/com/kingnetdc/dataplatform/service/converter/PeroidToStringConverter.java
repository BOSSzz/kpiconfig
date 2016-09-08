package com.kingnetdc.dataplatform.service.converter;

import com.kingnetdc.dataplatform.service.model.Period;
import org.springframework.core.convert.converter.Converter;

/**
 * Created by zhoujiongy on 2016/9/7.
 */
public class PeroidToStringConverter implements Converter<Period, String> {

    @Override
    public String convert(Period source) {
        return source.toString();
    }
}
