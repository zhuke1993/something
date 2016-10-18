package com.zhuke.something.spring.mvc;

import java.util.List;

/**
 * Created by ZHUKE on 2016/9/27.
 */
public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);
}
