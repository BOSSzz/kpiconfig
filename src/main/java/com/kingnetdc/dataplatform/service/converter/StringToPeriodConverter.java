package com.kingnetdc.dataplatform.service.converter;

import org.springframework.core.convert.converter.Converter;
import com.kingnetdc.dataplatform.service.model.Period;

/**
 * Created by zhoujiongy on 2016/9/7.
 */
public class StringToPeriodConverter implements Converter<String, Period> {

    @Override
    public Period convert(String source) {
        String value = source.trim();
        if("".equals(value)) {
            return null;
        }
        return Period.get(Integer.parseInt(source));
    }
}
