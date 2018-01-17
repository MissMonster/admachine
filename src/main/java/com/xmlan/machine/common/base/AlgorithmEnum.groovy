package com.xmlan.machine.common.base

/**
 * Created by ayakurayuki on 2018/1/12-18:24. <br/>
 * Package: com.xmlan.machine.common.base <br/>
 * 加密类型枚举类 <br/>
 * 支持使用
 * <pre>MD5</pre>
 * <pre>SHA-1</pre>
 * <pre>SHA256</pre>
 * 三种类型
 */
enum AlgorithmEnum {

    MD5("MD5"), SHA1("SHA-1"), SHA256("SHA-256")

    /**
     * 类型所使用的值，调用枚举时使用
     */
    private final String type

    AlgorithmEnum(String type) {
        this.type = type
    }

    final String getType() {
        return type
    }

}