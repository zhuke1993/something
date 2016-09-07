package com.zhuke.something.guava;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.concurrent.ExecutionException;

/**
 * Created by ZHUKE on 2016/8/26.
 */
public class GuavaCache {
    public static void main(String[] args) throws ExecutionException, UnsupportedEncodingException {
        /*LoadingCache<String, String> loadingCache = CacheBuilder.newBuilder().maximumSize(1)
                .build(new CacheLoader<String, String>() {
                    @Override
                    public String load(String s) throws Exception {
                        return s+"hahah";
                    }
                });
        loadingCache.put("zhuke", "zhuke");
        loadingCache.put("zhuke1", "zhuke");
        System.out.println(loadingCache.get("zhukefdsaf"));*/
        System.out.println(URLEncoder.encode("朱轲","UTF-8"));
    }
}
