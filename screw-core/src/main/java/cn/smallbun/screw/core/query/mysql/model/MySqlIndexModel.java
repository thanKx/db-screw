package cn.smallbun.screw.core.query.mysql.model;

import cn.smallbun.screw.core.mapping.MappingField;
import cn.smallbun.screw.core.metadata.Index;
import lombok.Data;

/**
 * @author xieq
 * @date 2024/1/17 16:05
 */
@Data
public class MySqlIndexModel implements Index {

    @MappingField(value = "TABLE_NAME")
    private String tableName;

    @MappingField(value = "INDEX_NAME")
    private String indexName;

    @MappingField(value = "COLUMN_NAME")
    private String columnName;

}
