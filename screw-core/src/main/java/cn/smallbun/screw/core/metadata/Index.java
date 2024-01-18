package cn.smallbun.screw.core.metadata;

import java.io.Serializable;

/**
 * 索引
 * @author xieq
 * @date 2024/1/17 16:02
 */
public interface Index extends Serializable {


    /**
     * 获取表名
     * @return
     */
    String getTableName();


    /**
     * 索引名称
     * @return
     */
    String getIndexName();


    /**
     * 索引字段名
     * @return
     */
    String getColumnName();
}
